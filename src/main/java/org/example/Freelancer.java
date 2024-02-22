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
public class Freelancer extends Employee{
    public Freelancer(String name) {
        super(name);
    }

    public Freelancer(String name, double hourlyrate) {
        super(name);
        Hourlyrate = hourlyrate;
    }

    public double getHourlyrate() {
        return Hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        Hourlyrate = hourlyrate;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "Hourlyrate=" + Hourlyrate +
                ", name='" + name + '\'' +
                '}';
    }

    double Hourlyrate;
    @Override
    public double AVG() {
        return(20.8 * 8 * Hourlyrate);
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    @Override
    public double calculatePay(int hoursWorked) {
        return 0;
    }

    @Override
    public double calculateAverageMonthlyPay() {
        return 0;
    }
}

