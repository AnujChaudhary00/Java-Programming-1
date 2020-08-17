import java.util.*;
public class twoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle call=new Rectangle();
		RectangleArea call2=new RectangleArea();
		call2.read_input();
		call.display();
		call2.display();
		
	}

}

class Rectangle
{
	public int width, height;
	public void display()
	{
		System.out.println(width+" "+height);
	}
	
	public void setter(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
}

class RectangleArea extends Rectangle
{
	public void read_input()
	{
		Scanner sc= new Scanner(System.in);
		width=sc.nextInt();
		height=sc.nextInt();
	}
	
	setter(width,height);
	
	public void display()
	{
		System.out.println(width*height);
	}
}