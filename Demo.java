public class Demo {
    public static void main(String[] args) {
        int nums[] = {1, 3,5,7,9,11,13,15};
        int target = 11;

        int result = linearSearch(nums, target);
        if(result == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at index " + result);
        }
    };

    public static int linearSearch(int[] nums, int target) {


        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] nums, int target) {

   int left = 0;
   int right = nums.length - 1;

   while(left <= right) {
    int mid = (left + right) / 2;
    if(nums[mid] == target) {
        return mid;
    }
    else if(nums[mid] < target) {
        left = mid + 1;
    }
    else if(nums[mid] > target) {
        right = mid - 1;
    }

   }


       
    }
}