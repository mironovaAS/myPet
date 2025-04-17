public class Food {
    private String name;
    private int foodEffect; // Насколько уменьшает голод

    public Food(String name, int hungerDecrease) {
        this.name = name;
        this.foodEffect = hungerDecrease;
    }

    // Геттеры - получаем данные из private полей
    public String getName() {
        return name;
    }
    public int getFoodEffect() {
        return foodEffect;
    }
}
