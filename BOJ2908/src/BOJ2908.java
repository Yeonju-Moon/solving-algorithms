/*import java.util.Scanner;

public class BOJ2908 {

	public static void main(String[] args) {		
		
		 * ���ڸ� 2�� �Է¹޾Ƽ�
		 * 1-1. �ڸ��� ��	 * 1-2. �ڸ��� �� -> �ڸ����� ���� ���� ���� ���� �ڸ����� ū ���� �� ŭ
		 * 2-1. ���ڸ� ������	 * 2-2. ��
		 
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num1_1 = 0, num2_1 = 0;
		int temp;
		
		while(num1 > 0)
		{
			temp = num1%10;
			num1 = num1/10;
			num1_1 = num1_1*10 + temp;
		}
		while(num2 > 0)
		{
			temp = num2%10;
			num2 = num2/10;
			num2_1 = num2_1*10 + temp;
		}

		System.out.println(num1_1>num2_1? num1_1 : num2_1);
	}

}
*/