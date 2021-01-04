public class City{
	private String name;
	private String[] connectors;

	public City(String name, String[] connectors){
		this.name = name;
		this.connectors = connectors;
	}

	public String getName(){
		return name;
	}

	public String[] getConnectors(){
		return connectors;
	}
}
