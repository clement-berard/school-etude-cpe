public class TreeSleeperAdapterMammouth implements ITreeSleeper {

	
	private IElephantidae e;
	
	
	public TreeSleeperAdapterMammouth(IElephantidae e) {
		super();
		this.e = e;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleepInTree() {
		// TODO Auto-generated method stub

	}

	@Override
	public void awakening() {
		// TODO Auto-generated method stub

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

	@Override
	public void setSleepLib() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAwakeLib() {
		// TODO Auto-generated method stub

	}
	
	// méthode spécifique

	@Override
	public String toString() {
		return "Je suis un Elephantide "+e.getName()+", et je peux dormir dans les arbres";
	}
	
	

}
