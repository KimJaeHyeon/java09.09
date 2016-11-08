import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JMenu.*;
;
class calc  implements ActionListener
{	
	JFrame frame;   
	JTextField textfieldNorth; 
	JTextField textField;
	JMenuBar menuBar;
	JMenu menu;
	JMenu menu2;
	JPanel panel1;  
	JPanel panelNorth;  
	GridLayout grid;
	JButton JBu;
	String[] strGrid={"7","8","9","/","4","5","6","*","1","2","3","-" ,"0","C","+","=" };
	
	private String first="";  	
	private String result=""; 		
	ArrayList<Integer> ee=new ArrayList<Integer>();  		
	ArrayList<String> store=new ArrayList<String>();  		

	public static void main(String[] args)   //����
	{
		calc cal=new calc();
		cal.layout();
	}
	
	public calc(){   //���� Ŭ���� ����
		frame=new JFrame("Calculator_by_������");
		menuBar=new JMenuBar();

		panel1=new JPanel();              //����κ�
		panelNorth=new JPanel();
		textField=new JTextField("0"); 			
		textfieldNorth=new JTextField(""); 		
	
		
		menu=new JMenu("�޴�1");		    //�޴��κ�
		JMenu menu1 = new JMenu("��ȭ����(P)");
		JMenuItem item1 = new JMenuItem("Open");
	  item1.setMnemonic('o');
		menu2=new JMenu("�޴�2");
		
	}

	public void layout(){   //���̾ƿ�
	
	textField.setHorizontalAlignment(JTextField.RIGHT);  
		
		panelNorth.setLayout(new BorderLayout());    		
		panelNorth.add(BorderLayout.CENTER,textField);
		
		panel1.setLayout(new GridLayout(4,3,6,6));  			

		for(int i=0; i<strGrid.length; i++){
			JBu=new JButton(strGrid[i]);  				
			JBu.addActionListener(this);	 			
			panel1.add(JBu); 						
		}
		
	
		frame.add(BorderLayout.NORTH,panelNorth); 
    	frame.add(BorderLayout.CENTER,panel1); 		 // �ؽ�Ʈ�ʵ� ���ʿ�
		
		frame.setSize(300,300);                                  
		frame.setVisible(true);                                  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
		menuBar.add(menu);		
		menuBar.add(menu2);
		frame.setJMenuBar(menuBar);  
	}	
	
	public void actionPerformed(ActionEvent e){  //�̺�Ʈ�κ�
		String str=e.getActionCommand();  		
		String read;				
		
		try{	
			if(str!="/" && str!= "*"&& str!= "-"&& str!= "+"&& str!= "C"&& str!= "="){	
				textField.setText(first);  		
				textField.getText();  		
				textfieldNorth.setText("");	
				textfieldNorth.getText(); 	
				
				read=textField.getText();  		
				first=read+str;
				textField.setText(first);		
				textField.getText(); 			
			}
					
			if(str=="/" || str== "*"|| str== "-"|| str== "+"|| str== "="){
				textfieldNorth.setText(str); 				
				textfieldNorth.getText();  					
				
				ee.add(Integer.parseInt(first));  
				first="";					
				
				store.add(str); 			 
			}
						
			if(str=="="){		
				int sum=0;
				sum=ee.get(0);  
				
				for(int a=0,h=1; a<ee.size(); a++,h++){  
					int ve=store.size(); 				
					if(ve>0){							
						ve--;			
						if(store.get(a)=="+"){		
							sum=sum+ee.get(h);  			
						}else if(store.get(a)=="-"){	
							sum=sum-ee.get(h);	
						}else if(store.get(a)=="*"){
							sum=sum*ee.get(h);
						}else if(store.get(a)=="/"){
							try{				
								sum=sum/ee.get(h);
							}catch(Exception exc){		
								sum=0; 
							}
						}			
					}
				}
				result=sum+"";						
				textField.setText(result);  		
				textField.getText(); 				
			}
			
			
			if(str=="C"){
				first="";
				textField.setText("0"); 			 
				textField.getText();  			
				textfieldNorth.setText(""); 	
				textfieldNorth.getText(); 
				ee.clear();  				
				store.clear();  			
			}
			
		}catch(Exception ex){
			textField.setText("Error �ٽ��Է� CŬ��."); 
			textField.getText(); 
		}
	
	}

}