public abstract class Tag {

	public String name;

	public Tag(String name) {
		super();
		this.name = name;
	}
	
	public abstract String getTag();

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}


}
