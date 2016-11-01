import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;


public class Ch8Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Hello World");
		f.setLayout(new FlowLayout());
		Label label = new Label("せせせせせせせせせ");
		f.add(label);
		f.setSize(300,300);
		f.setVisible(true);
		
	}
	
}
