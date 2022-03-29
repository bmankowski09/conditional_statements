package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 9;

        if (i < 10) {
            System.out.println("Podana liczba jest mniejsza niz 10");
        } else if (i == 10) {
            System.out.println("Podana liczba jest równa 10");
        } else {
            System.out.println("Podana liczba jest wieksza niz 10");
        }

        /*
        a) zadeklaruj dwie zmienne typu int i przypisz im wartosc
        b) do nowej zmiennej przypisz sume tych dwoch liczba
        c) wyswietl wynik tej operacji na ekran jezeli suma > 10
        d) wyswielt wynik tej operacji na ekran jezeli suma jest rowna 4
        e) jezeli poprzednie warunki nie "zadzialaly" to wyswietl na ekran "ERROR"
         */
        int u = 2, o = 1;
        int suma = u + o;
        if (suma > 10) {
            System.out.println("podaba suma jest wieksza niz 10 = " + suma);
        } else if (suma == 4) {
            System.out.println("Wynik operacji jest rowny 4");
        } else {
            System.out.println("ERROR");
        }

        /*
         * = przypisanie
         * == czy równa się (operator porównania)
         * != czy nie równa się
         * && -> operator AND (logicznie "i", koniunkcja)
         * || -> operator OR (logicznie "lub", alternatywa)
         * % - modulo - reszta z dzielenia
         */

        int a = 4, b = 6;

        //jezeli a jest wieksze od 2 i b jest wieksze od 4 to wypisz "cos" na ekran
        if (a > 2 && b > 4) {
            System.out.println("COS");
        }

        //jezeli a jest wieksze od 5 lub b jest wieksze od 5 to wypisz na ekran "cos1"
        if (a > 5 || b > 5) {
            System.out.println("COS1");
        }

        // Operator "i" (&&) potrzebuje prawdzwiosci wszystkich warunkow
        // Operator "lub" (||) tego nie potrzebuje

        int ocena = 5;
        switch (ocena) {
            case 2:
                System.out.println("Nie zaliczyłeś");
                break;
            case 3:
                System.out.println("Ledwo zdałeś");
                break;
            case 4:
                System.out.println("Zdales dobrze");
                break;
            case 5:
                System.out.println("Zdales bardzo dobrze");
                break;
            default:
                System.out.println("Nierozpoznana ocena");
        }

        // zadeklaruj zmienna ktora bedzie przechowywac nazwe miesiaca (styczen, maj, czerwiec)
        // za pomoca instrukcji switch wypisz pore roku w zaleznosci od miesiaca
        // przyklad -> jezeli twoja zmienna rowna sie styczen to wpisz "ZIMA" itd..

        String nazwaMiesiaca = "Maj";
        switch (nazwaMiesiaca) {
            case "Styczen":
                System.out.println("ZIMA!");
                break;
            case "Maj":
                System.out.println("Cieplej");
                break;
            case "Czerwiec":
                System.out.println("Lato");
                break;
            default:
                System.out.println("Chuj wie w sumie");
        }

        // 5 / 2 = 2 r 1
        System.out.println("Reszta z dzielenia 5 przez 2 wynosi: " + 5 % 2);

        // 10 / 4 = 2 r 2
        System.out.println("Reszta z dzielenia 10 przez 4 wynosi: " + 10 % 4);

        /*
        -> Zeby liczba a byla podzielna przez liczbe b, to reszta z dzielenia a/b musi byc rowna 0
        -> zeby a bylo podzielne prze b, to a%b musi byc rowne 0
         */

        System.out.println("10 jest podzielne prze 2 bo reszta z dzielenia wynosi: " + 10 % 2);

        // Jezeli cos jest parzyste to znaczy ze jest podzielne przez 2 (wynik dzielenia przez 2 nie daje reszty)
        // Jezeli cos jest nieparzyste to znaczy ze nie jest podzielne przez 2 (wynik dzielenia przez 2 daje reszte)

        int k = 5;
        if (k % 2 == 0) {
            System.out.println("K jest parzyste");
        } else if (k % 2 != 0) {
            System.out.println("K nie jest parzyste");
        }
        System.out.println();

        //ZADANKA!

        // 1. Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie) i program wyświetli najmniejsza z nich.
        /*
          2. Zadeklaruj dwie liczby double o różnych wartościach. Napisz instrukcje if else sprawdzającą podane warunki.
          a) jeżeli pierwsza liczba jest większa od drugiej i obie są podzielne przez 2 wypisz na ekran "TAK"
          b) jeżeli piersza liczba jest podzielna przez drugą lub druga jest podzielna przez pierwszą wypisz na ekran "TAK"
          c) jeżeli suma dwóch liczba jest większa od ich iloczynu i pierwsza jest podzielna przez drugą wypisz na ekran "tak"
         */
        // 3. ) Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie). Program ma wyswietlić je posortowane rosnąco
        //4. Przerobić jeszcze raz kod z zajęć nr2 oraz zadanie z zajęć nr1


        // 1. Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie) i program wyświetli najmniejsza z nich.

        System.out.println("Zadanie 1");
        int q = 113, w = 66, e = 61;
        if (q < w && q < e) {
            System.out.println("Najmniejsza liczba to " + q);
        } else if (w < q && w < e) {
            System.out.println("Najmniejsza liczba to " + w);
        } else {
            System.out.println("Najmniejsza liczba to " + e);
        }

        /*
         2. Zadeklaruj dwie liczby double o różnych wartościach. Napisz instrukcje if else sprawdzającą podane warunki.
          a) jeżeli pierwsza liczba jest większa od drugiej i obie są podzielne przez 2 wypisz na ekran "TAK"
          b) jeżeli piersza liczba jest podzielna przez drugą lub druga jest podzielna przez pierwszą wypisz na ekran "TAK"
          c) jeżeli suma dwóch liczba jest większa od ich iloczynu i pierwsza jest podzielna przez drugą wypisz na ekran "tak"
         */

        double a1 = 10.0, a2 = 5.0;
        if ((a1 > a2 && a1 % 2 == 0 && a2 % 2 == 0)) {
            System.out.println("Tak1");
        } else if (a1 % a2 == 0 || a2 % a1 == 0) {
            System.out.println("Tak2");
            // w ostatnim else (tak3) nie moglem dodac else samego wyskakiwal blad < -- nie moze miec zadnych warunkow
        } else if (a1 + a2 > a1 * a2 && (a1 % a2 == 0)) {
            System.out.println("Tak3");
        }


