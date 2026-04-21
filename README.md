⭐ What this program does

👉 It takes base and height of a triangle
👉 Then calculates area

Formula used:
Area = (base × height) / 2
⭐ Your Code
import java.util.Scanner;

class Triangle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of triangle :");
        double base = sc.nextDouble();

        System.out.print("Enter the height of triangle :");
        double ht = sc.nextDouble();

        double a = base*ht/2;

        System.out.println("Area of triangle :"+a);
    }
}
⭐ Line-by-Line Explanation
🔹 Line 1
import java.util.Scanner;

👉 This allows us to take input from user

🔹 Line 3
class Triangle

👉 We create a class named Triangle

🔹 Line 5
public static void main(String [] args)

👉 This is the starting point of the program
Program always starts from main

🔹 Line 7
Scanner sc = new Scanner(System.in);

👉 We create an object sc to read input from keyboard

🔹 Line 9
System.out.print("Enter the base of triangle :");

👉 Prints message asking user to enter base

🔹 Line 10
double base = sc.nextDouble();

👉 Takes input and stores in variable base

🔹 Line 12
System.out.print("Enter the height of triangle :");

👉 Asks for height

🔹 Line 13
double ht = sc.nextDouble();

👉 Takes height input

🔹 Line 15
double a = base*ht/2;

👉 Calculates area using formula

🔹 Line 17
System.out.println("Area of triangle :"+a);

👉 Prints the result

⭐ Example Run
Input:
Enter the base of triangle : 10
Enter the height of triangle : 5
Calculation:
Area = 10 × 5 / 2 = 25
Output:
Area of triangle :25.0
⭐ Very Simple Summary

👉 Take base
👉 Take height
👉 Multiply them
👉 Divide by 2
👉 Print answer
