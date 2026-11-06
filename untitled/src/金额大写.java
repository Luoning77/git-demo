import java.util.Scanner;

public class 金额大写 {
    public static void main(String[] args) {
        String b[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String w[]={"佰","拾","万","仟","佰","拾","元"};
        Scanner sc = new Scanner(System.in);//1024
        int i,j;
        String je="";
        while (1 == 1) {
            System.out.print("请输入金额：");
            String money = sc.next();
            int wx=money.length();
            if (wx <= 1 && wx >= 7) {
                System.out.println("金额输入错误，请输入7位数金额！");
                continue;
            }else{
                for(i=0,j=7-wx;i<wx;i++,j++){
                    char a=money.charAt(i);
                    String n=b[a-48];
                    String m=w[j];
                    je=je+n+m;
                }
                for(i=7-wx-1;i>=0;i--){
                    je="零"+w[i]+je;
                }
                break;
            }
        }
        System.out.println("转换后金额："+je);
    }
}
