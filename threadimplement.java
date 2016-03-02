package threads_collections;

public class threadimplement extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10000;i++)
		{
			System.out.println(i);
		}
	}

	
}
