import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // ���
		int M = Integer.parseInt(NM.nextToken()); // ����
		String n_person[] = new String[N];
		String m_person[] = new String[M];

		/* ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		  �̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, 
		 N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����. */
		StringBuilder name = new StringBuilder();
		for (int i = 0; i < N; i++) n_person[i] = br.readLine().trim();
		for (int i = 0; i < M; i++) m_person[i] = br.readLine().trim();

		int count = 0;
		while (--N >= 0)
		{
			for (int i = 0; i < M; i++)
				if (m_person[i].equals(n_person[N])) // if (m_person[i] == n_person[N])�� �־ȵ���
				{
					name.append(m_person[i]).append("\n");
					count++;
				}
		}
		// �躸���� ���� �� ����� ���������� ����Ѵ�.
		System.out.println(count);
		String str[] = name.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}