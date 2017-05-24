package algorithmTest01;
/*
RRGGGGGRBBBB
GRBGGGRGGGRR
BBRBGBRRRBGR
GBBRBGRRGRGR
RRRRRRRRRRRR

r r r r r b b b b g g g
y r r r x x x b b b g g
y r r r x x x b b g g b
r r y y x x x r b b b b
r r r r y y y r r b b g

 */
import java.util.Scanner;

public class floodfillAlgorithm {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static String ar [][] = new String [5][12];
	public static int flag [][] = new int [5][12];
	public static String st [] = new String[60];
	
	public static void main(String[] args) {
		
		//Arrays.fill(flag, 0);
		for(int i=0;i<5;i++){
			for(int j=0;j<12;j++){
				flag [i][j]= 0;
			}
		}
		
		int sn =1;
		int k=0;
		int ct=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<12;j++){
				ar[i][j]= scan.next();
				if(matchFound(ar[i][j], st,sn)){
					st[sn++]= ar[i][j];
				}
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<12;j++){
				String s= st[k++];
				if(ar[i][j]== s && flag [i][j]== 0){
					ct++;
					floodFill(i,j,s);
				}
			}
		}
		for(int i=0;i<sn;i++){
			System.out.print(st[i]+", ");
		}
		 System.out.println(ct);
	}

	private static void floodFill(int i, int j, String s) {
		
		 if(i<0 || j<0 || i>=5 || j>=12) //base case
			    return;

			   //if found dot and it's already not visited
			   if(ar[i][j]== s && flag[i][j]==0){

			      flag[i][j]=1; //mark this [i,j] dot as VISITED

			      //DFS Call for adjacent indices
			      floodFill(i+1,j, s);
			      floodFill(i-1,j, s);
			      floodFill(i,j+1, s);
			      floodFill(i,j-1, s);
			      floodFill(i+1,j+1, s);
			      floodFill(i+1,j-1, s);
			      floodFill(i-1,j+1, s);
			      floodFill(i-1,j-1, s);

			   }
		
	}

	private static boolean matchFound(String str, String[] st, int n) {

		for(int i=0;i <=n;i++){
			if(st[i]== str){
				return true;
			}
		}
		return false;
	}




}
