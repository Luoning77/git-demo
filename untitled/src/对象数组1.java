import java.util.Scanner;

public class 对象数组1 {
    public static void main(String[] args) {
        对象数组1JB jb[]=new 对象数组1JB[3];
        对象数组1JB c[]=new 对象数组1JB[3];

        对象数组1JB jb1=new 对象数组1JB("a001","华为p40",4599.0,100);
        对象数组1JB jb2=new 对象数组1JB("a002","拯救者y9000",15999.0,60);
        对象数组1JB jb3=new 对象数组1JB("a003","西数sn5000",1199.0,200);

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<c.length;i++) {
            /*对象数组1JB c1 = new 对象数组1JB("理想", 284599, "黑色");
            对象数组1JB c2 = new 对象数组1JB("小米", 259999, "墨绿色");
            对象数组1JB c3 = new 对象数组1JB("特斯拉", 221199, "白色");*/

            //c[i]=new 对象数组1JB(sc.next(), sc.nextInt(), sc.next());

            对象数组1JB cl=new 对象数组1JB();
            System.out.println("请输入第"+(i+1)+"辆车品牌：");
            cl.setName1(sc.next());

            System.out.println("请输入第"+(i+1)+"辆车价格：");
            cl.setJg1(sc.nextDouble());

            System.out.println("请输入第"+(i+1)+"辆车颜色：");
            cl.setYs(sc.next());

            c[i]=new 对象数组1JB(cl.getName1(), cl.getJg1(), cl.getYs());
            System.out.println();
        }
        jb[0]=jb1;
        jb[1]=jb2;
        jb[2]=jb3;
        /*
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;*/

        for(int i=0;i<jb.length;i++){
            对象数组1JB sp=jb[i];
            System.out.printf("商品ID：%s\n",sp.getId());
            System.out.printf("商品名：%s\n",sp.getName());
            System.out.printf("商品价格：%f\n",sp.getJg());
            System.out.printf("商品库存：%d\n",sp.getKc());
            System.out.println();
        }
        System.out.println();
        System.out.println();
        Double sum=0.0;
        for(int i=0;i<c.length;i++){
            对象数组1JB cl=c[i];
            System.out.println("车辆品牌："+c[i].getName1());
            System.out.printf("车辆价格：%.2f",cl.getJg1());
            sum+=c[i].getJg1();
            System.out.println("车辆颜色："+cl.getYs());
            System.out.println();
        }
        System.out.printf("车辆总价：%.2f",sum);
        double avg=sum/3.0;
        System.out.printf("车辆平均价格：%.2f",avg);
        System.out.println();
        for(int i=0;i<c.length;i++){
            double xiao=c[i].getJg1();
            if(xiao<avg){
                System.out.println("第"+(i+1)+"车辆价格"+xiao+"元,小于平均值"+avg);
            }
        }
    }
}
