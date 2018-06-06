import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入是否是会员：是（y）/否（其他）");
        String customer=scanner.next();
        System.out.println("请输入购物金额：");
        double money=scanner.nextDouble();
        if (customer.equals("y")){
            if(money>=200){
                money=money*0.75;
            }else{
                money=money*0.8;
            }

        }else{
            if (money>=100){
                money=money*0.9;
            }
        }
        System.out.println("实际支付："+money);
    }
}
