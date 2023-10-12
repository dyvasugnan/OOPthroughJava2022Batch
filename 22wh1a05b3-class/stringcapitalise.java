// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.io.* ;

class HelloWorld {
    public static void main(String[] args) throws IOException {
        int i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter string");
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str," ");
        
        int t=st.countTokens();
        //System.out.println("no of tokens is:"+t);
        for(i=0;i<t;i++) {
            String si=st.nextToken();
            //System.out.println(si);
            String k=" ";
            si = si.substring(0,1).toUpperCase() + si.substring(1);
            si=si.concat(k);
            //si=si.concat(si);
            System.out.print(si);
        }
        //System.out.println(si);
    }