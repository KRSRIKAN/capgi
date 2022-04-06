
class  MyThread implements Runnable{
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class MyThreadInf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread ( new MyThread());
Thread t2=new Thread ( new MyThread());
t1.setName("a");
t2.setName("b");
t2.setPriority(Thread.MAX_PRIORITY);

t1.start();
t2.start();
	}

}
