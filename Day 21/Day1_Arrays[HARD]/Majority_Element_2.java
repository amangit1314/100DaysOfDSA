public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0, candidate1 = 0, candidate2 = 1;
        
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }
        
        if (count1 > nums.length / 3)
            res.add(candidate1);
        if (count2 > nums.length / 3)
            res.add(candidate2);
        
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(majorityElement(arr));
    }
}