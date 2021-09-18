package ru.geekbrains.lessons;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name,String position,String email,String phone,int salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Создать сотрудника:");
        System.out.println("name = " + name);
        System.out.println("position = " + position);
        System.out.println("email = " + email);
        System.out.println("phone = " + phone);
        System.out.println("salary = " + salary);
        System.out.println("age = " +age);
    }


}
