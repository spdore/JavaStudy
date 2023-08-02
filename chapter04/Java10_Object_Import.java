package chapter04;
import java.util.*;  // 导入很多包时可以采用通配符*


public class Java10_Object_Import {
    public static void main(String[] args) {
        // TODO 面向对象 —— import
        // import主要用于在使用类前准备好类
        // import语句只能使用在package后，class前.
        // import关键字可以多次使用，导入多个类
        // 如果一个包中需要导入大量的类，那么可以使用通配符*简化操作
        // 如果import不同包中相同名称的类，还是要在使用时增加包名
        // chapter04.Java10_Object_Import
        java.lang.String name = "张三";
        String name1 = "张三";  // java.lang包使用频繁，Java虚拟机会自动补全该包名

        Date d = new Date();
        new ArrayList();  // Alt + Enter导入类

        new chapter04.Java10_Object_Import();
        new Java10_Object_Import();
    }
}
