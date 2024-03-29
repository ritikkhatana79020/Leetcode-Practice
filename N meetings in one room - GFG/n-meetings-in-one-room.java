// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    
    static class pair{
        int start;
        int end;
        public pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        pair ans[]=new pair[n];
        for(int i=0;i<n;i++){
            ans[i]=new pair(start[i],end[i]);
        }
        Arrays.sort(ans,(a,b)->(a.end-b.end));
        
        int li=ans[0].end;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(ans[i].start>li){
                li=ans[i].end;
                cnt++;
            }
        }
        
        return cnt;
    }
}