import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10828 {

	//static int stack[] = new int[10000];
	static int[] stack;
	static int i = -1;
	
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
		int testCase = Integer.parseInt(br.readLine().trim());
		stack = new int[testCase];
		while (testCase != 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(br.readLine());
		
			String[] a = sb.toString().split(" ");
			switch (a[0]) {
			case "push" :
				push(Integer.parseInt(a[1]));
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
		i++;
		stack[i] = x;
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
