import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Typy całkowito liczbowe */

        // 1 bajt [-128, 127]
        byte i1 = 100;

        // 2 bajty
        short i2 = 200;

        // 4 bajty
        int i3 = 400;

        // 8 bajty
        long i4 = 800;

        // Jeżeli przypiszemy do zmiennej wartość poza zakresem, to licznik się przekrąci
        // czyli dla i1 = 128 zapisane zostanie i = -128
        i1 = 127;

        // i1 +=1 to skrócony zapis i1 = i1+1
        i1 += 1;
        System.out.println(i1);


        /* Typy rzeczywiste */

        // 4 bajty, 6-7 cyfr znaczących
        float f1;

        // 8 bajty, 15 cyfr znaczących
        double f2;


        // Można przypisać zmienną mniej dokładną do bardziej dokładnej
        i2 = i1;

        // Odwrotnie nie da się, trzeba użyć rzutowania
        // i1 = i2; <- to się nie uda

        i1 = (byte)i2;


        /* Inne typy */

        char c1 = 'a';
        char c2 = '+';
        char c3 = '\n';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);


        /* Złożone odpowiedniki typów prostych */
        Integer I1, I2;
        int i_1, i_2;

        I1 = new Integer(1);
        I2 = new Integer(1);

        i_1 = 1;
        i_2 = 1;

        System.out.println(I1 == I2); // false
        System.out.println(I1.intValue() == I2.intValue()); //true
        System.out.println(i_1 == i_2); //true


        /* Tablice */

        // Dekleracja -> Alokacja -> Przypisanie

        // tablice są indeksowane od 0
        int[] array1;
        array1 = new int[10];

        int[] array2 = new int[10];
        int array3[] = new int[10];

        int[] array4 = { 0, 7, 8, -12}; // utworzenie tablicy w ten sposób jest możliwe tylko w jednej linijce z deklaracją!

        boolean[] array5 = new boolean[10];
        char[] array6 = new char[10];

        // Tutaj wypisują się wartości domyślne typów
        // liczba -> 0
        // boolean -> false
        // typy referencyjny (String, tablice, klasy) -> null
        System.out.println(array1[0]);
        System.out.println(array4[0]);
        System.out.println(array5[0]);


        /* Tablice dwuwymiarowe */

        int[][] tab_2d_1;
        int tab_2d_2[][];
        int[] tab_2d_3[] = { null, {1, 2, 3}}; // utworzenie tablicy w ten sposób jest możliwe tylko w jednej linijce z deklaracją!

        tab_2d_1 = new int[10][];
        tab_2d_2 = new int[10][5];
        // tab_2d_3 = { null, {1, 2, 3}} <- to się nie uda

        System.out.println(Arrays.deepToString(tab_2d_1));
        System.out.println(Arrays.deepToString(tab_2d_2));
        System.out.println(Arrays.deepToString(tab_2d_3));


        // Napisy i operacje na nich
        // UWAGA: Mimo tego, że String jest klasą, to porównanie == działa jak dla typów prostych, czyli
        // String s1 = new String("aaa");
        // String s2 = new String("aaa");
        // s1 == s2 <- jest prawdą

        String s1 = "asdf asdf";
        String s2 = " ASDF";

        // Konkatenacja
        String s3_1 = s1 + s2;
        String s3_2 = s1.concat(s2);
        System.out.println("S3: " + s3_1);
        System.out.println("S3: " + s3_2);

        // Małe/wielkie litery
        String s4 = s1.toLowerCase();
        System.out.println("S4: " + s4);

        String s5 = s1.toUpperCase();
        System.out.println("S5: " + s5);

        // "Mnożenie" napisów
        String s6 = s1.repeat(2);
        System.out.println("S6: " + s6);

        // Obcinanie znaków białych na początku i końcu (w srodku zostaja)
        String s7 = "  Napis napis     ".trim();
        System.out.println("S7: " + s7);

        // Długość napisu
        int l = s1.length();

        // Podział napisu na kilka napisów
        String[] s_tab = s1.split(" ");
        System.out.println("s_tab: " + Arrays.toString(s_tab));

        // Gdy chcemy zmieniać nasz napis

        StringBuilder sb = new StringBuilder();
        sb.append("0123456789");
        // usuwa [2, 5)
        sb.delete(2, 5);
        System.out.println(sb);

        sb.insert(2, "234");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
