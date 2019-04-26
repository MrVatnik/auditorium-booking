package Eltech.Vatnik;
import java.io.Console;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Booking test = new Booking("Ivanov Ivan Ivanovitch",new Date(),BookingTime.STARTING1140,Room.RM_03);
	    System.out.println(test);
	    //
	    test.setDay(new Calendar.Builder().setDate(2019,-1,1).build().getTime());
        System.out.println(test);
    }
}
