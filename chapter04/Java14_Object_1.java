package chapter04;

public class Java14_Object_1 {
    public static void main(String[] args) {

        // TODO 面向对象
        // 如果在一个构造方法中，想要调用其他的构造方法，那么需要使用特殊的构造方式
        User141 user1 = new User141();
        User141 user2 = new User141("zhangsan");
        User141 user3 = new User141("zhangsan","male");
    }
}
class User141 {
    User141() {
        this("张三");
    }
    User141(String name) {
        this(name,"male");
    }
    User141(String name, String sex) {
        System.out.println(name + "," + sex);
    }
}
