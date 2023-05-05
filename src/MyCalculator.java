/**
 * @Author xhy
 * @Date 2023/5/1 16:37
 * @description: 计算器
 * @Title: MyCalculater
 * @Package PACKAGE_NAME
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Stack;

public class MyCalculator implements ActionListener {
    // 定义主窗口并命名
    private final JFrame jf = new JFrame("计算器");
    // 定义文本框
    private final JTextField jt = new JTextField("用鼠标点击按钮来输入算术表达式");
    // 定义按钮
    private JButton but_0, but_1, but_2, but_3, but_4, but_5, but_6, but_7, but_8, but_9,
            but_add, but_sub, but_mult, but_div, but_lt, but_rt, but_org, but_equ, but_C, but_Del;
    // 初始化表达式
    private String input = "";

    MyCalculator() {
        // 设置各按钮的信息
        setButton();
        // 设置文本框信息
        setTextField();
        //设置主窗口信息
        setThis();
        // 添加各组件
        addBut();
    }

    // 设置按钮信息的方法
    private void setButton() {
        but_0 = new JButton("0");
        but_0.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_0.setMargin(new Insets(0, 0, 0, 0));
        but_1 = new JButton("1");
        but_1.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_1.setMargin(new Insets(0, 0, 0, 0));
        but_2 = new JButton("2");
        but_2.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_2.setMargin(new Insets(0, 0, 0, 0));
        but_3 = new JButton("3");
        but_3.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_3.setMargin(new Insets(0, 0, 0, 0));
        but_4 = new JButton("4");
        but_4.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_4.setMargin(new Insets(0, 0, 0, 0));
        but_5 = new JButton("5");
        but_5.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_5.setMargin(new Insets(0, 0, 0, 0));
        but_6 = new JButton("6");
        but_6.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_6.setMargin(new Insets(0, 0, 0, 0));
        but_7 = new JButton("7");
        but_7.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_7.setMargin(new Insets(0, 0, 0, 0));
        but_8 = new JButton("8");
        but_8.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_8.setMargin(new Insets(0, 0, 0, 0));
        but_9 = new JButton("9");
        but_9.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_9.setMargin(new Insets(0, 0, 0, 0));
        but_add = new JButton("+");
        but_add.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_add.setMargin(new Insets(0, 0, 0, 0));
        but_sub = new JButton("-");
        but_sub.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_sub.setMargin(new Insets(0, 0, 0, 0));
        but_mult = new JButton("*");
        but_mult.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_mult.setMargin(new Insets(0, 0, 0, 0));
        but_div = new JButton("/");
        but_div.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_div.setMargin(new Insets(0, 0, 0, 0));
        but_lt = new JButton("(");
        but_lt.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_lt.setMargin(new Insets(0, 0, 0, 0));
        but_rt = new JButton(")");
        but_rt.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_rt.setMargin(new Insets(0, 0, 0, 0));
        but_Del = new JButton("Del");
        but_Del.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_Del.setMargin(new Insets(0, 0, 0, 0));
        but_C = new JButton("C");
        but_C.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_C.setMargin(new Insets(0, 0, 0, 0));
        but_equ = new JButton("=");
        but_equ.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_equ.setMargin(new Insets(0, 0, 0, 0));
        but_org = new JButton(".");
        but_org.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
        but_org.setMargin(new Insets(0, 0, 0, 0));
    }

    // 设置文本框信息方法
    private void setTextField() {
        jt.setEditable(false);
        jt.setFont(new Font("楷体_2312", Font.PLAIN, 18));
    }

    // 定义主窗口的方法
    private void setThis() {
        // 窗口大小
        jf.setSize(500, 335);
        // 窗口位置
        jf.setLocation(600, 350);
        // 关闭窗口结束程序运行
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 窗口大小不可变
        jf.setResizable(false);
        // 窗口可见
        jf.setVisible(true);
    }

    // 添加各组件的方法
    private void addBut() {
        // 组件绝对位置摆放
        jf.setLayout(null);
        jt.setBounds(0, 0, 500, 80);
        jf.add(jt);
        but_7.setBounds(0, 100, 100, 50);
        jf.add(but_7);
        but_8.setBounds(100, 100, 100, 50);
        jf.add(but_8);
        but_9.setBounds(200, 100, 100, 50);
        jf.add(but_9);
        but_add.setBounds(300, 100, 100, 50);
        jf.add(but_add);
        but_lt.setBounds(400, 100, 100, 50);
        jf.add(but_lt);
        but_4.setBounds(0, 150, 100, 50);
        jf.add(but_4);
        but_5.setBounds(100, 150, 100, 50);
        jf.add(but_5);
        but_6.setBounds(200, 150, 100, 50);
        jf.add(but_6);
        but_sub.setBounds(300, 150, 100, 50);
        jf.add(but_sub);
        but_rt.setBounds(400, 150, 100, 50);
        jf.add(but_rt);
        but_1.setBounds(0, 200, 100, 50);
        jf.add(but_1);
        but_2.setBounds(100, 200, 100, 50);
        jf.add(but_2);
        but_3.setBounds(200, 200, 100, 50);
        jf.add(but_3);
        but_mult.setBounds(300, 200, 100, 50);
        jf.add(but_mult);
        but_Del.setBounds(400, 200, 100, 50);
        jf.add(but_Del);
        but_org.setBounds(0, 250, 100, 50);
        jf.add(but_org);
        but_0.setBounds(100, 250, 100, 50);
        jf.add(but_0);
        but_equ.setBounds(200, 250, 100, 50);
        jf.add(but_equ);
        but_div.setBounds(300, 250, 100, 50);
        jf.add(but_div);
        but_C.setBounds(400, 250, 100, 50);
        jf.add(but_C);
        initial();
    }

    // 各组件添加监听器
    private void initial() {
        but_0.addActionListener(this);
        but_1.addActionListener(this);
        but_2.addActionListener(this);
        but_3.addActionListener(this);
        but_4.addActionListener(this);
        but_5.addActionListener(this);
        but_6.addActionListener(this);
        but_7.addActionListener(this);
        but_8.addActionListener(this);
        but_9.addActionListener(this);
        but_add.addActionListener(this);
        but_sub.addActionListener(this);
        but_mult.addActionListener(this);
        but_div.addActionListener(this);
        but_org.addActionListener(this);
        but_C.addActionListener(this);
        but_lt.addActionListener(this);
        but_rt.addActionListener(this);
        but_Del.addActionListener(this);
        but_equ.addActionListener(this);
    }

    // 遍历到操作符时的压栈方法
    public double cal(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num2 - num1;  //靠近栈底的做被减数
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // 除数不为 0 则返回结果，除数为 0 弹出提示对话框
                if (num1 != 0) {
                    result = num2 / num1; //靠近栈底的做被除数
                } else {
                    // 提示对话框
                    JOptionPane.showOptionDialog(jf, "除数不能为0", "温馨提示",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
                    input = "";
                    jt.setText(input);
                }
                break;
            default:
                JOptionPane.showOptionDialog(jf, "算术表达式无法计算", "温馨提示您",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
                input = "";
                jt.setText(input);
                break;
        }
        return result;
    }

    // 后缀表达式值算法
    public String calculate(String input) {
        // 遍历字符串 input, 去掉连续两个空格的情况，例 （6+7）/3 + 2
        // 创建字符串数组用 " " 标志分割输入字符串
        String[] compute = input.split(" ");
        Stack<String> stack1 = new Stack<>();  // 存后缀表达式
        Stack<String> stack2 = new Stack<>();  // 临时放操作符
        Stack<String> stack3 = new Stack<>();  // 最后运算栈
        for (int i = 0; i < compute.length; ++i) {
            if (compute[i].matches("-?\\d+(\\.\\d+)?")) {
                stack1.push(compute[i]);
            } else if (stack2.isEmpty()) {
                stack2.push(compute[i]);
            } else if (compute[i].equals("(")) {
                stack2.push(compute[i]);
            } else if (compute[i].equals(")")) {
                while (!(stack2.peek().equals("("))) {
                    stack1.push(stack2.pop());
                }
                stack2.pop();
            }
            // 加减乘除入栈
            else if (compute[i].equals("+") || compute[i].equals("-") || compute[i].equals("*")
                    || compute[i].equals("/") || compute[i].equals("(")) {
                while ((!stack2.isEmpty()) && (nPriority(compute[i]) <= nPriority(stack2.peek()))) {
                    stack1.push(stack2.pop());
                }
                stack2.push(compute[i]);
            }
            // 数字小数点直接入栈
            else {stack1.push(compute[i]);}
        }
        // 当操作符栈不为空，将操作符全部弹入 stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        // 遍历后缀表达式
        for (String l : stack1) {
            String num1, num2;
            // 正则表达式匹配浮点数
            if (l.matches("-?\\d+(\\.\\d+)?")) {
                //if (l.matches("-?\\d+")) {    //正则表达式匹配数字
                stack3.push(l);
            } else {
                if(stack3.isEmpty()){
                    num1 = "0";
                }
                else {
                    num1 = stack3.pop();
                }
                if(stack3.isEmpty()){
                    num2 = "0";
                }
                else {
                    num2 = stack3.pop();
                }
                double calculate = cal(Double.parseDouble(num1), Double.parseDouble(num2), l);
                stack3.push(String.valueOf(calculate));
            }
        }
        // 计算结果保留三位小数
        DecimalFormat df = new DecimalFormat("#0.000");
        return df.format(Double.parseDouble(stack3.pop()));
    }

    // 定义运算符优先级
    public int nPriority(String str) {
        int n = 0;
        switch (str) {
            case "+":
            case "-":
                n = -1;
                break;
            case "*":
            case "/":
                n = 1;
                break;
            case "(":
                n = -2;
                break;
            case ")":
                n = 2;
            default:
                break;
        }
        return n;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cnt = 0;
        String actionCommand = e.getActionCommand();            //获取按钮上的字符串
        if (actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("*") || actionCommand.equals("/")) {
            input += " " + actionCommand + " ";
        } else if (actionCommand.equals("Del")) {
            input = input.substring(0, input.length() - 1);
        } else if (actionCommand.equals("C")) {
            input = "";
        } else if (actionCommand.equals("=")) {
            try {
                input += " " + "=" + " " + calculate(input);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            jt.setText(input);
            input = "";
            cnt = 1;
        } else if (actionCommand.equals("(")) {
            input += actionCommand + " ";
        } else if (actionCommand.equals(")")) {
            input += " " + actionCommand;
        } else {input += actionCommand;}
        // 设置标志 cnt ，让文本框始终显示输入字符串
        if (cnt == 0) {
            jt.setText(input);
        }
    }
}

class StartMyCalculator {
    public static void main(String[] args) {
        // 启动计算器图形界面窗口
        new MyCalculator();
    }
}