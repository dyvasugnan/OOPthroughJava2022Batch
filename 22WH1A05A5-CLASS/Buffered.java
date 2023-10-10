\\reading various data types in java using buffered reader
public Bufferedreader{
public static void main(String[] args) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("enter age:");
int age = Integer.parseInt(br.readLine());
}
}


