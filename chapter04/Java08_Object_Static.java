package chapter04;

public class Java08_Object_Static {
    public static void main(String[] args) {
        // TODO 面向对象 —— 静态
        // 针对于具体对象的属性称之为对象属性，成员属性，实例属性
        // 针对于具体对象的方法称之为对象方法，成员方法，实例方法
        // 把和对象无关，只和类相关的称之为静态
        // 和类相关的属性是静态属性
        // 和类相关的方法是静态方法
        // 静态语法就是在属性和方法之间增加static关键字
        Chinese c = new Chinese();
        c.name = "张三";
        System.out.println("Hello, " + c.name + c.nationality);

        Bird.fly();
        System.out.println(Bird.type);
    }
}
class Chinese {
    String name;
    String nationality = "中国";
}

class Bird {
    static String type = "鸟";
    static void fly() {
        System.out.println("飞");
    }
}