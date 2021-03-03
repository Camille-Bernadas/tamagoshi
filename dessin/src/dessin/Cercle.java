package dessin;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cercle extends ObjetGraphique{
	private Point2D centre;
	private int rayon;
	private boolean isVisible = true;
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.ORANGE, Color.WHITE};
	private int currentColor;
	
	public Cercle() {
		super();
		this.rayon = 0;
		this.centre = new Point2D(0,0);
		this.currentColor = 0;
	}


	public Cercle(Point2D centre, int rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}
	public Cercle(Point2D centre, int rayon, Color c) {
		super(c);
		this.centre = centre;
		this.rayon = rayon;
	}
	@Override
	public void dessineToi(GraphicsContext context) {
		if(isVisible) {
			context.setStroke(getColor());
			context.strokeOval(this.centre.getX() - this.rayon, this.centre.getY() - this.rayon, rayon*2, rayon*2);
			
		}
		
	}
	
	public void changeColor() {
		currentColor = (currentColor+1)%6;
		this.setColor(colors[currentColor]);
	}
	
	@Override
	public boolean contient(int a, int b) {
		boolean result = (a - this.centre.getX())*(a - this.centre.getX()) + (b - this.centre.getY())*(b - this.centre.getY()) <= (rayon*rayon);
		return result;
	}
	
	public boolean getVisibility() {
		return isVisible;
	}
	public void setVisibility(boolean newVis) {
		isVisible = newVis;
	}
	
	
}
