/*import java.util.Scanner;

public class Arr2_BOJ1157 {

	public static void main(String[] args) {
		
		 * HashMap�� ���ĺ� �� �� ����
		 * map�� value �� ���
		 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		
		int[][] num = new int[2][str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			if(num[0][i] == 0)
				
			//num[str.charAt(i)-65]++;
		}
		int max = 0; // ���ĺ� �ڸ���ȣ/����
		boolean a = false;
		for(int i = 0; i < 26; i++)
		{
			
			 * ���࿡ max��° ���ں��� i��° ���� �� ũ��
			 * max = i
			 
			if(num[i] > num[max])
			{
				max = i;
				a = false;
				//System.out.println(max + " " + i);
			}
			else if (num[i] == num[max])
				a = true;
			else
				a = false;
		}
		for(int i=0;i<26;i++)
			System.out.print(num[i]+" ");
		System.out.print("\n");
		System.out.println(a ? "?" : (char)(max+65));

	}

}
*/