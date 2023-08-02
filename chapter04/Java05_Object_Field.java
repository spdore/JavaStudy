package chapter04;

public class Java05_Object_Field {
    public static void main(String[] args) {

        // TODO 面向对象
        // 所谓属性，其实就是类的对象的相同特征
        // 语法和变量的声明很像
        // 属性类型 属性名称 = 属性值
        // 如果在声明属性的同时进行了初始化赋值，那么所有对象的该属性相同
        // 如果希望每个对象的属性不一致，那么可以不用再声明属性时进行初始化
        // 那么属性会在构造对象的时候默认初始化，而默认初始化的值取决于属性的类型
        // byte ,short, int, long => 0
        // float, double => 0.0
        // boolean flg = false
        // char = 空字符
        // 引用数据类型 => null

        // 变量的作用域很小，只在大括号内部起作用
        // 属性不仅仅在当前类中有效，而且可以随着对象在其他地方使用
        // 变量在使用前必须初始化，否则会有报错；属性可以不用初始化，JVM会帮我们完成自动初始化
        String name = "张三";
    }
}
class User05 {
    String name;
}
