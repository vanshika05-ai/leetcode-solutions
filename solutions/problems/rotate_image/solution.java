class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-i-1; j++){

                int del = j - i;

                int curr = matrix[i][j];
                int next = matrix[i+del][n-1-i];
                matrix[i+del][n-1-i] = curr;
                curr = next;

                next = matrix[n-i-1][n-i-1-del];
                matrix[n-i-1][n-i-1-del] = curr;
                curr = next;

                next = matrix[n-i-1-del][i];
                matrix[n-i-1-del][i] = curr;
                curr = next;

                matrix[i][j] = curr;
            }
        }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n/2; j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][n-1-j];
        //         matrix[i][n-1-j] = temp;
        //     }
        // }
    }
}