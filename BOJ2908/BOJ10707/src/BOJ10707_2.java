import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10707_2 {

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
		int input[] = new int[5];
		for (int i =0; i< 5; i++)
			input[i] = Integer.parseInt(br.readLine());

		int X = input[0] * input[4];
		int Y = 0;
		if (input[4] <= input[2])
			Y = input[1];
		else
			Y = (input[4] - input[2]) * input[3] + input[1];
		
		System.out.println((X < Y) ? X : Y);
	}
}
