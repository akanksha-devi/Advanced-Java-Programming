class Animal {
	String name;
	String sound;
	Animal(){
		this("" , "");  //null value
	}
	Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	String getInfo(int a) {
		return "";	
	}
	
	void getInfo() {    //overloading
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
	}
	
	void getInfo(String name, String sound, int legs) {    //overloading
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
		System.out.println("Legs:  " + legs);
	}
}

class Cat extends Animal{
	
	void getInfo(String a) {   //override
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
	}
}

public class PolyMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an1 = new Animal("Horse", "Hngg");
		an1.getInfo();
		an1.getInfo("Cat", "Meow", 4);
	}

}