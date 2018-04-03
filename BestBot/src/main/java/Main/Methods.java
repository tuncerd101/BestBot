package Main;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;

public class Methods {
	
	// generate random number between 1 und max
	protected static void randomNumber(MessageChannel objCh, Message objMsg) {
		int randomNumber = 0;
		//default wert
		int max = 10;
		
		//TODO muss neue Nachricht einlesen und in max speichern
		
		
		objCh.sendMessage("Max?").queue();
		try {
			max = Integer.parseInt(objMsg.getContentRaw());
		} catch(Exception invalidInput) {
			objCh.sendMessage("Invalid Input.").queue();
			objCh.sendMessage("Using default value: 10.").queue();
		}
			

		
		while(randomNumber == 0) {
			randomNumber = (int) (Math.random() * max);
		}
			
		objCh.sendMessage(Integer.toString(randomNumber)).queue();
		
	}

	// prints a coin flip
	protected static void coinFlip(MessageChannel objCh) {
		int randomNumber = (int) (Math.random() * 2);

		if (randomNumber == 0)
			objCh.sendMessage("Heads").queue();
		else
			objCh.sendMessage("Tails").queue();
	}
<<<<<<< HEAD

	protected static int convertParameter(String toConvert) {
		int parameter = 0;

		return parameter;
	}
=======
>>>>>>> master
}
