import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_GUI extends JFrame {
    private JPanel jPanel_1 = new JPanel();
    public static JPanel jPanel_2 = new JPanel();
    public static Font font = new Font("宋体", Font.PLAIN, 16);

    public static void main(String[] args) {
        Demo_GUI frame = new Demo_GUI();
        frame.setVisible(true);
    }

    public Demo_GUI() {
        super();
        setTitle("数学计算能力训练系统");
        setBounds(100, 100, 500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        JLabel jLabel_1 = new JLabel("姓名:张博");
        JLabel jLabel_2 = new JLabel("学号:1806410539");

        JButton jButton_1 = new JButton("1.加法");
        JButton jButton_2 = new JButton("2.减法");
        JButton jButton_3 = new JButton("3.乘法");
        JButton jButton_4 = new JButton("4.除法");

        jButton_1.addActionListener(new ButtonAction());

        jPanel_1.setBounds(50, 10, 400, 50);
        jPanel_2.setBounds(50, 90, 400, 300);

        getContentPane().add(jPanel_1);
        getContentPane().add(jPanel_2);

        jLabel_1.setFont(font);
        jLabel_2.setFont(font);

        jPanel_1.add(jLabel_1);
        jPanel_1.add(jLabel_2);

        jPanel_2.add(jButton_1);
        jPanel_2.add(jButton_2);
        jPanel_2.add(jButton_3);
        jPanel_2.add(jButton_4);
    }

    class ButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonName = e.getActionCommand();
            jPanel_2.removeAll();
            int funtionname = Integer.valueOf(buttonName.substring(0, 1));
            switch (funtionname) {
                case 1:
                    methot(new Operation_addition());
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
            }
        }
    }

    public static void methot(Operation operation) {
        operation.operation();
    }
}