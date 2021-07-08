package Pack;

public class GB {
    private int age;
    private int payroll;
    private int phoneNumber;
    private String fullName;
    private String position;
    private String email;

    public GB( int payroll, String fullName, String position,int age, String email, int phoneNumber){
            this.age = age;
            this.fullName = fullName;
            this.position = position;
            this.payroll = payroll;
            this.phoneNumber = phoneNumber;
            this.email = email;

        }
    private void Print () {
        System.out.printf("GB %s, position: %s, email: %s, phoneNumber: %d,payroll: %d,  age: %d\n", this.payroll, this.fullName, this.position, this.email, this.phoneNumber, this.age);
    }
    public static void main (String[] args) {
        GB[] GBes = {
                new GB (25_000, "Арнольд Шварценегер Лилипутович", "Завхоз", 37, "gsdfgdgg@mail.ru", 45245637),
                new GB ( 20_000, "Денисов Максим Александрович", "Юрист", 35, "gdfgdgvg@mail.ru", 65498465),
                new GB (36_000, "Брюс Уилис Уиллисович", "Сторож", 55, "hdfgdg@mail.ru", 5434564),
                new GB (16_000, "Джеки Чан Кореевич", "Делопроизводитель", 43, "gdfg@mail.ru", 4563456),
                new GB (319_000, "Поняткова Анна Николаевна", "Бухгалтер", 59, "yrwgsg@mail.ru", 47686863),};
    }
        }

