
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int N= sc.nextInt(); //tuka ni cuva za vrednosta na brojt 
	int M=sc.nextInt(); //znaci tuka ni trebaat dve promenlivi 
	
	if(M==0) {
		if(N==1) {
			System.out.println(0);
		}else {
			System.out.println("Ne postoi");
		}
		return;
	}
	
	if(M>9 *N || M<1){
			System.out.println("Ne postoi");
			return;
		}
	StringBuilder sb= new StringBuilder();
	int rem=M;
	
	for(int i=0;i<N;i++) {
		int start =(i==0)? 1:0;
		boolean placed=false;
		
		for(int d= start;d<=9;d++) {
			int remAfter = rem-d;
			int left = N-i-1;
			
			if(remAfter < 0) break;
			if(remAfter<=9 * left) {
				sb.append(d);
				rem= remAfter;
				placed=true;
				break;
			}
		}
		if(!placed) {
			System.out.println("Ne postoi");
			return;
		}
	}
	if(rem!=0) {
		System.out.println("Ne postoi");
	}else {
		System.out.println(sb.toString());
	}
}
}
