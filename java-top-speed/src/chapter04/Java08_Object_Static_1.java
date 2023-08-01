package chapter04;

public class Java08_Object_Static_1 {
    public static void main(String[] args) {
        // TODO 面向对象 —— 静态

        // 先有类，再有对象。
        // 有了对象就一定有类
        // 成员方法可以访问静态属性和静态方法
        // 但是静态方法不能访问成员属性与成员方法
        Test t = new Test();
        t.sex = "female";
        t.test();
        t.test1();
        Test.test1();
    }
}

class Test {
    String name;
    static  String sex;
    void test() {
        test1();
        System.out.println(sex);
    }
    static void test1() {
        System.out.println("test...1");
    }
}

class Bird1 {
    static String type = "鸟";
    static void fly() {
        System.out.println("飞");
    }
}