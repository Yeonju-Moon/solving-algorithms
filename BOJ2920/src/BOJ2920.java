import java.util.Scanner;

public class BOJ2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int music[] = new int[8];
		
		for(int i = 0; i < 8; i++)
			music[i] = sc.nextInt();

		/*
		 * ascending: 1���� ����
		 * descending: 8���� ����
		 * mixed: �߰��� ������ ���׹���
		 * ���� ���̶� ���ؼ� �׷���?�� ��ȭ�� ������ flag�� �ٲ���
		 */
		
		boolean flag = true;
		
		if(music[0] == 1 && music[7] == 8) // ascending�� ���
		{
			for(int i = 1; i < 7; i++) // ���� �� ascending ���¸�
			{
				if(music[i] == i+1)
					flag = false;
				else {
					flag = true;
					break;
				}
				if(i == 6)
					System.out.println("ascending");
			}
			
		}
		else if(music[0] == 8 && music[7] == 1)
		{
			for(int i = 1; i < 7; i++) // ���� �� descending ���¸�
			{
				if(music[i] == 8-i)
					flag = false;
				else {
					flag = true;
					break;
				}
				
				if(i == 6)
					System.out.println("descending");
			}		
		}
		
		if(flag)
			System.out.println("mixed");
		
	}

}
