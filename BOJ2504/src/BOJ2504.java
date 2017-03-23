import java.util.Scanner;
import java.util.Stack;

public class BOJ2504 {

	public static void main(String[] args) {
		/*
		 * ���ڿ��� 30����
		 * ���� ��ȣ��, p���ÿ� �Űܳ��� ���� ���� Ȯ��
		 * 
		 * ���� ��ȣ��, p���ÿ� ����� ���� ��ȣ�� �� -> ������ ���� �ƴϸ� 0
		 */
		
		Scanner scan = new Scanner(System.in);
		String tf = scan.nextLine();

		Stack<Character> s = new Stack<Character>();
		Stack<Character> p = new Stack<Character>();
		int score = 0, total = 0;
		
		for(int i=0; i < tf.length();i++)
			s.push(tf.charAt(i));
			
		while(!s.empty())
		{
			switch (s.peek())
			{ //���� ��ȣ��
			case ')':
			case ']':
				p.push(s.pop());
				//System.out.println(score);
				break;
			// 	���� ��ȣ��
			case '(':
				if(!p.empty() && p.pop() == ')')
				{
					s.pop();
					score = 2;
				}
				else
				{
					total = 0;
					break;
				}
				System.out.println(score);
				break;
			case '[':
				if(!p.empty() && p.pop() == ']')
				{
					s.pop();
					score = 3;
				}
				else
				{
					total = 0;
					break;
				}
				System.out.println(score);
				break;
			}
		}
		
		/*while(!s.empty())
		{
			//System.out.print(s.pop());
			
			if(s.peek() == ']' || s.peek() == ')') // ���� ��ȣ��
				p.push(s.pop());
			else if(s.peek() == '[')
			{
				if(p.peek() == ']')
				{
					p.pop();
					score += 3;
				}
				else score = 0;
			}
			else if(s.peek() == '(') // ���� ��ȣ��
			{
				if(p.peek() == ')')
				{
					p.pop();
					score += 2;
				}
				else score = 0;
			}
				//System.out.print(s.pop());
*/			
			/*else // ���� ��ȣ��
			{
				if(p.peek() == ']' && s.peek() == '[')
					score += 3;
				else if(p.peek() == ')' && s.peek() == '(')
					score += 2;
				else
					score = 0;
			}*/
			
		

	}

}
