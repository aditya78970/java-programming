import java.io.*;


 class ReadTest
 {
 public static void main(String[] args)
 {
     try
 {
 File fl = new File("Customer.java");
 BufferedReader br = new BufferedReader(new FileReader(fl)) ;
 String str;
 while ((str=br.readLine())!=null)
 {
 System.out.println(str);
 }
 br.close();
 }
 catch(IOException e) {
 e.printStackTrace();
 }
 }
}