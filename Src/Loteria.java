import java.util.Arrays;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        int[] company = new int[7];
        int[] player = new int[7];
        int rarity = 0;
            Random random = new Random();
        for (int i = 0; i < 7; i++) {
            company[i] = random.nextInt(10);
            player[i] = random.nextInt(10);
        }
        Arrays.sort(company);
        Arrays.sort(player);
            System.out.println("Виграшний білет: " + Arrays.toString(company));
        for (int j = 0; j < 7; j++) {
            if (company[j] == player[j]) {
                rarity++;
            }
        }
            System.out.println("Білет гравця:    " + Arrays.toString(player));
            System.out.println("Кількість збігів: " + rarity);
        if (rarity > 4) {
            System.out.println("Гравець вийграв дім.");
        } else if (rarity == 4) {
            System.out.println("Гравець вийграв телефон.");
        } else {
            System.out.println("Гравець програв.");
        }
    }
}

