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
public class Worker extends Employee {
    public Worker(String name) {
        super(name);
    }

    public Worker(String name, double ZP) {
        super(name);
        this.ZP = ZP;
    }

    public double getZP() {
        return ZP;
    }

    public void setZP(double ZP) {
        this.ZP = ZP;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ZP=" + ZP +
                ", name='" + name + '\'' +
                '}';
    }

    double ZP;
    @Override
    public double AVG() {
        return ZP;
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

