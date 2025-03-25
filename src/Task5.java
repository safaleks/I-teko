public class Task5 {
    public static void main(String[] args) {
        enum Month {
            JANUARY("Январь", 1),
            FEBRUARY("Февраль", 2),
            MARCH("Март", 3),
            APRIL("Апрель", 4),
            MAY("Май", 5),
            JUNE("Июнь", 6),
            JULY("Июль", 7),
            AUGUST("Август", 8),
            SEPTEMBER("Сентябрь", 9),
            OCTOBER("Октябрь", 10),
            NOVEMBER("Ноябрь", 11),
            DECEMBER("Декабрь", 12);
            private final String name;  // Название месяца (на русском)
            private final int number;   // Номер месяца (1-12)

            Month(String name, int number) {
                this.name = name;
                this.number = number;
            }

            public String getName() {
                return name;
            }

            public int getNumber() {
                return number;
            }
        }

        String monthName = "OCTOBER";
        Month month = Month.valueOf(monthName);
        System.out.println(month.getName());
    }
}
