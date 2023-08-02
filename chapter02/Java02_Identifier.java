package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {
        // TODO 标识符
        // 标识数据的符号
        String name = "China";

        // TODO  标识符的命名规则
        // 1. 英文拉丁字母
        String figure = "123";
        // 2. 符号
        // @, #, $, %
        // 标识符只能以$或者_序号，其他符号不能使用
        String _name = "America";
        String $name = "Australia";
        System.out.println(_name);
        System.out.println($name);
        // 3. 数字
        // 数字标识符不能放在开头
        String name1 = "Aug";

        // 4. 在大括号范围内标识符不得重复
        // 标识符区分大小写

        // 5. Java代码中有预先定义好的名称，为保留字，不得随意使用
        // 可以通过大小写区分关键字，但不推荐

        // 6. 驼峰命名法
        String userName = "666";

        // 7. 标识符没有长度限制
    }
}
