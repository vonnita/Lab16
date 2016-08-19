package Lab16;

import java.util.Scanner;
import java.util.Stack;

//user input for 1st equation 52*3+
//2nd equation 63 -1+
public class NumStack {

	public static void main(String[] args) {
		// iterate

		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = Scan1.nextLine();
		Stack<Integer> st = new Stack<Integer>(); // providing stack of
														// integers

		for (int i = 0; i < userInput.length(); i++) {
			char inputSeq = userInput.charAt(i);

			switch (inputSeq) {
			case '+':
				if (st.size() >= 2) {
					int x = st.pop();
					int y = st.pop();
					int result = x + y;
					st.push(result);
					System.out.println(st.pop());
				}					
				break;

			case '-': 
				if (st.size() >= 2) {
				int x = st.pop();
				int y = st.pop();
				int result = x - y;
				st.push(result);
				System.out.println(st.pop());
				}
				break;
			case '/': 
					if (st.size() >= 2) {
					int x = st.pop();
					int y = st.pop();
					int result = x/y;
					st.push(result);
					System.out.println(st.pop());
					}
				break;

			case '*':
				if (st.size() >= 2) {
					int x = st.pop();
					int y = st.pop();
					int result = x * y;
					st.push(result);
					System.out.println(st.pop());
				}
				break;

			default: // conversion
				int conversion = Character.getNumericValue(inputSeq);
				st.push(conversion);
				break;
			}

		}

		Scan1.close();
	}

}
