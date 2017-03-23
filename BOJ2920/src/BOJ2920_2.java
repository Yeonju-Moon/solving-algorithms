import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2920_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int music[] = new int[8];

		for(int i = 0; i < 8; i++)
			music[i] = Integer.parseInt(br.readLine().trim());

		/*
		 * ascending: 1���� ����
		 * descending: 8���� ����
		 * mixed: �߰��� ������ ���׹���
		 * ���� ���̶� ���ؼ� �׷���?�� ��ȭ�� ������ flag�� �ٲ���
		 */
		
		String state = "ascending";
		if(music[0] < music[1]) // ascending�� ���
		{
			for(int i = 0; i < 8; i++) // ���� �� ascending ���¸�
			{
				if(music[i] != i+1) {
					state = "mixed";
					break;
				}
			}
			
		}
		else
		{
			for(int i = 0; i < 8; i++) // ���� �� ascending ���¸�
			{
				if(music[i] == 8-i)
					state = "descending";
				else {
					state = "mixed";
					break;
				}
			}	
		}
		
		System.out.println(state);

	}

}
