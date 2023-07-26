/* 799. Champagne Tower */
/*https://leetcode.com/problems/champagne-tower/ */

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured==0) return 0;
        int rows=100;
        double[][] tower= new double[rows+1][rows+1];
        tower[0][0]=poured;

        for(int row=0;row<=query_row;row++){
            for(int cols=0;cols<=row;cols++){
                double splitwine=(tower[row][cols]-1.0)/2.0;
                if(splitwine>0){
                    tower[row+1][cols]+=splitwine;
                    tower[row+1][cols+1]+=splitwine;
                }
            }
        }
        return Math.min(1, tower[query_row][query_glass]);

    }
}