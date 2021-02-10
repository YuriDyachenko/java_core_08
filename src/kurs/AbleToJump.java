package kurs;
/*
интерфейс ВОЗМОЖНОСТЬ ПРЫГАТЬ
*/
public interface AbleToJump {

    //получить ограничение по прыжкам
    int getJumpLimit();
    //прыгать, передаем название препятствия для красивого вывода в консоль
    void jump(String what);

}
