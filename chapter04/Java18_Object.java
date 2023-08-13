package chapter04;

public class Java18_Object {
    public static void main(String[] args) {

        // TODO 面向对象
        // Java中不允许外部类使用private修饰
        // 所谓的外部类，就是在源码中直接声明的类
        // 所谓的内部类就是类中声明的类

        // 内部类就当成外部类的属性就可以

        // 因为内部类可以看成外部类的属性，所以需要构造外部类对象才能使用
        OuterClass outer =new OuterClass();
        OuterClass.InnerClass innerClass = outer.new InnerClass();
    }

}

class OuterClass {
    public class InnerClass {

    }
}

