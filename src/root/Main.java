package root;

import java.awt.DisplayMode;

public class Main {
	public static void main(String args[]){
		TheStack stck = new TheStack(6);
		
		System.out.println("Displaying Stack: \n");
		
		stck.displayStack();
		
		System.out.println("Trying to push values now:: \n ");
		
		stck.push("Hello");
		stck.push("world");
		stck.push("This");
		stck.push("is");
		stck.push("Manisha");
		stck.push("world");
		
		
		stck.push("This");
		stck.push("is");
		stck.push("Manisha");
		
		stck.displayStack();
		
		
		System.out.println("Trying to pop first");
		
		stck.pop();
		stck.pop();
		stck.pop();
		stck.pop();
		stck.pop();
		stck.pop();
		stck.pop();

		
		System.out.println("Displaying stack now ");
		stck.displayStack();
		stck.push("Rajan");
		stck.push("This");
		stck.push("is");
		stck.push("Manisha");
		System.out.println("Displaying stack now ");
		stck.displayStack();
	
	}
}
