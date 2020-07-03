import java.util.Iterator;

public class Operation_division extends Operation {
    @Override
    //除法功能函数
    public void operation() {
        String str1;//问题字符串
        String str2;//存放记录的字符串
        int number1 = 0;//输入的变量
        float number2 = 0;//回答正确的题的数量
        float number3 = 0;//回答正确的概率
        int number4;//问题答案变量
        long begintime = System.currentTimeMillis();//开始计时
        while (number1 != -1) {
            int x1 = random.nextInt(51);//随机数1
            int x2 = random.nextInt(51);//随机数2
            //防止被除数为0;是答案都大于等于1
            while (x2 == 0 || x1 < x2) {
                x1 = random.nextInt(51);
                x2 = random.nextInt(51);
            }
            str1 = x1 + "/" + x2;
            System.out.println(str1);//输出问题
            try {//防止输入字符会报错
                number1 = sc.nextInt();//输入答案
            } catch (Exception e) {
                System.out.println("请输入正确的数据类型");
                sc.next();//防止输入字符后无限循环
            }
            //退出函数
            if (number1 == -1) {
                long endtime = System.currentTimeMillis();//停止计时
                long functiontime = (endtime - begintime) / 1000;//算出所用时间
                Iterator<String> iterator = linkedList.iterator();//创建迭代器
                //遍历迭代器,输出做过的所有题目
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                //计算正确率;并防止出现linkedList.size()为0时,number2 / linkedList.size()的输出为NaN
                if (number2 != 0) {
                    number3 = number2 / linkedList.size() * 100;
                }
                String str3 = "你的正确率为" + number3 + "%    用时" + functiontime + "秒";
                System.out.println(str3);//输出正确率,做题所用时间
                return;//结束该函数
            }
            number4 = x1 / x2;//计算正确答案
            str2 = "第" + (linkedList.size() + 1) + "题: " + str1 + "=" + number4 + "  你的回答  " + number1;//连接成一条记录
            //验证是否回答正确
            if (number1 == x1 / x2) {
                System.out.println("回答正确\n=======================");
                number2++;
            } else {
                System.out.println("回答错误\n=======================");
            }
            linkedList.add(str2);//将记录存入集合
        }
    }
}
