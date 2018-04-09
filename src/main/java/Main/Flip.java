package Main;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class Flip extends Command {

	public Flip() {
		this.name = "flip";
		this.help = "Flips a Coin";
		this.guildOnly = false;
	}

	@Override
	protected void execute(CommandEvent event) {
		int randomNumber = (int) (Math.random() * 2);

		if (randomNumber == 0)
			event.getChannel().sendMessage("Heads").queue();
		else
			event.getChannel().sendMessage("Tails").queue();
	}

}
