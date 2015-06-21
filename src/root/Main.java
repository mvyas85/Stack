package root;

import java.awt.DisplayMode;

public class Main {
	public static void main(String args[]){
		TheStack stack = new TheStack(6);
		
		System.out.println("Displaying Stack: \n");
		
		stack.displayStack();
		
		System.out.println("Trying to push values now:: \n ");
		
		stack.push("Hello");
		stack.push("world");
		stack.push("This");
		stack.push("is");
		stack.push("Manisha");
		
		System.out.println("Peeking top item in the stack:"+stack.peek());
		stack.push("world");
		
		
		stack.push("This");
		stack.push("is");
		stack.push("Manisha");
		
		stack.displayStack();
		
		
		System.out.println("Trying to pop now");
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		
		System.out.println("Displaying stack now ");
		stack.displayStack();
		stack.push("Rajan");
		stack.push("This");
		stack.push("is");
		stack.push("Manisha");
		System.out.println("Displaying stack now ");
		stack.displayStack();
	
	}
}
