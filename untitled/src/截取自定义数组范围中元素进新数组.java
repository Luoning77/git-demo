import java.util.Scanner;

public class 截取自定义数组范围中元素进新数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("开始位置：");
        int from = sc.nextInt();//开始位置
        System.out.println();
        System.out.print("结束位置：");
        int to = sc.nextInt();//结尾位置
        int sz[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        copy(sz, from, to);
    }

    public static void copy(int sz[], int from, int to) {
        int xsz[] = new int[sz.length];
        int i, n;
        for (i = from - 1, n = 0; i < to; i++, n++) {
            xsz[n] = sz[i];
        }
        System.out.print("截取的新数组：");
        for (i = 0; i < to-from+1; i++) {
            if (i < to-from) {
                System.out.print(xsz[i] + ",");
            } else if (i == to-from) {
                System.out.println(xsz[i] + ";");
            }
        }
        return;
    }
}
