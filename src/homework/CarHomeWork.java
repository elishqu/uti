package homework;

public class CarHomeWork {
    public static void main(String[] args) {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        int isFuel = 9;
        //Проверка двигателя
        boolean isEngine = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean isError = true;
        //Датчики давления шин (4 шт)
        boolean isTire1 = true,
                isTire2 = true,
                isTire3 = true,
                isTire4 = true;

        if (isFuel >= 10 && isEngine && !isError) {
        } else if (isTire1 && isTire2 && isTire3 && isTire4) {
            System.out.println("машина работает");
        } else {
            System.out.println("Машина не работоспособна");
        }
    }


        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
//Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
    }

