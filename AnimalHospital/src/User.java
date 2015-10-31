
public class User {
	private String userID;
	private String username;
	private String userPassword;
	private String nameOfUser;
	private Animal pets [];
	private static int userCounter;
	private int petsOwned;
	public final int MAX_PETS = 5;
	
	public User(){
		username = "";
		userPassword = "";
		nameOfUser = "";
		pets = new Animal[MAX_PETS];
		petsOwned = 0;
		setUserID();
		userCounter++;
	}
	public User(String username, String password, String nameOfUser){
		this.username = username;
		this.userPassword = password;
		this.nameOfUser = nameOfUser;
		pets = new Animal[MAX_PETS];
		petsOwned = 0;
		setUserID();
		userCounter++;
	}
	public User(String username, String password, String nameOfUser, Animal pets[], String userID){
		this.username = username;
		this.userPassword = password;
		this.nameOfUser = nameOfUser;
		this.userID = userID;
		for(int i = 0; i < pets.length;i++){
			if(pets[i] == null){
				break;
			}else{
				this.pets[petsOwned] = pets[i];
				petsOwned++;
			}
		}
		userCounter++;
	}
	//added this method
	private void setUserID(){
		char randomLetter = (char)(Math.random()*26+97);
		userID = userCounter + Character.toString(randomLetter);
	}
	public String getUserID(){
		return userID;
	}
	public String getUsername(){
		return username;
	}
	public String getUserPassword(){
		return userPassword;
	}
	public String getNameOfUser(){
		return nameOfUser;
	}
	public int getPetsOwned(){
		return petsOwned;
	}
	public Animal [] getPet(){
		Animal temp [] = new Animal[MAX_PETS];
		for(int i = 0; i < petsOwned;i++){
			temp[i] = pets[i];
		}
		return temp;
	}
	public Animal getPet(int idx) throws IndexOutOfBoundsException, NullPointerException{
		if(idx >= petsOwned) throw new IndexOutOfBoundsException ("Invalid index!");
		if(pets[idx] == null) throw new NullPointerException ("No pet exists at that location!");
		return pets[idx];
	}
	public static int getUsercounter(){
		return userCounter;
	}
	
	public boolean setUsername(String username){
		//length must be between 4 and 20
		if(username.length() < 4 || username.length() > 20){
			return false;
		}
		//username must contain at least one number
		for(int i = 0; i < username.length();i++){
			if(Character.isDigit(username.charAt(i))){
				this.username = username;
				return true;
			}
		}
		return false;
	}
	
	public boolean setPassword(String password){
		final int MIN_NUM = 2;
		//length must be between 4 and 20
		if(password.length() < 4 || password.length() > 20){
			return false;
		}
		int numCounter= 0;
		//password must contain at least one number
		for(int i = 0; i < password.length();i++){
			if(Character.isDigit(password.charAt(i))){
				numCounter++;
			}
		}
		if(numCounter >= MIN_NUM){
			this.userPassword = password;
			return true;
		}
		return false;
	}
	
	public boolean setNameOfUser(String name){
		if(name.isEmpty() || name == null) return false;
		this.nameOfUser = name;
		return true;
	}
	
	public boolean addPet(Animal pet){
		if(petsOwned >= MAX_PETS) return false;
		pets[petsOwned] = pet;
		petsOwned++;
		return true;
	}
}
