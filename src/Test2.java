import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入银行存款，单位为万元");
        int money=scanner.nextInt();
        if(money>=500){
            System.out.println("凯迪拉克");
        }else if(money>=100){
            System.out.println("帕萨特");
        }else if(money>=50){
            System.out.println("依兰特");
        }else if(money>=10){
            System.out.println("奥拓");
        }else if(money<10){
            System.out.println("捷安特");
        }
    }
}
