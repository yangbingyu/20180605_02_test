import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        ArrayList l=new ArrayList();
        getPosition(num,l);
        System.out.println("整数的位数是："+l.size());

    }
        public static ArrayList<Integer> getPosition(int num, ArrayList<Integer> list) {
            if ((num / 10 == 0) && (num % 10 == 0)) {
                return list;
            }
            list.add(num % 10);
            getPosition(num / 10, list);
            return list;
        }


}
