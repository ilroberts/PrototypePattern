/**
 * Created by iwanroberts on 13/06/15.
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw method.");
    }
}
