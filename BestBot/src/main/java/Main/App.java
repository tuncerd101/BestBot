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
<<<<<<< HEAD
		String funktion = objMsg.getContentRaw();
		funktion = funktion.replaceAll(botName + " ", "").toLowerCase();
		
		//int paramter =
		
		
		
		switch(funktion) {
		case 	"help": sendPrivateMessage(objUser, "This is a test!");
				break;	
		case	"ping": objCh.sendMessage(objUser.getAsMention() + "Pong").queue();
				break;
		case	"name": objCh.sendMessage("My name is " + botName + ". I'm here to help!").queue();
				break;
		case	"flip": Methods.coinFlip(objCh);
				break;
		case	"random num": 
				break;
		
=======
		String function = objMsg.getContentRaw();
		function = function.replaceAll(botName + " ", "").toLowerCase();

		switch (function) {
		case "help":
			sendPrivateMessage(objUser, "This is a test!");
			break;
		case "ping":
			objCh.sendMessage(objUser.getAsMention() + "Pong").queue();
			break;
		case "name":
			objCh.sendMessage("My name is " + botName + ". I'm here to help!").queue();
			break;
		case "flip":
			Methods.coinFlip(objCh);
			break;
		case "random num":
			break;

>>>>>>> 6b46e8f3d9cbd48e272479c133247846fd8a7b5e
		}

	}

	private void sendPrivateMessage(User user, final String string) {
		user.openPrivateChannel().queue((channel) -> {
			channel.sendMessage(string).queue();
		});
	}
}
