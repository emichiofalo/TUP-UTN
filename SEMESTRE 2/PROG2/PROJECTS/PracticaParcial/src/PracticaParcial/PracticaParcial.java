package PracticaParcial;



import java.time.*;

/**
 *
 * @author Emi Chiófalo
 */
public class PracticaParcial {

    public static void main(String[] args) {
        
        //https://www.w3schools.com/java/java_date.asp - java date and time
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println("Fecha actual: " + myObj); // Display the current date
        
        LocalTime myObj2 = LocalTime.now();
        System.out.println("Hora actual: " + myObj2);
        
        //https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html - clase time
        System.out.println("Día del mes nro: " + myObj.getDayOfMonth());
        System.out.println("Día de la semana: " + myObj.getDayOfWeek());
        System.out.println("Día del año nro: " + myObj.getDayOfYear());
        System.out.println("Mes: " + myObj.getMonth().toString().toLowerCase() 
                + " - Mes nro: " + myObj.getMonthValue());
        System.out.println("Año: " + myObj.getYear());
        LocalDate prueba = LocalDate.of(2022,4,30);
        if (myObj.isAfter(prueba)) {
            System.out.println("La fecha " + prueba.toString() + " es anterior a hoy.");
        }
        System.out.println(myObj.plusDays(114));

        //https://docs.oracle.com/javase/8/docs/api/java/util/Date.html - class date
        /*
        In all methods of class Date that accept or return year, month, date, hours, minutes, 
        and seconds values, the following representations are used:
            - A year y is represented by the integer y - 1900.
            - A month is represented by an integer from 0 to 11; 0 is January, 1 is February, 
            and so forth; thus 11 is December.
            - A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
            - An hour is represented by an integer from 0 to 23. Thus, the hour from midnight to 
            1 a.m. is hour 0, and the hour from noon to 1 p.m. is hour 12.
            - A minute is represented by an integer from 0 to 59 in the usual manner.
            - A second is represented by an integer from 0 to 61; the values 60 and 61 occur only 
            for leap seconds and even then only in Java implementations that actually track leap 
            seconds correctly. Because of the manner in which leap seconds are currently introduced, 
            it is extremely unlikely that two leap seconds will occur in the same minute, but this 
            specification follows the date and time conventions for ISO C.
        */
        
        /*
        Constructor:
        Date(int year, int month, int date)
        
        Metodos - muchos están deprecados
        after(Date fecha)
        before(Date fecha) 
        getDate()
        getDay()
        getMonth()
        getYear()
        */
    }
    
}
