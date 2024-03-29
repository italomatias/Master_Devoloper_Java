package collections.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Date now = new Date();
        System.out.println(now);

        long time = now.getTime();
        System.out.println(time);


        Calendar cal = Calendar.getInstance();
        cal.set(2030,1,20,14,30,25);
        cal.set(Calendar.YEAR,2040);
        cal.set(Calendar.SECOND,20);

        cal.add(Calendar.MONTH , 2);
        cal.add(Calendar.YEAR , -2);

        System.out.println(cal.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d =   sdf.parse("03/12/2000 15:30:20");
        System.out.println(d);

        String s = sdf.format(d);
        System.out.println(s);
        cal.setTime(d);
        System.out.println(cal.getTime());
        cal.add(Calendar.HOUR , 48 );
        System.out.println(cal.getTime());
    }

}
