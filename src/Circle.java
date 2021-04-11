public class Circle extends Shape2D {

    private Double area;
    private Double radius;
    public static Double PI=3.14;

    public Circle(Double radius){
        this.setConvex(true);
        this.radius=radius;
        setArea();
    }

    @Override
    public Double getArea(){
        return this.area;
    }

    @Override
    public void setArea() {
        this.area=PI*(radius*radius);
    }
}
