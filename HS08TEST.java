import java.util.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	
	public static void main(String[] args)
	{
	Main w1 = new Main();
	Scanner input = new Scanner(System.in);
	double x = input.nextDouble();
    double y = input.nextDouble();
    double sum = y-x-0.5;
	if(x%5==0 && x+0.5 <= y)
	{
	   System.out.println(sum);
	}
	
	else
	{
	    System.out.println(y); 
	}
		
	}
}
