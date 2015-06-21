package root;

public class TheStack {

	private Object[] arr;
	private int Max;
	private int top= -1;
	
	public TheStack(int stackSize){
		this.Max = stackSize;
		arr = new Object[Max];
	}
	
	public void push(Object pushStr){
		
		if (isFull())
		{
			System.out.println("Sorry can not push any more values\nSize is full!!");
			return;
		}
		System.out.println("PUSHING "+(top+1)+" "+ pushStr);
		top++;
		arr[top] = pushStr;
		
	}
	
	public Object pop(){
		System.out.print("\nPOP"+ (top+1) +"= ");
		if(isEmpty())
		{
			System.out.println("Empty Stack");
			return "-1";
		}
		Object str = arr[top] ;
		top--;
		System.out.print(str);
		return str;
		
	}
	
	public void displayStack(){
		if(isEmpty())
		{
			System.out.println("Stack is Empty!!");
			return;
		}
		for(int i =0 ;i<=top;i++){
			System.out.println("[[[[["+i+"]]]]]] = " + arr[i]);
		}
	}
	
	public Object peek(){
		Object str = arr[top];
		return str;
	}
	
	private boolean isEmpty(){
		if(top == -1)
			return true;
		return false;
	}
	private boolean isFull(){
		if(top == Max -1 )
			return true;
		return false;
	}
	
}
