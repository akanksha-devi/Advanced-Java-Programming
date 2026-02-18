package funint;

class VoterList{
	void checkVoterName(int ageValue) {
		if(ageValue > 18) {
			System.out.println("You can vote!");
		} else {
			System.out.println("You can not vote");
		}
	}
}

@FunctionalInterface
interface AgeValid{
	void ageVal(int age);
}

public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeValid a = age -> {
			if(age > 18) {
				System.out.println("You can vote!");
			} else {
				System.out.println("You can not vote");
			}
		};
		a.ageVal(28);
		
		VoterList v1 = new VoterList();  //using another class function 
		AgeValid a1 = v1::checkVoterName;  //method refrencing
		a1.ageVal(13);
	}	
}