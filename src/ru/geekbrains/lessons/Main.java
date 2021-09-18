package ru.geekbrains.lessons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Employee employee1 = new Employee("Иванов Иван Иванович","бухгалтер","ivanov@mail.ru",
                "+79215264648",60000, 40 );
        Employee employee2 = new Employee("Петров Петр Петрович","директор","petrov@mail.ru",
                "+79219893467",100000, 47 );
    }
    /*
	1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
	 */
}
