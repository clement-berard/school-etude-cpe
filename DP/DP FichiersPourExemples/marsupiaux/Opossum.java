/**
 * 
 * @author Fran�oise PERRIN
 */


public class Opossum extends AbstractTreeSleeper  {
	public Opossum(String name){
		super(name);		
	}
	
	public void setSleepLib() {
		setSleepLong(" vient de s'endormir accroch� par la queue");
		setSleepShort(" endormi");	
	}

	public void setAwakeLib() {
		setSleepLong(" vient de se r�veiller et saute dans les branches");
		setSleepShort(" �veill�");	
	}
}
