
public abstract class Animal {
	private double weight;
	private int age;
	private String ownerName;
	private String petName;
	private String health;
	
	public final String MIN_HEALTH = "Poor";
	public final String MAX_HEALTH = "Excellent";
	public final String MID_HEALTH = "Average";
	
	public Animal(double weight, int age, String ownerN, String petN, String health){
		this.weight = weight;
		this.age = age;
		this.ownerName = ownerN;
		this.petName = petN;
		this.health = health;
	}
	public double getWeight(){
		return weight;
	}
	public int getAge(){
		return age;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public String getPetName(){
		return petName;
	}
	public String getHealth(){
		return health;
	}
	//assuming weight will be in kilograms (unless you want to provide the user an option to enter in kg or lb)
	public boolean setWeight(double w){
		if(w <= 0) return false;
		this.weight = w;
		return true;
	}
	public boolean setAge(int age){
		if(age < 0)return false;
		this.age = age;
		return true;
	}
	public boolean setPetName(String name){
		if(name.isEmpty() || name == null) return false;
		this.petName = name;
		return true;
	}
	public boolean setOwnerName(String name){
		if(name.isEmpty() || name == null) return false;
		this.ownerName = name;
		return true;
	}	
	public boolean setHealth(String indicator){
		indicator = indicator.trim();
		indicator.replaceAll(" ", "");
		//1 is min health, 2 is mid health, 3 is max health.
		if(!indicator.equals("1") && !indicator.equals("2")  && !indicator.equals("3")) return false;
		int num = Integer.parseInt(indicator);
		switch(num){
			case(1) : health = MIN_HEALTH; break;
			case(2) : health = MID_HEALTH; break;
			case(3) : health = MAX_HEALTH; break;
			default : return false;
		}
		return true;
	}
	public String toString(){
		String output = "";
		output += "Name: " + petName + "\n" + "Age: " + age + "kg\n" + "Weight: " +
		weight + "\n" + "Health: " + health + "\n" + "Owner name: " + ownerName + "\n";
		return output;
	}
}
