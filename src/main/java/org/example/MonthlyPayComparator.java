package org.example;

import java.util.Comparator;

class MonthlyPayComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.calculateAverageMonthlyPay(), employee2.calculateAverageMonthlyPay());
    }
}

