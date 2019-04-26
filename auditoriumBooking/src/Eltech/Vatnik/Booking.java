package Eltech.Vatnik;
import java.util.Date;

public class Booking {
    static int number;
    String name;
    Date day;
    BookingTime time;
    Room room;

    Booking(String name, Date day, BookingTime time, Room room){
        number = (int)((((name.charAt(0)-'A'+5)*10+day.getDay()+4)*10+day.getMonth()+3)*10+time.ordinal()+2)*10 + room.ordinal();
        this.name = name;
        this.day = day;
        this.time = time;
        this.room = room;
    }

    public String toString(){
        return number + " " + name + " " + room + " " + day.getDate() +"."+(day.getMonth()+1)+"."+(day.getYear()+1900)+ " " + time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public BookingTime getTime() {
        return time;
    }

    public void setTime(BookingTime time) {
        this.time = time;
    }

    public static int getNumber() {
        return number;
    }
}

