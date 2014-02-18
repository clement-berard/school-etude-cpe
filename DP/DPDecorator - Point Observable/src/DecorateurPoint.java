import java.util.Observable;

public class DecorateurPoint extends Observable implements PointGraphique {

	private PointGraphique point_g;

	public DecorateurPoint(PointGraphique pg) {

		super();
		this.point_g = pg;

	}

	@Override
	public int getX() {

		return this.point_g.getX();
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.point_g.getY();
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.point_g.setX(x);
		setChanged();
		notifyObservers();
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.point_g.setY(y);
		setChanged();
		notifyObservers();

	}

}
