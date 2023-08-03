package chapter04;

public class Java14_Object_2 {
    public static void main(String[] args) {

        // TODO 面向对象
        // byte 8
        // short 16
        // char 16
        // int 32
        // 基本数据类型在匹配方法时，可以在数值不变的情况下，扩大数据的精度

        short b = 10;
        test(b);

        AAA aaa = new AAA();
        test(aaa);

        BBB bbb = new BBB();
        test(bbb);

        AAA ccc = new BBB();  // 多态语法，运行结果取决于当前的参数列表与当前的数据类型
        test(ccc);
        // 多态其实就是约束了对象的使用场景
        // 方法的重载：方法名相同，参数列表不同(个数，顺序，类型)
        // AAA -> Object
        // BBB -> AAA(寻找父类)
    }
    static void test(byte b) {
        System.out.println("bbb");
    }
    static void test(short s) {
        System.out.println("sss");
    }
    static void test(char c) {
        System.out.println("ccc");
    }
    static void test(int i) {
        System.out.println("iii");
    }

    // 方法的重载
    static void test(AAA aaa) {
        System.out.println("aaa");
    }
    static void test(BBB bbb) {
        System.out.println("bbb");
    }
}

class AAA {

}

class BBB extends AAA {

}
