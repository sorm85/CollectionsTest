package JavaCoursera8;

import java.time.*;

public class DatesAndTimes {

    public DatesAndTimes () {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1985, 11, 12);
        LocalDate ld3 = LocalDate.of(2022, Month.JULY, 8);

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10, 5);

        LocalDateTime ltd1 = LocalDateTime.of(ld2, lt1);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);

        System.out.println(ld2.getDayOfWeek());
        System.out.println(ld3.getDayOfWeek());
        System.out.println(lt1);
        System.out.println(lt2);

        System.out.println(ltd1);

        MonthDay monthDay = MonthDay.of(7, 8);
        LocalDate localDate = monthDay.atYear(2022);

        YearMonth yearMonth = YearMonth.now();
        LocalDate localDate1 = yearMonth.atDay(8);

        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
