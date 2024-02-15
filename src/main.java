import easy.P169MajorityElement;
import easy.P645SetMismatch;

public class main {
    public static void main (String[] args){
        int[] nums = {8,7,3,5,3,6,1,4};
        System.out.println("Result: "  + P645SetMismatch.findErrorsNumber(nums)[0] + ", " + P645SetMismatch.findErrorsNumber(nums)[1] );
        System.out.println(P169MajorityElement.majorityElement(nums));
    }
}
