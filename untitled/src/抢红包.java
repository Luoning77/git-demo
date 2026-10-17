import java.util.Random;

public class 抢红包 {
    public static void main(String[] args) {
        /*
        、抢红包

需求：

一个大V直播抽奖，奖品是现金红包，分别有{2, 588, 888, 1000, 10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
         */
        int i=0;
        int hb[]={2,588,888,1000,10000};
        int xb;
        Random r=new Random();
        while(i<hb.length){
            xb=r.nextInt(5);
            if(hb[xb]!=-1){
                System.out.println("第"+(i+1)+"个红包："+hb[xb]);
                hb[xb]=-1;
                i++;
            }
        }
        int arr[][]={{1,2},{1,3}};
    }
}
