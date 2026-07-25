class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j:matrix[i]){
                arr[i] += j;
            }
        }
        return arr;
    }
}