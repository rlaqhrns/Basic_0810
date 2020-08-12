package dddddd;

import java.util.Scanner;

public class StudentTest {
	
	   public static void main(String[] args) {


	         
	      Scanner scan = new Scanner(System.in);
	      SbjectScore sbScore = new SbjectScore();
	      
	      
	      
	      while(true) {
	         System.out.println("학생성적관리프로그램에 오신 것을 환영합니다.");
	         System.out.println("번호를 입력하세요.");
	         System.out.println("0. 종료하기");
	         System.out.println("1. 신규성적 입력");
	         System.out.println("2. 총점 확인");
	         System.out.println("3. 평균 확인");
	         System.out.println("4. 석차 정렬");
	         
	        
	         int number = scan.nextInt();         
	         
	         
	         if(number==0) 
	            sbScore.quit();
	         else if(number==1) 
	            sbScore.newScore();  
	         else if(number==2) 
	            sbScore.total(); 
	         else if(number==3)
	            sbScore.average();  
	         else if(number==4)
	            sbScore.ranking();
	         else System.out.println("번호를 잘 못 입력하셨습니다. 다시 입력해주세요.\n");      
	         
	         
	      }
	 } 
}
	
	
	
	
	
	

