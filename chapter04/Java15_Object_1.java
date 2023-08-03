package chapter04;

public class Java15_Object_1 {
    public static void main(String[] args) {

        // TODO 面向对象 —— 重写
        CCC ccc = new CCC();
        System.out.println(ccc.sum());

        DDD ddd = new DDD();
        System.out.println(ddd.sum());

        CCC eee = new DDD();  // 按照DDD中的sum()运行
        // 一个对象能使用什么方法取决于引用变量的类型
        // 一个对象能使用什么属性取决于引用变量的类型
        // 一个对象的方法具体的使用（直接/间接）是需要看具体的对象的
        // 一个对象的属性具体的使用是不需要看具体的对象的
        System.out.println(eee.sum());

    }
}
class CCC{
    int i = 10;
    int sum() {
        return getI() + 10;
    }
    int getI() {
        return i;
    }
}
class DDD extends CCC{
    int i = 50;
    /*int sum() {
        return i + 30;
    }*/
    int getI() {
        return i;
    }
}