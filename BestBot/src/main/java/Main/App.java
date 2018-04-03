package Main;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter {
	public static void main(String[] args) throws Exception {
		JDA jda = new JDABuilder(AccountType.BOT).setToken(Settings.token).buildBlocking();

		jda.addEventListener(new App());
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		// Variables //
		int randomNumber;
		// Objects
		String botName = event.getJDA().getSelfUser().getAsMention();
		User objUser = event.getAuthor();
		MessageChannel objCh = event.getChannel();
		Message objMsg = event.getMessage();

		// Commands
		String input = objMsg.getContentRaw();
		String function = input.replaceAll(botName + " ", "").toLowerCase();

		if(input.contains(botName)) {

			switch (function) {
			case "help":
				sendPrivateMessage(objUser, "This is a test!");
				break;
			case "ping":
				objCh.sendMessage(objUser.getAsMention() + " Pong").queue();
				break;
			case "name":
				objCh.sendMessage("My name is " + botName + ". I'm here to help!").queue();
				break;
			case "random":
				System.out.println("dwd");
				String parameter = function.replace("random ", "");
				Methods.randomNumber(objCh, parameter);
				break;
			case "flip":
				Methods.coinFlip(objCh);
				break;
		
			}
		}

	}

	private void sendPrivateMessage(User user, final String string) {
		user.openPrivateChannel().queue((channel) -> {
			channel.sendMessage(string).queue();
		});
	}
}
