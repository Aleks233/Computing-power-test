import java.util.Scanner;

public class Demo {
    static Scanner sc = new Scanner(System.in);//new一个输入方法

    public static void main(String[] args) {
        System.out.println("\n\n数学计算能力训练系统\n\n学号:1806410539        姓名:张博\n\n1----加法    2----减法    3----乘法    4----除法    0----退出\n在答题时输入-1退出答题");
        int a = -1;//选择功能变量
        try {//防止输入字符会报错
            a = sc.nextInt();//输入
        } catch (Exception e) {
            System.out.println("请输入正确的数据类型");
            sc.next();//防止输入字符后无限循环
        }
        a = number(a);//数据筛选
        //功能选择
        switch (a) {
            case 1:
                methot(new Operation_addition_无GUI());
                break;
            case 2:
                methot(new Operation_subtraction());
                break;
            case 3:
                methot(new Operation_multiplication());
                break;
            case 4:
                methot(new Operation_division());
                break;
            default:
                break;
        }
        //退出系统,结束主函数
        System.out.println("结束");
    }

    //数据筛选
    public static int number(int a) {
        while (a < 0 || a > 4) {
            System.out.println("请输入正确的数字");
            try {//防止输入字符会报错
                a = sc.nextInt();//输入
            } catch (Exception e) {
                System.out.println("请输入正确的数据类型");
                sc.next();//防止输入字符后无限循环
            }
        }
        return a;
    }

    //功能接口
    public static void methot(Operation operation) {
        operation.operation();
    }
}