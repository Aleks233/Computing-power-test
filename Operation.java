import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public abstract class Operation {
    Random random = new Random();//new一个随机数方法
    Scanner sc = new Scanner(System.in);//new一个输入方法
    LinkedList<String> linkedList = new LinkedList<String>();//创建数据保存的容器
    JLabel jLabel_1 = new JLabel();
    JTextField jTextField_1 = new JTextField();
    JTextArea jTextArea_1 = new JTextArea();
    JButton jButton_5 = new JButton("停止测试");

    public abstract void operation();//函数功能的抽象方法
}