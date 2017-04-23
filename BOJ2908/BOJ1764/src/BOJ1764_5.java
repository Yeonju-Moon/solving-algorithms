import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // ���
		int M = Integer.parseInt(NM.nextToken()); // ����
		String n_person[] = new String[N];
		String m_person[] = new String[M];

		 /*ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		  �̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, 
		 N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����.*/ 
		StringBuilder name = new StringBuilder(" ");
		for (int i = 0; i < N; i++) n_person.append(br.readLine() + " ");
		for (int i = 0; i < M; i++) m_person[i] = br.readLine().trim();

		int count = 0;
		for (int i = 0; i < M; i++)
			if (n_person.toString().contains(" " + m_person[i] + " "))
			{
				name.append(m_person[i]).append("\n");
				count++;
			}
		
		// �躸���� ���� �� ����� ���������� ����Ѵ�.
		System.out.println(count);
		String str[] = name.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // ���
		int M = Integer.parseInt(NM.nextToken()); // ����
		StringBuilder n_person = new StringBuilder();
		String m_person[] = new String[M];

		 ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
		  �̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, 
		 N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����. 
		StringBuilder name = new StringBuilder(" ");
		for (int i = 0; i < N; i++) n_person.append(br.readLine() + " ");
		for (int i = 0; i < M; i++) m_person[i] = br.readLine().trim();

		int count = 0;
		for (int i = 0; i < M; i++)
			if (n_person.toString().contains(" " + m_person[i] + " "))
			{
				name.append(m_person[i]).append("\n");
				count++;
			}
		
		// �躸���� ���� �� ����� ���������� ����Ѵ�.
		System.out.println(count);
		String str[] = name.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}*/