class Sum{
    int num1, num2;
    Sum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void displaySum(){
        int sum = num1 + num2;
        System.out.println("Sum of 2 integers: " + sum);
    }
}

class Multiply{
    void displayMul(int num1, int num2){
        int mul = num1 * num2;
        System.out.println("Multiplication of 2 integers: " + mul);
    }
}

public class Calculator{
    public static void main(String []args){
        Sum s = new Sum(4, 6);
        s.displaySum();

        Multiply m = new Multiply();
        m.displayMul(5, 7); 
    }
}
