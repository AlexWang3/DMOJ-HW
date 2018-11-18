package LuhnAlgorithm;
import java.util.*;
public class Mainn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String [][]a=new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=in.next();
			}
		}
		int sum=0;
		String store;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				for(int k=a[i][j].length()-1;k>=0;k-=2) {
					store=Integer.parseInt(a[i][j].charAt(k)+"")*2+"";
					if(store.length()==1)
						sum+=Integer.parseInt(store);
					else
						sum+=Integer.parseInt(store.charAt(0)+"")+Integer.parseInt(store.charAt(1)+"");
				}
				for(int k=a[i][j].length()-2;k>=0;k-=2) {
					sum+=Integer.parseInt(a[i][j].charAt(k)+"");
				}
				if(sum%10==0) 
					System.out.print(0);
				else
					System.out.print(10-sum%10);
				sum=0;
			}
			System.out.println();
		}

	}

}
