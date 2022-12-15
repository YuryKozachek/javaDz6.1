package ru.netology.sqr.javaDz.services;

public class SQRService {
    public int sqrtCalc(int numOne, int numTwo) {
        int sumSqrt = 0;
        for (int i = 1; i < numTwo; i++) {
            if (i * i >= numOne && i * i <= numTwo) {
                sumSqrt++;
            }
        }
        return sumSqrt;
    }
}
