import java.util.HashMap;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Car> m1=new HashMap<Integer,Car>();
		m1.put(1, new Car(155.5,"skoda","blue"));
		m1.put(2, new Car(180.5,"benz","green"));
		m1.put(3, new Car(170.5,"audi","blue"));
		
		m1.put(4, new Car(520.5,"bmw","white"));
		System.out.println(m1);
		for(Integer v1:m1.keySet()) {
			System.out.println(v1);
		}
	}

}
