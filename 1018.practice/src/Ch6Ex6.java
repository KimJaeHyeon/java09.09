import java.util.Scanner;

public class Ch6Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] score = new int[45]; //
			for(int i=0 ; i<score.length; i++) {
			score[i] = i+1; //1~45���� ���� ����
			}
			for(int i=0 ; i<150; i++) {
			int temp;
			int n = (int)(Math.random()* 45);
			temp = score[0];
			score[0] = score[n];
			score[n] = temp; // 0~44�� �迭 �� �ڸ����� �������� �ٲ�
			}


			System.out.print("Lotto: ");
			for(int i=0 ; i<7; i++){
				if(i==6)
					
				{
			    	System.out.println("���ʽ� ���� :"+score[6]);
			
				}
				else
				System.out.print(score[i]+" "); // �������� �ٲ� �迭 0~5���� �� 6���� ���� �̱�
			
				
			}
		}
}
