import easy.P169MajorityElement;
import easy.P645SetMismatch;
import greedy.P11ContainerWithMostWater;
import greedy.P409LongestPalindrome;
import greedy.P997FindTheTownJudge;

public class main {
    public static void main (String[] args){
//        int[][] array = {{1,3},{1,4},{2,3},{2,4},{4,3}};
//        int[][] array = {{1,2}};
        int[][] array = {{1,3}, {3,1},{2,3}};
        System.out.println("Result: "  + P997FindTheTownJudge.findJudgeV2(3, array));
    }
}
