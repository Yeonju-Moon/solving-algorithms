import java.util.Scanner;

public class BOJ2675 {

	public static void main(String[] args) { // TODO ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		
        int caseNum = scanner.nextInt();
		
		while (caseNum != 0)
		{
			// ���ڿ� S�� �Է¹��� �Ŀ�
			int r = scanner.nextInt();
			String s = scanner.next(); // ���������
			// s = scan.nextLine(); ��������
			String t = new String();
			
			// �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� ��
			for(int i = 0; i < s.length(); i++)
			{
				for(int j = 0;j<r; j++)
				{
					t += s.charAt(i);
				}
			}
			caseNum--;
			// ���
			System.out.println(t);
		}
		
	}

}
