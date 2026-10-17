public class 女朋友对象测试1 {
    String name;
    private int age;
    String xb;
    double sg;

    public void eat(){
        System.out.print("吃吃吃吃吃");
    }
    public void sj(){
        System.out.print("睡睡睡睡睡");
    }

    public void setAge(int age){
        if(age>18&&age<30){
            this.age=age;
        }else{
            System.out.println("输入错误！");
        }
        return;
    }
    public int getAge(){
       return age;
    }
}
