
public class Bird extends Animal{
	private String species;
	private double beakSize;
	//added this constructor as well
	public Bird(double weight, int age, String ownerN, String petN, String health){
		super(weight,age,ownerN,petN,health);
		beakSize = 0;
		species = "";
	}
	public Bird(double weight, int age, String ownerN, String petN, String health, double beakSize, String species){
		super(weight,age,ownerN,petN,health);
		this.beakSize = beakSize;
		this.species = species;
	}
	public String getSpecies(){
		return species;
	}
	public double getBeakSize(){
		return beakSize;
	}
	public boolean setSpecies(String spec){
		if(spec.isEmpty() || spec == null) return false;
		this.species=spec;
		return true;
	}
	public boolean setBeakSize(double beak){
		if(beak <=0)return false;
		this.beakSize=beak;
		return true;
	}
	public String toString(){
		String output = super.toString();
		output = "Type of pet: " + Bird.class.getName() + "\n" +
		"Species: " + species + "\n" + "Beak size: " + beakSize + "\n";
		return output;
	}
}
