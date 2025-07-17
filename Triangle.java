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