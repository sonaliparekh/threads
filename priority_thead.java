package threads_collections;

public class priority_thead implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++)
		{
			System.out.println("Thread is executing" +  Thread.currentThread().getName());
		}
	}

	public static void main(String args[])
	{
		priority_thead pt = new priority_thead();
		Thread t1 = new Thread(pt);
		Thread t2 = new Thread(pt);
		Thread t3=  new Thread(pt);
		t1.setName("AA");
		t2.setName("BB");
		t3.setName("CC");
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
	}

	
	
}
