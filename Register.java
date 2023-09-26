import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {

    public Register() {
        setSize(400,300);
        setLayout(new GridLayout(4,1));
        JLabel label = new JLabel("회원 등록하기");
        Font curent = label.getFont();
        Font font = new Font(curent.getName(), curent.getStyle(), 24);
        label.setFont(font);
        JPanel p2,p5, p6;
        JButton b1, b2;
        setTitle("회원등록");
        p5 = new JPanel();
        p6 = new JPanel();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        p6.setBorder(BorderFactory.createEmptyBorder(10, 0,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 50,10, 100));
        p5.setBorder(BorderFactory.createEmptyBorder(0, 50,10, 100));
        // 레이블과 텍스트 상자 추가
        panel.add(new JLabel("이름 "));
        panel.add(new JTextField());

        panel.add(new JLabel("패스워드 "));
        panel.add(new JTextField());

        p5.setLayout(new GridLayout(2, 2));

        p5.add(new JLabel("이메일주소 "));
        p5.add(new JTextField());

        p5.add(new JLabel("전화번호 "));
        p5.add(new JTextField());
        b1 = new JButton("  등록하기  ");
        b2 = new JButton("   취소   ");
        p6.add(label);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        p2.setBorder(BorderFactory.createEmptyBorder(0, 0,0, 90));
        add(p6);
        add(panel);
        add(p5);
        add(p2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        Register r1 = new Register();
    }
}