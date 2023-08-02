package chapter03;

public class Java02_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制 —— 分支执行
        // 分支结构

        // 1. 可选分支:单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        // 判断:条件表达式的结果是否为ture，如果为true则执行分支当中的内容
        int i = 20;
        if (i == 10) {
            System.out.println("分支");
        }
        System.out.println("第三步");

        // 2. 必选分支:双分支结构(二选一)
        // 语法上使用if... else操作，这里的else表示其他情况
        int num_1 = 90;
        if (num_1 == 10) {
            System.out.println("分支1");
        } else {
            System.out.println("分支2");
        }

        // 3. 多分支
        int num_2 = 100;
        if (num_2 == 10) {
            System.out.println("分支1");
        } else if (num_2 == 100) {
            System.out.println("分支2");
        } else {
            System.out.println("分支3");
        }
    }
}
