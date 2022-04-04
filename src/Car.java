
public class Car {

	private String model;
	private int age;
	private String make;
	
	public Car() 
	{
		
	}
	
	public Car(String model, int age) 
	{
		this.model = model;
		this.age = age;
	}
	
	public Car(String model, int age, String make) 
	{
		this.model = model;
		this.age = age;
		this.make = make;
	}
	
	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMake() 
	{
		return make;
	}
	
	public void setMake(String make) 
	{
		this.make = "Fusion";
		System.out.println(make);
	}
	
	public boolean isNew() 
	{
		if(this.age == 22) {
			return true;
		} else {
			return false;
		}
	}
	
	public String inStock() 
	{
		return "Currently, we have a" + this.make + this.model + this.age + "in stock";
	}
	
	public static void main(String[] args) {
		Car car = new Car("Fusion", 19, "Ford");
	}
}
