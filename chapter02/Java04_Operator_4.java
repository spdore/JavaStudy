package chapter02;

public class Java04_Operator_4 {
    public static void main(String[] args) {
        // TODO 运算符 —— 三元运算符
        // 基本语法结构:
        // 变量 = (条件表达式) ? (任意表达式1) : (任意表达式2)
        // 运算规则:条件表达式的结果为true执行任意表达式1，否则执行任意表达式2
        int i = 10;
        int j = 20;
        int k = (i == 10) ? 1 + 1 : 2 + 2;
        System.out.println(k);  // 执行条件表达式1
    }
}
