package chapter04;

public class Java02_Object {
    public static void main(String[] args) {
        // TODO 面向对象

        // 类: 对象
        // 对象:猫 狗
        Animal a1 = new Animal();
        a1.type = "猫";
        a1.name = "咪咪";
        a1.run();

        Animal a2 = new Animal();
        a2.type = "狗";
        a2.name = "二狗子";
        a2.run();
    }
}

class Animal {
    String type;
    String name;

    void run() {
        System.out.println(type + name + "逃跑了");
    }
}