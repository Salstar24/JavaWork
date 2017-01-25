public class Door {
	private String name;
	private String hiddenObject;
	
	public void setName(String n) {
		name = n;
	}
	
	public void setHiddenObject(String o) {
		hiddenObject = o;
	}
	
	public String getHiddenObject() {
		return hiddenObject;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}
}