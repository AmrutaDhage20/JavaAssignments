public class TwoDimensionalArray {
    public static void main(String[] args){
        int arrayOfRollNumber[][]={{2, 7, 9}, {3, 6, 1}, {5,4,8}};

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(arrayOfRollNumber[i][j] + " ");
            }
            System.out.println();
        }
    }
}
