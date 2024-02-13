package ru.netology.services.QAdz5;

public class FreeService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int moneyInTheAccount = 0;
        for (int month = 0; month < 12; month++) {
            if (moneyInTheAccount >= threshold) {
                count++;
                moneyInTheAccount = (moneyInTheAccount - expenses) / 3;
            } else {
                moneyInTheAccount = moneyInTheAccount + income - expenses;
            }
        }
        return count;

    }
}
