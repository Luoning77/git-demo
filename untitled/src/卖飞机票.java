import java.util.Scanner;

public class 卖飞机票 {/*
需求：

- 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
- 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入机票月份：");
        int yue=sc.nextInt();
        System.out.println("请输入座舱类型（经济舱=1，头等舱=2）：");
        int zc=sc.nextInt();
        System.out.println("请输入机票原价：");
        double jpyj=sc.nextDouble();
        double jg;
        jg=mjp(yue,zc,jpyj);
        if(jg==-1){
            System.out.println("座舱输入错误，经济舱请输入1，头等舱请输入2！");
        }else if (jg==-2){
            System.out.println("机票月份输入错误，请输入1~12月的有效月份！");
        }else{
            System.out.println("计算折扣后机票价格："+jg);
        }
    }

    public static double mjp(int yue,int zc,double jpyj){
        double jg;
        if(yue>=5&&yue<=10){
            if(zc==1){
                jg=jpyj*0.85;
            }else if(zc==2){
                jg=jpyj*0.9;
            }else{
                jg=-1;
            }
        }else if(yue>=1&&yue<=4||yue==11||yue==12){
            if(zc==1){
                jg=jpyj*0.65;
            }else if(zc==2){
                jg=jpyj*0.7;
            }else{
                jg=-1;
            }
        }else {
            jg=-2;
        }
        return jg;
    }
}
