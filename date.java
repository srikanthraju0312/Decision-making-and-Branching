import java.util.*;
import java.time.*;

/**
 * This program returns the day of the week on the given date
 */
class date {
    public static void main(String[] args) {
        char t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month(in number): ");
        int enter = sc.nextInt();
        System.out.print("Date of the month: ");
        int a = sc.nextInt();
        System.out.print("Year: ");
        int b = sc.nextInt();

        LocalDate lod = LocalDate.of(b,Month.of(enter),a);

        DayOfWeek dow = DayOfWeek.from(lod);
        int val = dow.getValue();
        System.out.print("Do you want to get the name of the day(or) the number of the day(N/R): ");
        System.out.flush();
        

        try{
            switch(t = (char) System.in.read()){
                case 'N':
                case 'n': System.out.println("It was "+dow+" on "+a+" "+enter+" "+b);break;
                case 'R':
                case 'r': System.out.println("It was the "+val+" on "+a+" "+enter+" "+b);break;
                default: System.out.println("Sorry!!! couldn't get you try again");
            }
        }
        catch(Exception e){
            System.out.println("Input error "+e);
        }
    }
}
