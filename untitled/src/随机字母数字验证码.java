import java.util.Random;

public class 随机字母数字验证码 {
    /*
    需求：

- 定义方法实现随机产生一个5位的验证码
- 验证码格式：
- 长度为5
- 前四位是大写字母或者小写字母
- 最后一位是数字
     */
    public static void main(String[] args) {
        System.out.print("随机验证码：");
        int i;
        char yzm[]=new char[5];
        Random r=new Random();
        int sz=r.nextInt(10);
        for(i=0;i<yzm.length-1;i++){
            int zmd=r.nextInt(26)+65;
            int zmx=r.nextInt(26)+97;
            int sjs=r.nextInt(2)+1;
            if(sjs==1){
                yzm[i]=(char)zmd;
            }else if (sjs==2){
                yzm[i]=(char)zmx;
            }
        }
        for(i=0;i<yzm.length;i++){
            if(i==yzm.length-1){
                System.out.print(sz);
            }else{
                System.out.print(yzm[i]);
            }
        }
    }

    /*public static void yzm1(int yzm[]){
        int i;
        char yzm[]=new char[5];
        Random r=new Random();
        int sz=r.nextInt(10);
        for(i=0;i<yzm.length-1;i++){
            int zmd=r.nextInt(26)+65;
            int zmx=r.nextInt(26)+97;
            int sjs=r.nextInt(2)+1;
            if(sjs==1){
                yzm[i]=(char)zmd;
            }else if (sjs==2){
                yzm[i]=(char)zmx;
            }
        }
        for(i=0;i<yzm.length;i++){
            if(i==yzm.length-1){
                System.out.print(sz);
            }else{
                System.out.print(yzm[i]);
            }
        }
        return;
    }*/
}
