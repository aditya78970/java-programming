import java.io.File;

public class LengthOfFile {
    public static void main(String asq[])
    {
        String pathFile="fibonacci.java";
        File file=new File(pathFile);
        if(file.exists());
        System.out.println(file.getAbsolutePath()+":"+file.length());
        
    }
    
}
