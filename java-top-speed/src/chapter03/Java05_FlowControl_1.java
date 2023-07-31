package chapter03;

public class Java05_FlowControl_1 {
    public static void main(String[] args) {
        // TODO 流程控制 —— 重复执行(循环执行)
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // 遇到break停止循环
            }
            System.out.println(i);
        }

        // continue
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;  // 遇到continue跳过当前循环，直接执行下一次循环
            }
            System.out.println(j);
        }
    }
}
