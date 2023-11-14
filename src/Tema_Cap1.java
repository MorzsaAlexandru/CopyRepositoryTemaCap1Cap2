import java.util.Scanner;

public class Tema_Cap1 {


    public static void main(String[] args) {

        //1. Scrieti un program care afiseaza “Imi place Java”

        System.out.println("Imi place Java");

        //2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”

        System.out.println("1. Cursul acesta este foarte fain!\n" + "2. Cursul acesta este foarte fain!\n" + "3. Cursul acesta este foarte fain!\n" + "4. Cursul acesta este foarte fain!\n" + "5. Cursul acesta este foarte fain!\n" + "6. Cursul acesta este foarte fain!\n");

        //3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.

        int Ana = 24;
        int diferentaDeVarsta = 6;
        int David = (Ana - diferentaDeVarsta);
        System.out.println("Varsta lui David este de " + David + " ani");

        // 4. Scrieti un program in care cititi o propozitie de la tastatura

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o propozitie: ");
        String text = scanner.nextLine();
        System.out.println("Ai introdus propozitia : " + text);


        //5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
        //String si un boolean, apoi apelati metoda din metoda “main”

        myVariables();

        //6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
        //stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.

        citimDeLaTastatura();

        //7. Scrieti un program incare cititi de la tastatura un numar, si
        //calculati:
        //
        //        - rezultatul sumei cu 5
        //
        //        - rezultatul scaderii cu 12.3
        //
        //        - rezultatul inmultirii cu -3.2
        //
        //        - rezultatul impartirii cu 4
        //
        //        - rezultatul modulului cu 6

        Scanner enter = new Scanner(System.in);

        System.out.println("Introdu un numar de la tastatura: ");
        int numarTastatura = enter.nextInt();

        System.out.println("Suma numarului introdus " + numarTastatura + " cu 5 este " + (numarTastatura + 5));

        System.out.println("Scaderea numarului introdus " + numarTastatura + " cu 12.3 este " +  (numarTastatura - 12.3));

        System.out.println("Inmultirea numarului introdus " + numarTastatura + " cu -3.2 este " +  (numarTastatura * -3.2));

        System.out.println("Impartirea numarului introdu " + numarTastatura + " cu 4 este " + (numarTastatura / 4));

        System.out.println("Modulul numarului introdus " + numarTastatura + " cu 6 este " +  (numarTastatura % 6));



        //8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
        //fie 12 si 2:
        //
        //public class Solution {
        //
        //                        public static void main(String[] args) {
        //
        //                                    int x = 2;
        //
        //                                    int y = 12;
        //
        //
        //
        //                                    // y = x * y;
        //
        //                                    // y = x + y;
        //
        //
        //
        //                                    x = y - x;
        //
        //                                    y = y - x;
        //
        //
        //
        //                                    System.out.println(x);
        //
        //                                    System.out.println(y);
        //
        //                        }

        solution();

    }

    public static void solution() {

        int x = 2;

        int y = 12;


        //         y = x * y;

        y = x + y; // y = 2 + 12 = 14  -> y = 14


        x = y - x; // x = 14-2 = 12     -> x = 12

        y = y - x; // y = 14 - 12 = 2  -> y = 2


        System.out.println(x);

        System.out.println(y);

    }

    public static void citimDeLaTastatura(){
        Scanner enter = new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int numarTastatura = enter.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int numarTastatura2 = enter.nextInt();

        System.out.println("Primul numar: " + numarTastatura);
        System.out.println("Al doilea numar: " + numarTastatura2);

    }

    public static void myVariables () {

        int a = 2;
        String b = "Ana";
        boolean c = true;

        System.out.println(a + "\n" + b + "\n" + c + "\n");
    }
}
