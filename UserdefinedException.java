import java.io.*;
class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = -2872694086602732648L;

	private int id;

	EmployeeNotFoundException(int i, String message) {
		super(message);
		this.id = i;
	}

	EmployeeNotFoundException(int i, String message, String cause) {
		super(message, new Throwable(cause));
		this.id = i;
	}

	@Override
	public String toString() {
		return String.format("EmployeeNotFoundException[%d]", this.id);
	}}

//Program for IO classes


public class UserdefinedException
{
public static void main(String args[]) //throws IOException
{
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c=(char)br.read();
System.out.println(c);

//String s=br.readLine();

//System.out.println(s);
}
catch(IOException ie)
{
ie.printStackTrace();
}
}
}
