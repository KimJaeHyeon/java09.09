import java.awt.*;

public class Ch8Ex3 extends Frame {
	public Ch8Ex3(){
		super("awt�⺻����");
		setLayout(new BorderLayout());
		Label t1 = new Label("���̵�");
		Label t2 = new Label("��й�ȣ");
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		Button btn = new Button("login");
		
		Panel p1 = new Panel();
		p1.add(t1);
		p1.add(id);
		
		Panel p2 = new Panel();
		p2.add(t2);
		p2.add(pwd);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);

		setSize(250,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch8Ex3 app = new Ch8Ex3();
	}

}
