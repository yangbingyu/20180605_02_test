import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统 > 幸运抽奖\n");
        int vipno=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入四位会员号：");
        vipno=scanner.nextInt();
        int bai=vipno%1000/100;
        int ram=(int)(Math.random()*10);
        System.out.println("产生的随机数是："+ram);
        if(bai==ram){
            System.out.println(vipno+"号顾客是幸运客户，获精品Mp3一个");
        }else{
            System.out.println(vipno+"号顾客，谢谢您的支持");
        }
    }
}
