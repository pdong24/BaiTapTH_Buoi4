public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        // Ép kiểu Hero về CanSwim để gọi hàm swim()
        CanSwim swimmer = hero;
        swimmer.swim();

        // Ép kiểu Hero về CanFight để gọi hàm fight()
        CanFight fighter = hero;
        fighter.fight();
    }
}