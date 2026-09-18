class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr1 = {0,0};

        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){
             if(count.isEmpty()){
                count.put(nums[i],i);
             }else{
                 if(count.containsKey(target-nums[i])){
                    arr1[0]=count.get(target-nums[i]);
                    arr1[1]= i ;
                    break;
                 }
                 count.put(nums[i], i);
             }
        }

        return arr1;
        
    }
}

