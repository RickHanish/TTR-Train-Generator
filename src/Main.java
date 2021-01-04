import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		ArrayList<City> list = new ArrayList<>();
		try{
			Scanner input = new Scanner(new File("DestinationList.txt"));
			while(input.hasNextLine()){
				String name = input.nextLine();
				int numConnectors = input.nextInt();
				input.nextLine();
				String[] connectors = new String[numConnectors];
				for(int i = 0; i < numConnectors; i++){
					String newCity = input.nextLine();
					connectors[i] = newCity;
				}
				input.nextLine();
//				input.nextLine();
				City dest = new City(name, connectors);
				list.add(dest);
			}
			input.close();
		}
		catch(FileNotFoundException exc){
			System.out.println("Error reading DestinationList.txt\n" + exc.getMessage());
			exc.printStackTrace();
			System.exit(0);
		}
		for(int i = 0; i < 4; i++){ //3 players: pick 5 routes, destroy 4 tracks
			City city1 = list.get((int)(Math.random() * list.size()));
			String city2 = city1.getConnectors()[(int)(Math.random() * city1.getConnectors().length)];
			System.out.println(city1.getName() + " <> " + city2);
		}
	}
}
