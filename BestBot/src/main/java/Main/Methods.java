package Main;

import net.dv8tion.jda.core.entities.MessageChannel;

public class Methods {

	// generate random number between 0 und max
	public static int randomNumber(int max) {
		int randomNumber = (int) (Math.random() * max);

		return randomNumber;
	}

	// prints a coin flip
	protected static void coinFlip(MessageChannel objCh) {
		int randomNumber = (int) (Math.random() * 2);

		if (randomNumber == 0)
			objCh.sendMessage("Heads").queue();
		else
			objCh.sendMessage("Tails").queue();
	}
}
