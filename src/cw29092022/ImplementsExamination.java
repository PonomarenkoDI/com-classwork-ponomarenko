package cw29092022;

public class ImplementsExamination {

    public void getWeek(DaysOfTheWeek day) {
        switch (day) {
            case MONDAY: {
                if (day.getWeek().equals("Понедельник")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case TUESDAY: {
                if (day.getWeek().equals("Вторник")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case WEDNESDAY: {
                if (day.getWeek().equals("Среда")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case THURSDAY: {
                if (day.getWeek().equals("Четверг")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case FRIDAY: {
                if (day.getWeek().equals("Пятница")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case SATURDAY: {
                if (day.getWeek().equals("Суббота")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }
            case SUNDAY: {
                if (day.getWeek().equals("Воскресенье")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getWeek());
                }
                break;
            }

        }

    }
}



