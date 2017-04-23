import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // ���
		int M = Integer.parseInt(NM.nextToken()); // ����

		/* ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		 * �̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, 
		 * N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����. */
		StringBuilder person = new StringBuilder();
		for (int i = 0; i < N+M; i++)
			person.append(br.readLine().trim()).append("\n");
		String people[] = person.toString().split("\n");

		person.setLength(0);
		//StringBuilder name = new StringBuilder();
		int count = 0;
		for (int i = 0; i < N; i++)
		{
			for (int j = N; j < N+M; j++)
				if (people[i].equals(people[j]))
				{
					person.append(people[i]).append("\n");
					count++;
				}
		}
			
		 // �躸���� ���� �� ����� ���������� ����Ѵ�.
		System.out.println(count);
		String str[] = person.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
		
	}
}
