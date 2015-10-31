
public class Cat extends Animal {
	private boolean doBite;
	private boolean doScratch;
	
	//added this constructor as well
	public Cat(double weight, int age, String ownerN, String petN, String health){
		super(weight,age,ownerN,petN,health);
		doBite = false;
		doScratch = false;
	}
	public Cat(double weight, int age, String ownerN, String petN, String health, boolean bite, boolean scratch){
		super(weight,age,ownerN,petN,health);
		this.doBite = bite;
		this.doScratch = scratch;
	}
	public boolean getDoBite(){
		return doBite;
	}
	public boolean getDoScratch(){
		return doScratch;
	}
	//0 if it does not bite, 1 if it bites
	public boolean setDoBite(int bite){
		if(bite != 0 && bite != 1) return false;
		if(bite == 0){
			this.doBite = false;
		}else{
			this.doBite = true;
		}
		return true;
	}
	//0 if it does not scratch, 1 if it scratches
	public boolean setDoScratch(int scratch){
		if(scratch != 0 && scratch != 1) return false;
		if(scratch == 0){
			this.doScratch = false;
		}else{
			this.doScratch = true;
		}
		return true;
	}
	public String toString(){
		String output = super.toString();
		output = "Type of pet: " + Cat.class.getName() + "\n" +
		"Bites?: " + doBite + "\n" + "Scratches?: " + doScratch + "\n";
		return output;
	}
}
