import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1547 {
	static int ball = 1;
	
	public static void main(String[] args) throws Exception {
		/*
		 * ù° �ٿ� ���� ��ġ�� �ٲ� Ƚ�� M�� �־�����, M�� 50���� �۰ų� ���� �ڿ����̴�.
		 * ��° �ٺ��� M���� �ٿ��� ���� ��ġ�� �ٲ� ��� X�� Y�� �־�����, X�� �Ű� Y�� ���� ��ġ�� ���� �ٲٴ� ���� �ǹ��Ѵ�.
		 * ���� �̵���Ű�� �߿� ���� �ſ��� ���������� ���� ����. X�� Y�� ���� 3���� �۰ų� ����, X�� Y�� ���� ���� �ִ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		StringBuilder change;
		while(testCase-- != 0)
		{
			change = new StringBuilder(br.readLine().trim());
			String num[] = change.toString().split(" ");
			
			temp(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
		}
		
		System.out.println((ball >= 1 && ball <= 3) ? ball : -1);
	}
	
	private static void temp(int a, int b) {
		// ���࿡ ���� ���� 2�� �߿� ball�� ��ġ�ϴ� �� ������ �ٲ�
		if(a == ball) ball = b;
		else if(b == ball) ball = a;
	}

}
