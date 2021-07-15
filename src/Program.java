import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String rock = "     ------\n"
				+ "---'   ____)\n"
				+ "      (_____)\n"
				+ "      (_____)\n"
				+ "      (____)\n"
				+ "---.__(___)"
				;
		
		String paper = "    _______\n"
				+ "---'   ____)____\n"
				+ "          ______)\n"
				+ "          _______)\n"
				+ "         _______)\n"
				+ "---.__________)";
		
		
		String scissors = "    _______\n"
				+ "---'   ____)____\n"
				+ "          ______)\n"
				+ "       __________)\n"
				+ "      (____)\n"
				+ "---.__(___)";
		
		
		List<String> images = Arrays.asList(rock,paper,scissors);
	
		System.out.println("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors.\n");
		int user_choice = sc.nextInt();
		System.out.println(images.get(user_choice));
		
		int computer_choice = (int)(Math.random());
		System.out.println();
		System.out.println("Computer choose: ");
		System.out.println();
		System.out.println(images.get(computer_choice));
		System.out.println();
		
		if (user_choice >= 3 || user_choice < 0) {
			System.out.println("You typed an invalid number, you lose!");
		}
		else if(user_choice == 0 && computer_choice == 2) {
			System.out.println("You win!");
		}
		else if(computer_choice == 0 && user_choice == 2) {
			System.out.println("You loose!");
		}
		else if(computer_choice > user_choice) {
			System.out.println("You lose!");
		}
		else if(user_choice > computer_choice) {
			System.out.println("You win!");
		}
		else if(user_choice == computer_choice) {
			System.out.println("It's a draw");
		}
		
		sc.close();
	}

}
