public class StringPractice {
    public static void main(String asq[])
    {
        String str = "study";
        str.concat("tonight");
        System.out.println(str); // Output: study
        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");         //output studytonight
        System.out.println(strB);
        StringBuilder s3=new StringBuilder(strB);
        StringBuilder s4=s3.reverse();
        System.out.println(s3); 
        System.out.println(s4); 

    }
    
}
