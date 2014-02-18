import java.util.ArrayList;

public class CompositeTag implements Tag {

	protected ArrayList<Tag> les_enfants_tag;

	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValeur() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Tag> getLes_enfants_tag() {
		return les_enfants_tag;
	}

	public void setLes_enfants_tag(ArrayList<Tag> les_enfants_tag) {
		this.les_enfants_tag = les_enfants_tag;
	}

}
