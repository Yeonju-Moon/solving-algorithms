import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2490 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder yoot = new StringBuilder();
		
		// �Ѳ����� ��� �Է°��� stringBuilder ��ü�� �ް�
		// \n�� �������� split
		for(int i = 0; i < 3; i++)
		{
			switch (br.readLine().trim())
			{
			case "1 1 1 0":
			case "1 1 0 1":
			case "1 0 1 1":
			case "0 1 1 1":
				yoot.append("A\n");
				break;
			case "1 1 0 0":
			case "1 0 1 0":
			case "0 1 1 0":
			case "1 0 0 1":
			case "0 1 0 1":
			case "0 0 1 1":
				yoot.append("B\n");
				break;
			case "0 0 0 1":
			case "0 0 1 0":
			case "0 1 0 0":
			case "1 0 0 0":
				yoot.append("C\n");
				break;
			case "0 0 0 0":
				yoot.append("D\n");
				break;
			case "1 1 1 1":
				yoot.append("E\n");
				break;
			default:
				break;
			}
		}
		System.out.println(yoot);
		/*
		
		String yoot[] = sb.toString().split("\n");
		
		for (int i = 0; i< yoot.length; i++)
			System.out.println(yoot[i]);
		//int testCase[] = {4, 4, 4};
		
		//for(int i = 0; testCase[2] < 0; testCase[i]--)

		int yoot[] = new int[12];
		int i = 0;
		while (i < 12) {
			if (i == 3 || i == 7)
			{
				yoot[i] = Integer.parseInt(br.readLine().trim());
				i++;
				sb.append("\n");
			}
		}
		*/
				
	}

}
