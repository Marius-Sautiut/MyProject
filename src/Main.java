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

        //Tema Lab10 Metoda si Obiecte //
        //1.Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().//
        printMyName();
        sumaADouaNumere();
        impartireaADouaNumere();
        OperatiuneaA();
        OperatiuneaB();
        OperatiuneaC();
        OperatiuneaD();

        //2.Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.//
        System.out.println("rezultatul Adunarii este :" + adunarea(2,3));
        System.out.println("rezultatul Scaderii este :" + scaderea(10,5));
        System.out.println("rezultatul Inmultirii este :" + inmultirea(27,3));
        System.out.println("rezultatul Impartirii este :" + impartirea(1350,70));

        //3.Scrieti o metoda java, care sa afiseze urmatorul model//
        modelJava();

        //4.//

        System.out.println(mediaATreiNumere(10,10,11));

        //5.Scrieti o metoda java, care sa afiseze urmatorul model://
        chipDeOm();

        //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere//
        restulImpartirii();

        //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.//
        System.out.println(celsius(50));

        //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii??
        System.out.println(meters(500));


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

    }

    //Tema Lab10//
    //1.//
    public static void printMyName() {
        System.out.println("Hello \nMarius!");
    }
    public static void sumaADouaNumere(){
        int SumaADouaNumere = 2 + 2;
        System.out.println(SumaADouaNumere);
    }
    public static void impartireaADouaNumere(){
        double ImpartireaADouaNumere = 10/3d;
        System.out.println(ImpartireaADouaNumere);
    }
    public static void OperatiuneaA(){
        int OperatiuneaA = -5 + 8 * 6;
        System.out.println(OperatiuneaA);
    }
    public static void OperatiuneaB(){
        double OperatiuneaB = (55+9) % 9d;
        System.out.println(OperatiuneaB);
    }
    public static void OperatiuneaC(){
        int OperatiuneaC =20 + -3*5 / 8;
        System.out.println(OperatiuneaC);
    }
    public static void OperatiuneaD(){
        double OperatiuneaD = 5 + 15 / 3 * 2 - 8 % 3d;
        System.out.println(OperatiuneaD);
    }

    //2.//
    public static int adunarea(int primulNumar, int alDoileaNumar){
        int rezultat= primulNumar + alDoileaNumar;
        return rezultat;
    }
    public static float scaderea(float primulNumar, float alDoileaNumar){
        float rezultat= primulNumar - alDoileaNumar;
        return rezultat;
    }
    public static float inmultirea(float primulNumar, float alDoileaNumar){
        float rezultat=primulNumar * alDoileaNumar;
        return rezultat;
    }
    public static float impartirea(float primulNumar, float alDoileaNumar){
        float rezultat=primulNumar / alDoileaNumar;
        return rezultat;
    }

    //3.//
    public static void modelJava(){
        System.out.println("    J     a   v     v  a" +
                         "\n    J    a a   v   v  a a" +
                         "\n J  J   aaaaa   V V  aaaaa" +
                         "\n  JJ   a     a   V  a     a"+
                         "\n"
                );

    }

    //4.//

    public static float mediaATreiNumere(float primulNumar, float alDoileaNumar, float alTreileaNumar){
        float rezultat=(primulNumar + alDoileaNumar + alTreileaNumar) / 3;
        return rezultat;
    }



    //5.//
    public static void chipDeOm(){
        System.out.println("  +\" \" \" \" \"+"+
                       "\n[ |  o   o  | ]" +
                       "\n  |    ^    |" +
                       "\n  |  ' _ '  |" +
                       "\n  +_________+"

        );
    }

    //6.//
    public static void restulImpartirii(){
        double restulImpartirii = 100/3d;
        System.out.println(restulImpartirii);
    }

    //7.//
    public static float celsius(float farenheit){
        float rezultat= ((farenheit-32)*5)/9;
        return rezultat;
    }
    //8.//
    public static float meters(float inch){
        float rezultat= (float) (inch * 0.0254);
        return rezultat;
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