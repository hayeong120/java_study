import java.util.Scanner;

class IfExam1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		if(a % 2 == 0) System.out.println(a + "은(는) 짝수입니다.");
		else System.out.println(a + "은(는) 홀수입니다.");
	}
}