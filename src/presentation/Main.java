package presentation;

import util.Validate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Validate.validateInteger(scanner);
        System.out.println(n);
        float a = Validate.validateFloat(scanner);
        System.out.println(a);
        double b = Validate.validateDouble(scanner);
        System.out.println(b);
        boolean check = Validate.validateBoolan(scanner);
        System.out.println(check);
        scanner.nextLine();
        String s = Validate.validateString(scanner);
        System.out.println(s);
    }
}
