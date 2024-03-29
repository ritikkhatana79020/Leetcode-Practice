class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);    
        }
        return ans;
    }
}