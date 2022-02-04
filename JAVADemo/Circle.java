
public class Circle{
    private int radius;
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("The circle is:" + radius);
    }
}