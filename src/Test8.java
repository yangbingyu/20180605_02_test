/**
 * Created by dell on 2018/6/5.
 */
public class Test8 {
    public static void main(String[] args) {
        double money=10000;
        for (int year=1;year<=5;year++){
            money=money*(1+0.003);
        }
        System.out.println("五年后，获得的本金是："+money);
    }
}
