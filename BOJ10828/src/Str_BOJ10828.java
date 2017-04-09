import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Str_BOJ10828 {

	//static int stack[] = new int[10000];
	static int[] stack;
	static int i = -1;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		/*
		 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * push X: ���� X�� ���ÿ� �ִ� �����̴�.
		 * pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 * size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
		 * empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		 * top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine().trim());
		stack = new int[testCase];
		while (testCase != 0) {
			sb1.append(br.readLine());
		
			switch (sb1.toString()) {
			case "push" :
				//stack[i++] = Integer.parseInt(br.readLine().trim());
				i++;
				stack[i] = Integer.parseInt(br.readLine().trim());
				break;
			case "pop" :
				if(i == -1)
					sb.append(i).append("pop").append("\n");
				else
					sb.append(stack[i--]).append("pop").append("\n");
				break;
			case "size" :
				sb.append(i+1).append("size").append("\n");
				break;
			case "empty" :
				if(i == -1)
					sb.append(1).append("empty").append("\n");
				else
					sb.append(0).append("empty").append("\n");
				break;
			case "top" :
				if(i == -1)
					sb.append(i).append("top").append("\n");
				else
					sb.append(stack[i]).append("top").append("\n");
				break;
			default :
				break;
			}
			
			testCase--;
		}
		System.out.println(sb);
	}

	static void push(int x){
		i++;
		stack[i] = x;
	}
	
	static void pop(){
		if(i == -1)
			sb.append(i).append("\n");
		else
			sb.append(stack[i--]).append("\n");
		//sb.append((i == -1) ? i+"\n" : stack[i--]+"\n");
	}
	
	static void size(){
		sb.append(i+1).append("\n");
	}
	
	static void empty(){
		if(i == -1)
			sb.append(1).append("\n");
		else
			sb.append(0).append("\n");
	}
	
	static void top(){
		if(i == -1)
			sb.append(i).append("\n");
		else
			sb.append(stack[i]).append("\n");
	}
}


/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Str_BOJ10828 {

	static int stack[] = new int[10000];
	static int i = -1;
	
	public static void main(String[] args) throws Exception {
		
		 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * push X: ���� X�� ���ÿ� �ִ� �����̴�.
		 * pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 * size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
		 * empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		 * top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		String[] str = new String[testCase];
		for(int i = 0; i< testCase;i++)
		{
			str[i] = ;
		}
		
		while (testCase != 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(br.readLine());
		
			String[] a = sb.toString().split(" ");
			switch (a[0]) {
			case "push" :
				i++;
				stack[i] = Integer.parseInt(a[1]);
				break;
			case "pop" :
				System.out.println(pop());
				break;
			case "size" :
				System.out.println(size());
				break;
			case "empty" :
				System.out.println(empty());
				break;
			case "top" :
				System.out.println(top());
				break;
			default :
				break;
			}
			
			testCase--;
		}
	}

	static void push(int x){
	}
	
	static int pop(){
		return (i == -1 ? i : stack[i--]);
	}
	
	static int size(){
		return i+1;
	}
	
	static int empty(){
		return (i == -1 ? 1 : 0);
	}
	
	static int top(){
		return (i == -1 ? i : stack[i]);
	}
}
*/