
import java.util.*;


class operation
{

	interface Interface1
	{
		int op(int x, int y);
	}
	
	public int operate(int x, int y, Interface1 inf)
	{
		return inf.op(x,y);
	}
}

public class CalculatorQuestion extends operation {
	
	public static void main(String []args)
	{
		
		operation obj=new operation(); 
		Interface1 addition=(int x,int y) -> x + y;
		
		Interface1 product = (int x, int y) -> x*y;
		
		Interface1 difference = (int x, int y) -> Math.abs(x-y);
		
		Interface1 safeDivision =(int x, int y) -> x/y;
		
		System.out.println(obj.operate(5, 4,addition));
		System.out.println(obj.operate(5, 4,product));
		System.out.println(obj.operate(5, 4,difference));
		System.out.println(obj.operate(5, 4,safeDivision));
		
		
	}

}



