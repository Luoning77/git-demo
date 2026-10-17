public class 登录jbean {
    private String name;
    private int mima;
    private int qrmima;
    private String yx;
    private int xb;
    private int nn;

    public 登录jbean(String name, int mima, int qrmima, String yx, int xb, int nn) {
        this.name = name;
        this.mima = mima;
        this.qrmima = qrmima;
        this.yx = yx;
        this.xb = xb;
        this.nn = nn;
    }
    public 登录jbean() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMima(int mima) {
        if (mima > 100 && mima < 100000) {
            this.mima = mima;
        } else {
            System.out.println("输入的密码不规范（3-6位密码）！");
        }
    }
    public int getMima() {
        return mima;
    }

    public void setQrmima(int qrmima) {
        for (int i = 1; i >= 1; i++) {
            if (mima == qrmima) {
                this.qrmima = qrmima;
                break;
            } else if (i >= 5) {
                System.out.println("重试次数过多！");
                this.qrmima = -1;
                break;
            } else {
                System.out.println("密码输入错误，与初始输入密码不匹配！");
                continue;
            }
        }
    }
    public int getQrmima() {
        return qrmima;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }
    public String getYx() {
        return yx;
    }

    public void setXb(int xb) {
        this.xb = xb;
    }
    public int getXb() {
        return xb;
    }

    public void setNn(int nn) {
        if(nn>=18&&nn<=60){
            this.nn = nn;
        }else{
            System.out.println("年龄输入错误！请填写18-60岁之间的年龄");
        }
    }
    public int getNn() {
        return nn;
    }
}
