package kurs;
/*
интерфейс ВОЗМОЖНОСТЬ БЕГАТЬ
*/
public interface AbleToRun {

    //получить ограничение по бегу
    int getRunLimit();
    //бежать, передаем название препятствия для красивого вывода в консоль
    void run(String what);

}
