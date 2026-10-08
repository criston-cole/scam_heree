class Solution {
    public int trap(int[] height) {
        int i=0,j=(height.length-1),lmax=0,rmax=0,wat=0;
        while(i<=j){
            if(height[i]<=height[j]){
                if(height[i]>=lmax){
                lmax=height[i];
                }
                else{
                    wat+=lmax-height[i];
                }
                i++;
            }
            else{
               if(height[j]>=rmax){
                rmax=height[j];
               }
               else{
                wat+=rmax-height[j];
               } 
               j--;
            }
        }
        return wat;

        
    }
}