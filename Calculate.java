import java.util.Scanner;
class Calculate
{
	public void circle(int radius)
	{
		double area= 3.14*radius*radius;
		System.out.println("area of the given circle is:" +area);
	}
	public void sphere(int radius)
	{
		double volume=(4*3.14*radius*radius*radius)/3;
		System.out.println("volume of the sphere is:" +volume);
	}
	public static void main(String args[])
	{
		Calculate obj=new Calculate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int circleRadius=sc.nextInt();
		System.out.println("Enter the radius of the sphere");
		int sphereRadius=sc.nextInt();
		obj.circle(circleRadius);
		obj.sphere(sphereRadius);
	}
}
