package java10;

public class MainVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		var b = 20; //local variable type inference  //cannot make it instance variable
		var name = "kiet mca"; 
		var value = 10.34;
//		var c;  // var should be initialized value can be modified but cannpt be ;
		
		String name1 = new String("This is String");
		var name2 = new String("This is String with var"); //name1 and name2 both are equivalent
		int[] val = {23, 45, 67, 89};
		
		for(var v: val) {
			System.out.println(v);
		}
	}

}
