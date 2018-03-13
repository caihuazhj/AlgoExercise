package practice;

import java.util.Scanner;

/**
 *链接：https://www.nowcoder.com/questionTerminal/dfeed0e0e4624814b122265e859783b2
 来源：牛客网

 先输入你要输入的字符串的个数。
 然后换行输入该组字符串。每个字符串以回车结束，每个字符串少于一百个字符。
 如果在输入过程中输入的一个字符串为“stop”，也结束输入。
 然后将这输入的该组字符串按每个字符串的长度，由小到大排序，按排序结果输出字符串。
 */
public class Exercise1 {
    public static void main(String[] args) {

        //首先确定字符串数组的长度
        Scanner scanner =  new Scanner(System.in);

        while (scanner.hasNext()){
            String str = scanner.nextLine();

            int num = Integer.valueOf(str);
            int count = 0;
            String[] strings = new String[num];

            for(int i=0;i<num;i++){
                strings[i] = scanner.nextLine();
                count++;

                if(strings[i].equals("stop")){
                    System.out.println(count);
                    count--;
                    break;
                }
            }
            System.out.println(strings.length);
            //冒泡排序
            for (int i=1;i<count;i++){
                for (int j=0;j<count-i;j++){
                    if (strings[j].length()>strings[j+1].length()){
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                }
            }

            for (int i = 0;i<count;i++){
                System.out.println(strings[i]);
            }


        }
    }
}
