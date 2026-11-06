public class 登录 {
    public static void main(String[] args) {
        登录jbean dj=new 登录jbean("大义",12345,12345,"22212邮箱",1,20);//把像输入的值传递给JavaBean中的set
        dj.setName("long");
        dj.setMima(12345);
        dj.setQrmima(12345);
        dj.setYx("22212邮箱");
        dj.setXb(1);
        dj.setNn(20);

        int mima,qrmima,xb,nn;//定义变量名来容纳JavaBean中get的返回的值
        String name,yx;
        name=dj.getName();
        mima= dj.getMima();
        qrmima= dj.getQrmima();
        yx=dj.getYx();
        xb=dj.getXb();
        nn= dj.getNn();

        System.out.println("姓名："+name);//输出JavaBean中get的返回的值
        System.out.println("输入密码："+mima);
        System.out.println("请确认密码正确："+qrmima);
        System.out.println("请输入邮箱："+yx);
        if (xb==1){
            System.out.println("性别：男");
        }else if(xb==0){
            System.out.println("性别：女");
        }else{
            System.out.println("输入性别出错！");
        }
        System.out.println("年龄："+nn);
    }
}
