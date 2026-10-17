import java.util.Scanner;

public class 输入成绩区分等级 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入成绩（百分制）：");
        int cj=sc.nextInt();
        switch(cj/10){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("成绩为"+cj+",不合格");
                break;
            case 6:
                System.out.println("成绩为"+cj+"，及格");
                break;
            case 7:
            case 8:
                System.out.println("成绩为"+cj+"，良好");
                break;
            case 9:
            case 10:
                System.out.println("成绩为"+cj+"，优秀");
                break;
            default:
                System.out.println("输入成绩错误！");
        }
    }
}
