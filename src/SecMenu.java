import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class SecMenu {
    public void menu(){
        System.out.println("1.客户信息管理\n");
        System.out.println("2.购物清算\n");
        System.out.println("3.真情回馈\n");
        System.out.println("4.注销\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的选择：");
        int choose=scanner.nextInt();
        switch(choose){
            case 1:
                System.out.println("购物管理系统>客户信息管理");;break;
            case 2:
                System.out.println("您已退出");break;
        }

    }
}
