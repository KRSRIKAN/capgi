
public class Car {
	Double ts;
	String brand;
	String colour;
	public Car(Double ts, String brand, String colour) {
		super();
		this.ts = ts;
		this.brand = brand;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [ts=" + ts + ", brand=" + brand + ", colour=" + colour + "]";
	}
	
	

}
