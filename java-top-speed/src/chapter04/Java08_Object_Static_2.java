package chapter04;

public class Java08_Object_Static_2 {
    public static void main(String[] args) {
        // TODO 面向对象

        // 类的信息加载完成后会自动执行静态代码块中的信息，可以完成静态属性的初始化
        // 执行时按照声明的顺序执行
        User08.test();

        // 对象准备创建时也会自动调用代码块，但不是静态的
        new User08();
    }
}
class User08 {
    static {
        // 静态代码块
        System.out.println("静态代码块执行1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行2");
    }
    static void test() {
        System.out.println("test...");
    }
    {
        System.out.println("代码块执行1");
    }
    static {
        // 静态代码块
        System.out.println("静态代码块执行3");
    }
    {
        System.out.println("代码块执行2");
    }
}