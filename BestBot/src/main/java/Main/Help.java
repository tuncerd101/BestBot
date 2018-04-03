package Main;

import net.dv8tion.jda.core.entities.User;

public class Help {
	static void sendPrivateHelpMessage(User user) {
		String[] help = { "help", "ping", "name", "flip" };

		for (int i = 0; i < help.length; i++) {
			String command = help[i];
			user.openPrivateChannel().queue((channel) -> {
				channel.sendMessage(command).queue();
			});
		}
	}
}
