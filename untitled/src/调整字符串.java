import java.util.Scanner;

public class 调整字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int count=0;
        String s="deabc";
            System.out.println("请输入需要调整的字符串:");
            String zfc = sc.next();
            String zfch1;

        for(int j=0;j<zfc.length();j++) {
            count++;
            StringBuilder zfch = new StringBuilder();
            for (i = 1; i < zfc.length(); i++) {
                char a = zfc.charAt(i);
                zfch.append(a);
            }
            zfc=zfch.append(zfc.charAt(0)).toString();
            System.out.println(zfch.toString());
            if(s.equals(zfch.toString())){
                zfch1=zfch.toString();
                System.out.println("调整后："+zfch1);
                System.out.println("ture!!!");
                break;
            }
        }

        if(count==zfc.length()) {
            System.out.println("falsh >_<");
        }
    }
}