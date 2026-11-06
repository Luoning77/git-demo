public class 登录JB {
    private String name;
    private String mm;
    private String sfz;
    private String sjh;

    public 登录JB() {
    }

    public 登录JB(String name, String mm, String sfz, String sjh) {
        this.name = name;
        this.mm = mm;
        this.sfz = sfz;
        this.sjh = sjh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int zm = 0;
        int sz = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.length() >= 3 && name.length() <= 15) {
                char a = name.charAt(i);
                if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
                    zm++;
                } else if (a >= '0' && a <= '9') {
                    sz++;
                } else {
                    this.name = "no0";//用户输入的用户名包含非法字符
                    return;
                }
            } else {
                this.name = "no1";//不在用户名长度的3-15范围内
                return;
            }
        }
        if (zm == 0 && sz == 0) {
            this.name = "no2";//纯字母或纯数字
            return;
        }else{
            this.name =name;
        }
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        int s = sfz.length();
        if (s != 18) {
            this.sfz = "no0";//身份证不为18位
            return;
        } else {
            for (int i = 0; i < s; i++) {
                char a = sfz.charAt(i);
                if (i == 0) {
                    if (a == '0') {
                        this.sfz = "no1";//身份证第一位为0
                        return;
                    }
                } else if (i < s - 1) {
                    if (!(a >= '0' && a <= '9')) {
                        this.sfz = "no2";//前17位出现非法字符
                        return;
                    }
                } else if (i == s - 1) {
                    if (a >= '0' && a <= '9' || a == 'x' && a == 'X') {
                        this.sfz = sfz;
                    } else {
                        this.sfz = "no3";//最后一位字符不合法
                        return;
                    }
                }
            }
        }
    }

    public String getSjh() {
        return sjh;
    }

    public void setSjh(String sjh) {
        int s = sjh.length();
        if (s != 11) {
            this.sjh="no0";//手机号不为11位
            return;
        }else{
            for (int i = 0; i < s; i++) {
                char a=sjh.charAt(i);
                if(i==0){
                    if(a=='0') {
                        this.sjh = "no1";//手机号首位为0
                        return;
                    }
                }else{
                    if(!(a>='0'&&a<='9')){
                        this.sjh="no2";//手机号不存在
                        return;
                    }
                }
            }
            this.sjh=sjh;
        }
    }
}
