//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
    В ПРОЕКТЕ СПРЯТАЛАСЬ ОШИБКА - НАЙДИ ЕЕ!
 */
//        Pet petBarsik = new Pet("Барсик");
//        petBarsik.printStatus();  // Начальное состояние
//        petBarsik.feed();        // Кормим
//        petBarsik.play();        // Играем
//        petBarsik.play();        // Играем ещё (устанет)
//        petBarsik.sleep();       // Спит
//        petBarsik.printStatus(); // Проверяем состояние

        Toy ball = new Toy("Мяч", 20);
        Toy mouse = new Toy("Мышь", 15);

        //инициализируем массив объектами
        Toy[] toysFirst = new Toy[3];
        toysFirst[0] = ball;
        toysFirst[1] = mouse;
        toysFirst[3] = new Toy("Носок", 10);

        //сокращенная форма инициализации массива
        Toy[] toys = {ball, mouse, new Toy("Носок", 10)};


        Pet petBarsik = new Pet("Барсик", toys);
        petBarsik.printStatus();

        // Играем с игрушкой
        petBarsik.play(0);  // Играем с мячом (индекс 0)
        petBarsik.printStatus();

        // Пробуем поиграть несуществующей игрушкой
        petBarsik.play(5);  // Ошибка
        petBarsik.printStatus();

        //создаем объекты еды
        Food apple = new Food("Яблоко", 30);
        Food catFood = new Food("Кошачий корм", 50);

        //добавляем еду в инвентарь Барсика
        petBarsik.addFood(apple);
        petBarsik.addFood(catFood);
        petBarsik.printStatus();

        petBarsik.feed(0);  // Съедаем яблоко (индекс 0)
        petBarsik.printStatus();

        petBarsik.feed(5);  // Ошибка
        petBarsik.printStatus();
        petBarsik.feed(-1);
        petBarsik.printStatus();

        petBarsik.play();
        petBarsik.printStatus();

    }
}