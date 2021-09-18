package ru.geekbrains.lessons;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    public int age;

    public Employee(String name,String position,String email,String phone,int salary,int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Создать сотрудника:");
        print();
    }

    public void print(){
        System.out.print("name = " + name);
        System.out.print(" position = " + position);
        System.out.print(" email = " + email);
        System.out.print(" phone = " + phone);
        System.out.print(" salary = " + salary);
        System.out.println(" age = " +age);
    }

}
