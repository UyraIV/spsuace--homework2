package ru.spsuace.homework2.objects.simple;

/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 * Плюс реализуйте любой метод (операцию) над комплексными числами (на ваш выбор)
 */
public class ComplexNumber {
    private final double real;
    private final double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    private String sign() {
        if (real > 0) return " + ";
        else return " - ";
    }

    public boolean equals(ComplexNumber number) {
        return (this.real == number.real) & (this.imag == number.imag);
    }

    public double module() {
        return Math.abs(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public static ComplexNumber complexSum(ComplexNumber complexNum1, ComplexNumber complexNum2) {
        return new ComplexNumber(complexNum1.real + complexNum2.real, complexNum1.imag + complexNum2.imag);
    }

    public String toString() {
        if (real > 0) {
            if (imag > 0) {
                return real + "+" + imag + "i";
            } else if (imag == 0) {
                return String.valueOf(real);
            } else {
                return real + "-" + Math.abs(imag) + "i";
            }
        } else if (real < 0) {
            if (imag > 0) {
                return "-" + real + "+" + imag + "i";
            } else if (imag == 0) {
                return String.valueOf(real);
            } else {
                return "-" + real + "-" + Math.abs(imag) + "i";
            }
        } else {
            if (imag > 0) {
                return imag + "i";
            } else if (imag == 0) {
                return "0";
            } else {
                return "-" + Math.abs(imag) + "i";
            }
        }
    }
}