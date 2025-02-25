public class Main
{
    public static void main(String[] args) 
    {
        printLetter_S();
        System.out.println();
        printLetter_R();
        System.out.println();
        printLetter_I();
        System.out.println();
        printLetter_P();
        System.out.println();
        printLetter_R();
        System.out.println();
        printLetter_A();
        System.out.println();
        printLetter_S();
        System.out.println();
        printLetter_A();
        System.out.println();
        printLetter_N();
        System.out.println();
        printLetter_N();
        System.out.println();
        printLetter_A();
    }

    public static void printLetter_S()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 2 && j == 2 || i == 2 && j == 3 || i == 4 && j == 1 || i == 4 && j == 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLetter_R()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 2 && j == 2 || i == 4 && j == 3 || i == 5 && j == 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLetter_I()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 2 && (j == 1 || j == 3) || i == 3 && (j == 1 || j == 3) || i == 4 && (j == 1 || j == 3)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLetter_P()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 2 && j == 2 || i == 4 && j == 2 || i == 4 && j == 3 || i == 5 && j == 2 || i == 5 && j == 3) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLetter_A()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 && (j == 1 || j == 3) || i == 2 && j == 2 || i == 4 && j == 2 || i == 5 && j == 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printLetter_N()
    {
        int row = 5;
        int col = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 && j == 2 || i == 5 && j == 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
