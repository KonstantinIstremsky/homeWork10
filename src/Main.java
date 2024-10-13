import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }

    public static void task2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());
    }

    public static void task3(){
        String firstName = "Семен";
        String middleName = "Семенович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameTrue = fullName.replace("е", "ё");
        System.out.println("Ф. И. О. сотрудника — " + fullNameTrue);
    }
    }