import java.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    

    public static void main(String asq[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter some word");
        String text=sc.nextLine();
        System.out.println("enter some number");
        int i=sc.nextInt();

        try{
            BufferedWriter f_writer=new BufferedWriter(new FileWriter("/Users/Aditya/OneDrive/Desktop/dac_java/file.txt"));
            f_writer.write(text);
            f_writer.write(i);
            System.out.print(
                "File is created successfully with the content.");
            //f_writer.close();

            FileReader reader=new FileReader("/Users/Aditya/OneDrive/Desktop/dac_java/file.txt");
            int cha;
            while((cha=reader.read())!=-1);
            System.out.print((char) cha);
            reader.close();
            f_writer.close();
        }
        //catch(IOException e){
        //    System.out.println(e.getMessage());
        //}
        
        catch(IOException e)
        {
            e.printStackTrace();
        }
    

    }
    
}
