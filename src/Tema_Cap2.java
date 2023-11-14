import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tema_Cap2 {

    public static void main(String[] args) {

        // Ex.1 Sa salvam un random number in range-ul 0-100 intr-o variabila si sa compparam daca este mai mare sua mai mic ca input-ul de la tastatura

        Random randomGenerator = new Random();
        int randomGeneratorLimit = 100;

        int numarRandom = randomGenerator.nextInt(randomGeneratorLimit);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar de la tastatura ");
        int numarSlavat = scanner.nextInt();

        if (numarRandom>numarSlavat){
            System.out.println("Numarul random " + numarRandom + " este mai mare decat " + numarSlavat);
        }else {
            System.out.println("Numarul ales " + numarSlavat+ " este mai mare ca nr random " + numarRandom );

        }

        // Ex. 2   Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
        //   -‘a’: adaugare
        //   -‘s’: scadere
        //   -‘i’: inmultire
        //   -‘p’: impartire
        //   -‘m’: modul
        //   Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int primulNumar = input.nextInt();
        System.out.println("Ai introdus numarul " + primulNumar + "\n");

        System.out.println("Introdu al doilea numar: ");
        int alDoileaNumar = input.nextInt();
        System.out.println("Ai introdus numarul " + alDoileaNumar + "\n");

        System.out.println("1. Tasta 'a' pentru suma celor doua numere \n2. Tasta 's' pentru scaderea celor doua numere\n3. Tasta 'i' pentru inmultirea celor doua numere" +
                "4. Tasta 'p' pentru impartirea celor doua numere\n5. Tasta 'm' pentru modulul/restul dintre cele doua numere\n");
        char chooice = input.next().charAt(0);


        switch (chooice){


            case 'a': {
                System.out.println("Suma dintre cele doua numere este: "+ (primulNumar+alDoileaNumar));
            }break;

            case 's': {
                System.out.println("Scaderea dintre cele doua numere este: " + (primulNumar - alDoileaNumar));
            }break;

            case 'i': {
                System.out.println("Inmultirea dintre cele doua numere este: " + (primulNumar*alDoileaNumar));
            }break;

            case 'p': {
                System.out.println("Impartirea dintre cele doua numere este: " + (primulNumar / alDoileaNumar));
            }break;

            case 'm': {
                System.out.println("Modulul/restul dintre cele doua numere este: " + (primulNumar % alDoileaNumar));
            }break;

            default:
                System.out.println("Invalid");

        }

        //Ex 3 Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

        String[][] arrayDimensional = {{"Alex","Andrei","Maria"},{"Dev's","HR","Marketing","Customer","Financial"}};
        System.out.println(arrayDimensional[0][0]);
        System.out.println(arrayDimensional[0][2]);
        System.out.println(arrayDimensional[1][0]);
        System.out.println(arrayDimensional[1][4]);


        //Ex. 4 Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.


        ArrayList<Character> lista = new ArrayList<>();

        lista.add('a');
        lista.add('b');
        lista.add('c');
        lista.add('d');
        lista.add('e');
        lista.add('f');
        lista.add('g');
        lista.add('h');
        lista.add('l');

        for (int i = 0; i < lista.size(); i+=2){

            System.out.println("Valoarea lui " + lista.get(i) + " la indexul " + i);

        }


        //Ex 5 Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”


        ArrayList<Double> listaDouble = new ArrayList<>();

        listaDouble.add(12.12);
        listaDouble.add(4.5);
        listaDouble.add(2.45);
        listaDouble.add(5.67);
        listaDouble.add(1.23);
        listaDouble.add(3d);

        for (int i = 0 ; i < listaDouble.size(); i ++){

            if (listaDouble.get(i) == 4.5){
                System.out.println("Elementul " + listaDouble.get(i)+ " este egal cu 4.5 " + " la indexul " + i);
            }else if (listaDouble.get(i)>5.0){
                System.out.println("Elementul " + listaDouble.get(i)+ " mai mare decat 5 " + " la indexul " + i);
            }

        }


        //Ex 6 Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere). Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.


        ArrayList<String> listaNume = new ArrayList<>();
        listaNume.add("Maria");
        listaNume.add("Alex");
        listaNume.add("Magda");
        listaNume.add("Lucian");
        listaNume.add("Calin");
        listaNume.add("Ionut");
        listaNume.add("Andrei");
        listaNume.add("Marcel");
        listaNume.add("Emi");

        for (int i = 0; i < listaNume.size(); i++){
            if (i == 2) {
                System.out.println("Continue");
                continue;
            }else if (i == 7){
                break;
            }else {
                System.out.println("Index valid");
            }
            System.out.println(listaNume.get(i));
        }

        //7. Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.

        int[] numere = {23,12,1,34,23};
        int suma = 0;

        for (int i = 0; i < numere.length; i++){
            suma = suma + numere[i];
        }

        System.out.println("Suma este = " + suma);


        //8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

        ArrayList<Integer> arraylist = new ArrayList<>();

        Integer [] array = {};

        System.out.println(arraylist.size());
        System.out.println(array.length);

        System.out.println();

        //sau
        if (arraylist.size()==0){
            System.out.println("Lista este goala");
        }

        if (array.length == 0){
            System.out.println("Array-ul este gol");
        }

        System.out.println();

        //or
        System.out.println(arraylist);
        System.out.println(array); //  locul unde e salvat in memorie o sa fie output -ul


        //Ex 9 Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.

        ArrayList<Integer> listaNr = new ArrayList<>();


        listaNr.add(23);
        listaNr.add(12);
        listaNr.add(11);
        listaNr.add(45);
        listaNr.add(2);
        listaNr.add(5);


        Collections.sort(listaNr);
        System.out.println(listaNr);

        Collections.sort(listaNr, Collections.reverseOrder());
        System.out.println(listaNr);



    }


}