// 3. ) Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie). Program ma wyswietlić je posortowane rosnąco

        int q1 = 1, q2 = 2, q3 = 4;
        if (q1 < q2 && q1 < q3) {
            System.out.println("Pierwsza liczba liczba to " + q1);
        }
        if (q2 > q1 && q2 < q3) {
            System.out.println("Druga liczba to " + q2);
        }
        if (q3 > q1 && q3 > q2) {
            System.out.println("Trzecia liczba to " + q3);
        }

        //4. Przerobić jeszcze raz kod z zajęć nr2 oraz zadanie z zajęć nr1

        // Kod z zajec nr 1

                /*
        1.  a) Zadeklaruj dwie zmienne typu double
            b) w nowych zmiennych przechowaj ich -,+,*,/
            c) Wypisz na ekran (W JEDNEJ LINI UZYWAJAC JEDNEGO SYSO) ich wynik operacji ladnie sformatowany
        2. Zadeklaruj zmienna typu INT oraz typu DOUBLE -> wykonaj na nich wszystkie 4 operacje i wyswietl na ekran
        3. Wypisz na ekran dlugosc Stringa "Ala ma kota!" -> 12
         */

        double zz = 12.0, xx = 2.0;
        double sum = zz + xx, difference = zz - xx, multiplication = zz * xx, division = zz / xx;
        System.out.println("Suma:" + sum + " " + "Roznica:" + difference + " " + "Mnozenie:" + multiplication + " " + "Dzielenie:" + division);

        int cc = 10;
        double vv = 5.0;
        double sumOne = cc + vv, differenceOne = cc - vv, multiplicationOne = cc * vv, divisionOne = cc / vv;
        System.out.println("Suma:" + sumOne + " " + "Roznica:" + differenceOne + " " + "Mnozenie:" + multiplicationOne + " " + "Dzielenie:" + divisionOne);

        String s1 = "Ala ma kota i 2 psy!";
        String s2 = "Janusz tez ma passata";
        System.out.println("Dlugosc stringa to " + s1.length());
        System.out.println("Dlugosc stringa to " + s2.length());

        // Kod z zajec nr 2

        // 1. Napisz program w którym deklarujesz 4 zmienne typu int (różne od siebie) i program wyświetli najwieksza z nich

        int ee = 1, rr = 2, tt = 3, yy = 4;
        if (yy > tt && yy > rr && yy > ee) {
            System.out.println("Najwieksza liczba to " + yy);
        } else if (tt > yy && tt > rr && tt > ee) {
            System.out.println("Najwieksza liczba to " + tt);
        } else if (rr > yy && rr > tt && rr > ee) {
            System.out.println("Najwieksza liczba to " + rr);
        } else
            System.out.println("Najwieksza liczba to " + ee);
                /*
         2. Zadeklaruj dwie liczby double o różnych wartościach. Napisz instrukcje if else sprawdzającą podane warunki.
          a) jeżeli pierwsza liczba jest większa od drugiej i obie są podzielne przez 2 wypisz na ekran "TAK"
          b) jeżeli piersza liczba jest podzielna przez drugą lub druga jest podzielna przez pierwszą wypisz na ekran "TAK"
          c) jeżeli suma dwóch liczba jest większa od ich iloczynu i pierwsza jest podzielna przez drugą wypisz na ekran "tak"
         */

        double z1 = 6, z2 = 12;
        if (z1 > z2 && z1 % 2 == 0 && z2 % 2 == 0) {
            System.out.println("TAK");
        } else if (z1 % z2 == 0 || z2 % z1 == 0) {
            System.out.println("TA");
        } else if (z1 + z2 > z1 * z2 && (z1 % z2 == 0)) {
            System.out.println("TAK!");
        }

        // 3. ) Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie). Program ma wyswietlić je posortowane rosnąco.

        int x1 = 4, x2 = 6, x3 = 8, x4 = 10;
        if (x1 < x2 && x1 < x3 && x1 < x4) {
            System.out.println("Pierwsza liczba liczba to " + x1);
        }
        if (x2 > x1 && x2 < x3 && x2 < x4) {
            System.out.println("Druga liczba to " + x2);
        }
        if (x3 > x1 && x3 > x2 && x3 < x4) {
            System.out.println("Trzecia liczba to " + x3);
        }
        if (x1 < x4 && x4 > x3 && x2 < x4) {
            System.out.println("Czwarta liczba to " + x4);
        }


        //EXTRA ZADANKA

        // 1. Write a Java program to get a number from the user and print whether it is positive or negative
        //Input number: 35
        //Expected Output : Number is positive
        double numer = 35;

        if (numer > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (numer == 0) {
            System.out.println("Liczba jest rowna 0");
        } else {
            System.out.println("Liczba jest ujemna");
        }

        /* 2. Write a Java program to solve quadratic equations (use if, else if and else).
        Test Data
        Input a: 1 Input b: 5 Input c: 1
        Expected Output : The roots are -0.20871215252208009 and -4.7912878474779195
        */

        double m = 1, n = 5, l = 1;
        double root1, root2;

        double determinant = n * n - 4 * m * l; // spr czy wieksze niz 0
        if (determinant > 0) {
            root1 = (-n + Math.sqrt(determinant)) / (2 * m);
            root2 = (-n - Math.sqrt(determinant)) / (2 * m);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (determinant == 0) {  // spr czy jest == 0
            root1 = root2 = -n / (2 * m);
            System.out.format("root1 = root2 = %.2f;", root1);
        } else {
            double real = -n / (2 * m);  // spr czy jest mniejsze niz 0
            double imaginary = Math.sqrt(-determinant) / (2 * m);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
        System.out.println();

            /*
            3. Take three numbers from the user and print the greatest number.
                Test Data
                Input the 1st number: 25
                Input the 2nd number: 78
                Input the 3rd number: 87
                Expected Output : The greatest: 87
             */
        // Wczytanie tekstu do programu
        System.out.println("Wczytaj tekst");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Twoja tekst: " + line);

        // Wczytanie inta do programu
        System.out.println("Wczytaj inta");
        Scanner scannerInt = new Scanner(System.in);
        int value = scannerInt.nextInt();
        System.out.println("Twoj int: " + value);

        System.out.println("Wczytaj inta1");
        Scanner scannerInt1 = new Scanner(System.in);
        int value1 = scannerInt1.nextInt();
        System.out.println("Twoj int1: " + value1);

        System.out.println("Wczytaj inta2");
        Scanner scannerInt2 = new Scanner(System.in);
        int value2 = scannerInt2.nextInt();
        System.out.println("Twoj int1: " + value2);


        int st = 25, nd = 78, rd = 87;

        if (value > value1 && value > value2) {
            System.out.println("Najwieksza liczba to " + value);
        } else if (value1 > value && value1 > value2) {
            System.out.println("Najwieksza liczba to " + value1);
        } else {
            System.out.println("Najwieksza liczba to " + value2);
        }

        /*
            4. Write a Java program that keeps a number from the user and generates an integer
            between 1 and 7 and displays the name of the weekday.
         */
        System.out.println("Wczytaj tekst");
        Scanner scanner3 = new Scanner(System.in);
        String line3 = scanner.nextLine();
        System.out.println("Twoja tekst: " + line3);

        // Wczytanie inta do programu
        System.out.println("Wczytaj inta");
        Scanner scannerInt3 = new Scanner(System.in);
        int dzienTygodnia = scannerInt3.nextInt();
        System.out.println("Twoj int: " + dzienTygodnia);


        if(dzienTygodnia == 1) {
            System.out.println("Poniedzialek");
        } else if(dzienTygodnia == 2) {
            System.out.println("Wtorek");
        } else if(dzienTygodnia == 3) {
            System.out.println("Sroda");
        } else if(dzienTygodnia == 4) {
            System.out.println("Czwartek");
        } else if(dzienTygodnia == 5) {
            System.out.println("Piatek");
        } else if(dzienTygodnia == 6) {
            System.out.println("Sobota");
        } else if(dzienTygodnia == 7) {
            System.out.println("Niedziela");
        } else {
            System.out.println("Prosze wybrac liczbe pomiedzy 1 a 7");
        }
        System.out.println();


    }


}












