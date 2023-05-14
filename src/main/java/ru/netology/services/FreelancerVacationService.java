package ru.netology.services;

public class FreelancerVacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int savings = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (savings < threshold) {
                savings += income - expenses;
            } else {
                vacationMonths++;
                savings -= expenses + savings / 3;
            }
        }

        return vacationMonths;
    }
}