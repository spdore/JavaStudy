package chapter04;

public class Java14_Object {
    public static void main(String[] args) {

        // TODO 面向对象
        // 一个类中，不能重复声明相同的方法，也不能声明相同的属性
        // 这里相同的方法指的是方法名，参数列表相同，和返回值类型无关
        // 如果方法名相同，但是参数列表（个数，顺序，类型）不相同，会认为是不同的方法，只不过是名称不一样
        // 这个操作在Java称之为方法的重载
        // 构造方法也存在方法的重载
        User14 user = new User14("zhangsan");
        user.login(1379707617);
        user.login("6666666");
        user.login("zhangsan","123456");
    }
}

class User14 {
    User14() {
        System.out.println("user...");
    }
    User14(String name) {
        System.out.println("user..." + name);
    }

    void login(String account, String password) {
        System.out.println("账号密码登录");
    }
    void login(int tel) {
        System.out.println("手机验证码登录");
    }
    void login(String wx) {
        System.out.println("微信支付宝登录");
    }
}
