package practice;

import java.util.Scanner;

/**
 * 输入一个长度不超过20的字符串，对所输入的字符串，按照ASCII码的大小从小到大进行排序，请输出排序后的结果
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()){
             str = scanner.nextLine();

             char[] chars = str.toCharArray();
             if (chars.length >20){
                 System.out.println(chars);
                 return;
             }else {
                 for (int i = 0;i<chars.length-1;i++){
                     for (int j = i+1;j<chars.length;j++){
                         if (chars[i]>chars[j]){
                             char temp = chars[i];
                             chars[i] = chars[j];
                             chars[j] = temp;
                         }
                     }
                 }
             }
             for (int i=0;i<chars.length;i++){
                 System.out.println(chars[i]);
             }
        }
    }
}
