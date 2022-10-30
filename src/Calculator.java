public class Calculator {

    public void printMyName() {
        System.out.println("Hello \nMarius!");
    }

    public void sumaADouaNumere() {
        int SumaADouaNumere = 2 + 2;
        System.out.println(SumaADouaNumere);
    }

    public void impartireaADouaNumere() {
        double ImpartireaADouaNumere = 10 / 3d;
        System.out.println(ImpartireaADouaNumere);
    }

    public void OperatiuneaA() {
        int OperatiuneaA = -5 + 8 * 6;
        System.out.println(OperatiuneaA);
    }

    public void OperatiuneaB() {
        double OperatiuneaB = (55 + 9) % 9d;
        System.out.println(OperatiuneaB);
    }

    public void OperatiuneaC() {
        int OperatiuneaC = 20 + -3 * 5 / 8;
        System.out.println(OperatiuneaC);
    }

    public void OperatiuneaD() {
        double OperatiuneaD = 5 + 15 / 3 * 2 - 8 % 3d;
        System.out.println(OperatiuneaD);
    }

    //2.//
    public int adunarea(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public float scaderea(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public float inmultirea(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public float impartirea(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    //3.//
    public void modelJava() {
        System.out.println("    J     a   v     v  a" +
                "\n    J    a a   v   v  a a" +
                "\n J  J   aaaaa   V V  aaaaa" +
                "\n  JJ   a     a   V  a     a" +
                "\n"
        );

    }

    //4.//

    public float mediaATreiNumere(float primulNumar, float alDoileaNumar, float alTreileaNumar) {
        float rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / 3;
        return rezultat;
    }


    //5.//
    public void chipDeOm() {
        System.out.println("  +\" \" \" \" \"+" +
                "\n[ |  o   o  | ]" +
                "\n  |    ^    |" +
                "\n  |  ' _ '  |" +
                "\n  +_________+"

        );
    }

    //6.//
    public void restulImpartirii() {
        double restulImpartirii = 100 / 3d;
        System.out.println(restulImpartirii);
    }

    //7.//
    public float celsius(float farenheit) {
        float rezultat = ((farenheit - 32) * 5) / 9;
        return rezultat;
    }

    //8.//
    public float meters(float inch) {
        float rezultat = (float) (inch * 0.0254);
        return rezultat;
    }


}