
public class Cube implements Shape{

    private Double area;
    private Double length;
    private int sides=6;

    public Cube(Double length){
        this.length=length;
        setArea();
    }

    @Override
    public Double getArea(){
        return this.area;
    }

    @Override
    public void setArea() {
        this.area=sides*(length*length);
    }
}
