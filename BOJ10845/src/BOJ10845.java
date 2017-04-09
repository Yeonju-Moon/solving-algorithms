import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10845 {

	static int[] stack;
	static int front = -1, back = -1;
	public static void main(String[] args) throws Exception {
		/*
		 * ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ����� �� ���� �����̴�.
		 * push X: ���� X�� ť�� �ִ� �����̴�.
		 * pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 * size: ť�� ����ִ� ������ ������ ����Ѵ�.
		 * empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		 * front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		 * back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
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
			case "front" :
				System.out.println(front());
				break;
			case "back" :
				System.out.println(back());
				break;
			default :
				break;
			}
			
			testCase--;
		}
		
		for(int i = 0; i<stack.length; i++)
			System.out.println(stack[i]);
	}
	

	static void push(int x){
		
		if (front == -1 && back == -1)
		{
			front++;
			back++;
			stack[front] = x;
		}
		else
		{
			back++;
			stack[back] = x;
		}
	}
	
	static int pop(){
		return ((back == -1) || (front > back)) ? -1 : stack[front++];
	}
	
	static int size(){
		return ((back == -1 && front == -1) ? 0 : back - front + 1);
	}
	
	static int empty(){
		return ((front == -1 && back == -1) || (front > back)) ? 1 : 0;
	}

	static int front(){
		return ((front == -1) || (front > back)) ? -1 : stack[front];
	}
	
	static int back(){
		return ((back == -1) || (front > back)) ? -1 : stack[back];
	}

}
