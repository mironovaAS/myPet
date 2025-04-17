public class Toy {
    private String name;
    private int happinessEffect; // Насколько увеличивает счастье

    public Toy(String name, int happinessIncrease) {
        this.name = name;
        this.happinessEffect = happinessIncrease;
    }

    // Геттеры - получаем данные из private полей
    public String getName() {
        return name;
    }
    public int getHappinessEffect() {
        return happinessEffect;
    }
}
