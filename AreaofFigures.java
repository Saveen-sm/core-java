package inputdata;
import java.util.Scanner;
public class AreaofFigures {

	public static void main(String[] args) {
		float area,side,base,height,length,breadth,radius;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of Rectangler");
		System.out.println("Enter length and breadth");
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		area=length*breadth;
		System.out.println("Area of rectangle with length "+length+"and breadth "+breadth+" is= "+area+"Sq units");
		System.out.println("Area of circle");
		System.out.println("Enter Radius");
		radius=sc.nextFloat();
		area=3.14f*radius*radius;
		System.out.println("Area of Circle with radius "+radius+" is = "+area+"Sq units");
		System.out.println("Area of Square");
		System.out.println("Enter side");
		side=sc.nextFloat();
		area=side*side;
		System.out.println("Area Square with side "+ side+" is = "+area+"Sq units");
		System.out.println("Area of Triangle");
		System.out.println("Enter base and height");
		base=sc.nextFloat();
		height=sc.nextFloat();
		area=0.5f*base*height;
		System.out.println("Area of Triangle with base "+base+" and height "+height+" is = "+area+"Sq units");
		sc.close();

	}

}
