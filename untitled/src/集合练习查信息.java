import java.util.ArrayList;
import java.util.Scanner;

public class 集合练习查信息 {
    public static void main(String[] args) {
        集合练习查信息JB xs[]=new 集合练习查信息JB[3];//三套JavaBean中的信息
        ArrayList<集合练习查信息JB> list=new ArrayList<集合练习查信息JB>();//泛型主要写引用类型（包括普通的类）
        int i;
        Scanner sc=new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            xs[i] = new 集合练习查信息JB();//用于输入JavaBean中的信息
            System.out.println("请输入第"+(i+1)+"位学生的id：");
            xs[i].setId(sc.next());
            System.out.println("请输入第"+(i+1)+"位学生的名字：");
            xs[i].setName(sc.next());
            System.out.println("请输入第"+(i+1)+"位学生的密码：");
            xs[i].setMm(sc.next());
            list.add(xs[i]);//把一个学生的id，name，mm一并填入一个JavaBean 对象（即一个集合元素（一格））
            System.out.println();
        }
        System.out.println("请输入需要查询学生的id：");
        String id1=sc.next();
        boolean pd=cx(list,id1);
        System.out.println(pd);

        if(cx1(list,id1)!=-1&&cx(list,id1)==true){
            int fh=cx1(list,id1);
            System.out.println("id:"+xs[fh].getId());
            System.out.println("name:"+xs[fh].getName());
            System.out.println("mm:"+xs[fh].getMm());
        }
    }

    public static boolean cx(ArrayList<集合练习查信息JB> list,String id){
        int i;
        for (i = 0; i < list.size(); i++) {
            集合练习查信息JB s=list.get(i);
            if(id.equals(s.getId())){
                return true;
            }
        }
        return false;
    }
    public static int cx1(ArrayList<集合练习查信息JB> list,String id){
        int i;
        for (i = 0; i < list.size(); i++) {
            集合练习查信息JB s=list.get(i);
            if(id.equals(s.getId())){
                int fh=i-1;
                return fh;
            }
        }
        return -1;
    }
}
