import java.util.ArrayList;

import java.util.*;
public class UncheckedExcepton {
    public static void main(String asq[]) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("monday");
        arrayList.add("tuesday");
        arrayList.add("Wednesday");
        String day="Sunday";
        
        if(!arrayList.contains(day))
        {
            try{
                throw new DayNotAvailableException("Day not avalable",day);
            }
            catch(DayNotAvailableException e)
            {
                e.getLocalizedMessage();
                e.printStackTrace();
            }
        }
        
    }
    
}
class DayNotAvailableException extends RuntimeException
{
    String day;
    public DayNotAvailableException()
    {
        super();
    }
    public DayNotAvailableException(String message,String day)
    {
        super(message);
        this.day=day;
    }
    public DayNotAvailableException(String message,String day,Throwable cause)
    {
        super(message,cause);
        this.day=day;
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
    @Override
    public String getMessage()
    {
        return "the day"+day+"is not available";
    }
}

