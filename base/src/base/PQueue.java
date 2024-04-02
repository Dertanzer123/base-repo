package base;

public class PQueue {

	private QElement[] elements;
	private int rear;
	private int front;
	private QElement[] telements;
	private int trear;
	private int tfront;

	public PQueue(int capacity) {
		elements = new QElement[capacity];
		rear = 0;
		front = 0;
		telements = new QElement[capacity];
		trear = 0;
		tfront = 0;

	}

	public boolean Qadd(QElement input) {
		
		if(isfull()) 
		{
			return false;
		}
		while(!isempty()&&input.getPriority1()<=Peek().getPriority1()&&input.getPriority2()<=Peek().getPriority2()) 
		{
		tQadd(Qtake());	
		}
		tQadd(input);
		while(!isempty()) 
		{
			tQadd(Qtake());		
		}
		while(!tisempty()) 
		{
			Qadd(tQtake());		
		}
		return true;
		
	}
	private void sQadd(QElement input) 
	{
		elements[front % elements.length] = input;
		front++;
	}
	private void tQadd(QElement input) 
	{
		telements[tfront % telements.length] = input;
		tfront++;
	}
	private QElement tQtake() {
		QElement output = telements[trear% telements.length];
		telements[trear % telements.length] = null;
		trear++;
		return output;

	}
	private boolean tisempty() {
		return telements[trear % telements.length] == null;
	}

	private boolean tisfull() {
		return telements[tfront % telements.length] != null;
	}

	public QElement Qtake() {
		QElement output = elements[rear% elements.length];
		elements[rear % elements.length] = null;
		rear++;
		return output;

	}

	public QElement Peek() {
		QElement output = elements[rear% elements.length];
		return output;

	}

	public int size() {
		if (elements[rear % elements.length] == null) {
			return 0;
		} else if (elements[front % elements.length] != null) {
			return elements.length;
		} else {
			return (elements.length + (front % elements.length - rear % elements.length)) % elements.length;
		}
	}

	public boolean isempty() {
		return elements[rear % elements.length] == null;
	}

	public boolean isfull() {
		return elements[front % elements.length] != null;
	}

}
