import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	int n = input.nextInt();
    	int[] numbers = new int[n];
    	
    	int sum = 0;
    	
    	
    	//reading the array and calculating the sum
    	for(int i=0; i<n; i++) {
    		numbers[i] = input.nextInt();
    		sum+= numbers[i];
    	}
    	
    	//calculating the average
    	double average = (double) sum / n;
    	
    	//Printing the array before transformation
    	System.out.print("{");
    	for(int i=0; i<n-1; i++) {
    		System.out.print(numbers[i]+",");
    	}
    	System.out.print(numbers[n-1]);
    	System.out.print("} ");
    	System.out.println();
    	
    	//Removing elements smaller than the average
    	int i = 0;
    	
    	
    	while(i < n) {
    		if(numbers[i] < average) {
    			for(int j = i; j < n-1; j++) {
    				numbers[j] = numbers[j+1];
    			}
    			n--;
    		}else {
    			i++;
    	 }	
	   }
    	//Priniting the array after the transformation
    	
    	System.out.print("{");
    	for(int k =0 ; k < n-1; k++) {
    		System.out.print(numbers[k]+ ",");
    	}
    	System.out.print(numbers[n-1]);
    	System.out.print("} ");
    	input.close();
    }
}
