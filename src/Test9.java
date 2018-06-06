/**
 * Created by dell on 2018/6/5.
 */
public class Test9 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=1000;i++){
            if(i%7!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
