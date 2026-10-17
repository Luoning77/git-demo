import java.util.Random;
import java.util.Scanner;

public class 双色球 {
    /*
    投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1－33中选择；蓝色球号码从1－16中选择。
     */
    public static void main(String[] args) {
        int zj[] = new int[7];
        int sr[] = new int[7];
        int sr1;
        Random r = new Random();
        int hong, lan;
        boolean pd;
        int i;
        for (i = 0; i < zj.length - 1; i++) {
            hong = r.nextInt(33) + 1;
            pd = pdcfhong(hong, zj);
            if (pd == false) {
                i--;
                continue;
            } else {
                zj[i] = hong;
            }
        }
        zj[6] = r.nextInt(16) + 1;
        System.out.print("中奖号码：");
        for (i = 0; i < zj.length; i++) {
            System.out.print(zj[i] + " ");
        }
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < zj.length - 1; i++) {
            System.out.print("用户请输入第" + (i + 1) + "个红球号码：");
            sr[i] = sc.nextInt();
            if (pdfwhong(sr[i]) && pdsrcfhong(sr[i], sr, i)) {
                continue;
            } else {
                System.out.println("输入红色双色球重复或超出范围(1~33),重新输入！");
                i--;
                continue;
            }
        }
        while (1 == 1) {
            System.out.print("用户请输入蓝球号码：");
            sr[sr.length - 1] = sc.nextInt();
            if (pdfwlan(sr[sr.length - 1])) {
                break;
            } else {
                System.out.println("蓝球超出范围（中奖号范围1~16）,重新输入！");
                continue;
            }
        }
        int hongzj = 0, lanzj = 0;
        for (i = 0; i < sr.length - 1; i++) {
            if (sr[i] == zj[i]) {
                hongzj++;
            }
        }
        if (sr[zj.length - 1] == zj[zj.length - 1]) {
            lanzj++;
        }
        System.out.println("红色双色球中奖次数：" + hongzj);
        System.out.println("蓝色双色球中奖次数：" + lanzj);
    }

    public static boolean pdcfhong(int hong, int zj[]) {
        int i;
        for (i = 0; i < 7 - 1; i++) {
            if (hong != zj[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean pdfwhong(int sr1) {
        if (sr1 >= 1 && sr1 <= 33) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pdfwlan(int sr1) {
        if (sr1 >= 1 && sr1 <= 16) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pdsrcfhong(int sr1, int sr[],int n) {
        int i;
        for (i = 0; i < 7 - 1; i++) {
            if (i != n) {
                if (sr1 != sr[i]) {
                    continue;
                } else {
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}
