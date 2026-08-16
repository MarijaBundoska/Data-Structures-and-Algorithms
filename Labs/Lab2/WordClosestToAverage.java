//For a given array with N words, find the word with length closest to the average length of the words in the array. 
//If there are two words with lengths that are on the same distance to the average length, return the longer word. 
//Additionally, if they are with the same length, you take the first one. For example for the array "a", "an", "cat", "door", "apple" 
//the average word length is (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3, which means that the word with length closest to the average length is "cat" (length is 3).

//For the array "I", "on", "dog", "star", "water", "bright" 
//the average word length is 3.5 and both words "dog" and "star" have lengths that are equally distant to the average length (lengths are 3 and 4, respectively). 
//The correct answer is the longer word which is "star" (with length 4).
//There can be duplicates in the array.

// За дадена низа од N зборови, најдете го зборот чија должина е најблиску до просечната должина на сите зборови во низата.
// Ако постојат два збора чии должини се на еднакво растојание од просечната должина, вратете го подолгиот збор.
// Дополнително, ако тие се со иста должина, земете го оној што се појавува прв. 
// На пример, за низата: "a", "an", "cat", "door", "apple" 
// просечната должина на зборовите е (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3, што значи дека зборот со должина најблиска до просекот е "cat" (со должина 3).

// За низата: "I", "on", "dog", "star", "water", "bright" 
// просечната должина на зборовите е 3.5 и двата збора "dog" и "star" имаат должини кои се на еднакво растојание од просекот (со должини 3 и 4, соодветно). 
// Точниот одговор е подолгиот збор, односно "star" (со должина 4).
// Во низата може да има и дупликати.


import java.util.Scanner;


@SuppressWarnings("unchecked")

class Array<E>{
	private E data[];
	private int size;
	
	
	public Array(int capacity) {
		this.data = (E[]) new Object[capacity];
		this.size = 0;
	}
	
	public void insertLast(E o) {
		if(size + 1 > data.length)
			this.resize();
		data[size++] = o;
	}
	
	public void insert(int position, E o) {
		if(position >= 0 && position <= size) {
			if(size+1 > data.length)
				this.resize();
		for(int i=size;i > position;i--) {
			data[i] = data[i-1];
		}
		data[position] = o;
		size++;
	   }else {
		   System.out.println("Cannot be inserted the element on that position.");
	   }
	}
	
	public void set(int position, E o) {
		if(position >= 0 && position < size)
			data[position] = o;
		else
			System.out.println("The given position is not valid!");
	}
	
	public E get(int position) {
		if(position >=0 && position < size)
			return data[position];
		else
			System.out.println("The given position is not valid!");
		return null;
	}
	
	public int find(E o) {
		for(int i=0; i < size; i++) {
			if(o.equals(data[i]))
				return i;
		}
		return -1;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public void delete(int position) {
		if(position >= 0 && position < size) {
			for(int i=position; i < size -1; i++) {
				data[i] = data[i+1];
			}
			data[size-1] = null;
			size--;
		}
	}

	
//	public void delete(int position) {
//		if(position >= 0 && position < size){
//			E[] newData = (E[]) new Object[size -1];
//			for(int i=0; i < position; i++)
//				newData[i] = data[i];
//			for(int i=position; i < size -1; i++)
//				newData[i] = data[i+1];
//			data = newData;
//			size--;
//		}
//	}
	
	public void resize() {
		E[] newData = (E[]) new Object[size*2];
		for(int i=0; i < size; i++)
			newData[i] = data[i];
		this.data = newData;
	}
	
	@Override
	public String toString() {
		String ret = new String();
		if(size>0) {
			ret = "{";
			ret += data[0];
			for(int i=1; i < size; i++) {
				ret +="," + data[i];
			}
			ret += "}";
			return ret;
		}else {
			ret = "Empty array!";
		}
		return ret;
	}
}

public class ArrayMeanWWordLength{
	public static String wordClosestToAverageLength(Array<String> arr) {
		int sum = 0;
		int n = arr.getSize();
		
		for(int i=0; i < n;i++) {
			sum += arr.get(i).length();
		}
		
		float avg = (float) sum / n;
		
		String bestWord = arr.get(0);
		float minDiff = Math.abs(bestWord.length() - avg);
		
		for(int i=1; i < n;i++) {
			String currentWord = arr.get(i);
			int currentLen = currentWord.length();
			
			float currentDiff = Math.abs(currentLen - avg);
			
			if(currentDiff < minDiff) {
				minDiff = currentDiff;
				bestWord = currentWord;
			}
			
			else if(currentDiff == minDiff && currentLen > bestWord.length()) {
				bestWord = currentWord;
			}
		}
		return bestWord;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		Array<String> arr = new Array<>(N);
		input.nextLine();
		
		for(int i=0; i < N; i++) {
			arr.insertLast(input.nextLine());
		}
		System.out.println(wordClosestToAverageLength(arr));
	}
}

