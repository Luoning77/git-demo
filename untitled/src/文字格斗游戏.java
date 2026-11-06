import java.util.Random;
import java.util.Scanner;

public class 文字格斗游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        文字格斗游戏jB gd=new 文字格斗游戏jB();
        String name1="元神";//角色1名字；随机伤害，血量的方法
        int sh1=sjsh1();
        int xl1=sjxl1();
        gd.setName1(name1);
        gd.setSh1(sh1);
        gd.setXue1(xl1);
        name1= gd.getName1();
        sh1= gd.getSh1();
        xl1= gd.getXue1();

        String name2="明朝";//角色2名字；随机伤害，血量的方法
        int sh2=sjsh2();
        int xl2=sjxl2();
        gd.setName2(name2);
        gd.setSh2(sh2);
        gd.setXue2(xl2);
        name2= gd.getName2();
        sh2= gd.getSh2();
        xl2= gd.getXue2();

        System.out.println("玩家1："+name1+"\t"+"    玩家2:"+name2);//角色1和角色2的介绍
        System.out.println("玩家1伤害："+sh1+"\t"+"    玩家2伤害:"+sh2);
        System.out.println("玩家1血量："+xl1+"\t"+"玩家2血量:"+xl2);
        System.out.println();

        int syxl;
        for(int i=1;xl1>=0&&xl2>=0;i++){
            if (i%2==1){
                syxl=xl2-sh1;
                xl2=syxl;
                if(syxl<=0){
                    System.out.println("在第"+i+"回合中,"+name2+"被"+name1+"KO了！！！");
                    System.out.println(name1+"胜利！！！");
                }else{
                System.out.println("在第"+i+"回合中,"+name1+"轻轻的打了"+name2+"一拳,"+"造成了"+sh1+"点伤害,"+name2+"还剩"+syxl+"点血量");}
            }else if(i%2==0){
                syxl=xl1-sh2;
                xl1=syxl;
                if(syxl<=0){
                    System.out.println("在第"+i+"回合中,"+name1+"被"+name2+"KO了！！！");
                    System.out.println(name2+"胜利！！！");
                }else{
                System.out.println("在第"+i+"回合中,"+name2+"轻轻的打了"+name1+"一拳,"+"造成了"+sh2+"点伤害,"+name1+"还剩"+syxl+"点血量");}
            }
        }
    }

    public static int sjsh1() {
        int sjsh1;
        Random r = new Random();
        sjsh1=r.nextInt(21)+10;
        return sjsh1;
    }
    public static int sjsh2() {
        int sjsh2;
        Random r = new Random();
        sjsh2=r.nextInt(16)+15;
        return sjsh2;
    }

    public static int sjxl1() {
        int sjxl1;
        Random r = new Random();
        sjxl1=r.nextInt(51)+100;
        return sjxl1;
    }
    public static int sjxl2() {
        int sjxl2;
        Random r = new Random();
        sjxl2=r.nextInt(51)+90;
        return sjxl2;
    }
}
