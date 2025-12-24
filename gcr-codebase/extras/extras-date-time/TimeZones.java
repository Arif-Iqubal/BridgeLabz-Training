import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        // Get the current moment in time 
        Instant now = Instant.now();

        // Define the time zones using their full IDs
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST is UTC+5:30
        ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // PST/PDT

        // Create ZonedDateTime objects for each zone
        ZonedDateTime gmtTime = now.atZone(gmtZone);
        ZonedDateTime istTime = now.atZone(istZone);
        ZonedDateTime pstTime = now.atZone(pstZone);

        // Define a formatter (optional, can also use zdt.toString())
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Print the times
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
