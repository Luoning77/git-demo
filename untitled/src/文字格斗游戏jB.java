public class 文字格斗游戏jB {
    private String name1;
    private int xue1;
    private int sh1;

    private String name2;
    private int xue2;
    private int sh2;

    public 文字格斗游戏jB(String name1, int xue1, int sh1, String name2, int xue2, int sh2) {
        this.name1 = name1;
        this.sh1 = sh1;
        this.xue1 = xue1;
        this.name2 = name2;
        this.sh2 = sh2;
        this.xue2 = xue2;
    }
    public 文字格斗游戏jB() {
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getName1() {
        return name1;
    }

    public void setSh1(int sh1) {
        if (sh1 >= 10 && sh1 <= 30) {
            this.sh1 = sh1;
        } else {
            System.out.println("伤害影响平衡，伤害建议10-30");
        }
    }
    public int getSh1() {
        return sh1;
    }

    public void setXue1(int xue1) {
        if (xue1 >= 100 && xue1 <= 150) {
            this.xue1 = xue1;
        } else {
            System.out.println("血量影响平衡，血量建议100-150");
        }
    }
    public int getXue1() {
        return xue1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
    public String getName2() {
        return name2;
    }

    public void setSh2(int sh2) {
        if (sh2 >= 15 && sh2 <= 30) {
            this.sh2 = sh2;
        } else {
            System.out.println("伤害影响平衡，伤害建议15-30");
        }
    }
    public int getSh2() {
        return sh2;
    }

    public void setXue2(int xue2) {
        if (xue2 >= 90 && xue2 <= 140) {
            this.xue2 = xue2;
        } else {
            System.out.println("血量影响平衡，血量建议90-140");
        }
    }
    public int getXue2() {
        return xue2;
    }
}
