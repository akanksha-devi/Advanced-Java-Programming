abstract class Car{
    abstract void display();
     void show(){
        System.out.println("Abstract class.");
     }
}
class BMW extends Car{
    void display(){
         System.out.println("BMW iX3");
   }

    public static void main(String []args){
        BMW bmw = new BMW();  //downcasting polymorphism
        bmw.display();
        bmw.show();

        Car car = new BMW();  //upcasting polymorphism
        car.display();
        car.show();
    }    
}