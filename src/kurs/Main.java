package kurs;
/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны
уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
(успешно пробежал, не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
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
