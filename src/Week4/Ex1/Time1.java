package Week4.Ex1;

// Define time in a 24-hour format. But accommodate 12 hours as well eventually...
public class Time1 {
    private int hour; // Between 0 - 23
    private int minute; // Between 0 - 59
    private int second; // Between 0 - 59

    public Time1(){}
    public Time1(int hour){
        this(hour,0,0);
    }
    public Time1(int hour, int minute){
        this(hour,minute,0);
    }

    public Time1(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23");
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0-59");
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Copy Constructor
    public Time1(Time1 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }

    // Ability to set the time
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24
                || minute < 0 || minute >= 60
                || second < 0 || second >= 60){
            throw new IllegalArgumentException("Hour, minute, and/or second was out of range");
        }

        // Assuming the values are correct
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //
    public String buildString(){
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniveralString()",
                this.toUniveralString(),
                "toUniversalString",
                toUniveralString());
    }
    // Converts into universal time (HH:MM:SS)
    public String toUniveralString(){
        return String.format("%02d:%02d:%02d",
                hour,minute,second);
    }
    // Coverts into standard time (HH:MM:SS AM/PM)
    public String toString(){
        // Will convert any hour value above 12 into appropriate "12-hour" value
        return String.format("%02d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute,
                second,
                (hour > 12) ? "AM" : "PM");
        // FANCY IF STATEMENT : (A == B) ? true : false
    }

    public int getHour() { return hour; }
    public void setHour(int hour){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23");
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute){
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0-59");
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second){
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0-59");
        this.second = second;
    }
}
