class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.split(" ");
        StringBuilder sb=new StringBuilder("");
        
        for(int i=arr.length-1;i>=0;i--){
            if(("").equals(arr[i])){
                continue;
            }
            sb.append(arr[i]).append(" ");
        }
        
        String ans = sb.toString();
        return ans.trim();
    }
}