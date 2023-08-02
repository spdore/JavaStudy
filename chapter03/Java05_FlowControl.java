package chapter03;

public class Java05_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制 —— 重复执行(循环执行)
        // 根据条件重复执行某段代码

        // 1. while:有条件循环
        // while (条件表达式) {需要循环执行的代码}
        System.out.println("第一步");
        int age = 1;
        while (age <= 5) {
            System.out.println("while循环执行" + age + "次");
            age += 1;
        }
        System.out.println("第二步");

        // 2. do...while
        // 循环代码至少执行一次，先执行再判断条件是否满足
        /*
            基本语法结构:
            do {
                循环代码
            } while (条件表达式)
         */
        do {
            System.out.println("while循环执行" + age + "次");
            age += 1;
        } while (age <= 10);

        // 3. for
        /*
            基本语法结构:
            for (初始化表达式; 条件表达式; 更新表达式) {
                循环的代码
            }
         */
        for (; age <= 15; age ++) {
            System.out.println("while循环执行" + age + "次");
        }
    }
}
