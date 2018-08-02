
import java.util.Scanner;

public class ThoughtWorks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String command1 = scanner.nextLine();//第一行输入 m*n的道路网格
            String command2 = scanner.nextLine();//第二行输入 联通性

            String[] ss = command1.split(" ");
            try {
                int m = Integer.parseInt(ss[0]);
                int n = Integer.parseInt(ss[1]);
                //初始化输出结果
                String[][] result = initResult(command1, m, n);


                //最终输出
                for (int i = 0; i < 2 * m + 1; i++) {
                    for (int j = 0; j < 2 * n + 1; j++) {
                        System.out.print(result[i][j]);
                    }
                    System.out.println("\n");
                }
            }catch (Exception e){

            }
        }
    }

    //初始化输出结果为 2n+1 2m+1的二维string数组
    public static String[][] initResult(String command1,int m,int n){

        //初始化输出结果 均为[w]
        String[][] result = new String[2*m+1][2*n+1];
        for (int i=0;i<2*m+1;i++){
            for (int j=0;j<2*n+1;j++){

                    result[i][j]="[W]";

            }
        }
        return result;
    }
    //获取第二行输入，并p
    public static void isConnected(String command2,String[][] result){
        String[] splitCommand2 = command2.split(";");
        for (int i = 0; i < splitCommand2.length; i++) {
            String[] splitPosition = splitCommand2[i].split(" ");
            //获取两个位置的坐标
            int x1 = Integer.parseInt(splitPosition[0].split(",")[0]);
            int y1 = Integer.parseInt(splitPosition[0].split(",")[1]);
            int x2 = Integer.parseInt(splitPosition[1].split(",")[0]);
            int y2 = Integer.parseInt(splitPosition[1].split(",")[1]);

            System.out.println(x1 + " " + x2 + " " + y1 + " " + y2 + " ");
            //
            if (x1 == x2) {
                if (y1 == y2) {
                    System.out.println("same point");
                } else if (Math.abs(y1 - y2) == 1) {
                    result[2 * x1 + 1][2 * y1 + 1] = "[R]";
                    result[2 * x2 + 1][2 * y2 + 1] = "[R]";
                    int wall = y1 > y2 ? y1 : y2;
                    result[2 * x2 + 1][2 * wall] = "[R]";
                } else {
                    System.out.println("Maze format error.");

                }
            } else {
                if (y1 == y2) {
                    if (Math.abs(x1 - x2) == 1) {
                        result[2 * x1 + 1][2 * y1 + 1] = "[R]";
                        result[2 * x2 + 1][2 * y2 + 1] = "[R]";
                        int wall = x1 > x2 ? x1 : x2;
                        result[2 * wall][2 * y1 + 1] = "[R]";

                    } else {
                        System.out.println("Maze format error.");

                    }
                } else {
                    System.out.println("Maze format error.");

                }
            }
        }
    }
}
