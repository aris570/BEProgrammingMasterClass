public class Square extends Shape2D{

    private Double area;
    private Double length;

    public Square(Double length){
        this.setConvex(true);
        this.length=length;
        setArea();
    }

    @Override
    public Double getArea(){
        return this.area;
    }

    @Override
    public void setArea() {
        this.area=length*length;
    }
}
