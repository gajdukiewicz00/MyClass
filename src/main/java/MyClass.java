import java.util.Scanner;

class Object{
    class Circle{
        public Circle(int r){
            double sqr = 3.14*r*r;
            System.out.println("Square of circle: " + sqr);
        }
    }
    class Recktangle{
        public Recktangle(int a, int b){
            double sqr = a*b;
            System.out.println("Square of recktangle is: " + sqr);
        }
    }
    class Triangle{
        public Triangle(int a, int b, int c){
            double p = (a + b + c) / 2;
            double sqr = Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
            System.out.println("Square of triangle is: " + sqr);
        }
    }
}

public class MyClass{

    public static void main(String []args){
        System.out.print("Chose figure\n1 - Circle\n2 - Recktangle\n3 - Triangle\nYour chose: ");
        Scanner sc = new Scanner(System.in);
        int chose = sc.nextInt();
        switch(chose){
            case 1:
                System.out.println("You chosed circle!");
                System.out.print("Input radius: ");
                int r = sc.nextInt();
                Object.Circle circle_ex = new Object().new Circle(r);
                break;
            case 2:
                System.out.println("You chosed recktangle!");
                System.out.print("Input 1st side: ");
                int a = sc.nextInt();
                System.out.print("Input 2nd side: ");
                int b = sc.nextInt();
                Object.Recktangle recktangle_ex = new Object().new Recktangle(a,b);
                break;
            case 3:
                System.out.println("You chosed triangle!");
                System.out.print("Input 1st side: ");
                a = sc.nextInt();
                System.out.print("Input 2nd side: ");
                b = sc.nextInt();
                System.out.print("Input 2nd side: ");
                int c = sc.nextInt();
                Object.Triangle triangle_ex = new Object().new Triangle(a,b,c);
                break;
            default:
                System.out.println("Your chosed wrong figure!");
                break;
        }
    }
}
