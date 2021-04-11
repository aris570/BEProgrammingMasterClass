public class Sphere implements Shape{

    private Double area;
    private Double radius;
    public static Double PI=3.14;

    public Sphere(Double radius){
        this.radius=radius;
        setArea();
    }

    @Override
    public Double getArea(){
        return this.area;
    }

    @Override
    public void setArea() {
        this.area=4*PI*(radius*radius);
    }
}
