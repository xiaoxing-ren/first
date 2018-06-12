
import java.util.Calendar;
import java.util.Date;
/**
*时间操作类，目前是  判断给定的时间是一年中的第几天
*/
public class TestDate{
    
    public static void main(String args[]){
        
        Date date = new Date();
        
        /**
        *java.util.Calendar
        *abstract class calendar
        */
        Calendar ca = Calendar.getInstance();
        
        ca.setTime(date);
        
        int i = ca.get(Calendar.DAY_OF_YEAR);
        
        System.out.println(i);
    }

 
}
