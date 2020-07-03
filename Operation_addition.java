public class Operation_addition extends Operation {
    @Override
    //加法功能函数
    public void operation() {
        jLabel_1.setFont(Demo_GUI.font);
        jTextField_1.setFont(Demo_GUI.font);

        jLabel_1.setBounds(10, 10, 125, 40);
        jTextField_1.setBounds(200, 30, 50, 40);
        jButton_5.setBounds(300, 30, 100, 40);

        Demo_GUI.jPanel_2.add(jButton_5);
        Demo_GUI.jPanel_2.add(jLabel_1);
        Demo_GUI.jPanel_2.add(jTextField_1);

        Demo_GUI.jPanel_2.update(Demo_GUI.jPanel_2.getGraphics());

        String str1;//问题字符串
        String str2;//存放记录的字符串
        String str3;
        int number1 = 0;//输入的变量
        float number2 = 0;//回答正确的题的数量
        float number3 = 0;//回答正确的概率
        int number4;//问题答案变量
        int number5 = 1;//计数
        int number6 = -1;//判定循环
        long begintime = System.currentTimeMillis();//开始计时
        int x1 = random.nextInt(51);//随机数1
        int x2 = random.nextInt(51);//随机数2
        str1 = x1 + "+" + x2;
        str3 = number5 + str1;
        jLabel_1.setText(str3);
        Demo_GUI.jPanel_2.update(Demo_GUI.jPanel_2.getGraphics());
        try {
            number1 = Integer.valueOf(jTextField_1.getText());
        } catch (Exception e) {
            /*number1 = -1;
            Demo_GUI.jPanel_2.update(Demo_GUI.jPanel_2.getGraphics());*/
        }
        number4 = x1 + x2;//计算正确答案
        str2 = "第" + (linkedList.size() + 1) + "题: " + str1 + "=" + number4 + "  你的回答  " + number1;//连接成一条记录
        ;
    }
}
