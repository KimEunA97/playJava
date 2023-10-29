import javax.swing.*; // GUI 라이브러리
import java.awt.*; //awt : Abstract Window Toolkit
import java.awt.event.ActionListener; //이벤트 리스너
import java.awt.event.ActionEvent; //이벤트 발생
import java.util.ArrayList; //동적 배열 객체 관리 라이브러리

public class Calculator extends JFrame {
  // JFrame : GUI 창 , JButton : 버튼
  public Calculator() {
    setTitle("Calcuator"); // 프로그램 제목
    setSize(500, 500);
    setResizable(false); // 크기 조절 off
    setLocationRelativeTo(null); // 화면 중앙에서 실행
    setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 프로그램 정상 종료

    JPanel panel = new JPanel(new GridLayout(4, 4));

    // 글자 필드
    JTextField textField = new JTextField();
    panel.add(textField, BorderLayout.NORTH);

    String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };
    for (String button : buttons) {
      var btn = new JButton(button);
      panel.add(btn);
    }

    add(panel);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
