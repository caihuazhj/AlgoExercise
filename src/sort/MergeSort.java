package sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] a){
        int[] temp = new int[a.length]; //开辟原始数组空间，避免频繁开辟空间，长度与a相同
        MergeSortIteration(a,a.length,temp);
//        devideSort(a,0,a.length-1,temp);

    }
    //递归实现的归并排序
    public static void devideSort(int[]a,int left,int right,int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            devideSort(a,left,mid,temp);
            devideSort(a,mid+1,right,temp);
            merge(a,left,mid,right,temp);
        }
    }
    //合并方法
    public static void merge(int[]a,int left,int mid,int right,int[] temp){
        int i =left; //左序列指针
        int j = mid+1; //右序列指针
        int t=0;//temp指针

        //比较左右两序列的值，填入temp
        while (i<=mid &&j<=right){
            if(a[i]<=a[j]){
                temp[t++] = a[i++];
            }else{
                temp[t++] = a[j++];
            }
        }
        //将左序列剩余元素全部填入temp
        while (i<=mid){
            temp[t++] = a[i++];
        }
        //将右序列剩余元素全部填入temp
        while (j<=right){
            temp[t++] = a[j++];
        }
        t= 0;
        //将有序数据填回原数组
        while (left<=right){
            a[left++] = temp[t++];
        }

    }
    //非递归实现归并排序
    public static void MergeSortIteration(int A[], int len,int[] temp){
        int left, mid, right;// 子数组索引,前一个为A[left...mid]，后一个子数组为A[mid+1...right]
        for (int i = 1; i < len; i *= 2)        // 子数组的大小i初始为1，每轮翻倍
        {
            left = 0;
            while (left + i < len)              // 后一个子数组存在(需要归并)
            {
                mid = left + i - 1;
                right = mid + i < len ? mid + i : len - 1;// 后一个子数组大小可能不够
                merge(A, left, mid, right,temp);
                left = right + 1;               // 前一个子数组索引向后移动
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,6,150,7,9,12,5,123,3};
        mergeSort(a);
        System.out.println(Arrays.toString(a));

    }
}
