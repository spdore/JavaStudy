package chapter02;

public class Java04_Operator_2 {
    public static void main(String[] args) {
        // TODO 运算符 —— 关系运算符
        // 关系运算符就是比较两个数据间的关系的运算符
        // 关系表达式:元素1 关系运算符[==, !=, >, >=, <, <=] 元素2
        // 关系表达式结果为布尔类型，表达式结果与预想相同结果为true，与预想结果不同结果为false
        int i = 10;
        int j = 20;
        System.out.println(i == j);  // false
        System.out.println(i != j);  // true
        System.out.println(i > j);  // false
        System.out.println(i >= j);  // false
        System.out.println(i < j);  // true
        System.out.println(i <= j);  // true

    }
}
