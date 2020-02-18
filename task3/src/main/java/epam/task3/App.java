package epam.task3;
import java.util.Scanner;;
public class App 
{

    public static void main( String[] args )
    {
    	int c;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("enter on to start");
    	String condition=scanner.next();
    	do {
        int a = scanner.nextInt();
        String ch=scanner.next();
        switch(ch) {
        case "+":
        	int b=scanner.nextInt();
        	c=a+b;
        	System.out.println(c);
        	break;
        case "-":
        	int d=scanner.nextInt();
        	c=a-d;
        	System.out.println(c);
        	break;
        case "*":
        	int e=scanner.nextInt();
        	c=a*e;
        	System.out.println(c);
        	break;
        case "/":
        	int f=scanner.nextInt();
        	c=a/f;
        	System.out.println(c);
        	break;
        case"off":
        	condition ="off";
        	System.out.println("end");
        default:
        	System.out.print("invalid operation");
        }
        }while(condition!="0ff");
        scanner.close();
    }
}
