public class Min_Platforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatforms(arr, dep));
    }

    private static int minPlatforms(int[] arr, int[] dep) {
        if(arr.length == 0 || dep.length == 0)
            return 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform_need = 1, result = 1;
        int i = 1, j = 0;

        while(i < n && j < n) {
            if(arr[i] == dep[i]){
                platform_need++;
                i++;
            }

            else if (arr[i] < dep[j]) {
                platform_need++;
                i++;

                else {
                    platform_need--;
                    j++;
                }

                if(platform_need > result)
                    result = platform_need;
            }

            return result;
        }
    }
}