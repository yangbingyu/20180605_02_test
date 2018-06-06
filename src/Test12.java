/**
 * Created by dell on 2018/6/6.
 */
public class Test12 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (true){
            if(i%3!=0){
                sum+=i;
                System.out.println(i);
            }
            i++;
            if (sum>=2000){
                break;
            }

        }
        System.out.println(sum);
    }
}
