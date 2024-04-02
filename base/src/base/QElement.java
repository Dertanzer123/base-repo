package base;

public class QElement {
	private Object Data;
	private int priority1;
	private int priority2;
	
	public QElement(Object Data,int priority1,int priority2) 
	{
		this.Data=Data;
		this.priority1=priority1;
		this.priority2=priority2;
					
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	public int getPriority1() {
		return priority1;
	}
	public void setPriority1(int priority1) {
		this.priority1 = priority1;
	}
	public int getPriority2() {
		return priority2;
	}
	public void setPriority2(int priority2) {
		this.priority2 = priority2;
	}
	
	
	
}
