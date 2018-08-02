package pinduoduo;

import java.util.Scanner;

public class LieBiaoBuQuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int offset =scanner.nextInt();
            int n = scanner.nextInt();
            int l1 = scanner.nextInt();
            int l2 = scanner.nextInt();
            int start1 = -1, end1 = -1, start2 = -1, end2 = -1;

            if (offset<l1){//优先从L1开始
                if (offset+n<=l1){
                    start1 = offset;
                    end1 = offset+n;
                    start2 = 0;
                    end2 = 0;
                }else {
                    start1 = offset;
                    end1 = l1;
                    start2 = 0;
                    end2 = (offset + n <= l1 +l2)? offset+n-l1 : l2;
                }
            }else if (offset>=l1 && offset<=l1+l2){//在l1和l2之间
                start1 = l1;
                end1 = l1;
                start2 = offset-l1;
                end2 = (offset + n <= l1 +l2)? offset+n-l1 : l2;
            }else {//超过l2
                start1 = l1;
                end1 = l1;
                start2 = l2;
                end2 = l2;
            }
            System.out.println(start1 + " " + end1 + " " + start2 + " " + end2);
        }
    }
}
