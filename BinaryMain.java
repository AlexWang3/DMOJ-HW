package Binary;
import java.util.*;
public class BinaryMain {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Stack <Integer>s=new Stack();
		int N=in.nextInt();
		int []nums=new int[N];
		for (int i=0;i<N;i++) {
			nums[i]=in.nextInt();
		}
		for(int m=0;m<N;m++) {
			int div=nums[m];		
			while (div>1) {
				s.push(div%2);
				div=div/2;			
			}
			s.push(1);
			for(int t=1;t<=8;t++) {
				if(s.size()<=4*t&&s.size()>4*(t-1)) {
					while(s.size()<4*t) {
						s.push(0);
					}
					for(int w=0;w<t;w++) {
						for(int i=0;i<4;i++) {
							System.out.print(s.pop());
						}
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
