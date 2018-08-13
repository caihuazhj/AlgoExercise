package interviewExercise;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int s = 0;
            int t = n - k;
            s += t*(t+1)/2;
            for(;n>k;n--){
                if(n%(n-k) == k){
                    s++;
                }else{
                    break;
                }
            }
            System.out.println(s);
        }
    }
}