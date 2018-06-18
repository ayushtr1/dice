package dice;
import java.util.Random;
import java.util.Scanner;
public class dice {
public static void main(String args[])
{
	Random r= new Random();
	Scanner sc= new Scanner(System.in);
	
	int ch = sc.nextInt();
	System.out.println("enter your choice");	
	switch(ch)	
	{
	case 1:
	String choice[]= {	"True","False"	};
	System.out.println(choice[r.nextInt(2)]);	
break;
	case 2:
		String choice1[]={"one","two","three","four"};
		System.out.println(choice1[r.nextInt(4)]);	
		break;
	case 3:
		String choice2[]={"one","two","three","four","five","six"};
		System.out.println(choice2[r.nextInt(6)]);	
		break;
	default:
		System.out.print("wrong entry");
		
}
}
}