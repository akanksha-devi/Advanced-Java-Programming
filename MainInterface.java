package java8;
interface Calc{
    void calculate(int n1, int n2);
    default void calculate(int n1, int n2, int n3){ //overload in interface{modern java}
        int s = n1 + n2 + n3;
        // System.out.println("Sum in interface: " + s);
        getPrivateInfo("Sum in interface: " + s); //interface private function calling
    }

    static String getInfo(){
        return "This is static getInfo method inside Calc.";
    }

    private void getPrivateInfo(String msg){
        System.out.println(msg);
    }
}

class Calculator implements Calc{
    @Override
    public void calculate(int n1, int n2){
        int add = n1 + n2;
        System.out.println("Sum: " + add);
    }

    @Override
    public void calculate(int n1,  int n2, int n3){ //override in modern java.
        int s = n1 + n2 + n3;
        System.out.println("Sum in subclass: " + s);
    }
}
public class MainInterface{
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.calculate(24, 15);
        c.calculate(18, 38, 19);
        System.out.println(Calc.getInfo()); //this is not accessible using subclass object, it is accessible using class name.
    }
}
