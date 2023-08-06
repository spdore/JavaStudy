package chapter04;

public class Java16_Object_Recursion {
    public static void main(String[] args) {

        // TODO 面向对象 —— 递归
        // 所谓的递归: 方法调用自身，称之为递归方法
        // 20以内奇数求和
        // 1 + 3 + 5 + 7 + 9... + 19
        int result = computeAP(10);
        System.out.println(result);

        // 阶乘： 5!
        // 1 * 2 * 3 * 4 * 5
        result = computeFactorial(5);
        System.out.println(result);
    }

    public static int computeAP(int num) {
        num = num % 2 == 0 ? num - 1 : num;  // 如果传入数字为偶数，则要自减1；如果是奇数，则不变
        if (num == 1) {
            return 1;  //结果是1直接返回
        } else {
            return num + computeAP(num - 2);  //以10为例，该式计算9 + (7到1的等差奇数数列的和)
        }
    }

    public static int computeFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * computeFactorial(num - 1);  // 5 * 4!
        }
    }
}

