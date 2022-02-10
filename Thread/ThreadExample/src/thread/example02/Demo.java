package thread.example02;

public class Demo {

	public static void main(String[] args){
		System.out.println("Main Thread is Starting ...");
		MyPrinter p=new MyPrinter();
		Sync01 s1=new Sync01("Thread 1",p);
		Sync02 s2=new Sync02("Thread 2",p);
		try {
			s1.t.join();
			s2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread ends.");
	}
}
