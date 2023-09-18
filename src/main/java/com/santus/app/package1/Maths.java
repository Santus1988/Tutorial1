package com.santus.app.package1;

public class Maths {

    public static void main(String[] args) {

        for (int n = 0; n < 100; n+=11) {
            printGrade(n);
            
        }

        for (int n = 99; n > 0; --n) {
            printGrade(n);
            n = n - 10;  
            
            if (n == 1  ) {
              n = 0;
                printGrade (n);
            }
        }
        
        
    }

    private static void printGrade(int n) {
        if (n >= 70 && n <= 100) {
            System.out.println(n + " is A");

        } else if (n >= 60 && n < 70) {
            System.out.println(n + " is B");
        } else if (n >= 50 && n < 60) {
            System.out.println(n + " is C");

        } else if (n >= 40 && n < 50) {
            System.out.println(n + " is D");
        } else {
            System.out.println(n + " is F");
        }
    }

}
