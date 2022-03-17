package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        // test ConverterIf month
        System.out.println("Testing ConverterIf month");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Input: " + i);
            System.out.println("Output: " + converterIf.convertMonth(i));
            System.out.println();
        }

        // test ConverterIf day
        System.out.println("Testing ConverterIf day");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Input: " + i);
            System.out.println("Output: " + converterIf.convertDay(i));
            System.out.println();
        }

        // test ConverterSwitch month
        System.out.println("Testing ConverterSwitch month");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Input: " + i);
            System.out.println("Output: " + converterSwitch.convertMonth(i));
            System.out.println();
        }

        // test ConverterSwitch day
        System.out.println("Testing ConverterSwitch day");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Input: " + i);
            System.out.println("Output: " + converterSwitch.convertDay(i));
            System.out.println();
        }
    }
}
