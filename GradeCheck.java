import java.util.Scanner;
		public class GradeCheck {
			public static void checkGrade(int grade)
			{
				if(grade>=55)
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
			}
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				int grade=scan.nextInt();
				checkGrade(grade);
				System.out.println();
				
			}
			

	

	
	
	
	
	
	
	
	
	
}
