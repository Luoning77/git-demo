import java.util.Scanner;
import java.util.StringJoiner;

public class 转换罗马数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringJoiner lm = new StringJoiner(",", "[", "]");
        String lmb[] = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        while (1 == 1) {
            System.out.println("请输入需要转换的数字：");
            String sz = sc.next();
            int i;
            int count=0;
            if (sz.length() <= 9) {
                for (i = 0; i < sz.length(); i++) {
                    char a = sz.charAt(i);
                    if (a >= '0' && a <= '9'){
                        count++;
                    }
                }
                if(count==sz.length()){
                    for (i = 0; i < sz.length(); i++) {
                        char a = sz.charAt(i);
                            lm.add(lmb[a-'0']);
                        }
                    String lmh=lm.toString();
                    System.out.println("转换后："+lmh);
                    break;
                }else {

                    System.out.println("您输入的数字不合法，含有非数字内容，请重新输入！");
                    continue;
                }
            }else{
                System.out.println("您输入的数字不合法，超出数字长度限制，请重新输入！");
                continue;
            }
        }
    }
}
