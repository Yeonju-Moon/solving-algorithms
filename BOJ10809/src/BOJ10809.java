import java.util.Scanner;

public class BOJ10809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String s = new String(); //char s[] = new char[100];
		int alphabet[] = new int[26];
		
		// ��ü �迭 -1�� ���� �ʱ�ȭ
		for (int i=0;i<26;i++)
		{
			alphabet[i] = -1;
			//System.out.print(alphabet[i]+" ");
		}
		
		// 1. ���ڿ��� �Է¹޾�
		s = scanner.nextLine();
		//System.out.println(s);
		
		// 5. �ݺ�
		for (int i = 0; i < s.length(); i++)
		{
			int a = s.charAt(i) - 97;// alphabet�迭 �ȿ� �� �˹ٺ��� ��ġ(����)
			// 2. �Է¹��� ���ڿ��� ���ڿ� �ش��ϴ� ���ĺ��� Ȯ�εƴ��� üũ
			if(alphabet[a] == -1)
			{ // 3. �ȵ�����(-1�̸�) ������ ���� ����ֱ�
				alphabet[a] = i;
			}
			// 4. Ȯ�ε����� �Ѿ
		}
		for (int i = 0; i < 26; i++)
			System.out.print(alphabet[i]+" ");
	}
}

