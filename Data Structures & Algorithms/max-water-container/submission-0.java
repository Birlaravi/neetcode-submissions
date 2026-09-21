class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int i = 0;
        int j = heights.length-1;
        while(i<j){
            int prod = Math.min(heights[i],heights[j])*(j-i);
             if(prod>area)area=prod;
             if(heights[i]>heights[j])j--;
             else i++;
        }
        return area;
    }
}
