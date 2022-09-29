package cw29092022;

public class Main {
    public static void main(String[] args) {
        ImplementsExamination ex = new ImplementsExamination();
        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        for (DaysOfTheWeek week : days) {
            ex.getWeek(week);
        }

    }

}
