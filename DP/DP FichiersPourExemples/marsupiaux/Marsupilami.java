/**
 * 
 * @author Fran�oise PERRIN
 */

public class Marsupilami extends AbstractTreeSleeper  {
	
	public Marsupilami(String name){
		super(name);		
	}
 
	public void setSleepLib() {
		setSleepLong(" vient de s'endormir dans un nid");
		setSleepShort(" endormi");		
	}

	public void setAwakeLib() {
		setSleepLong(" vient de se r�veiller et joue dans l'arbre");
		setSleepShort(" �veill�");	
	}
}
