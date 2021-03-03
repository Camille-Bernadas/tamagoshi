package dessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Point2D;

public class Rectangle extends ObjetGraphique{
	private Rectangle2D rectangle;
	private boolean isVisible = true;
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.ORANGE, Color.WHITE};
	private int currentColor;
	
	public Rectangle() {
		super();
		this.rectangle = new Rectangle2D(0, 0, 0, 0);
		currentColor = 0;
	}
	
	public Rectangle(int x, int y, int largeur, int hauteur) {
		super();
		this.rectangle = new Rectangle2D(x, y, largeur, hauteur);
	}

	public Rectangle(Point2D p, int largeur, int hauteur) {
		super();
		this.rectangle = new Rectangle2D(p.getX(), p.getY(), largeur, hauteur);
	}
	
	public Rectangle(Point2D p, int largeur, int hauteur, Color c) {
		super(c);
		this.rectangle = new Rectangle2D(p.getX(), p.getY(), largeur, hauteur);
	}
	

	public void dessineToi(GraphicsContext context) {
		if(isVisible) {
			context.setFill(getColor());
			context.fillRect(this.rectangle.getMinX(), this.rectangle.getMinY(), this.rectangle.getWidth(), this.rectangle.getHeight());
		}
	}
	
	public void changeColor() {
		currentColor = (currentColor+1)%6;
		this.setColor(colors[currentColor]);
	}

	public boolean contient(int a, int b) {
		return this.rectangle.contains(Double.valueOf(a).doubleValue(),Double.valueOf(b).doubleValue());
	}
	
	public boolean getVisibility() {
		return isVisible;
	}
	public void setVisibility(boolean newVis) {
		isVisible = newVis;
	}

}
