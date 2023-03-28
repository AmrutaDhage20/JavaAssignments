//Program for Two Dimensional Array
public class TwoDimensionalArray{
    public static void main(String[] args){

        int arrayOfRollNumber[][] = {{2, 7, 9}, {3, 6, 1}, {5,4,8}};
        for(int index=0; index<3; index++){
            for (int code=0; code<3; code++){
                System.out.println(arrayOfRollNumber[index][code]+" ");
            }
            System.out.println();
        }
    }
}