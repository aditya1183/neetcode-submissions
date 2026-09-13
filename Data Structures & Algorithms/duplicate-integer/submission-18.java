class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> res= new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
           
                res.add(nums[i]);
           
        }
        if(res.size()== nums.length){
            return false;
        }
        return true;
    }
}