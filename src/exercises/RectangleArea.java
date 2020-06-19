package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner lengthInput=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = lengthInput.nextInt();
        Scanner widthInput=new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        int width = widthInput.nextInt();
        lengthInput.close();
        widthInput.close();
        int area = length*width;
        System.out.println("Rectangle's area is: "+area);
    }
}
