package JavaTest;

public class SpiralPattern {
    //Print a spiral pattern of size n=5.
    static void printSpiralPattern(int size) {
        int row = 0, column = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;
        char move = 'r';
        int[][] matrix = new int[size][size];
        for (int index = 1; index < size * size + 1; index++) {
            matrix[row][column] = index;
            switch (move) {
                case 'r':
                    column += 1;
                    break;
                case 'l':
                    column -= 1;
                    break;
                case 'u':
                    row -= 1;
                    break;
                case 'd':
                    row += 1;
                    break;
            }
            if (index == boundary) {
                boundary = boundary + sizeLeft;
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeLeft -= 1;
                }
                switch (move) {
                    case 'r':
                        move = 'd';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                }
            }
        }
        for (row = 0; row < size; row++) {
            for (column = 0; column < size; column++) {
                int number = matrix[row][column];
                if (number < 10)
                    System.out.print(number + " ");
                else
                    System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int size = 5;
        System.out.println("Spiral Pattern is: \n");
        printSpiralPattern(size);
    }
}