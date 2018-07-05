package sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    public static void selectSort(int[] array,int n){
        int temp;
        for (int i=0;i<n;i++){//做i趟排序
            int minIndex = i;
            for (int j=i+1;j<n;j++){//内部循环，找到最小值的下标
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex !=i){//将最小值放在开始位置
                //交换
                temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;

            }

        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,6,150,7,9,12,5,123,3,123,34123};
        selectSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
