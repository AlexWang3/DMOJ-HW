package TheMirror;
import java.util.*;
public class TheMirror {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int []a=new int[N];
		int []b=new int[N];
		for (int i=0;i<N;i++) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<N;i++) {
			count=0;
			for(int n=a[i];n<b[i];n++) {
				if(IsPrime(n)) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
	public static boolean IsPrime(int n) {
		int i=2;
		if(n==1)
			return false;
		while((n%i!=0)&&i*i<n) {
			i++;
		}
		if(i*i>n)
			return true;
		return false;
	}

}
