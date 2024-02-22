package greedy;

public class P997FindTheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        if (trust.length == n){
            return -1;
        }
        int[] peoples = new int[n+1];
        boolean[] isVote = new boolean[n+1];
        int judge = 0;
        int maxTrust = 0;
        for (int[] personTrust : trust){
            isVote[personTrust[0]] = true;
            int trustTo = personTrust[1];

            peoples[trustTo] += 1;
            if (peoples[trustTo] > maxTrust){
                maxTrust = peoples[trustTo];
                judge = trustTo;
            }
        }

        boolean duplicate = false;
        for (int i=1; i<peoples.length; i++){
            int peopleTrust = peoples[i];

            if (isVote[i] == false && peopleTrust != maxTrust){
                return -1;
            }
            if (maxTrust == peopleTrust && duplicate == true){
                return -1;
            }
            else if (maxTrust == peopleTrust && duplicate == false){
                duplicate = true;
            }
        }
        for (int[] personTrust : trust){
            if (personTrust[0] == judge && personTrust[1] != judge){
                return -1;
            }
        }
        return judge;
    }
    public static int findJudgeV2(int n, int[][] trust){
        boolean[] isVoteOther = new boolean[n+1];
        int[] numOfVote = new int[n+1];

        for (int[] vote : trust){
            if (vote[0] != vote[1]){
                numOfVote[vote[1]] += 1;
                isVoteOther[vote[0]] = true;
            }
        }
        for (int i=1; i<=n; i++){
            if (numOfVote[i] == n-1 && isVoteOther[i] == false)
                return i;
        }
        return -1;
    }

}
