import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;
        System.out.println("Your Height in cm is " + height + " while in feet is " + (int)(height / 30.48) + " and inches is " + (height / 2.54));
        System.out.println("The area of the triangle is " + areaCm + " square centimeters and " + areaInches + " square inches");
        input.close();
    }
}