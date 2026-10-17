import java.util.Scanner;

public class 评委打分 {
    /*
    评委打分

需求：

在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
     */
    public static void main(String[] args) {
        double pw[]=new double[6];
        double avg=df1(pw);
        System.out.println("本手歌曲的选手得分："+(avg/4.0));
    }

    public static int df1(double pw[]){
        int df=0;
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<pw.length;i++){
            System.out.print("第"+(i+1)+"位评委打分:");
            pw[i]=sc.nextDouble();
            System.out.println();
        }
        double max,min;
        int maxxb,minxb;
        max=min=pw[0];
        maxxb=minxb=0;
        for(i=0;i<pw.length;i++){
            if(max<pw[i]){
                max=pw[i];
                maxxb=i;
            }
            if(min>pw[i]){
                min=pw[i];
                minxb=i;
            }
        }
        pw[maxxb]=pw[minxb]=0;
        for(i=0;i<pw.length;i++){
            df+=pw[i];
        }
        return df;
    }
}
