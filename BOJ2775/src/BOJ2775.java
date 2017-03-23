import java.util.Scanner;

public class BOJ2775 {

	public static void main(String[] args) {
		/*
		 * ��, ���ȣ, �ο��� �迭
		 * �迭 �ʱ�ȭ -> 1,2,3,4,5...
		 * resiNum[���ȣ] �� resiNum[���ȣ-1] + resiNum[���ȣ-1]
		 */

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int[] resiNum;
		
		while (num!=0)
		{
			int floor= scanner.nextInt();
			int room = scanner.nextInt();
			
			if(floor<1 || 14<floor || room<1 || 14<room)
			{
				System.out.println("�ٽ� �Է����ּ���");
			}
			
			// �迭 �ʱ�ȭ : 0��
			resiNum = new int[room];
			for(int i = 0; i < room; i++)
				resiNum[i] = i+1;
			
			while (0!=floor)
			{ // 1������ ��� �����ϱ� �ٲ� �ʿ䰡 ����
				for(int i = 1; i < room; i++)
					resiNum[i] = resiNum[i-1] + resiNum[i];
				floor--;
			}
			
			System.out.println(resiNum[room-1]);
			num--;
			/*for(int i = 0; i < room; i++)
				System.out.print(resiNum[i] + " ");*/
			
		}
	}
}
