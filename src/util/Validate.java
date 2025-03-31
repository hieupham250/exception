package util;

import java.util.Scanner;

public class Validate {

    public static int validateInteger(Scanner sc) throws Exception {
        try {
            System.out.print("Nhập số nguyên: ");
            int n = sc.nextInt();
            return n;

        } catch (Exception e) {
            System.out.println("Ko đúng định dạng");
        }
        return 0;
    }

    public static float validateFloat(Scanner sc) throws Exception {
        try {
            sc.nextLine();
            System.out.print("Nhập số thực float: ");
            float n = sc.nextFloat();
            return n;
        } catch (Exception e) {
            System.out.println("Ko đúng định dạng");
        }
        return 0;
    }

    public static double validateDouble(Scanner sc) throws Exception {
        try {
            sc.nextLine();
            System.out.print("Nhập số thực double: ");

            double n = sc.nextDouble();
            return n;

        } catch (Exception e) {
            System.out.println("Ko đúng định dạng");
        }
        return 0;
    }

    public static boolean validateBoolan(Scanner sc) throws Exception {
        try {
            sc.nextLine();
            System.out.print("Nhập true/false: ");
            boolean check = sc.nextBoolean();
            return check;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static String validateString(Scanner sc) throws Exception {
        try {
            sc.nextLine();
            System.out.print("nhập vào chuỗi: ");
            String str = sc.nextLine();
            return str;
        } catch (Exception e) {
            System.out.println("Ko đúng định dạng");
        }
        return null;
    }
}
