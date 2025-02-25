import java.util.Scanner;

class Left {
    public void triangle1() {
        int x = 4;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Right {
    public void triangle2() {
        int x = 4;
        int i, j, k;
        for (i = 0; i < x; i++) {
            for (j = 1; j < x - i; j++) {
                System.out.print("  ");
            }
            for (k = x - (i + 1); k < x; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class right_left_triangle {

    public static void main(String[] args) {
        Left a = new Left();
        a.triangle1();
        System.out.println();
        Right b = new Right();
        b.triangle2();
    }
}
