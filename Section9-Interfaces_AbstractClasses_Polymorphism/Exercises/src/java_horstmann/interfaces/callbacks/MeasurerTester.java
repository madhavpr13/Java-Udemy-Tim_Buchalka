package java_horstmann.interfaces.callbacks;
import java.awt.Rectangle;

public class MeasurerTester {

    public static void main(String[] args) {
        Measurer areaMeasurer = new AreaMeasurer();

        Rectangle[] rects = new Rectangle[]
                {
                        new Rectangle(5,10,20,30),
                        new Rectangle(10,20,30,40),
                        new Rectangle(20,30,5,15)
            };

        double averageArea = Data.average(rects, areaMeasurer);
        System.out.println("Average area of the rectangles is " + averageArea);

        Measurer lengthMeasurer = new LengthMeasurer();

        String[] strings = {"Hello", "World", "Scala"};
        double averageLength = Data.average(strings, lengthMeasurer);
        System.out.println("Average length of the strings is " + averageLength);

        Rectangle r1 = new Rectangle(5,10,20,30);
        Rectangle r2 = new Rectangle(10,15,20,28);
        Rectangle max = (Rectangle) Data.maximum(r1, r2, areaMeasurer);
        System.out.println("The maximum rectangle has width " + max.getWidth() + ", and height " + max.getHeight());

    }


}
