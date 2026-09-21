class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] res = new int[nums.length];
        int pro1 = 1;
        int pro2 = 1;

        for (int i= 0;i<nums.length;i++){
              arr1[i] = pro1*nums[i];
              pro1 = arr1[i];
              arr2[nums.length-i-1] = pro2*nums[nums.length-i-1];
              pro2 = arr2[nums.length-i-1];
        }

         for (int i= 0;i<nums.length;i++){
              if(i==0){
                 res[i]=1*arr2[i+1];
              }else if(i==(nums.length-1)){
                res[i]=arr1[i-1]*1;
              }else{
                res[i]=arr1[i-1]*arr2[i+1];
              }
        }
        return res;
    }
}  
