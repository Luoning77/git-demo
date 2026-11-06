import java.util.Scanner;

public class 对象数组5 {
    /*
   案例 对象数组5

定义一个长度为 3 的数组，数组存储 1~3 名学生对象作为初始数据，学生对象的学号，姓名各不相同。

学生的属性：学号，姓名，年龄。(y)

要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。(y)
要求2：添加完毕之后，遍历所有学生信息。(y)
要求3：通过 id 删除学生信息
　　　　如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
要求5：查询数组 id 为 "heima002" 的学生，如果存在，则将他的年龄 +1 岁
    */
    public static void main(String[] args) {
        对象数组5JB xs[] = new 对象数组5JB[3];
        Scanner sc = new Scanner(System.in);
        int i, rs1;
        while (1 == 1) {
            System.out.println("请输入学生人数：");
            int rs = sc.nextInt();
            rs1 = rs;
            if (rs <= 3 && rs >= 1) {
                for (i = 0; i < rs; i++) {
                    xs[i] = new 对象数组5JB();
                    if (i == 0) {
                        System.out.println("第" + (i + 1) + "个学生的学号：");
                        xs[i].setXuehao(sc.next());

                    }
                    while (i != 0) {
                        System.out.println("第" + (i + 1) + "个学生的学号：");
                        xs[i].setXuehao(sc.next());
                        for (int n = 0; n < i; n++) {
                            if (xs[n].getXuehao().equals(xs[i].getXuehao())) {
                                System.out.println("该学生的与其他学生学号重复，请重新输入！");
                                n--;
                                System.out.println("第" + (i + 1) + "个学生的学号：");
                                xs[i].setXuehao(sc.next());
                            }
                        }
                        break;
                    }
                    System.out.println("第" + (i + 1) + "个学生的名字：");
                    xs[i].setName(sc.next());
                    while (1 == 1) {
                        System.out.println("第" + (i + 1) + "个学生的年龄：");
                        xs[i].setNl(sc.nextInt());
                        if (xs[i].getNl() == -1) {
                            System.out.println("年龄输入错误！请输入6-30岁之间的学生");
                            continue;
                        }
                        break;
                    }
                    System.out.println();
                    if ((i + 1) == rs) {
                        break;
                    }
                }
            } else {
                System.out.println("人数不符合要求，人数要求1-3名！");
                continue;
            }
            if ((i + 1) == rs) {
                break;
            }
        }
        System.out.println("在原基础上的人数中增加一个学生:");
        对象数组5JB xs1[] = new 对象数组5JB[xs.length + 1];
        for (i = 0; i < (rs1 + 1); i++) {
            if (i != rs1) {
                xs1[i] = xs[i];
            } else {
                xs1[i] = new 对象数组5JB();
                while (1 == 1) {
                    System.out.println("第" + (rs1 + 1) + "个学生的学号：");
                    xs1[rs1].setXuehao(sc.next());
                    for (i = 0; i < rs1; i++) {
                        if (xs1[rs1].getXuehao().equals(xs[i].getXuehao())) {
                            System.out.println("该学生的与其他学生学号重复，请重新输入！");
                            i--;
                            System.out.println("第" + (rs1 + 1) + "个学生的学号：");
                            xs1[rs1].setXuehao(sc.next());
                        }
                    }
                    break;
                }
                System.out.println("第" + (i + 1) + "个学生的名字：");
                xs1[i].setName(sc.next());
                while (1 == 1) {
                    System.out.println("第" + (i + 1) + "个学生的年龄：");
                    xs1[i].setNl(sc.nextInt());
                    if (xs1[i].getNl() == -1) {
                        System.out.println("年龄输入错误！请输入6-30岁之间的学生");
                        continue;
                    }
                    break;
                }
            }
        }
        for (i = 0; i < xs1.length; i++) {
            if (xs1[i] == null) {
                continue;
            } else {
                System.out.println("第" + (i + 1) + "名学生的学号：" + xs1[i].getXuehao());
                System.out.println("第" + (i + 1) + "名学生的姓名：" + xs1[i].getName());
                System.out.println("第" + (i + 1) + "名学生的年龄：" + xs1[i].getNl());
                System.out.println();
            }
        }
        int count=rs1+1;
        int index=-1;
        System.out.println("请输入需要删除学生的学号：");
        String id = sc.next();
        for(i=0;i<xs1.length;i++){
            if(id.equals(xs1[i].getXuehao())){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("删除失败,学号不存在！");
        }else{
            for(i=0;i<count-1;i++){
                xs1[i]=xs1[i+1];
            }
        }
        xs1[count-1]=null;
        count--;
        System.out.println("该学生信息删除成功！");
        System.out.println("目前删掉后的学生信息：");
        for(i=0;i<count;i++){
            System.out.println("执行删除后第" + (i + 1) + "名学生的学号：" + xs1[i].getXuehao());
            System.out.println("执行删除后第" + (i + 1) + "名学生的姓名：" + xs1[i].getName());
            System.out.println("执行删除后第" + (i + 1) + "名学生的年龄：" + xs1[i].getNl());
            System.out.println();
        }
        for(i=0;i<count;i++){
            if("heima002".equals(xs1[i].getXuehao())){
                int a=xs1[i].getNl()+1;
                xs1[i].setNl(a);
                System.out.println("更新学号为“heima002”的学生信息：");
                System.out.println("执行删除后该学生的学号：" + xs1[i].getXuehao());
                System.out.println("执行删除后该学生的姓名：" + xs1[i].getName());
                System.out.println("执行删除后该学生的年龄：" + xs1[i].getNl());
                break;
            }
        }
    }
}
        /*
        //for(i=0;i<xs1.length;i++){
        for (i = 0, rs = 0; i < xs1.length; i++, rs++) {
            if (id.equals(xs1[i].getXuehao())) {
                xs1[i].setXuehao(null);
                /*xs1[i].setName(null);
                xs1[i].setNl(-2);
            }
            if ("null".equals(xs1[i].getXuehao())) {
                rs--;
                continue;
            } else {
                System.out.println("执行删除后第" + (rs + 1) + "名学生的学号：" + xs1[i].getXuehao());
                System.out.println("执行删除后第" + (rs + 1) + "名学生的姓名：" + xs1[i].getName());
                System.out.println("执行删除后第" + (rs + 1) + "名学生的年龄：" + xs1[i].getNl());
            }
        }


        /*int rs;
        for(i=0,rs=0;i<xs1.length;i++,rs++){
            xs1[i] = new 对象数组5JB();
            /*if(!"null".equals(xs1[i].getXuehao())&&!"null".equals(xs1[i].getName())&&xs1[i].getNl()!=-2){
                System.out.println("执行删除后第"+(rs+1)+"名学生的学号："+xs1[i].getXuehao());
            }else{
                rs--;
                continue;
            }
            if(!"null".equals(xs1[i].getName())){
                System.out.println("执行删除后第"+(rs+1)+"名学生的姓名："+xs1[i].getName());
            }
            if(xs1[i].getNl()!=-2){
                System.out.println("执行删除后第"+(i+1)+"名学生的年龄："+xs1[i].getNl());
            }
            System.out.println();
            if("null".equals(xs1[i])){
                rs--;
            }else{
                System.out.println("执行删除后第"+(rs+1)+"名学生的学号："+xs1[i].getXuehao());
                System.out.println("执行删除后第"+(rs+1)+"名学生的姓名："+xs1[i].getName());
                System.out.println("执行删除后第"+(i+1)+"名学生的年龄："+xs1[i].getNl());
            }
        }
        System.out.println("判断学号为heima002的同学年龄+1");
        for (i = 0; i < xs1.length; i++) {
            xs1[i] = new 对象数组5JB();
            if ("heima002".equals(xs1[i].getXuehao())) {
                xs1[i].setNl(xs1[i].getNl() + 1);
                System.out.println("当前学号为heima002的学生年龄：" + xs1[i].getNl());
            }
        }
    }
}
*/
