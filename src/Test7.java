import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数");
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        System.out.println("请输入操作：");
        String op=scanner.next();
        switch (op){
            case "+":
                System.out.println(a+b);break;
            case "-":
                System.out.println(a-b);break;
            case "*":
                System.out.println(a*b);break;
            case "/":
                System.out.println(a/b);break;
        }
    }


}
