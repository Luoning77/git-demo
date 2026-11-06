public class 对象数组5JB {
    private String xuehao;
    private String name;
    private int nl;

    public 对象数组5JB() {
    }
    public 对象数组5JB(String xuehao, String name, int nl) {
        this.xuehao = xuehao;
        this.name = name;
        this.nl = nl;
    }

    public String getXuehao() {
        return xuehao;
    }
    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNl() {
        return nl;
    }
    public void setNl(int nl) {
        if(nl>=6&&nl<=30){
        this.nl = nl;}else if (nl==-2){
            this.nl=-2;
        }else{
            this.nl=-1;
        }
    }
}
