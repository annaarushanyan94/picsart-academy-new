package am.picsartacademy.lesson2;

public class BubbleSort {
    public static void main(String[] args) {

        int n = 9;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");

                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");

                }
                System.out.println();

            }

                    int  a = 9;
                    for (int l = a; l > 0; l--) {
                        if (l % 2 != 0) {
                            for (int j = 0; j < (a - l) / 2; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < l; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                }
            }

}




