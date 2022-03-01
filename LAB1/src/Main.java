// Deklaracja klasy
class Cat {
    // Pola klasy
    // public - dostepne poza klasa
    // private - niedostepne poza klasa

    public String Name;
    public int Age;
    private String SecretName = "Sekretne imie";

    // Metody klasy
    public void DajGlos() {
        System.out.println(Name);
    }

    public String DajSekretnyGlos() {
        return SecretName;
    }
}

class Complex {
    public double re;
    public double im;

    public Complex Plus(Complex c) {
        Complex result = new Complex();
        result.re = re + c.re;
        result.im = im + c.im;
        return result;
    }

    public Complex Multiply(Complex c) {
        Complex result = new Complex();
        result.re = re * c.re - im * c.im;
        result.im = re * c.im + im * c.re;
        return result;
    }
}

class Human {
    public String Name;
    public String Surname;

    public void Introduce() {
        System.out.println("My name is " + Name + " " + Surname);
    }
}

public class Main {
    public static void main(String[] args) {
        // podstawowe typy zmiennych
        int a = 1;
        float b = 1.54f;
        double c = 1.75;
        String d = "Napis";
        boolean f = false;

        // skladnia if'a - instrukcji warunkowej
        if(f) {
            System.out.println("F jest prawda");
        } else {
            System.out.println("F jest falszem");
        }

        // skladnia petli for, odpowiednim pythonowego:
        // for i in range(1, 10):
        for(int i=1; i<10; i++) {
            System.out.println(i);
        }

        // Utworzenie obiektu klasy Cat
        Cat e = new Cat();
        e.Name = "Filemon";

        // DajGlos zwraca void (typ "nic"), wiec mozemy ja wykonac, ale nie mozemy przypisac do zmiennej
        e.DajGlos();

        // DajSekretnyGlos zwraca String, wiec mozemy wynik funkcji przypisac do zmiennej typu String
        String secretName = e.DajSekretnyGlos();
        System.out.println(secretName);

        // Utworzenie obiektow klasy Complex
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.re = 1;
        c1.im = 2;

        c2.re = 3;
        c2.im = 4;

        // Multiply zwraca typ Complex, wiec mozemy przypisac jej wynik do zmiennej typu Complex
        Complex c3 = c1.Multiply(c2);

        System.out.print("(");
        System.out.print(c3.re);
        System.out.print(",");
        System.out.print(c3.im);
        System.out.print(")");

        Human h = new Human();
        h.Name = "Mikolaj";
        h.Surname = "Ryll";
        h.Introduce();
    }
}
