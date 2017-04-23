import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10707 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * X�� : 1���ʹ� A��.
		 * Y�� : �⺻����� B���̰�, ��뷮�� C���� ���϶�� ����� �⺻��ݸ� û���ȴ�.
		 * 		��뷮�� C���Ͱ� �Ѿ��� ��� �⺻��� B���� ���ؼ� �߰������ �ٴ´�. 
		 * 		�߰������ ��뷮�� C���͸� �Ѿ��� ��� 1���͸� �Ѿ��� ������ D���̴�.
		 * 
		 * A : X���� 1���ʹ� ���
		 * B : Y���� �⺻���
		 * C : Y���� ����� �⺻����� �Ǵ� ��뷮�� ����
		 * D : Y���� 1���� �� �߰����
		 * P : JOI���� ������ ����ϴ� �� �ް� ������ ��
		 */
		/*String input = new String();
		for (int i =0; i< 5; i++)
			input += br.readLine() + " ";*/
		
		StringBuilder input = new StringBuilder();
		for (int i =0; i< 5; i++) 
			input.append(br.readLine()).append(" "); //input.append(br.readLine()).append("\n");
		String price[] = input.toString().split(" ");

		int X = Integer.parseInt(price[0]) * Integer.parseInt(price[4]);
		int Y = 0;
		if (price[4].compareTo(price[2]) <= 0) //if (Integer.parseInt(price[4]) <= Integer.parseInt(price[2]))
			Y = Integer.parseInt(price[1]);//Integer.parseInt(price[0]) * Integer.parseInt(price[4]);
		else
			Y = (Integer.parseInt(price[4]) - Integer.parseInt(price[2])) * Integer.parseInt(price[3]) + Integer.parseInt(price[1]);
		
		System.out.println((X < Y) ? X : Y);	
	}
}
