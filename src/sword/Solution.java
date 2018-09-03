package sword;
public class Solution {
    public boolean Find(int target, int [][] array) {


        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean FindBinarySearch(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;

        int i = row-1;
        int j = 0;

        while (i>=0 && j<col){
            if (target<array[i][j]){
                i--;
            }else if (target>array[i][j]){
                j++;
            }else {
                return true;
            }
        }
        return false;

    }
}