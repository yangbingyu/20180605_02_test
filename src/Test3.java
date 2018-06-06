import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的成绩，单位为秒");
        double time=scanner.nextDouble();

        if(time<10){
            System.out.println("请输入您的性别");
            String sex=scanner.next();
            if (sex.equals("女")){
                System.out.println("恭喜您进入女子组决赛");
            }if (sex.equals("男")) {
                System.out.println("恭喜您进入男子组决赛");
            }
        }else{
            System.out.println("很遗憾，您未能进入决赛");
        }
    }
}
