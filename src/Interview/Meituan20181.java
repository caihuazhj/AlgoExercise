package Interview;

import java.util.Scanner;

public class Meituan20181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.nextLine();
            String t = sc.nextLine();

            distance(s,t);

        }

    }
    public static int distance(String s, String t){
        int ls = s.length();
        int ts = t.length();
        int son = ls - ts +1;
        int count = 0;
        for(int i=0;i<son;i++){
            for(int j=i,k=0;k<ts;j++,k++){
                if(s.charAt(j)!=t.charAt(k)){count++;}
            }
        }
        System.out.println(count);
        return count;
    }
}
