package sort;


import java.util.Scanner;

public class SortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            int n = s.length();
            for(int i=0;i<n;i++){// 做第i趟排序
               int min = i;//记下目前找到的最小值所在的位置
                for(int j=min+1;j<n;j++){// 选最小的记录
                    if(c[j]<c[min]){
                        min=j;
                    }
                    //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
                    char temp = c[i];
                    c[i] = c[min];
                    c[min]=temp;
                }
            }
            for (int i =0;i<c.length;i++){
                System.out.println(c[i]);
            }
        }

    }
}
