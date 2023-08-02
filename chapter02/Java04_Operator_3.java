package chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {
        // TODO 运算符 —— 逻辑运算符
        // 逻辑运算符就是描述多个条件表达式之间的关系的运算符
        // 基本语法结构:变量(条件表达式1) 逻辑运算符 变量(条件表达式1)
        // 结果的变量的类型依然为布尔类型
        // true true => ?
        // true false => ?
        // false true => ?
        // false false => ?

        // TODO 与运算： &
        // 两个都是true才是true，其余全为false
        int i = 10;
        boolean result = (i < 5) & (i < 20);
        System.out.println(result);

        // TODO 或运算： |
        // 只要有一个是true就是true，全为false时才是false
        result = (i > 5) | (i < 20);
        System.out.println(result);

        // TODO 短路与运算： &&
        // 根据第一个表达式的结果来判断是否要判定第二个表达式，第一个结果为false则不会执行第二个表达式
        int a = 10;
        int b = 20;
        boolean result_1 = (a > 10) && (++b > 30);
        System.out.println(result_1);
        System.out.println(b);  // 没有执行++b的操作

        boolean result_2 = (a > 5) && (++b > 30);
        System.out.println(result_2);
        System.out.println(b);  // 执行++b的操作

        // TODO 短路或运算： ||
        // 根据第一个表达式的结果来判断是否要判定第二个表达式，第一个结果为true则不会执行第二个表达式
        int c = 10;
        int d = 20;
        boolean result_3 = (c == 10) || (++d > 30);
        System.out.println(result_3);
        System.out.println(d);  // 没有执行++d的操作

        boolean result_4 = (c != 10) || (++d > 30);
        System.out.println(result_3);
        System.out.println(d);  // 执行++d的操作

        // TODO 非运算： ！
        int num = 10;
        boolean result_5 = num == 10;
        System.out.println(!result_5);  // false
    }
}
