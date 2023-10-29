import javax.swing.*; // GUI 라이브러리
import java.awt.*; //awt : Abstract Window Toolkit
import java.awt.event.ActionListener; //이벤트 리스너
import java.awt.event.ActionEvent; //이벤트 발생
import java.util.ArrayList; //동적 배열 객체 관리 라이브러리

public class Calculator extends JFrame {
  // JFrame : GUI 창 , JButton : 버튼
  public Calculator() {
    setTitle("Calcuator");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setBackground(Color.white);
    contentPane.setLayout(new FlowLayout());

    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("CANCEL"));
    contentPane.add(new JButton("IGNORE"));

    setSize(300, 150);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
