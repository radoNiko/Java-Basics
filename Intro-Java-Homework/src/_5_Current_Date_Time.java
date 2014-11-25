import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class _5_Current_Date_Time {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(1);
		System.out.println(date);
	}

}
