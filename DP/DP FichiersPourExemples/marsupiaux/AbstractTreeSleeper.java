/**
 * 
 * @author Françoise PERRIN
 */

public abstract class AbstractTreeSleeper extends AbstractAnimal implements ITreeSleeper{
	
	protected String sleepLong;	    // libellé long du mode de sommeil	
	protected String sleepShort;	// libellé court du mode de sommeil	
	protected boolean sleepState;	// awake/sleep	
	
	// Méthodes différées pour mettre à jour les libellés de mode de sommeil
	// dans les classes dérivées
	public abstract void setSleepLib();
	public abstract void setAwakeLib();
	
	AbstractTreeSleeper(IAnimal animal){	
		super(animal.getName());
		setSleepState(true);	
		setSleepShort(" éveillé");
	}
	
	AbstractTreeSleeper(String name){	
		super(name);
		setSleepState(true);
		setSleepShort(" éveillé");
	}
	
	public void sleepInTree() {		// template method
		setSleepState(!getSleepState());
		setSleepLib();
	}

	public void awakening() {
		setSleepState(!getSleepState());
		setAwakeLib();
	}

	public String getSleepLong() {
		return sleepLong;
	}

	public void setSleepLong(String sleepLong) {
		this.sleepLong = sleepLong;
	}

	public String getSleepShort() {
		return sleepShort;
	}

	public void setSleepShort(String sleepShort) {
		this.sleepShort = sleepShort;
	}

	public boolean getSleepState() {
		return sleepState;
	}

	public void setSleepState(boolean sleepState) {
		this.sleepState = sleepState;
	}

}
