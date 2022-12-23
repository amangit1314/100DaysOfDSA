//Find maximum sum possible equal sum of three stacks
public class MaxEqualSumOfThreeStacks {
    public static void main(String[] args) {
        int[] stack1 = {3, 2, 1, 1, 1};
        int[] stack2 = {4, 3, 2};
        int[] stack3 = {1, 1, 4, 1};
        System.out.println(maxEqualSumOfThreeStacks(stack1, stack2, stack3));
    }

    public static int maxEqualSumOfThreeStacks(int[] stack1, int[] stack2, int[] stack3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < stack1.length; i++) {
            sum1 += stack1[i];
        }
        for (int i = 0; i < stack2.length; i++) {
            sum2 += stack2[i];
        }
        for (int i = 0; i < stack3.length; i++) {
            sum3 += stack3[i];
        }
        int top1 = 0, top2 = 0, top3 = 0;
        while (true) {
            if (top1 == stack1.length || top2 == stack2.length || top3 == stack3.length) {
                return 0;
            }
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= stack1[top1++];
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= stack2[top2++];
            } else if (sum3 >= sum1 && sum3 >= sum2) {
                sum3 -= stack3[top3++];
            }
        }
    }
}
