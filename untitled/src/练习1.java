import java.util.Random;//5个随机数的max,min,sum,avg
import java.util.Scanner;

public class 练习1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int a[]=new int[5];
        int i;
        for(i=0;i<a.length;i++){
            int n=r.nextInt(91)+10;//随机数范围10~100
            a[i]=n;
        }
        System.out.print("生成的5个随机数：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n");
        int max,min,sum,t;
        double avg;
        max=min=sum=a[0];
        for(i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
            sum+=a[i];
        }
        avg=sum/5.0;
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("总和："+sum);
        System.out.println("平均值："+avg);
    }
}
