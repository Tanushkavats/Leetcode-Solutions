class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int bal = 0;
        int[] ans= new int[seq.length()];
        for(int i = 0;i<seq.length();i++){
            char ch = seq.charAt(i);
            if(ch == '('){
                bal++;
                ans[i] = bal%2;
            }else{
                ans[i] = bal%2;
                bal--;
            }
        }
        return ans;
        
    }
}