import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeCalculator {

    /*
    * The below method is used when you have a date, and you want to calculate time between now and that date
    * */
    public String CalculateDuration(String startDateTime){
        String duration = "";
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy hh:mm aa");
        Date endDate = new Date();
        DateTimeFormatter df = DateTimeFormat.forPattern("dd-MMM-yyyy hh:mm aa");
        DateTime s = df.parseDateTime(startDateTime);
        DateTime e = df.parseDateTime(format.format(endDate));
        Period p = new Period(s,e);
        int elapsedYears = p.getYears();
        int elapsedMonths = p.getMonths();

        DateTime yearDiff = s.plusYears(elapsedYears);
        DateTime monDiff = yearDiff.plusMonths(elapsedMonths);
        Days d = Days.daysBetween(monDiff, e);
        int elapsedDays = d.getDays();

        int elapsedHours = p.getHours();
        int elapsedMinutes = p.getMinutes();

        duration += elapsedYears + " Years "+elapsedMonths+" Months " + elapsedDays + " Days " + elapsedHours+" Hours "+ elapsedMinutes+" Minutes";

        return duration;
    }

    /*
    * The below method is used when you have two dates
    * */
    public String CompareTwoDates(String startDateTime, String endDateTime){
        String duration = "";
        DateTimeFormatter df = DateTimeFormat.forPattern("dd-MMM-yyyy hh:mm aa");
        DateTime s = df.parseDateTime(startDateTime);
        DateTime e = df.parseDateTime(endDateTime);
        Period p = new Period(s,e);
        int elapsedYears = p.getYears();
        int elapsedMonths = p.getMonths();

        DateTime yearDiff = s.plusYears(elapsedYears);
        DateTime monDiff = yearDiff.plusMonths(elapsedMonths);
        Days d = Days.daysBetween(monDiff, e);
        int elapsedDays = d.getDays();

        int elapsedHours = p.getHours();
        int elapsedMinutes = p.getMinutes();

        duration += elapsedYears + " Years "+elapsedMonths+" Months " + elapsedDays + " Days " + elapsedHours+" Hours "+ elapsedMinutes+" Minutes";

        return duration;
    }

}
