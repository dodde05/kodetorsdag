public class Game {

    public static void main(String[] args){
        Player one = new Player("August");
        System.out.println(one.name + " joined the game");

        Weapon sword = new Weapon("stone sword", 20);
        System.out.println(one.name + " picked up a weapon of type " + sword.getType() + " with damage " + sword.getDamage());
    }

}