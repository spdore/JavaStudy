package chapter02;

public class Java03_Datatype_1 {
    public static void main(String[] args) {
        // TODO 数据类型转换
        // 大的数据类型范围包含小的范围可以直接转化
        // 范围大的数据不能直接转化为范围小的数据
        byte b = 10;
        short c = b;
        int d = c;
        long e = d;
        float f = e;
        double g = f;

        // 强制数据类型转换
        int num = (int)g;

        double dou = 1.8;  // 向下取整
        int num1 = (int)dou;
        System.out.println(num1);
    }
}
