package com.esjay;

/**
 * Created by Suvajit on 16/03/17.
 */
public class SolutionsAlgoAssignment2 {

    public void checkFirstEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

    public void checkSecondEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = 2x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == 2 * x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

    public void checkThirdEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = 3x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == 3 * x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

    public void checkFourthEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = 4x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == 4 * x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

    public void checkFifthEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = 5x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == 5 * x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

    public void checkSixthEquation() {
        System.out.println("The solutions of the equation x1³+x2³+ x3³+x4³ = 6x1x2x3x4 are as follows:");

        for (int x1 = 1; x1 <= 100; x1++) {
            for (int x2 = 1; x2 <= 100; x2++) {
                for (int x3 = 1; x3 <= 100; x3++) {
                    for (int x4 = 1; x4 <= 100; x4++) {
                        if ((x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) + (x4 * x4 * x4) == 6 * x1 * x2 * x3 * x4)
                            System.out.println("x1 = " + x1 + ", x2 =" + x2 + ", x3 =" + x3 + ", x4 =" + x4);
                    }
                }

            }

        }
    }

}
