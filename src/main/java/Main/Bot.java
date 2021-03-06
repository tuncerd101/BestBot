package Main;

import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter {
	public static void main(String[] args) throws Exception {
		CommandClientBuilder client = new CommandClientBuilder();
		EventWaiter waiter = new EventWaiter();
		String ownerId = "11";
		String token = Settings.getSettings();

		client.setOwnerId(ownerId);
		client.addCommands(new RandomNumber(), new Flip());

		new JDABuilder(AccountType.BOT).setToken(token).addEventListener(waiter).addEventListener(client.build())
				.buildAsync();
	}
}
