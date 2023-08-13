package chapter04;

public class Java20_Object {
    public static void main(String[] args) {

        // TODO 面向对象
        // Java中提供了一种语法，可以在数据初始化后不被修改，使用关键字final
        // final可以修饰变量，变量的值一旦初始化后就无法修改
        // final可以修饰属性，那么JVM虚拟机无法自动进行初始化，需要自己进行初始化
        // final可以修饰方法，但是这个方法不能被子类重写
        // final可以修饰类，这个类就没有子类了
        // final不可以修饰构造方法
        // final可以修饰方法的参数，一旦修饰，参数就无法修改
        final String name = "张三";
        System.out.println(name);

        User20 user = new User20("李4");
        // user.name = "李四";
        System.out.println(user.name);  // 引用数据类型的默认值是null

        // user.name = "李5";
        System.out.println(user.name);  // 引用数据类型的默认值是null
    }
}

class User20 {
    public final String name;
    public User20(String name) {
        this.name = name;  // public User20(String name)的值赋予public final String name
    }
    public void test() {

    }
}

/*
class Child20 extends User20 {
    /*
    // 无法重写
    public void test() {
        super.test();
    }
}
 */
