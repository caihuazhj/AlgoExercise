package sort;

import java.util.Arrays;

public class QuickSort {


    public void quickSort(int[] array){
        subQuickSort(array,0,array.length-1);
//        System.out.println(Arrays.toString(array));
    }
    //利用分治与递归，对已排好的块继续排序
    public void subQuickSort(int[] array,int low,int high){
        if(low >=high){
            return;
        }

        int midIndex = quickSortCore(array,low,high);
        //分治，对排序后的前后数组分别排序
        subQuickSort(array,low,midIndex-1);
        subQuickSort(array,midIndex+1,high);
    }
    //一趟排序
    public int quickSortCore(int[] array,int low,int high){

        int midValue = array[low];

        while (low < high){
            //后面的值和标志位比较，大于则标志位向前移动一位
            while (array[high]>=midValue && low<high){
                high--;
            }
            //否则，交换位置
            array[low] = array[high];

            while (array[low] <=midValue && low<high){
                low++;
            }
            array[high] = array[low];
        }
        //标志位记录到中轴
        array[low] = midValue;

        return  low;
    }


    public static void main(String[] args) {
        int[] a = { 1, 12, 2, 13, 3, 14, 4, 15, 5, 16, 17, 17, 177, 18, 8, 8, 19 };
        QuickSort quicksort = new QuickSort();
        quicksort.quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
