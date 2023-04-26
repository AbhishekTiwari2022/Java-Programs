
/*Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5 */

public class Task8 {
    private static final double Width=5.5;
    private static final double Height=8.5;
    public static void main(String []s)
    {
        double area=Width*Height;
        double perimeter=2*(Height+Width);
        System.out.println("Area of ractangle is : "+area);
        System.out.println("Primeter of ractangle is : "+perimeter);
    }
}
