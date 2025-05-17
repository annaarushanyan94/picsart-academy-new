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
       /* int[] n = {3, 1, 5, 2, 4};
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k < n.length; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
                /*if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                     for (int s = 1; s<= (2*i-1); S++) {sout  "*"} */




