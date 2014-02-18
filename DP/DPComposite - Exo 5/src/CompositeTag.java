import java.util.ArrayList;

public class CompositeTag extends Tag {

	protected ArrayList<Tag> les_enfants_tag = new ArrayList<>();

	public CompositeTag(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param t
	 */
	public void ajouter(Tag t) {
		this.les_enfants_tag.add(t);
	}

	public void retirer(Tag t) {
		this.les_enfants_tag.remove(t);
	}

	public ArrayList<Tag> getLes_enfants_tag() {
		return les_enfants_tag;
	}

	public void setLes_enfants_tag(ArrayList<Tag> les_enfants_tag) {
		this.les_enfants_tag = les_enfants_tag;
	}

	@Override
	public String getTag() {
		System.out.println("C'est un dossier :  " + this.name);
		return this.name;
	}

}
