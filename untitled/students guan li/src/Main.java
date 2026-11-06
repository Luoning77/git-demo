import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        /*
        需水:
采取控制台的方式去书写学生管理系统。

分析:
登录界面:
System.out.println(“欢迎来到学生管理系统");
System.out.println("请选择操作1登录 2注册 3忘记密码”);

用户类:
属性:用户名、密码、身份证号码、手机号码

注册功能:
1,用户名需要满足以下要求:
验证要求:
用户名唯一
用户名长度必须在3~15位之间
只能是字母加数字的组合,但是不能是纯数字
2,密码键盘输入两次,两次一致才可以进行注册。
3,身份证号码需要验证。
验证要求：
长度为11位
不能以0为开头
必须都是数字

登录功能:
1,键盘录入用户名//111111111111111111
2,键盘录入密码
3,键盘录入验证码
验证要求:
用户名如果未注册,直接结束方法,并提示:用户名未注册,请先注册y
判断验证码是否正确,如不正确,重新输入y
再判断用户名和密码是否正确,有3次机会

忘记密码:
1,键盘录入用户名,判断当前用户名是否存在,如不存在,直接结束方法,并提示:未注册
2,键盘录入身份证号码和手机号码
3,判断当前用户的身份证号码和手机号码是否一致,
如果一致,则提示输入密码,进行修改。
如果不一致,则提示:账号信息不匹配,修改失败。

验证码规则:
长度为5
由4位大写或者小写字母和1位数字组成,同一个字母可重复
数字可以出现在任意位置
比如:
aQa1K

初始菜单:
-- 欢迎来到黑马学生管理系统 --

"1:添加学生”
“2 删除学生"
"3:修改学生”
"4:查询学生”
"5:退出”
“请输入您的选择:”

学生类:
属性:id、姓名、年龄、家庭住址
添加功能:
键盘录入每一个学生信息并添加,需要满足以下要求:
·id唯一
删除功能:
键盘录入要删除的学生id,需要满足以下要求:
         */
        登录JB dl=new 登录JB();
        Scanner sc = new Scanner(System.in);
        int dlcg=-1;
        int sfdl=-1;
        String zcyhm="用户名";
        String zcmm="密码";
        String zcsjh="手机号";
        String zcsfz="身份证";
        while(1==1) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.print("请选择你的操作：");
            int xz = sc.nextInt();

            if (xz == 2) {
                while (1 == 1) {
                    int t=0;
                    登录JB s=new 登录JB();
                    while(1==1) {
                        System.out.println("请输入用户名：");
                        dl.setName(sc.next());
                        if("no0".equals(dl.getName())){
                            System.out.println("用户输入的用户名包含非法字符,请重新输入！");
                            continue;
                        }else if("no1".equals(dl.getName())){
                            System.out.println("用户名不在长度的3-15范围内,请重新输入");
                            continue;
                        }else if("no2".equals(dl.getName())){
                            System.out.println("用户名为纯字母或纯数字,请重新输入");
                            continue;
                        }else{
                            zcyhm=dl.getName();
                            break;
                        }
                    }
                    System.out.println("请输入密码：");
                    dl.setMm(sc.next());
                    while(1==1) {
                        System.out.println("请再次确认密码：");
                        String mm = sc.next();
                        if (mm.equals(dl.getMm())) {
                            zcmm= dl.getMm();
                            break;
                        }else{
                            System.out.println("两次密码不一致,请重新输入！");
                        }
                    }
                    while(1==1) {
                        System.out.println("请输入身份证号码：");
                        dl.setSfz(sc.next());
                        if ("no0".equals(dl.getSfz())) {
                            System.out.println("身份证不为18位,请重新输入！");
                            continue;
                        } else if ("no1".equals(dl.getSfz())) {
                            System.out.println("身份证首位不能为0,请重新输入！");
                            continue;
                        } else if ("no2".equals(dl.getSfz())) {
                            System.out.println("前17位身份证号只能为数字,请重新输入！");
                            continue;
                        } else if ("no3".equals(dl.getSfz())) {
                            System.out.println("最后一位字符不合法,请重新输入！");
                            continue;
                        }else{
                            zcsfz= dl.getSfz();
                            break;
                        }
                    }
                    while(1==1){
                        System.out.println("请输入手机号：");
                        dl.setSjh(sc.next());
                        if ("no0".equals(dl.getSjh())) {
                            System.out.println("手机号不为11位,请重新输入！");
                            continue;
                        } else if ("no1".equals(dl.getSjh())) {
                            System.out.println("手机号首位为0,请重新输入！");
                            continue;
                        } else if ("no2".equals(dl.getSjh())) {
                            System.out.println("手机号不存在,请重新输入！");
                            continue;
                        }else {
                            zcsjh= dl.getSjh();
                            break;
                        }
                    }
                    sfdl=0;
                    System.out.println("注册成功,请返回主菜单登录！");
                    break;
                }
                continue;
            }

            if(xz==1){
                if(sfdl==-1){
                    System.out.println("未注册,请先回去注册！");
                    continue;
                }else if(sfdl==0){
                    int t=0;//已失败的次数
                    while(1==1){
                        System.out.println("请输入用户名：");
                        dl.setName(sc.next());
                        System.out.println("请输入密码：");
                        dl.setMm(sc.next());
                        while(1==1) {
                            Random r=new Random();
                            int yzm1= r.nextInt(900000)+100000;
                            System.out.println("验证码:"+yzm1);
                            System.out.println("请输入验证码：");
                            int yzm = sc.nextInt();
                            if (yzm == yzm1) {
                                break;
                            }else{
                                System.out.println("验证码错误,请重新输入！");
                            }
                        }
                        //用户名和密码同时正确才算登录成功
                        if(zcyhm.equals(dl.getName()) && zcmm.equals(dl.getMm())){
                            dlcg=0;
                            System.out.println("登录成功！");
                            break;
                        }
                        t++;
                        if(t>=3){
                            System.out.println("用户名或密码错误3次,程序结束！");
                            return;
                        }
                        System.out.println("用户名或密码错误,还有"+(3-t)+"次机会！");
                    }
                }
            }
            if(xz==3){
                System.out.println("请输入用户名：");
                String name=sc.next();
                if(name.equals(zcyhm)){
                    System.out.println("请输入身份证号：");
                    String sfz=sc.next();
                    System.out.println("请输入手机号：");
                    String sjh=sc.next();
                    if (sfz.equals(zcsfz) && sjh.equals(zcsjh)){
                        while(1==1) {
                            System.out.println("请输入需要修改的密码：");
                            String xgmm = sc.next();
                            if (xgmm.equals(zcmm)) {
                                System.out.println("与原本密码相同,请重新输入！");
                                continue;
                            }else{
                                zcmm = xgmm;
                                dl.setMm(xgmm);
                                break;
                            }
                        }
                    }else{
                        System.out.println("身份证号或手机号不一致！");
                        continue;
                    }
                }else{
                    System.out.println("用户未注册！");
                    continue;
                }
            }
            if(dlcg==0) {
                break;
            }else if(dlcg==-1){
                System.out.println("请先登录！");
                continue;
            }
        }


        学生管理系统JB gl[] = new 学生管理系统JB[3];
        ArrayList<学生管理系统JB> list = new ArrayList<>();
        int count = 0;
        while (1 == 1) {
            System.out.println("------ 欢迎来到long 学生管理系统 ------");
            System.out.println("1:添加学生");
            System.out.println("2 删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println();
            System.out.print("请输入您的选择:");
            int t = sc.nextInt();

            if (t == 1) {
                int rs1;
                System.out.println("请输入本次添加的学生人数：");
                int rs = sc.nextInt();
                if (rs <= 0) {
                    System.out.println("人数必须大于 0，请重新输入！");
                    continue;
                }
                count += rs;
                if (count >= 0 && count <= 3) {
                    int count1=count-rs;
                    for (int i = count1; i < count; i++) {
                        int cs=0;
                        gl[i] = new 学生管理系统JB();
                        while(1==1) {
                            if(cs==0) {
                                System.out.println("第" + (i + 1) + "名学生id：");
                            }else{
                                System.out.println("id重复！");
                                System.out.println("请重复输入：");
                            }
                            String id = sc.next();
                            boolean chongfu = false;
                            for (int j = 0; j < list.size(); j++) {
                                if (id.equals(list.get(j).getId())) {
                                    chongfu = true;
                                    break;
                                }
                            }
                            if (chongfu) {
                                cs++;
                                continue;
                            }else{
                                gl[i].setId(id);
                                break;
                            }
                        }
                        System.out.println("第" + (i + 1) + "名学生姓名：");
                        gl[i].setName(sc.next());
                        System.out.println("第" + (i + 1) + "名学生年龄：");
                        gl[i].setNl(sc.nextInt());
                        System.out.println("第" + (i + 1) + "名学生家庭住址：");
                        gl[i].setJtzz(sc.next());
                        list.add(gl[i]);
                    }
                    //continue;
                } else if (count < 0) {
                    count -= rs;
                    System.out.println("学生人数信息异常,请重新填写有效人数信息！");
                    //continue;
                } else if (count > 3) {
                    count -= rs;
                    System.out.println("学生人数过多,请重新填写有效人数信息！");
                    //continue;
                }
                continue;
            }

            if (t == 2) {
                System.out.println("请输入需要删除的学生的id：");
                String id1 = sc.next();
                int i;
                for (i = 0; i < list.size(); i++) {
                    if (id1.equals(list.get(i).getId())) {
                        list.remove(i);
                        count--;
                        System.out.println("删除成功！");
                        break;
                    }
                }
                if (i == 0 && list.size() == 0) {
                    System.out.println("该系统中没有学生信息,请先添加！");
                    //continue;
                } else if (i == list.size()) {
                    System.out.println("无学生信息！");
                    //continue;
                }
                continue;
            }

            if (t == 3) {
                学生管理系统JB gl1[] = new 学生管理系统JB[1];
                System.out.println("请输入需要修改的学生的id：");
                String id1 = sc.next();
                int i;
                for (i = 0; i < list.size(); i++) {
                    if (id1.equals(list.get(i).getId())) {
                        gl1[0] = new 学生管理系统JB();
                        System.out.println("学生id修改为：");
                        gl1[0].setId(sc.next());

                        while(1==1) {
                            int cs=0;
                            gl1[0] = new 学生管理系统JB();
                            if(cs==0) {
                                System.out.println("学生id修改为：");
                            }else{
                                System.out.println("id重复！");
                                System.out.println("请重复输入：");
                            }
                            String id = sc.next();
                            gl1[0].setId(id);
                            boolean chongfu = false;
                            for (int j = 0; j < count; j++) {
                                if (id.equals(gl[j].getId())) {
                                    chongfu = true;
                                    break;
                                }
                            }
                            if (chongfu) {
                                cs++;
                                continue;
                            }else{
                                gl1[0].setId(id);
                                break;
                            }
                        }

                        System.out.println("学生姓名修改为：");
                        gl1[0].setName(sc.next());
                        System.out.println("学生年龄修改为：");
                        gl1[0].setNl(sc.nextInt());
                        System.out.println("学生家庭住址修改为：");
                        gl1[0].setJtzz(sc.next());
                        list.set(i, gl1[0]);
                        break;
                    }
                }
                if (i == 0 && list.size() == 0) {
                    System.out.println("该系统中没有学生信息,请先添加！");
                    //continue;
                } else if (i == list.size()) {
                    System.out.println("无学生信息！");
                    //continue;
                }
                continue;
            }

            if (t == 4) {
                System.out.println("请输入需要查询的学生的id：");
                String id1 = sc.next();
                int i;
                for (i = 0; i < list.size(); i++) {
                    if (id1.equals(list.get(i).getId())) {
                        System.out.println("学生id：" + list.get(i).getId());
                        System.out.println("学生姓名：" + list.get(i).getName());
                        System.out.println("学生年龄：" + list.get(i).getNl());
                        System.out.println("学生家庭住址：" + list.get(i).getJtzz());
                        break;
                    }
                }
                if (i == 0 && list.size() == 0) {
                    System.out.println("该系统中没有学生信息,请先添加！");
                    //continue;
                } else if (i == list.size()) {
                    System.out.println("无学生信息！");
                    //continue;
                }
                continue;
            }

            if (t == 5) {
                System.out.println("退出！");
                return;
            }
        }
    }
}
