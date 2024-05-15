public class Demo {
    public static void main(String[] args) {
        int nums[] = {1, 3,5,7,9,11,13,15};
        int target = 13;

        int result = binarySearch(nums, target);
        int result2 = linearSearch(nums, target);
        if(result == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at index " + result);
        }
    };

    public static int linearSearch(int[] nums, int target) {

        int steps = 0;
        for(int i = 0; i < nums.length; i++) {
            steps++;
            if(nums[i] == target) {
                System.out.println("Linear Steps: " + steps);
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
        int mid = (left + right) / 2;
        if(nums[mid] == target) {
        System.out.println("Binary Steps: " + steps);
        return mid;
         }
         else if(nums[mid] < target) {
        left = mid + 1;
         }
         else if(nums[mid] > target) {
        right = mid - 1;
         }

   };
        System.out.println("Steps: " + steps );
    return -1;
       
    };
}