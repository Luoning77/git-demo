import java.util.Random;

public class 数字加密 {
    /*
    案例　数字加密

需求：

- 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
- 规则如下：
先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
     */
    public static void main(String[] args) {
        Random r = new Random();
        int mm[] = new int[4];
        int i,jmh;
        for (i = 0; i < mm.length; i++) {
            if (i != 0) {
                mm[i] = r.nextInt(10);
            } else {
                mm[i] = r.nextInt(9) + 1;
            }
        }
        System.out.print("加密前密码:");
        for (i = 0; i < mm.length; i++) {
            System.out.print(mm[i]);
        }
        System.out.println();
        System.out.print("加密后密码:");
        jmh=jm1(mm);
        System.out.println(jmh);
        System.out.println();

        int jiemi=0;
        int jiemi1[]=new int[4];
        System.out.print("加密后再解密密码验证:");
        for(i=0;i<jiemi1.length;i++){
            jiemi1[i]=(jmh+10)-5;
            jiemi=jiemi*10+mm[i];
        }
        System.out.print(jiemi);
    }


    public static int jm1(int mm[]) {
        int jm = 0;
        int i, n,jmh=0;
        int mm1[] = new int[mm.length];
        for (i = 0, n = mm.length - 1; i < mm.length && n >= 0; i++, n--) {
            mm1[n] = (mm[i] + 5)% 10;
        }
        for(i=0;i<mm1.length;i++){
            jmh=jmh*10+mm1[i];
        }
        return jmh;
    }


}
