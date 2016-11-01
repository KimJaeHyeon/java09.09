import java.util.Scanner;

public class Ch6Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] score = new int[45]; //
			for(int i=0 ; i<score.length; i++) {
			score[i] = i+1; //1~45개의 숫자 생성
			}
			for(int i=0 ; i<150; i++) {
			int temp;
			int n = (int)(Math.random()* 45);
			temp = score[0];
			score[0] = score[n];
			score[n] = temp; // 0~44의 배열 각 자리수를 무작위로 바꿈
			}


			System.out.print("Lotto: ");
			for(int i=0 ; i<7; i++){
				if(i==6)
					
				{
			    	System.out.println("보너스 숫자 :"+score[6]);
			
				}
				else
				System.out.print(score[i]+" "); // 무작위로 바뀐 배열 0~5까지 총 6개의 숫자 뽑기
			
				
			}
		}
}
