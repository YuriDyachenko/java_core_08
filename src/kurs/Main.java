package kurs;

public class Main {

    public static void main(String[] args) {
        Participle[] participles = new Participle[6];
        participles[0] = new Man("Иван", 500, 2);
        participles[1] = new Cat("Ананасик", 30, 1);
        participles[2] = new Robot("R2D2", 100);
        participles[3] = new Man("Игорь", 200, 2);
        participles[4] = new Cat("Непоседа", 50, 1);
        participles[5] = new Robot("C3PO", 200);

        Obstructive[] obstructives = new Obstructive[4];
        obstructives[0] = new Treadmill(20);
        obstructives[1] = new Wall(0);
        obstructives[2] = new Treadmill(200);
        obstructives[3] = new Wall(1);

        for (Participle p: participles) {
            System.out.println(p.toString());
            for (Obstructive o: obstructives) {
                if (!o.overcome(p)) {
                    break;
                }
            }
        }
    }
}
