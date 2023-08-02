package chapter04;

public class Java12_Object_Extends_1 {
    public static void main(String[] args) {

        // TODO 面向对象 —— Extends —— 继承
        // 如果父类和子类含有相同的属性，可以采用特殊关键字区分
        // super & this
        Child1 c = new Child1();
        System.out.println(c.name);
        c.test();
    }
}

class Parent1 {
    String name = "张三";
}

class Child1 extends Parent1 {
    String name = "李四";
    void test() {
        System.out.println(this.name);  // this：当前  默认情况下this关键字省略
        System.out.println(super.name);  // super：父类
    }
}
