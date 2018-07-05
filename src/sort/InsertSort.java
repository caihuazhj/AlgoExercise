package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {

    public static void insertSort(int[] array,int n){
        for (int i=0;i<n;i++){
            int get = array[i];//拿到第i张牌
            int j = i-1;
            while (j>=0 && array[j]>get){//拿到的牌与之前的进行比较
                array[j+1] = array[j];// 如果该手牌比抓到的牌大，就将其右移
                j--;
            }
            array[j+1] = get;
        }
    }

    public static void binaryInsertSort(int[] array,int n){
        for (int i=0;i<n;i++){
            int get = array[i];//拿到第i张牌
            int left = 0;// 拿在左手上的牌总是排序好的，所以可以用二分法
            int right = i - 1;// 手牌左右边界进行初始化
            // 采用二分法定位新牌的位置
            while (left <= right){
                int mid = (left + right) / 2;
                if (array[mid] > get){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--){// 将欲插入新牌位置右边的牌整体向右移动一个单位
                array[j + 1] = array[j];
            }
            array[left] = get; // 将抓到的牌插入手牌
        }
    }

    public static void shellSort(int[] data){
        int h = 1;
        while (h <= data.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i - h]) {
                    int tmp = data[i];
                    int j = i - h;
                    while (j >= 0 && data[j] > tmp) {
                        data[j + h] = data[j];
                        j -= h;
                    }
                    data[j + h] = tmp;
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }

    }
    public static void main(String[] args) {
        int[] a = {4,2,6,150,7,9,12,5,123,3};
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }
}
