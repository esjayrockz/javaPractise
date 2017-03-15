package com.esjay;



/**
 * Created by Suvajit on 09/02/17.
 */
public class SolutionsAlgoClass {
    public void checkFirstEquation() {
        System.out.println("The solutions of the equation x₁³+x₂³=kx₁x₂ are as follows:");
        for (int k = 1; k <= 10; k++) {
            for (int x1 = 1; x1 <= 100; x1++) {
                for (int x2 = 1; x2 <= 100; x2++) {
                    if ((x1 * x1 * x1) + (x2 * x2 * x2) == k * x1 * x2)
                        System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", Value of k = " + k);
                }

            }


        }
    }

    public void checkSecondEquation() {
        System.out.println("\nThe solutions of the equation x₁³+x₂³+x₃³=kx₁x₂x₃ are as follows:");
        for (int k = 1; k <= 10; k++) {
            for (int x1 = 1; x1 <= 100; x1++) {
                for (int x2 = 1; x2 <= 100; x2++) {
                    for (int x3 = 1; x3 <= 100; x3++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) == k * x1 * x2 * x3)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", Value of k = " + k);
                    }

                }


            }
        }
    }
}