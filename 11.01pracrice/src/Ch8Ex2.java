import java.awt.*;
import javax.swing.*;

public class Ch8Ex2 extends JFrame {

	public Ch8Ex2(){
		super("�ȳ�~");
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("������ �ȳ�");
		getContentPane().add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		setVisible(true);

	}
	
	public static void main(String[] args){
		Ch8Ex2 app = new Ch8Ex2();
	}

}
