public class main {

    public static void main(String[] args) {

        Circle cir = new Circle(10.0);
        Square sq = new Square(10.0);
        Sphere sphere = new Sphere(10.0);
        Cube cube = new Cube(10.0);

        System.out.println("Circle area is: "+cir.getArea()+ " & Convex shape is: "+cir.getConvex());
        System.out.println("Square area is: "+sq.getArea()+ " & Convex shape is: "+sq.getConvex());
        System.out.println("Sphere area is: "+sphere.getArea());
        System.out.println("Cube area is: "+cube.getArea());

    }
}
