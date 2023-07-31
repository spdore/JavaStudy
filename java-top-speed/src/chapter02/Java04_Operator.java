package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {
        // TODO 运算符
        // 就是参与数据运算的符号，无法自行定义

        // TODO 表达式
        // 就是采用运算符和数据连接在一起形成符合Java语法规则的指令代码，称之为表达式

        // 1. 算术运算符
        // 二元运算符：两个元素参与运算的运算符.  1 + 2
        // 表达式的运算结果的类型按照类型范围最大的元素的类型决定，运算结果的数据类型最小使用的类型是int类型
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);  // 向下取整 (int, int) => int
        System.out.println(1.0 / 2);  // 向下取整 (double, int) => double
        System.out.println(5 % 2);

        /*
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);
         */

        System.out.println(1 + 2 * 3);
        System.out.println( (1 + 2) * 3);

        // 2. 一元运算符：一个元素参与运算的运算符.
        // ++, --
        int i = 1;
        int j = i++;  // 先赋值再自增
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
