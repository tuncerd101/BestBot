package Main;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class randomNumber extends Command {

	public randomNumber() {
		this.name = "random";
		this.help = "Make a decision";
		this.arguments = "<item> <item> ...";
		this.guildOnly = false;
	}

	@Override
	protected void execute(CommandEvent event) {
		if (event.getArgs().isEmpty())
			event.replyWarning("You did not give me an argument!");
		else {
			String[] items = event.getArgs().split("\\s+");

			event.getChannel().sendMessage(items[0]).queue();
		}

	}

}
