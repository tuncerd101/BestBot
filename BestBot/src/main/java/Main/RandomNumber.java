package Main;

import org.apache.commons.lang3.StringUtils;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class RandomNumber extends Command {

	public RandomNumber() {
		this.name = "random";
		this.help = "Make a decision";
		this.arguments = "<number>";
		this.guildOnly = false;
	}

	@Override
	protected void execute(CommandEvent event) {
		if (event.getArgs().isEmpty())
			event.replyWarning("You did not give me an argument!");
		else {
			String[] items = event.getArgs().split("\\s+");

			int randomnumber = 0;

			if (StringUtils.isNumeric(items[0]) == true) {
				int max = Integer.parseInt(items[0]);
				// solange neue zahl bis != 0
				while (randomnumber == 0) {
					randomnumber = (int) (Math.random() * max);
				}
				event.getChannel().sendMessage(Integer.toString(randomnumber)).queue();

			} else {
				event.getChannel().sendMessage("Invalid Parameter.").queue();
			}

		}
	}
}
