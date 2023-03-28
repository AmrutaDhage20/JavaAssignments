//Program for Array using for loop
public class ArrayForClass{

    public static void main (String[] args){

        int[] ageArray = {10,20,30,50,60,80};
        for(int index=0; index<ageArray.length; index++)
        {
            System.out.println("Different numbers are:" + ageArray[index]);
        }
    }
}