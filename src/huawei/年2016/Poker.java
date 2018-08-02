package huawei.年2016;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.java2d.pipe.SpanIterator;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] p = s.split("-");
            String[] left = p[0].split(" ");
            String[] right = p[1].split(" ");
            //两边都是 个 对 三个 四个  五个 比较第一个
            if (left.length==right.length){
                if (left.length==5){
                    if (left[0].equals("10")||right[0].equals("10")){
                        System.out.println("10 J Q K A");
                    }
                }else {
                    int a = Integer.valueOf(left[0].charAt(0));
                    int b = Integer.valueOf(right[0].charAt(0));
                    if (a>b){
                        System.out.println(p[0].toString());
                    }else{
                        System.out.println(p[1].toString());
                    }
                }

            }else{
                if (left[0].equals("joker")){//左边是双王
                    System.out.println(p[0].toString());
                }else if (right[0].equals("joker")){//右边是双王
                    System.out.println(p[1].toString());
                }else if(left.length==4 &&!(right[0].equals("joker"))){
                    System.out.println(p[0].toString());
                }else if(right.length==4 &&!(left[0].equals("joker"))){
                    System.out.println(p[1].toString());
                }else{
                    System.out.println("ERROR");
                }
            }
        }
    }
}
