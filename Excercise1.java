import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        
        float numbers[] = new float[5];  
        float plus = 0;  
        float addition = 0;
        int negativeCount = 0;
        int positiveCount = 0;
        int zero = 0;

        for(int i=0; i<numbers.length;i++ ){
            System.out.print("enter a number: ");
          numbers[i] = entry.nextFloat();
        }

        for(int i =0; i<numbers.length;i++){
           
        if(numbers[i] <= -1){
            plus += numbers[i];
            negativeCount++;
        }else if (numbers[i] >= 1){
             addition += numbers[i];
                positiveCount++;
        }else{
               zero++;
        }
        }


        float averageNegative = ( plus / negativeCount);
        float averagePositive = (  addition /positiveCount);

        if(averageNegative < 0){
            System.out.println("the negative numbers are: " + averageNegative);
        }else{
            System.out.println("dont be a number");
        }

        if(averagePositive > 0){
             System.out.println("the positive numbers are: " + averagePositive);
        }else{
            System.out.println("dont be a number");
        }
            System.out.println("the zero numbers are: " + zero);
    }
}
