package Dj;
//import java.util.*;
public class Difference {
	public static void main(String[]args) {
		//Scanner sc=new Scanner(System.in);
		int arr[]=new int [] {7,9,6,3,2};
		int difference=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					difference=arr[j]-arr[i];
				}
				
			}
			
		}
		System.out.println(difference);
	}

}
