import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         // Tema Lab9 Introducere in programare java //

//       // 1.Printati "Hello" in consola, iar pe rand nou, printati numele vostru.//
//
//        System.out.println("Hello \nMarius!");
//
//        //2.Printati rezultatul sumei a doua numere(orice numere)//
//        //System.out.println("Suma a doua numere 2 + 2 este:");//
//        int SumaADouaNumere = 2 + 2;
//        System.out.println(SumaADouaNumere);
//
//        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.//
//        //System.out.println("Impartirea a doua numere 10/3 este:");//
//        double ImpartireaADouaNumere = 10/3d;
//        System.out.println(ImpartireaADouaNumere);
//
//        //4.Printati rezultatul urmatoarelor operatiuni//
//        //a.//
//        int OperatiuneaA = -5 + 8 * 6;
//        System.out.println(OperatiuneaA);
//
//        //b.//
//        double OperatiuneaB = (55+9) % 9d;
//        System.out.println(OperatiuneaB);
//
//        //c.//
//        int OperatiuneaC =20 + -3*5 / 8;
//        System.out.println(OperatiuneaC);
//
//        //d.//
//        double OperatiuneaD = 5 + 15 / 3 * 2 - 8 % 3d;
//        System.out.println(OperatiuneaD);

        Calculator calc = new Calculator();


//        //Tema Lab10 Metoda si Obiecte //
//        //1.Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().//
//        calc.printMyName();
//        calc.sumaADouaNumere();
//        calc.impartireaADouaNumere();
//        calc.OperatiuneaA();
//        calc.OperatiuneaB();
//        calc.OperatiuneaC();
//        calc.OperatiuneaD();
//
//        //2.Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.//
//        System.out.println("rezultatul Adunarii este :" + calc.adunarea(2,3));
//        System.out.println("rezultatul Scaderii este :" + calc.scaderea(10,5));
//        System.out.println("rezultatul Inmultirii este :" + calc.inmultirea(27,3));
//        System.out.println("rezultatul Impartirii este :" + calc.impartirea(1350,70));
//
//        //3.Scrieti o metoda java, care sa afiseze urmatorul model//
//        calc.modelJava();
//
//        //4.//
//
//        System.out.println(calc.mediaATreiNumere(10,10,11));
//
//        //5.Scrieti o metoda java, care sa afiseze urmatorul model://
//        calc.chipDeOm();
//
//        //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere//
//        calc.restulImpartirii();
//
//        //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.//
//        System.out.println(calc.celsius(50));
//
//        //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii??
//        System.out.println(calc.meters(500));

//        //9.//
//        Scanner scanner = new Scanner(System.in);
//
//        float timeSeconds;
//        float mps,kph, mph;
//
//        System.out.print("Input distance in meters: ");
//        float distance = scanner.nextFloat();
//
//        System.out.print("Input hour: ");
//        float hr = scanner.nextFloat();
//
//        System.out.print("Input minutes: ");
//        float min = scanner.nextFloat();
//
//        System.out.print("Input seconds: ");
//        float sec = scanner.nextFloat();
//
//        timeSeconds = (hr*3600) + (min*60) + sec;
//        mps = distance / timeSeconds;
//        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
//        mph = kph / 1.609f;
//
//        System.out.println("Your speed in meters/second is "+mps);
//        System.out.println("Your speed in km/h is "+kph);
//        System.out.println("Your speed in miles/h is "+mph);
//
//
//        scanner.close();



//        int x = 2;
//        int y = 5;
//
//        int z = sum(x, y);
//        System.out.println(z);
//
//        float a = substract(x, y);
//        System.out.println(a);
//
//        float c= divide(x,y);
//        System.out.println(c);
//
//        float d= asterics(x,y);
//        System.out.println(d);

        //TEMA LAB IF / ELSE

//        // Exercitiul 3
        LogicalOperations op = new LogicalOperations();
//        int biggest= op.checkBiggerNumber(4,3);
//        System.out.println("The bigger number is:" + biggest);
//
//        // Exercitiul 4
//        String fastTrack = op.textComparison("FastTrackIT");
//        System.out.println(fastTrack);
//
//        // Exercitiul 5
//        String exercitiulTemaCinci =op.exercitiulCinci("Burger", 5);
//        System.out.println(exercitiulTemaCinci);
//
//        // Exercitiul 6
//        String exercitiulTemaSase =op.exercitiulSase(5);
//        System.out.println(exercitiulTemaSase);
//
//        //Exercitiul 7
//        String exercitiulTemaSapte = op.exercitiulSapte(4);
//        System.out.println(exercitiulTemaSapte);
//
//        //Exercitiul 9
//        boolean exercitiulTemaNoua = op.isNumberEven(22);
//        System.out.println(exercitiulTemaNoua);
//
//        //Exercitiul 10
//        boolean exercitiulTemaZece = op.isEligibleToVote(18);
//        System.out.println(exercitiulTemaZece);
//
//        //Exercitiul 11
//        int exercitiulTemaUnsprezece = op.isGreaterNumber(21,32,8);
//        System.out.println(exercitiulTemaUnsprezece);

        //Tema Java For Loops

//        //Exercitiul 1
//        op.printFromNumberTo100(10);
//
//
//        //Exercitiul 2
//        op.printFromNumberToMinus100(2);

        //Exercitiul 3

//        op.exercitiulTrei(20,30);

        //Exercitiul 5
//        op.evenNumber(1);

        //Exercitiul 6
//        op.oddNumber(1);

        //Exercitiul 7
//            data viitoare

        //Exercitiul 8
        //System.out.println(op.sumCount());

        //Exercitiul 9
        //System.out.println(op.sumAndAverage());

        //Tema While Loop

        //Exercitiul 1

        int first =20;
        int last =30;
        op.printFromFirstToLast(first,last);



    }







//    public static int sum(int first, int second) {
//        int result = first + second;
//        return result;
//    }
//
//    public static float substract(float first, float second){
//        float result = first - second;
//        return result;
//    }
//
//    public static float divide(float first, float second){
//        float result = first / second;
//        return result;
//    }
//
//    public static float asterics(float first, float second){
//        float result = first * second;
//        return result;
//    }

    }