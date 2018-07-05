package Interview;

import java.util.*;

public class Lianjia1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){

            List<List<Integer>> kaiguan = new ArrayList<>();
            int n = scanner.nextInt();
            for (int i=0;i<n;i++){
                int k = scanner.nextInt();
                List<Integer> xuhao = new ArrayList<>();
                for (int j=0;j<k;j++){
                    xuhao.add(scanner.nextInt());
                }
                kaiguan.add(xuhao);
            }
            //将list根据size排序
            Collections.sort(kaiguan, new Comparator<List>(){

                @Override
                public int compare(List o1, List o2) {
                    if(o1.size()<o2.size()){
                        return 1;
                    }
                    if(o1.size()==o2.size()){
                        return 0;
                    }
                    return -1;
                }
            });
            System.out.println(kaiguan);
            int count = 0;

            int[] liang = new int[1000];
            for (int i=0;i<kaiguan.size();i++){
                int temp = 0;
                for (int j=0;j<kaiguan.get(i).size();j++){
                    if (liang[kaiguan.get(i).get(j)] != 1){
                        temp++;
                    }else {
                        temp--;
                    }

                }

                if (temp > 0){
                    for (int j=0;j<kaiguan.get(i).size();j++){
                        liang[kaiguan.get(i).get(j)] = 1;
                    }
                    count = count+ temp;
                }
            }
            System.out.println(count);
        }

//    }
}
