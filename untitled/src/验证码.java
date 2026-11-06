import java.util.Random;

public class 验证码 {
    public static void main(String[] args) {
        char yzmk[] = new char[62];
        int i;
        char xx = 'a';
        char dx = 'A';
        char sz='0';
        for (i = 0; i < 62; i++) {
            if (i < 26) {
                yzmk[i] = xx++;
            } else if (i<52) {
                yzmk[i] = dx++;
            }else{
                yzmk[i]=sz++;
            }
        }//存入大小写的26个英文字母,0-9十个数字；共62

        Random r=new Random();
        StringBuilder mm=new StringBuilder();
        for(i=0;i<5;i++){
            if(i!=4){
            mm.append(yzmk[r.nextInt(52)]);}//前四位为字母
            if(i==4){
                mm.append(yzmk[r.nextInt(10)+52]);//最后一位为数字
            }
        }

        System.out.println(mm.toString());//验证以上是否为4个随机字母+1个数字

        char arr[]=mm.toString().toCharArray();//把StringBuilder的字符串mm——>为String字符串,再次由String——>拆分成的数组arr[]
        char t;

        int t1=r.nextInt(4);
        t=arr[arr.length-1];
        arr[arr.length-1]=arr[t1];
        arr[t1]=t;//随机一个前四位字母和第五位数字交换

        String zg=new String(arr);//数组——>String字符串
        System.out.println(zg);
    }
}
