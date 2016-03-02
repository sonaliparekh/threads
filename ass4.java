package threads_collections;

public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadimplement t = new threadimplement();
		t.start();
		for(int i = 0;i<5000;i++)
		{
			if(t.isAlive())
			{
				System.out.println("Thread is running ");
			}
			else
			{
				System.out.println("Thread is dead ");
				break;
			}
		}
	}


}
