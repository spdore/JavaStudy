package chapter04;  // 包

import java.util.Date;

public class Java09_Object_Package {
    public static void main(String[] args) {
        // TODO 面向对象 —— package —— 包
        // package中容纳类
        // 基本语法： package 包的完整路径;
        // 路径中的多个包用.隔开
        // java.long.Object
        // 主要功能用于分类管理

        // 一个类可以没有包，但是package不能在同一个源码文件中使用多次
        // 包名为了区分类名，一般全部都是小写

        // Java中存在不同包的相同名称的类，可以使用包进行区分
        // 一般情况下，在使用类时，我们都会使用类的全名（包名 + 类型）
        new java.util.Date();
    }
}
