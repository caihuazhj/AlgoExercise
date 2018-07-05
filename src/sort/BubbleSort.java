package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        int temp = 0;
        for (int i = 0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static void main(String[] args) {
        int[] a = {4,2,6,150,7,9,12,5,123,3};
//        Arrays.sort();
        bubbleSort(a);
    }
}
