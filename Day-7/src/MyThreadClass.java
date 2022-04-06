
class MyThreadC extends Thread
{

public void run() {
// TODO Auto-generated method stub

for(int i=0;i<18;i++)
{
System.out.println(Thread.currentThread().getName()+" "+i);
}
}
}

public class MyThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadC t1=new MyThreadC();
		MyThreadC t2=new MyThreadC();
		t1.setName("A");
		t2.setName("B");
	//	t2.setPriority(10); it print 10 members
		t1.start();
		t2.start();

	}

}
