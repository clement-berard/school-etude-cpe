
/**
 * 
 * @author Françoise PERRIN
 */

public abstract class AbstractAnimal implements IAnimal {
	protected String name;
	
	public AbstractAnimal(String name){
		setName(name);
	}	
	public String getName (){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.getClass().getName()+ " " + getName();
	}
}
