package chapter29;

public class View {
    private Custom[] customs;

    public View(Custom[] customs) {
        this.customs = customs;
    }

    public String register(Custom custom) {
        for (int i = 0; i < customs.length; i++) {
            if (customs[i].getName().equals(custom.getName())) {
                if (customs[i].getPassword().equals(custom.getPassword())) {
                    return "登录成功";
                } else {
                    return "密码不正确";
                }
            }
        }
        return "用户不存在";
    }
}
