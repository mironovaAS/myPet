import java.util.ArrayList;
import java.util.Random;

public class Pet {
    //параметры = поля = данные
    private String name;     //имя питомца
    private int hunger;      // 0 - сытый, 100 - очень голодный
    private int happiness;   // 0 - грустный, 100 - очень счастливый
    private int energy;      // 0 - спит, 100 - полон сил

    private Toy[] toys;      // инвентарь - игрушки
    private ArrayList<Food> foods; //инвентарь - еда

    //конструкторы
//    public Pet(String name) {
//        this.name = name;
//        this.hunger = 50;
//        this.happiness = 70;
//        this.energy = 80;
//    }

    public Pet(String name, Toy[] toys) {
        this.name = name;
//        this.hunger = 50;
//        this.happiness = 50;
//        this.energy = 80;
        initParam();
        this.toys = toys;
        this.foods = new ArrayList<>();
    }


    //действия = методы

    //случайные стартовые параметры
    private void initParam() {
        Random random = new Random();
        hunger = random.nextInt(101);
        happiness = random.nextInt(101);
        energy = random.nextInt(100) + 1;
    }

    //покормить питомца
    public void feed() {
        hunger -= 30;
        if (hunger < 0) hunger = 0;
        System.out.println(name + " кушает. Ням-ням!");
    }

    // Кормим питомца (удаляем еду из ArrayList)
    public void feed(int foodIndex) {
        if (foodIndex >= 0 && foodIndex < foods.size()) {
            Food food = foods.remove(foodIndex); // Удаляем еду из ArrayList
            hunger -= foods.remove(foodIndex).getFoodEffect();
            if (hunger < 0) hunger = 0;
            System.out.println(name + " съел(а) " + food.getName() + "! Голод: " + hunger);
        } else {
            System.out.println("Неверный индекс для еды!");
        }
    }

    //поиграть с питомцем
    public void play() {
        happiness += 20;
        energy -= 15;
        if (happiness > 100) happiness = 100;
        System.out.println(name + " весело играет!");
    }

    //поиграть с игрушкой
    public void play(int toyIndex) {
        if (toyIndex >= 0 && toyIndex < toys.length && toys[toyIndex] != null) {
            Toy toy = toys[toyIndex];
            happiness += toy.getHappinessEffect();
            if (happiness > 100) happiness = 100;
            energy -= 15;
            System.out.println(name + " играет с игрушкой " + toy.getName() + "! Счастье: " + happiness);
        } else {
            System.out.println("Неверный индекс или игрушка отсутствует!");
        }
    }

    //уложить спать
    public void sleep() {
        energy = 100;
        hunger += 10;
        System.out.println(name + " сладко спит.");
    }

    //выводим текущее состояние питомца
    public void printStatus() {
        System.out.println("\n=== " + name + " ===");
        System.out.println("Голод: " + hunger + "/100");
        System.out.println("Счастье: " + happiness + "/100");
        System.out.println("Энергия: " + energy + "/100");
        System.out.println("Игрушек: " + toys.length);
        System.out.println("Еды в запасах: " + foods.size());
        System.out.println();
    }

    // Добавляем еду в ArrayList
    public void addFood(Food food) {
        foods.add(food);
        System.out.println("Добавлена еда: " + food.getName());
    }




}
