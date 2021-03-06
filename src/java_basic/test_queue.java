package java_basic;

class queue{
	int front, rear, size;
	int capacity;
	int[] arr;
	queue(int capacity){
		this.capacity = capacity;
		front=size=0;
		rear = capacity-1;
		arr = new int[capacity];
	}
	void add(int item) {
		if(isFull())
			throw new IndexOutOfBoundsException("Queue is Full");
		rear = (rear+1)%capacity;
		arr[rear] = item;
		size++;
		System.out.println(item+" added");
	}
	int remove() {
		if(isEmpty())
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = arr[front];
		front = (front+1)%capacity;
		return temp;
	}
	int peek() {
		return arr[front];
	}
	boolean isFull() {
		return size==capacity;
	}
	boolean isEmpty() {
		return size==0;
	}
}




/*class queue{
	int[] arr;
	int front, rear, size;
	int capacity;
	public queue(int capacity) {
		this.capacity=capacity;
		front=size=0;
		rear = capacity-1;
		arr = new int[capacity];
	}
	public boolean isFull() {
		return size==capacity;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void add(int item) {
		if(isFull())
			throw new IndexOutOfBoundsException("Queue is Full");
		rear = (rear+1)%capacity;
		arr[rear] = item;
		size++;
		System.out.println("Enquequed:"+item);
	}
	public int remove() {
		if(isEmpty())
			throw new IndexOutOfBoundsException("Queue is Empty");
		int item = arr[front];
		front=(front+1)%capacity;
		size--;
		return item;
	}
	public int peek() {
		if(isEmpty())
			throw new IndexOutOfBoundsException("Queue is Empty");
		return arr[front];
	}
	public int rear() {
		if(isEmpty())
			throw new IndexOutOfBoundsException("Queue is Empty");
		return arr[rear];
	}
}*/

public class test_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue queue = new queue(5);
		
		queue.add(10);
		queue.add(15);
		queue.add(20);
		System.out.println(queue.remove()+" removed");
		System.out.println(queue.remove()+" removed");
		System.out.println(queue.remove()+" removed");
		
		/*try {
			System.out.println(queue.peek());
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println(queue.isEmpty());*/
	}

}
