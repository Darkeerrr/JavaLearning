package java_projects;

public class max1InArray {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1};
        int max = MaxOnes(nums);
        System.out.println(max);

    }

    private static int MaxOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int item : nums){
            if (item > 0){
                count++;
                // if(max < count)max = count;
                max = max < count? count: max;
                // max = Math.max(max, count);
            }
            else if (item == 0){
                if(max < count){
                    max = count;
                    count = 0;
                }
                else count = 0;
            }
        }
        return max;
    }
}
