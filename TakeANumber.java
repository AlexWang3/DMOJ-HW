package TakeANumber;
import java.util.*;
public class TakeANumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Start=in.nextInt();
		int count=0;
		int late=0;
		String input;
		while (true) {
			input=in.next();
			if(input.equals("TAKE")) {
				count++;
				late++;
				Start++;
				if(Start==1000)
					Start=1;
			}
			else if(input.equals("SERVE")) 
				count--;
			else if(input.equals("CLOSE")) {
				System.out.println(late+" "+count+" "+Start);
				late=0;
				count=0;
			}	
			else if(input.equals("EOF")) 
				break;
		}

	}

}
