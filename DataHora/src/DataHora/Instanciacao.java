package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {

	public static void main(String[] args) {
		//formata uma data customizada;
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//instancia a data local//
		LocalDate d01 = LocalDate.now();
		//instancia a data e a hora local//
		LocalDateTime d02 = LocalDateTime.now();
		//instacia data e hora global//
		Instant d03 = Instant.now();
		//formata um texto ISO para data e hora//
		LocalDate d04 = LocalDate.parse("2023-12-25");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-25T00:00:01");
		Instant d06 = Instant.parse("2023-12-25T00:00:01Z");
		Instant d07 = Instant.parse("2023-12-25T00:00:01-03:00");
		
		LocalDate d08 = LocalDate.parse("01/01/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("01/01/2024 08:30",fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 01, 15);

		System.out.println("d01 = " +d01);
		System.out.println("d02 = " +d02);
		System.out.println("d03 = " +d03);
		System.out.println("d04 = " +d04);
		System.out.println("d05 = " +d05);
		System.out.println("d06 = " +d06);
		System.out.println("d07 = " +d07);
		System.out.println("d08 = " +d08);
		System.out.println("d09 = " +d09);
		System.out.println("d10 = " +d10);
	}

}
