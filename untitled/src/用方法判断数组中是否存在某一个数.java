import java.util.Scanner;

public class 用方法判断数组中是否存在某一个数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pds=sc.nextInt();
        int sz[]={11,22,33,44,55,66,77,88,99};
        pd(sz,pds);
    }

    public static void pd(int sz1[],int pds1){
        int i;
        for(i=0;i<sz1.length;i++){
            if(pds1==sz1[i]){
                System.out.println(pds1+"存在，位置在数组中第"+(i+1)+"位");
                return;
            }
        }
        if(i==sz1.length){
            System.out.println(pds1+"不存在于该数组中！");
        }
    }
}
