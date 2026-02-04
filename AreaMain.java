interface Area{
    double PI = 3.14;
    double getArea();
}

class Circle implements Area{
    double r;
    Circle(double r){
        this.r = r;
    }
    public double getArea(){
        double area = PI*r*r;
        return (PI*r*r);
    }
    void display(){
        System.out.println("Area of circle: " + getArea());
    }
}

public class AreaMain{
    public static void main(String[] args){
        Circle c1 = new Circle(12.5);
        c1.display();
        //System.out.println("Area of circle: "+ c1.getArea());

        Area c2 = new Circle(13.5);
        //c2.display();  //it voilates the rule of polymorphism
        System.out.println("Area of circle: " + c2.getArea());

        Area r1 = new Area(){
            public double getArea(){
                double l = 6, b = 8;
                return (l*b);
            }
        };
        System.out.println("Area of rectangle: " + r1.getArea());
    }
}
