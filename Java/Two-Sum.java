class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> int_map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int_map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int second_num = target-nums[i];
            if(int_map.containsKey(second_num) && int_map.get(second_num)!=i){
                return new int[]{i,int_map.get(second_num)};
            }
        }
        return new int[]{-1,-1};
    }
}