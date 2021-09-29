package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloUser {
	public static void main(String[] args) {
		
		//Get user input
		List<String> names = getNameInput();
		
		//First value is name
		String name = names.get(0);
		//Convert first letter to upper case an all other letters to lower case
		name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
		//Output name
		System.out.println("Vards: " + name);
		
		//Second an further values are last names, concatenate all values into variable
		String lastName = "";
		for ( int i = 1; i < names.size(); i++) {
			if (!lastName.isEmpty())
			{
				lastName += " ";
			}
			lastName += names.get(i);
		}
		
		//Convert last name to upper case
		lastName = lastName.toUpperCase();
		//Output last name
		System.out.println("Uzvards: " + lastName);
		
	}
	
	private static List<String> getNameInput()
	{
		System.out.println("Ievadiet vardu un uzvardu(s) atdalitus ar atstarpem");
		
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			//remove leading and trailing spaces
			input = input.strip();
			//Check if input is not blank and contains at least one space
			if (!input.isBlank() && input.indexOf(" ") > 0) {
				//Split string into parts at spaces
				String[] inputParts = input.split("\\s");
				
				//Check if parts array contains at least name and one last name
				if (inputParts.length >= 2)
				{
					//Add  valid parts to result list
					List<String> names = new ArrayList<String>();
					for (int i = 0; i < inputParts.length; i++) {
						if (!inputParts[i].isBlank()) {
							names.add(inputParts[i]);
						}
					}
					
					//Check if result list contains at least name and one last name
					if (names.size() >= 2)
					{
						return names;
					}
				}
			}
			
			System.out.println("Neatbilstosa ievade, ludzu, ievadiet vardu un uzvardu(s) attdalitus ar atstarpi");
			
		}
	}
	
}
