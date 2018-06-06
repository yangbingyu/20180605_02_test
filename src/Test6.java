import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入消费金额：");
        float money=scanner.nextFloat();
        System.out.println("是否参加优惠换购活动：\n");
        System.out.println("1:满50元，加2元换购百事可乐饮料1瓶\n");
        System.out.println("2:满100元，加3元换购500ml可乐一瓶\n");
        System.out.println("3:满100元，加10元换购5公斤面粉\n");
        System.out.println("4:满200元，加10元可换的1个苏泊尔炒菜锅\n");
        System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶\n");
        System.out.println("0：不换购");
        System.out.println("请选择：");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:if (money>=50){
                System.out.println("本次消费总金额："+(money+2));
                System.out.println("成功换购：百事可乐饮料一瓶"+"\n");
            }else{
                System.out.println("不能换购");
            } break;
            case 2:if (money>=100){
                System.out.println("本次消费总金额："+(money+3)+"\n");
                System.out.println("成功换购：500ml可乐一瓶");
            } else{
                System.out.println("不能换购");
            } break;
            case 3:if (money>=100){
                System.out.println("本次消费总金额："+(money+10)+"\n");
                System.out.println("成功换购：5公斤面粉");
            } else{
                System.out.println("不能换购");
            } break;
            case 4:if (money>=200){
                System.out.println("本次消费总金额："+(money+10)+"\n");
                System.out.println("成功换购：1个苏泊尔炒菜锅");
            } else{
                System.out.println("不能换购");
            } break;
            case 5:if (money>=200){
                System.out.println("本次消费总金额："+(money+20)+"\n");
                System.out.println("成功换购：欧莱雅爽肤水一瓶");
            } else{
                System.out.println("不能换购");
            } break;
            case 0:
                System.out.println("不换购，谢谢惠顾");break;
            default:
                System.out.println("谢谢惠顾");break;
        }


    }
}
