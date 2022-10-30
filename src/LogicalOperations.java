import java.sql.SQLOutput;

public class LogicalOperations {
        //Tema IF/ElSE
//    public int getGreaterNumber(int first, int second) {
//        if (first > second) {
//            return first;
//        } else {
//            return second;
//        }
//    }
//
//    public String textAndNumberComp(String textInput, int numberInput) {
//        if (textInput.equals("FastTrack") && numberInput <= 3) {
//            return textInput + numberInput;
//        } else if (!textInput.equals("FastTrack") && numberInput >= 4) {
//            return numberInput + textInput;
//        } else {
//            return "No condition was met";
//        }
//    }
//
//    public int checkBiggerNumber(int first, int second) {
//        if (first > second) {
//            return first;
//        } else {
//            return second;
//        }
//    }
//
//    public String textComparison(String textInput) {
//        if (textInput.equals("FastTrackIT")) {
//            return "Learning text comparison";
//        } else {
//            return "Got to try some more";
//        }
//    }
//
//    public String exercitiulCinci(String textInput, int number) {
//        if (textInput.equals("FastTrackIT") && number <= 3) {
//            return textInput + number;
//        } else if (!textInput.equals("FastTrackIT") && number >= 4) {
//            return textInput + number;
//        }
//        else{return "None of the above";}
//    }
//
//    public String exercitiulSase(int number){
//        if (number > 8 || number == 6) {
//            return "The amount of snow this winter was(cm):" + number;
//        } else {
//            return "The forecast snow is(cm):" + number;
//        }
//    }
//
//    public String exercitiulSapte(int number){
//    if(number>3 && number !=4){
//        return "The number is greater than 3 and not equal to 4";
//        }
//    else if(number==4){
//        return "The number is equal to 4";
//        }
//    else if(number<3){
//        return"The number is lower than3";
//        }
//    else{
//        return "None of the above";
//        }
//
//    }
//
//    public boolean isNumberEven(int number){
//        if(number %2==0){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public boolean isEligibleToVote(int age){
//        if(age>=18){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public int isGreaterNumber(int numarulUnu, int numarulDoi, int numarulTrei){
//        if(numarulUnu > numarulDoi && numarulUnu > numarulTrei){
//            return numarulUnu;
//        }else if(numarulDoi >numarulUnu && numarulDoi>numarulTrei){
//            return numarulDoi;
//        }else{
//            return numarulTrei;
//        }
//    }
    //Tema for loop

    //Exercitiul 1
    public void printFromNumberTo100(int number){
        for(int i=number;i<=100; i++) {
            System.out.println(i);
        }
    }
//    // Exercitiul 2
    public void printFromNumberToMinus100(int number){
        for(int i=number;i>=-100; i--) {
            System.out.println(i);
        }
    }
        //Ecercitiul 3
    public void exercitiulTrei(int firstNumber, int secondNumber){
        for(int i=firstNumber;i<=secondNumber; i++) System.out.println(i);
    }

    //Exercitiul 5
       public void evenNumber(int number){
           for(int i=number; i<=100;i++){
               if(i%2 ==0){
                   System.out.println(i);
               }
           }
       }




//    //Exercitiul 6
   public void oddNumber(int number){
           for(int i=number; i<=100;i++){
               if(i%2 !=0){
                   System.out.println(i);
               }
           }
       }

    //Exercitiul 7
    public float sumCount(){
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        return (float) sum;
    }


    //Exercitiul 8

    public float sumAndAverage(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum = sum +i;//sau sum +=i  face acelasi lucru
        }
        return sum/100f;
    }
}