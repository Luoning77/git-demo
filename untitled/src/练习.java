import java.util.Random;
import java.util.Scanner;

public class 练习 {
    public static void main(String[] args) {
        System.out.print("用户正确用户名：");
        String name1="niubi";
        System.out.println(name1);
        System.out.print("用户正确密码：");
        String mm1="12345";
        System.out.println(mm1);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String name=sc.next();
            System.out.println("请输入密码：");
            String mm=sc.next();
            if(name1.equals(name)&&mm1.equals(mm)){
                System.out.println("用户登录成功！");
                break;
            }else{
                System.out.println("输入错误！还剩"+(3-i-1)+"次机会");
                continue;
            }
        }
        if (i==3){
            System.out.println("机会用尽，请稍后重试！");
        }

        System.out.println();
        int dx=0,xs=0,sz=0;
        System.out.print("请输入一个字符串：");
        String zfc=sc.next();
        for(i=0;i<zfc.length();i++){
            char c=zfc.charAt(i);
            if(c>=65&&c<=90){
                dx++;
            }else if (c>=97&&c<=122){
                xs++;
            }else if(c>=48&&c<=57){
                sz++;
            }
        }
        System.out.println("该字符串中包含大写字母"+dx+"个,小写字母"+xs+"个,数字"+sz+"个");
    }
}
