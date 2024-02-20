package greedy;

import java.util.Arrays;

public class P268MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missingNumber = 0;
        for (int num : nums){
            if (num == missingNumber){
                missingNumber += 1;
            }
            else {
                break;
            }
        }
        return missingNumber;
    }
    public static int missingNumberV2(int[] nums) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int sum = 0;
        int sizeOfArr = nums.length;
        for (int num : nums){
            sum += num;
            max = num > max ? num : max;
            min = num < min ? num : min;
        }
        return (sizeOfArr * (sizeOfArr + 1))/2 - sum;
    }
}
