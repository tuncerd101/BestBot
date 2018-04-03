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
		// Objects
		String botName = event.getJDA().getSelfUser().getAsMention();
		User objUser = event.getAuthor();
		MessageChannel objCh = event.getChannel();
		Message objMsg = event.getMessage();

		String input = objMsg.getContentRaw();
		String function = input.replaceAll(botName + " ", "").toLowerCase();

		// Commands
		if (input.contains(botName)) {
			switch (function) {
			case "help":
				Help.sendPrivateHelpMessage(objUser);
				break;
			case "ping":
				objCh.sendMessage(objUser.getAsMention() + " Pong").queue();
				break;
			case "name":
				objCh.sendMessage("My name is " + botName + ". I'm here to help!").queue();
				break;
			case "random":
				System.out.println("dwd");
				String parameter = input.replace("random ", "");
				Methods.randomNumber(objCh, parameter);
				break;
			case "flip":
				Methods.coinFlip(objCh);
				break;
			case "random num":
				break;
			default:
				objCh.sendMessage(
						"If you need any help than type @BestBot help to get the list of all commands you can use!");
				break;
			}
		}
	}
}
