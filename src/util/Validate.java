package util;

import java.util.Scanner;

public class Validate {

   public static int validateInteger(Scanner sc) throws Exception {
       try {
           System.out.print("Nhập số nguyên: ");
           if (sc.hasNextInt()) {
               int n = sc.nextInt();
               return n;
           } else {
               throw new Exception("Ko phải số nguyên");
           }
       } catch (Exception e) {
          System.out.println(e.getMessage());
       }
       return 0;
   }

   public static float validateFloat(Scanner sc) throws Exception {
       try {
           System.out.print("Nhập số thực float: ");
           if (sc.hasNextFloat()) {
               float n = sc.nextFloat();
               return n;
           } else {
               throw new Exception("Ko phải số thực float");
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return 0;
   }

   public static double validateDouble(Scanner sc) throws Exception {
       try {
           System.out.print("Nhập số thực double: ");
           if (sc.hasNextDouble()) {
               double n = sc.nextDouble();
               return n;
           } else {
               throw new Exception("Ko phải số thưc double");
           }
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
       return 0;
   }

   public static boolean validateBoolan(Scanner sc) throws Exception {
       try {
           System.out.print("Nhập true/false: ");
           if (sc.hasNextBoolean()) {
               boolean check = sc.nextBoolean();
               return check;
           } else {
               throw new Exception("Ko phải kiểu boolean");
           }
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
       return false;
   }

   public static String validateString(Scanner sc) throws Exception {
       try {
           System.out.print("nhập vào chuỗi: ");
           String str = sc.nextLine();
           if (str.isEmpty()) {
               throw new Exception("Chuỗi không được để trống");
           } else {
               return str;
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       return null;
   }
}
