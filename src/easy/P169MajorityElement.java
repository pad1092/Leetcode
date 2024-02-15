package easy;
public class P169MajorityElement {
    public static int majorityElement(int[] nums){
        int majorityNumber = nums[0];
        int frequently = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == majorityNumber){
                frequently += 1;
            }
            else if (frequently == 0){
                majorityNumber = nums[i];
                frequently = 1;
            }
            else{
                frequently -= 1;
            }
        }
        return majorityNumber;
    }
}
