package chapter02;

public class Java04_Operator_1 {
    public static void main(String[] args) {
        // TODO 运算符 —— 赋值运算符
        // 等号其实就是赋值运算符：将表达式的结果赋值给等号左边的变量
        // 赋值运算符需要考虑数据类型的关系
        String name = "China";
        byte b = 10;
        short s = b;

        // TODO 运算符 —— 复合赋值运算符
        // 如果元素进行重新运算后赋值给自己，那么可以将运算和复制的符号简化
        int i = 1;
        i += 1;  // i = i + 1
        System.out.println(i);

        i *= 2;
        System.out.println(i);
    }
}
