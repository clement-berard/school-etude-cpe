import java.util.Observable;
import java.util.Observer;

public class TreeSleeperDecorateObservable implements  ITreeSleeper,IObservable {

	private SujetObservable sujet;
	private ITreeSleeper isleep;

	public TreeSleeperDecorateObservable(ITreeSleeper tree,
			SujetObservable sujet) {
		this.sujet = sujet;
		this.isleep = tree;
	}



	@Override
	public void addObserver(Observer observateur) {
		// TODO Auto-generated method stub
		sujet.addObserver(observateur);
	}

	@Override
	public void notifyObservers(Object o) {
		// TODO Auto-generated method stub
		sujet.notifyObservers(o);

	}

	@Override
	public void setObservable(Observable obs) {
		// TODO Auto-generated method stub
		this.sujet = (SujetObservable) obs;
		sujet.notifyObservers(isleep);
	}

	@Override
	public void setSleepLib() {
		isleep.setSleepLib();
		System.out.println("Changement (observable) il dort");
		
		sujet.notifyObservers();
	}

	@Override
	public void setAwakeLib() {
		isleep.setAwakeLib();
		System.out.println("Changement (observable) il est reveille");
		sujet.notifyObservers();
	}

	@Override
	public String getName() {
		
		return isleep.getName();
	}

	@Override
	public void setName(String name) {
		isleep.setName(name);
	}

	@Override
	public void sleepInTree() {
		setSleepLib();

	}

	@Override
	public void awakening() {
		setAwakeLib();

	}

	@Override
	public String getSleepLong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSleepShort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getSleepState() {
		// TODO Auto-generated method stub
		return false;
	}

}
