import java.util.Scanner;

public class SB_BOJ2908 {

	public static void main(String[] args) {		
		/*
		 * ���ڸ� ���ڿ��� 2�� �Է¹޾Ƽ�
		 * 1-1. ���ڸ� ������	 * 1-2. ��
		 */
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		StringBuffer sb = new StringBuffer(""+num1);
		String st = sb.reverse().toString();
		num1 = Integer.parseInt(st);
		
		sb = new StringBuffer(""+num2);
		st = sb.reverse().toString();
		num2 = Integer.parseInt(st);
		
		System.out.println(num1>num2 ? num1 : num2);
	}

}
