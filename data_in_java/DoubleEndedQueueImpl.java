package data_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class DoubleEndedQueueImpl {
 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertFront(int item){
        //add element at the beginning of the queue
        System.out.println("adding at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        System.out.println("adding at rear: "+item);
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(0);
        System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(deque.size()-1);
        System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public int peakFront(){
        //gets the element from the front without removing it
        int item = deque.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakRear(){
        //gets the element from the rear without removing it
        int item = deque.get(deque.size()-1);
        System.out.println("Element at rear: "+item);
        return item;
    }
     
    public static void main(String a[]){
         Scanner scan = new Scanner(System.in);
        DoubleEndedQueueImpl deq = new DoubleEndedQueueImpl();
//        deq.insertFront(34);
//        deq.insertRear(45);
//        deq.removeFront();
//        deq.removeFront();
//        deq.removeFront();
//        deq.insertFront(21);
//        deq.insertFront(98);
//        deq.insertRear(5);
//        deq.insertFront(43);
//        deq.removeRear();
        
       // while(scan.hasNext()){ 
			int c= scan.nextInt();
			int t=1;
			while(c>0){
				int n= scan.nextInt();
				int m= scan.nextInt();
				int ar[]= new int [n];
				String sr[]= new String [m];
				scan.next();
				while(m>0){
					String st=scan.nextLine();
					int r=0, l=0,sl=0,p;
					if(st.contains(" ")){
						String s[]= st.split(" ");
						p= Integer.parseInt(s[1]);
						switch (s[0]){
						case "pushRight": 
							deq.insertRear(Integer.parseInt(s[1]));
						case "pushLeft": 
							deq.insertFront(Integer.parseInt(s[1]));
						
						}
					}
					m--;
				}
				c--;
			}
      //  }
    }
}





















