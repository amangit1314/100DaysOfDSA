public class CombinationSum {
  public static void combinationSum(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, int target, List<Integer> al, int index) {
    if(index == a.size()) {
        if(target == 0) {
            ans.add(new al(al));
        }
        return;
    }

    if(a.get(index) <= target) {
        al.add(a.get(index));
        combinationSum(ans, a, target - a.get(index), al, index);
    }

    combinationSum(ans, a, target, al, index + 1);
  } 
}