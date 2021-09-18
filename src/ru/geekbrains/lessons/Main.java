package ru.geekbrains.lessons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Employee employee1 = new Employee("Иванов Иван Иванович","бухгалтер","ivanov@mail.ru",
                "+79215264648",60000, 40 );
        Employee employee2 = new Employee("Петров Петр Петрович","директор","petrov@mail.ru",
                "+79219893467",100000, 47 );
        Employee[] employees =new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович","бухгалтер","ivanov@mail.ru",
                "+79215264648",60000, 41 );
        employees[1] = new Employee("Петров Петр Петрович","директор","petrov@mail.ru",
                "+792152687448",100000,50  );
        employees[2] = new Employee("Рибак Олег Иванович","электрик","oleg@mail.ru",
                "+79215264680",30000, 25 );
        employees[3] = new Employee("Морозова Инна Олеговна","секретарь","inna@mail.ru",
                "+79217864648",20000, 22 );
        employees[4] = new Employee("Васильев Андрей Романович","водитель","and@mail.ru",
                "+79215554648",300000, 45 );


    }

}
