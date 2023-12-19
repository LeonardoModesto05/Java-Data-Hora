package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataToTexto {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2005-01-15");
		LocalDateTime d02 = LocalDateTime.parse("2005-07-20T02:25:13");
		Instant d03 = Instant.parse("2023-12-14T09:48:13Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		//passar data para string
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		//passar data e hora para string
		System.out.println();
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + fmt2.format(d02));
		System.out.println("d02 = " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("d02 = " + d02.format(fmt4));
		
		System.out.println();
		System.out.println("d03 = " +fmt3.format(d03));
		System.out.println("d03 = " +fmt5.format(d03));

	}

}
