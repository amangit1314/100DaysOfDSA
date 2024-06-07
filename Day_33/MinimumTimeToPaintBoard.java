import java.util.ArrayList;

/**
 * PROBLEM:
 * This program finds the minimum time required to paint a board by a given number of painters.
 *
 * Assumptions:
 * - Each unit of the board takes 1 unit of time to paint.
 * - A painter can only paint contiguous units of the board.
 *
 * PLATFORM: CodeStudio
 *
 * EXAMPLE:
 * Input: board = [5, 5, 5, 5], painters = 2 (max number of painters)
 * Output: 10 (Explanation: Each painter can paint 2 units in 5 units of time)
 */

public class MinimumTimeToPaintBoard {

    private static int calculateBoardSectionSum(ArrayList<Integer> board, int startIndex, int endIndex) {
        int totalSum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            totalSum += board.get(i);
        }
        return totalSum;
    }

    public static int findMinimumTime(ArrayList<Integer> board, int maxPainters) {
        int boardLength = board.size();

        // dp (dynamic programming) table to store minimum times for different scenarios
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>(maxPainters + 1);
        for (int i = 0; i <= maxPainters; i++) {
            dp.add(new ArrayList<>(boardLength + 1));
            for (int j = 0; j <= boardLength; j++) {
                dp.get(i).add(0); // Initialize with 0
            }
        }

        // Base cases:
        // - 1 painter: minimum time to paint each section is the sum of its units
        for (int i = 1; i <= boardLength; i++) {
            dp.get(1).set(i, calculateBoardSectionSum(board, 0, i - 1));
        }

        // - 1 board unit: minimum time is the same for any number of painters
        for (int i = 1; i <= maxPainters; i++) {
            dp.get(i).set(1, board.get(0));
        }

        // Fill the dp table using dynamic programming
        for (int painters = 2; painters <= maxPainters; painters++) {
            for (int boardSectionLength = 2; boardSectionLength <= boardLength; boardSectionLength++) {
                int minTime = Integer.MAX_VALUE;
                // Try assigning different lengths to the previous painter (1 to boardSectionLength-1)
                for (int previousPainterSection = 1; previousPainterSection <= boardSectionLength; previousPainterSection++) {
                    int maxTimeForPreviousPainter = dp.get(painters - 1).get(previousPainterSection);
                    int timeForCurrentPainter = calculateBoardSectionSum(board, previousPainterSection, boardSectionLength - 1);
                    minTime = Math.min(minTime, Math.max(maxTimeForPreviousPainter, timeForCurrentPainter));
                }
                dp.get(painters).set(boardSectionLength, minTime);
            }
        }

        // Return the minimum time required to paint the entire board with the given number of painters
        return dp.get(maxPainters).get(boardLength);
    }

    public static void main(String[] args) {
        ArrayList<Integer> board = new ArrayList<>();
        board.add(5);
        board.add(5);
        board.add(5);
        board.add(5);
        int painters = 2;

        System.out.println("Minimum Time Required: " + findMinimumTime(board, painters));
    }
}

/** Time Complexity - O(K * N^2) */
/** Space Complexity - O(N * K) */
