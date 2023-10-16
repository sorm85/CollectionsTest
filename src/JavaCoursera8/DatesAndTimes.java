package JavaCoursera8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DatesAndTimes {

    public DatesAndTimes () {
//        ExamplesDateTime1();
//        timeZone();
//        ClockExample();
//        compareDates();
//        formattingDates();
//        SetPeriods();
//        SetDuration();
//        ChangingDatesAndTimes ();

    }

    private void ChangingDatesAndTimes() {
        LocalDateTime ldt1 = LocalDateTime.now();


        //método plus y minus
        LocalDateTime ldt2 = ldt1.plusDays(21);
        System.out.println(ldt2);
    }

    private void SetDuration() {
        Duration d1 = Duration.of(1,ChronoUnit.DAYS);
        System.out.println(d1);

        Duration d2 = Duration.ofHours(9);
        System.out.println(d2);

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(15,0);
        Duration dt3 = Duration.between(lt1,lt2);
        System.out.println(dt3);


    }

    private void SetPeriods() {
        Period period = Period.of(1,1,1);
        System.out.println(period);
        Period period2 = Period.ofDays(100);
        System.out.println(period2);

        LocalDate ld1 = LocalDate.of(2022,1,1);
        LocalDate ld2 = LocalDate.now();
        Period period3 = Period.between(ld1,ld2);
        System.out.println(period3);
        List <LocalDate> famm = Famm();

        Period period4 = Period.between(famm.get(0),famm.get(1));
        Period period5 = Period.between(famm.get(3),famm.get(2));

        System.out.println("Diferencias entre emm y ren: "+period4);
        System.out.println("Diferencias entre iss y ddsr: "+period5);

        long nrOfDaysEmmRenn = ChronoUnit.DAYS.between(famm.get(0),famm.get(1));
        long nrOfDaysIssDssr = ChronoUnit.DAYS.between(famm.get(3),famm.get(2));


        System.out.println("Diferencia en dias entre emm y ren: "+nrOfDaysEmmRenn);
        System.out.println("Diferencia en dias entre Issr y ddsr: "+nrOfDaysIssDssr);



    }


    private void formattingDates() {
        LocalDateTime ldt = LocalDateTime.now();
        String formattedDate = DateTimeFormatter.ISO_ORDINAL_DATE.format(ldt);
        System.out.println(formattedDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(ldt)); //11-October-2023
        String formattedStyle = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
        System.out.println(formattedStyle); //Oct 11, 2023, 8:22:29 PM
    }

    protected void ExamplesDateTime1 () {
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
    protected void timeZone () {
        ZoneId zoneId = ZoneId.of("US/Pacific");
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt,zoneId);
        System.out.println(zdt1);
    }

    protected void ClockExample () {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        Instant instant = clock.instant();
        System.out.println(instant);

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());
        Clock clock2 = Clock.offset(clock,Duration.ofHours(10));
        System.out.println(clock2);
        System.out.println(clock2.instant());
    }
    protected void compareDates () {
        LocalDateTime emmita  = LocalDateTime.of(2014,5,18,8,10);
        LocalDateTime ranita  = LocalDateTime.of(2023,2,9,8,45);
        System.out.println(ranita.compareTo(emmita)+ " años de diferencia");

        System.out.println(ranita.isAfter(emmita));
        System.out.println(ranita.isBefore(emmita));
        System.out.println(ranita.isEqual(emmita));

    }

    protected List <LocalDate> Famm (){
        List<LocalDate> response  = new ArrayList<>();
        LocalDate emm = LocalDate.of(2014,5,18);
        LocalDate ren = LocalDate.of (2023,2,9);
        LocalDate isyoo = LocalDate.of(1987,7,8);
        LocalDate ddsr = LocalDate.of (1985,11,12);

        response.add(emm);
        response.add(ren);
        response.add(isyoo);
        response.add(ddsr);


        return response;

    }
}
