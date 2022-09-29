package cw29092022;

public enum DaysOfTheWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String week;

    DaysOfTheWeek(String week) {
        this.week = week;
    }

    String getWeek(){
        return week;
    }
}

