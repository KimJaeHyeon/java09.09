import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex3 extends JFrame {
	Ex3() {
		setTitle("�ݼ� �̺�Ʈ ������ �ۼ�2");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setVisible(true);
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		add(btn);
	}
	public static void main(String [] args) {
		new Ex3();
	}
}
class Ex1 implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");			
	}
}
