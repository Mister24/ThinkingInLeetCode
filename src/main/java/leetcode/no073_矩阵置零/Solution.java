package leetcode.no073_矩阵置零;

class Solution {
    public void setZeroes(int[][] matrix) {
        // 行数
        int rowNum = matrix.length;
        // 列数
        int colNum = matrix[0].length;
        
        // 第一行含有0的标记
        boolean firstRowContainsZero = false;
        // 第一列含有0的标记
        boolean firstColContainsZero = false;
        for (int i = 0; i < colNum; i++) {
            if (matrix[0][i] == 0) {
                firstRowContainsZero = true;
                break;
            }
        }
        for (int j = 0; j < rowNum; j++) {
            if (matrix[j][0] == 0) {
                firstColContainsZero = true;
                break;
            }
        }
    
        for (int i = 1; i < rowNum; i++) {
            for (int j = 1; j < colNum; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
    
        for (int i = 1; i < rowNum; i++) {
            for (int j = 1; j < colNum; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // 填充第一行
        if (firstRowContainsZero) {
            for (int i = 0; i < colNum; i++) {
                matrix[0][i] = 0;
            }
        }
    
        // 填充第一列
        if (firstColContainsZero) {
            for (int i = 0; i < rowNum; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}