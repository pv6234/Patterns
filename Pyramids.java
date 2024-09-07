class Pyramid_testing {

    public static void main(String[] args) {
        int a = 15, i, j;
        String[][] x = new String[a][a];

        //2-D Array formation
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                x[i][j] = "  ";
            }
        }

        for (i = 0; i < a; i++) {
            for (j = 0; j < i + 1; j++) {
                x[i][j] = "   *";
            }
        }

        //top pyramid
        for (i = 0; i < a; i++) {
            for (j = a - 1; j >= 0; j--) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

        //bottom pyramid
        for (i = a - 2; i >= 0; i--) {
            for (j = a - 1; j >= 0; j--) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
