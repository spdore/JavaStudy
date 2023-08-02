package chapter04;

public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {
        // TODO 面向对象 —— 方法 —— 参数
        // 基本数据类型传递的是数据，引用数据类型传递的是数据地址
        int i = 10;
        test(i);
        System.out.println(i);

        String s = "abc";
        test1(s);
        System.out.println(s);

        User user = new User();
        user.name = "张三";
        test2(user);
        System.out.println(user.name);
    }

    public static void test(int i) {
        i = i + 10;
    }

    public static void test1(String s) {
        s = s + 10;
    }

    public static void test2(User user) {
        user.name = "李四";
    }
}
class User {
    String name;
}
