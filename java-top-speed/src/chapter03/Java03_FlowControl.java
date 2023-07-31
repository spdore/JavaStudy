package chapter03;

public class Java03_FlowControl {
    public static void main(String[] args) {
        // TODO 流程控制 —— 分支执行
        // 特殊的分支结构 switch
        System.out.println("第一步");
        System.out.println("第二步");
        int i = 20;

        // switch内顺序执行，一旦找到一个条件与之匹配则执行switch结构内其余的所有情况所对应的语句
        switch (i) {
            case 10 :
                System.out.println("分支1");
            case 20 :
                System.out.println("分支2");
            case 30 :
                System.out.println("分支3");
        }  // 打印分支2,分支3

        // 如果一个分支都无法匹配，那么分支都不会执行，如果想要在无法匹配的情况下执行分支，则需要增加default
        switch (i) {
            case 10 :
                System.out.println("分支1");
            case 20 :
                System.out.println("分支2");
            case 30 :
                System.out.println("分支3");
            default:
                System.out.println("其他分支");
        }  // 打印分支2,分支3,其他分支

        // 如果执行某个分支后不想执行其他分支，可以使用break关键字
        switch (i) {
            case 10 :
                System.out.println("分支1");
                break;
            case 20 :
                System.out.println("分支2");
                break;
            case 30 :
                System.out.println("分支3");
                break;
            default:
                System.out.println("其他分支");
        }  // 打印分支2

        System.out.println("第三步");

    }
}
