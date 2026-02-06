class Animal {
	String name;
	String sound;
	Animal(){
		this("Cat1" , "Meow");  //null value
	}
	Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
//	String getInfo(int a) {
//		return "";	
//	}
	
//	void getInfo(String a) {
//		System.out.println("Name: " + name);
//		System.out.println("Sound: " + sound);
//	}
	
	void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
	}
	
	void getInfo(String name, String sound, int legs) {
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
		System.out.println("Legs:  " + legs);
	}
}

class Cat extends Animal{
	Cat(String name, String sound){
		super(name, sound);
	}
	
	void getInfo(String a) {
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
	}
}

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal an1 = new Animal("Horse", "Hngg");
//		an1.getInfo();
//		an1.getInfo("Cat", "Meow", 4);
		
		Cat c1 = new Cat("Cat2", "Meow");
		c1.getInfo();
	}

}