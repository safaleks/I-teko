public class Task5 {
    public static void main(String[] args) {
        enum Month {
            JANUARY("Январь"),
            FEBRUARY("Февраль"),
            MARCH("Март"),
            APRIL("Апрель"),
            MAY("Май"),
            JUNE("Июнь"),
            JULY("Июль"),
            AUGUST("Август"),
            SEPTEMBER("Сентябрь"),
            OCTOBER("Октябрь"),
            NOVEMBER("Ноябрь"),
            DECEMBER("Декабрь");
            private final String name;  // Название месяца (на русском)

            Month(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

        }

        String monthName = "OCTOBER";
        Month month = Month.valueOf(monthName);
        System.out.println(month.getName());
    }
}
