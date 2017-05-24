package algorithmsPractice;
/*
3
10
285 310 179 652 351 423 861 254 450 520
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MargeSort {
	
	public static ArrayList<Integer> ar= new ArrayList<Integer>();	
	public static ArrayList<Integer> br= new ArrayList<Integer>();	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(scan.hasNext()){
			int t= scan.nextInt();
			while(t>0){
				int n= scan.nextInt();
				for(int i=0;i<n;i++){
					ar.add(scan.nextInt());

				}
				margeSort(0, n-1);
				
			}
		}
	}

	private static void margeSort(int low, int high) {
		if(low < high){
			int mid= (int) Math.floor((low+high)/2);
			margeSort(low, mid);
			margeSort(mid+1 , high);
			marge(low, mid, high);
		}
		
		System.out.println(ar);
	}

	private static void marge(int low, int mid, int high) {
		int h= low;
		int i= low;
		int j= mid+1;
		while((h<=mid) && (j<= high)){
			if(ar.get(h)<= ar.get(j)){
				br.add(ar.get(h));
				h=h+1;
			}else{
				br.add(ar.get(j));
				j=j+1;
			}
			i=i+1;
		}
		if(h>mid){
			for(int k=j;k<=high;k++){
				br.add(ar.get(k));
				i=i+1;
			}
		}else{
			for(int k=h;k<=mid;k++){
				br.add(ar.get(k));
				i=i+1;
			}
			for(int k=low;k<=high;k++){
				ar.add(br.get(k));
			}
		}
		
	}
}

















