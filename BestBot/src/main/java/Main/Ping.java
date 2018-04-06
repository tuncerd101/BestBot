package Main;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class Ping extends Command {

	public Ping() {
		this.name = "ping";
		this.help = "Gives back a Pong";
		this.guildOnly = false;
	}

	@Override
	protected void execute(CommandEvent event) {
		event.getChannel().sendMessage(event.getAuthor().getAsMention() + " Pong").queue();
	}

}
