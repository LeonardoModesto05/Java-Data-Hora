package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2005-01-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-18T08:30:05");
		Instant d06 = Instant.parse("2023-12-20T12:30:40Z");
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Japan"));
		//ZoneId.getAvailableZoneIds();
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("d04 day = " + d04.getDayOfMonth());
		System.out.println("d04 month = " + d04.getMonthValue());
		System.out.println("d04 year = " + d04.getYear());
		
		System.out.println("d05 hour =  " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());
	}

}
	