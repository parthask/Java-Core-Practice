package algorithmsPractice;

public class MargeSort_2 {

	public static void main(String[] args) {
		int arr[]= {5,2,7,5,4,8,1,6,3,5,9,285, 310, 179, 652, 351, 423 ,861 ,254, 450, 520};		
		print( arr);
		divide(arr);
		print(arr);
	}
	
	public static void conquare(int larr[], int rarr[], int arr[]) {
		int i=0,j=0,k=0;
		int l,r,a;
		l= larr.length;
		r= rarr.length;
		a= arr.length;
		while(i<l && j<r){
			if(larr[i]<= rarr[j]){
				arr[k]=larr[i];
				i++;
			}else{
				arr[k]=rarr[j];
				j++;
			}
			k++;
		}
		while(i<l){
			arr[k]= larr[i];
			i++;
			k++;
		}
		while(j<l){
			arr[k]= rarr[j];
			j++;
			k++;
		}
		//print( arr);
	}

	public static void divide(int[] arr) {
		int len=  arr.length;
		if(len<2) return;
		int l= len/2;
		int r= len-l;
		int larr [] = new int [l];
		int rarr [] = new int [r];
		int i=0;
		while( i<l){
			larr[i]= arr[i];
			i++;		
		}
		while( i<len){
			rarr[i-l]= arr[i];
			i++;
		}
		divide(larr);
		divide(rarr);
		conquare(larr, rarr, arr);		
	}

	private static void print(int[] arr) {
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println();		
	}

	
}
