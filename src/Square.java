/**
 * Created by iwanroberts on 13/06/15.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";

    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
