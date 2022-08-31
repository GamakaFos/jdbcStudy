public class TDDCircleArea {

    private double radius;
    private double diameter;
    private double perimeter;

    private final double piNumber = Math.PI;


    public TDDCircleArea(){}


    public double measureRadius(){
        return piNumber * (radius * radius);
    }
    public double measureDiameter(){
        return (piNumber * (diameter * diameter)) / 4;
    }
    public double measurePerimeter(){
        return (perimeter * perimeter) / (piNumber * 4);
    }




    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
