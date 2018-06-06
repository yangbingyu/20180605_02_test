/**
 * Created by dell on 2018/6/6.
 */
public class Test11 {
    public static void main(String[] args) {
       int a=1;
       int b=1;
       int i=3;
       System.out.printf(a+"\t");
       System.out.printf(b+"\t");
       while (i<20){
           a=a+b;
           System.out.printf(a+"\t");
           if (i%5==0){
               System.out.println();
           }

           i++;
           b=b+a;
           System.out.printf(b+"\t");
           if (i%5==0){
               System.out.println();
           }

           i++;
       }
    }
}
