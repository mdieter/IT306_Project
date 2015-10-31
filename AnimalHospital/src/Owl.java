
public class Owl extends Animal{
	private boolean nocturnal;
	private double eyeDiameter;
	//added this constructor as well
	public Owl(double weight, int age, String ownerN, String petN, String health){
		super(weight,age,ownerN,petN,health);
		nocturnal = false;
		eyeDiameter = 0;
	}
	public Owl(double weight, int age, String ownerN, String petN, String health,boolean noctur, double dia ){
		super(weight,age,ownerN,petN,health);
		this.nocturnal=noctur;
		this.eyeDiameter = dia;
	}
	
	public boolean getNocturnal(){
		return nocturnal;
	}
	public double getEyeDiamter(){
		return eyeDiameter;
	}
	
	//0 if it is not nocturnal, 1 if it is  nocturnal
	public boolean setNocturnal(int noctu){
		if(noctu != 0 && noctu != 1) return false;
		if(noctu == 0){
			this.nocturnal = false;
		}else{
			this.nocturnal = true;
		}
		return true;
	}
	public boolean setEyeDiameter(double dia){
		if(dia <= 0) return false;
		this.eyeDiameter = dia;
		return true;
	}
	public String toString(){
		String output = super.toString();
		output = "Type of pet: " + Owl.class.getName() + "\n" +
		"Nocturnal?: " + nocturnal + "\n" + "Eye Diameter: " + eyeDiameter + "\n";
		return output;
	}
}
