import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("1.登陆系统\n");
        System.out.println("2.退出\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的选择：");
        int x=scanner.nextInt();
        SecMenu s=new SecMenu();
        switch (x){
            case 1:
                s.menu();break;
            case 2:
                System.out.println("您已退出");break;
            default:
                System.out.println("输入不合法");break;
        }
    }
}
