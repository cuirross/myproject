package lesson9;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Василий Цой", "Сосун", "vasyasoska@gmail.gandon", "+11111111", 321, 43);
        employee[1] = new Employee("Сергей Цой", "Лизун", "serejaGay2006@gmail.gay", "+22222222", 0, 44);
        employee[2] = new Employee("Харисов Имиль", "Блядун", "imilpipiska2004@gmail.virgin", "+3333333", 987, 23);
        employee[3] = new Employee("Синауридзе Дмитрий", "Пиздюк", "dimas2010@gmail.khametova", "+444444", 123, 18);
        employee[4] = new Employee("Саркисов Руслан", "Скам", "scam2004@gmail.mamont", "+5555555", 543, 41);

        System.out.println("Работники старше 40 лет: ");
        for (int i = 0; i < employee.length ; i++) {
            if (employee[i].getAge() > 40){
             employee[i].printEmployeeInfo();
        }
            System.out.println("==================");

            }
        }
    }


