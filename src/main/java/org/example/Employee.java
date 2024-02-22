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
public abstract class Employee implements Comparable<Employee>, Payable{
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double AVG();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

