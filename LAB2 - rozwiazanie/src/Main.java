import java.util.Arrays;;

class FunctionProvider {
    public boolean isPrime(int n) {
        if( n <= 1) return false;

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }

    public int[] getFibonacci(int n) {
        int[] tab = new int[n];
        if(n == 0) return tab;

        tab[0] = 1;
        if(n == 1) return tab;

        tab[1] = 1;

        for(int i=2; i<n; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }

        return tab;
    }

    public int[][] getFibonacciArrays(int[] tab) {
        int[][] result = new int[tab.length][];
        for(int i=0; i<tab.length; i++) {
            result[i] = getFibonacci(tab[i]);
        }

        return result;
    }

    public boolean[][] getPrimeArrays(int n) {
        boolean[][] A = new boolean[n][];
        for(int i=0; i<n; i++) {
            A[i] = new boolean[i+1];
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++)
            {
                A[i][j] = isPrime(i+j);
            }
        }

        return A;
    }

    public void PrintPerson(String s) {
        String[] data = s.split(":");
        System.out.println(data[0].toUpperCase());
        System.out.println(data[1].toLowerCase());
        System.out.println(data[2] + data[3]);

        StringBuilder sb = new StringBuilder();
        sb.append(data[4]);

        int n = sb.length() / 2;
        if(sb.length() % 2 == 0) {
            sb.insert(n, "0");
        } else {
            sb.delete(n, n+1);
        }

        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) {
        // ETAP 1
        FunctionProvider f = new FunctionProvider();

        System.out.println("Etap 1:");
        int[] array = { -12, 0, 1, 2, 4, 123, 199, 21377, 7919 };

        for(int i=0; i < array.length; i++) {
            boolean prime = f.isPrime(array[i]);
            System.out.println(array[i] + " -" + (prime ? "" : " NOT") + " PRIME");
        }

        System.out.println();

        // ETAP 2
        System.out.println("Etap 2:");
        int[] array2 = { 0, 1, 2, 5, 15};
        for (int i: array2) {
            int[] tab = f.getFibonacci(i);
            System.out.print("[ ");
            for(int j=0; j<i; j++)
                System.out.print(tab[j] + " ");
            System.out.println(" ]");
        }
        System.out.println();

        // ETAP 3
        System.out.println("Etap 3:");
        int[] t = {0, 5, 0, 1, 2, 10};
        int[][] fib = f.getFibonacciArrays(t);
        System.out.println(Arrays.deepToString(fib).replace(", [", ",\n["));
        System.out.println();

        // ETAP 4
        System.out.println("Etap 4:");
        boolean[][] p2 = f.getPrimeArrays(10);
        System.out.println(Arrays.deepToString(p2).replace(", [", ",\n["));
        System.out.println();

        // ETAP 5
        System.out.println("Etap 5:");
        String[] data = {
                "Mikołaj:Ryll:Warszawa:Polska:23",
                "Jan:Kowalski:Berlin:Niemcy:112",
                "Hanna:Nowak:Madryt:Hiszpania:6",
        };

        for(String s : data) {
            f.PrintPerson(s);
        }
    }
}
