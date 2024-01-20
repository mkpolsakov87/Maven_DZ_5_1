package ru.netology.mvndz.mvndz5.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                int savings = (money / 3) * 2;
                money = money - savings;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
