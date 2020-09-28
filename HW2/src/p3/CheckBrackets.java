package p3;

import java.io.IOException;

import p1.Queues;
import p4.BookObjects;

public class CheckBrackets {

	public static void main(String[] args) {
		String str = "public class Demo {public static void main(String[] args) throws IOException {BookObjects.createBooks();}}";
		System.out.println(isBalanced(str));
	}

	public static boolean isBalanced(String javaProgram) {
		String str = javaProgram.replaceAll(" ", "");
		Queues que = new Queues();
		
		int braces = 0;
		int parenT = 0;
		int squreB = 0;
		
		for(int i = 0; i < str.length(); i++) {
			que.insert(str.charAt(i));
		}
	
		while(!que.isEmpty()) {
			char ch = que.remove();
			if(ch == '{') {
				braces++;
			}else if(ch == '}') {
				braces--;
			}else if(ch == '(') {
				parenT++;
			}else if(ch == ')') {
				parenT--;
			}else if(ch == '[') {
				squreB++;
			}else if(ch == ']') {
				squreB--;
			}
		}
		
		if(braces == 0 && parenT == 0 && squreB == 0) {
			return true;
		}else {
			return false;
		}
	}
}