package chapter03;

public class Java06_FlowControl_test {
    public static void main(String[] args) {
        // TODO 流程控制 —— 小练习
        // 九层妖塔
        /*
                        *
                       ***
                      *****
                     *******
                    *********
                   ***********
                  *************
                 ***************
                *****************
         */
        for (int i = 1; i <= 9; i++ ) {
            for (int k = 0; k < (9 - i); k ++ ) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
