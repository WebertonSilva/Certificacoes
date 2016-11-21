package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesTimes {

	public static void main(String[] args) {
		
		// O método now retorna a data local de onde o SO está sendo executado 
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println("\n");
		
		//Ambos criam a mesma data
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		
//		As classes date e time são imutáveis, por isso o resultado precisa ser atribuída a alguma referência.
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);		
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28
		
		
		System.out.println("\n");
		
//		As classes date e time são imutáveis, por isso o resultado precisa ser atribuída a alguma referência.
		LocalDate dt = LocalDate.of(2015, Month.MARCH, 31);
		System.out.println(dt);
		dt = dt.plusMonths(1);
		System.out.println(dt); // 2019-02-28
		dt = dt.plusDays(10);
		System.out.println(dt);
		
		System.out.println("\n");
		//Apesar de d ser DateTime, A saida do metodo formater é apenas a hora
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
		System.out.println(d.format(f));
		
	
		System.out.println("\n");
		//Periodo não permite encademanto, apenas o útimo método chamado contém a alteração
		LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p2 = Period.ofDays(1).ofYears(2);
		d2 = d2.minus(p2);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f2.format(d2));
		
		
//		Periodo não é encadeado
		
		System.out.println("\n");
		Period wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println(wrong);
		
		Period wrong2 = Period.ofYears(1);
		wrong2 = Period.ofWeeks(7);
		System.out.println(wrong2);
		
		Period acert = Period.of(1, 0, 7);		
		System.out.println(acert);
		
	}

}
