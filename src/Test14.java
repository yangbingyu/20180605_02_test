/**
 * Created by dell on 2018/6/6.
 */
public class Test14 {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            if(i%3==0&&i%5==0){
                System.out.println("FlipFlop");
            }else if (i%3==0){
                System.out.println("Flip");
            }else if (i%5==0){
                System.out.println("Flop");
            }else{
                System.out.println(i);
            }
            i++;
        }
    }
}
