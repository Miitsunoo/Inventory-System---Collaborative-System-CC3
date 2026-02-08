public class main {
    public static void main(String[] args) {
        Player player = new Player("XxpotatoxX");
        Item potion = new Item("Health Potion x1");

        player.getInventory().storeItem(potion);

        String output =
			player.identityOfPlayer() + "\n" +
			player.getInventory().identityOfInventory();

		System.out.println(output);
    }
}