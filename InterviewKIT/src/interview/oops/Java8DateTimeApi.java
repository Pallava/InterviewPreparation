package interview.oops;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Java8DateTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate l = LocalDate.now();
		System.out.println("Date is - > "+l);
		
		
		LocalDate l2 = LocalDate.of(2021, Month.OCTOBER, 24);
		System.out.println("of ->"+l2);
		
		
		LocalTime l3 = LocalTime.now();
		System.out.println("Local time - >"+l3);
		
		LocalDateTime l4 = LocalDateTime.now(ZoneId.of("Asia/Qatar"));
		System.out.println("Asia/Qatar timn eis ->"+l4);
		//ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);
	}

}
