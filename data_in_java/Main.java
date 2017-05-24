package data_in_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer sb = new StringBuffer("");
        String m = "";
        
        while(true) {
            int x = Integer.parseInt(br.readLine());
            if(x==0)
                break;
            Queue<Integer> qu=new LinkedList<Integer>();
            for(int i=1;i<x+1;i++){
                qu.add(i);
            }
            sb.append("Discarded cards:");
            boolean flag=false;
            while(qu.size()>1){
                if(flag)
                    sb.append(",");
                sb.append(" ").append(qu.remove());
                qu.add(qu.remove());
                flag=true;
            }
            sb.append("\n");
            sb.append("Remaining card: ").append(qu.remove()).append("\n");
        }
        System.out.print(sb);
    }
}