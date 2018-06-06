import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入任意数字，最多不超过10个，输入999结束");
        int sum=0;
        int count=0;
        int i=0;
        while (i<10){
            int num=scanner.nextInt();
            if (num==999){
                break;
            }
            if (num>0){
                count++;
                sum+=num;
            }
            i++;
        }
        System.out.println("正数的个数为："+count+"，正数的和为："+sum);
    }
}
