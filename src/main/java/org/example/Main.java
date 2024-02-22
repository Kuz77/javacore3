package org.example;

//1. Построить три класса (базовый и 2 потомка),
// описывающих некоторых работников с почасовой оплатой
// (один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).

//        а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
//        Для «повременщиков» формула для расчета такова:
//        «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
//        для работников с фиксированной оплатой
//        «среднемесячная заработная плата = фиксированная месячная оплата».

//        б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");


        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Freelancer("бФри4", 700));
        employees.add(new Freelancer("дФри1", 1000));
        employees.add(new Freelancer("гФри2", 900));
        employees.add(new Freelancer("вФри3", 800));
        employees.add(new Freelancer("аФри5", 600));

        employees.add(new Worker("бВорк4", 70_000));
        employees.add(new Worker("дВорк1", 100_000));
        employees.add(new Worker("гВорк2", 90_000));
        employees.add(new Worker("вВорк3", 80_000));
        employees.add(new Worker("аВорк5", 60_000));


        System.out.println(employees);
        System.out.println(" ");

        for (Employee employee : employees){
            System.out.println(employee.getName() + " получил за месяц " + employee.AVG());
        }
        System.out.println(" ");


        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Collections.sort(employees, nameComparator);


        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }


    }
}