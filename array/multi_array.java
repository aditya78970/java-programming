package array;
import java.util.*;

public class multi_array {
    
    public static void main(String asr[]){
        float arr[][]=new float[10][10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){

                arr[i][j]=sc.nextFloat();
            }
        }
        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){

                System.out.println(arr[i][j]+" ");
                System.out.println("\n");
            }
        }

    }

    
}
