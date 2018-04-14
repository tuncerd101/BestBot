package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Settings {
	private static String token;

	public static String getSettings() {
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\Git\\Repo\\BestBot\\Settings\\settings.txt"))) {
			token = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return token;
	}
}
