import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex2 extends JFrame {
	Ex2() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("마우스 이벤트 테스트 버튼");
		btn.setBackground(Color.BLUE);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		add(btn);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Ex2();
	}
} 

class MyMouseListener implements MouseListener {
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.GREEN);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
}
