package algorithmsPractice;
public class MergeSorter {
	public static void main(String[] args) {
		int []ar= new int [16];
//		for(int i=0;i<16;i++){
//			ar[i]= (int)Math.random();
//		}
		sort(ar);
		for(int i=0;i<16;i++){
			System.out.println(ar[i]);
		}
	}
 

	public static void sort(int[] a)   {

		//for(int i = 1; i <= a.length; i++) the parameters for the for loop are wrong.{  
		merge(0,0,1,a);
		merge(1,1,2,a);
		merge(2,2,3,a);
		merge(3,3,4,a);
		merge(4,4,5,a);
		merge(5,5,6,a);
		merge(6,6,7,a);
		merge(7,7,8,a);
		merge(8,8,9,a);
		merge(9,9,10,a);
		merge(10,10,11,a);
		merge(11,11,12,a);
		merge(12,12,13,a);
		merge(14,14,15,a);
	}

public static void merge(int from, int mid, int to, int[] a) {

    int n = to - from + 1;
 
    int[] b = new int[n];
 

    int i1 = from;
    int i2 = mid + 1;

    int j = 0;

    while (i1 <= mid && i2 <= to) {

        if (a[i1] < a[i2]) {

            b[j] = a[i1];

            i1++;

        } else {

            b[j] = a[i2];

            i2++;

        }

        j++;

    }
  while (i1 <= mid) {
        b[j] = a[i1];

        i1++;

        j++;

    }
   while (i2 <= to) {

        b[j] = a[i2];

        i2++;

        j++;

    }
  for (j = 0; j < n; j++) {

        a[from + j] = b[j];

    }

}
}