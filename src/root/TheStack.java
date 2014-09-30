package root;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	private int currPosi= 0;
	
	public TheStack(int stackSize){
		this.stackSize = stackSize;
		stackArray = new String[stackSize];
//		
//		Arrays.fill(stackArray,"-1");
	}
	
	public void push(String pushStr){
		
		if (currPosi>= stackSize)
		{
			System.out.println("Sorry can not push any more values\nSize is full!!");
			return;
		}
		System.out.println("PUSHING "+currPosi+" "+ pushStr);
		stackArray[currPosi++	] = pushStr;
	}
	
	public void pop(){
		System.out.print("\nPOP"+(currPosi-1)+"= ");
		if(currPosi== 0)
		{
			System.out.println("Empty Stack");
			return;
		}
		System.out.print(stackArray[--currPosi] );
	}
	
	public void displayStack(){
		if(currPosi==-1)
		{
			System.out.println("Stack is Empty!!");
			return;
		}
		for(int i =0 ;i<currPosi;i++){
			System.out.println("[[[[["+i+"]]]]]] = " + stackArray[i]);
		}
	}
	
}
