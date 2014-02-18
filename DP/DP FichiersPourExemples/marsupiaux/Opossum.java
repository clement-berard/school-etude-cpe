/**
 * 
 * @author Françoise PERRIN
 */


public class Opossum extends AbstractTreeSleeper  {
	public Opossum(String name){
		super(name);		
	}
	
	public void setSleepLib() {
		setSleepLong(" vient de s'endormir accroché par la queue");
		setSleepShort(" endormi");	
	}

	public void setAwakeLib() {
		setSleepLong(" vient de se réveiller et saute dans les branches");
		setSleepShort(" éveillé");	
	}
}
