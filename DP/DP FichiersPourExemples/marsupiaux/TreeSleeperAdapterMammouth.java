public class TreeSleeperAdapterMammouth extends AbstractTreeSleeper{

	
	private IElephantidae e;
	
	
	public TreeSleeperAdapterMammouth(IElephantidae e) {
		super(e);
		this.e = e;
	}

	
	
	// méthode spécifique

	@Override
	public String toString() {
		return "Je suis un Elephantide "+e.getName()+", et je peux dormir dans les arbres";
	}



	@Override
	public void setSleepLib() {
		sleepState = true;
		System.out.println(" dodo");
		
	}



	@Override
	public void setAwakeLib() {
		sleepState = false;
		System.out.println(" reveille");
		
	}
	
	

}
