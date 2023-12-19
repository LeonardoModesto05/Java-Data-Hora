package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoHour {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2005-01-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-18T08:30:05");
		Instant d06 = Instant.parse("2023-12-20T12:30:40Z");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearLocalDate = d04.plusYears(18);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearLocalDate = " +  nextYearLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
		LocalDateTime nextWeekLocalDateTIme = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " +  pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTIme = " + nextWeekLocalDateTIme);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);

		
		System.out.println("t1 dias = " + t1.toDays() );
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());


	}

}
