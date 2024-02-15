package easy;

public class P645SetMismatch {
    public static int[] findErrorsNumber(int[] nums){
        int actualSum = 0;
        int length = nums.length;
        for (int i=0; i<length; i++){
            actualSum += nums[i];
        }
        int duplicateNumber = actualSum - length*(length+1)/2;
        return null;
    }
}
