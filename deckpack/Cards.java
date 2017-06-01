package deckpack;

public class Cards {
	private String value;
	private String type;
	private String color;
	
	public Cards(String value, String type, String color){
		this.value=value;
		this.type=type;
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String getValue() {
		return value;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString()
	{
		return value+"---"+type+"---"+color;
	}
	
}
