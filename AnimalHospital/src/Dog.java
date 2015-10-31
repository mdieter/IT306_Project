
public class Dog extends Animal {
	private String breed;
	private String bodyDesign;
	
	//added this constructor as well
	public Dog(double weight, int age, String ownerN, String petN, String health){
		super(weight,age,ownerN,petN,health);
		breed = "";
		bodyDesign = "";
	}
	public Dog(double weight, int age, String ownerN, String petN, String health, String design, String breed){
		super(weight,age,ownerN,petN,health);
		this.breed = breed;
		this.bodyDesign = design;
	}
	
	public String getBreed(){
		return breed;
	}
	public String getBodyDesign(){
		return bodyDesign;
	}
	public boolean setBreed(String breed){
		if(breed.isEmpty() || breed == null) return false;
		this.breed= breed;
		return true;
	}
	public boolean setBodyDesign(String design){
		if(design.isEmpty() || design == null) return false;
		this.bodyDesign = design;
		return true;
	}
	public String toString(){
		String output = super.toString();
		output = "Type of pet: " + Dog.class.getName() + "\n" +
		"Breed: " + breed + "\n" + "Body design: " + bodyDesign + "\n";
		return output;
	}
}
