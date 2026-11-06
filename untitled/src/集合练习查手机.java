import java.util.ArrayList;
import java.util.Scanner;

public class 集合练习查手机 {
    public static void main(String[] args) {
        /*添加手机对象并返回要求的数据

需求:

定义Javabean类:Phone

Phone属性:品牌,价格。

main方法中定义一个集合,存入三个手机对象。

分别为:小米,1000。苹果,8000。锤子2999。

定义一个方法,将价格低于3000的手机信息返回。*/
        集合练习查手机JB sj[]=new 集合练习查手机JB[3];
        Scanner sc=new Scanner(System.in);
        ArrayList<集合练习查手机JB> list=new ArrayList<集合练习查手机JB>();
        //ArrayList<集合练习查手机JB> list1=new ArrayList<集合练习查手机JB>();
        for (int i = 0; i < 3; i++) {
            sj[i]=new 集合练习查手机JB();
            System.out.println("请输入第"+(i+1)+"部手机品牌：");
            sj[i].setPp(sc.next());
            System.out.println("请输入第"+(i+1)+"部手机价格：");
            sj[i].setJg(sc.nextInt());
            list.add(sj[i]);
        }
        System.out.println();
        ArrayList<集合练习查手机JB> list1=pd(list);
        for (int i = 0; i < list1.size(); i++) {
            集合练习查手机JB s=list1.get(i);
            System.out.println("手机价格低于3000的手机");
            System.out.println("手机品牌："+s.getPp());
            System.out.println("手机价格："+s.getJg());
            System.out.println();
        }
    }

    public static ArrayList<集合练习查手机JB> pd(ArrayList<集合练习查手机JB> list){
        ArrayList<集合练习查手机JB> list1=new ArrayList<集合练习查手机JB>();
        for (int i = 0; i < list.size(); i++) {
            集合练习查手机JB s=list.get(i);
            if(s.getJg()<3000){
                list1.add(s);
            }
        }
        return list1;
    }
}
