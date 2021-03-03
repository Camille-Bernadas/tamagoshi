package dessin;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.canvas.GraphicsContext;

public abstract class ObjetGraphique extends Shape{
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public ObjetGraphique() {
		this.color = Color.BLACK;
	}

	public ObjetGraphique(Color color) {
		this.color = color;
	}
	
	public boolean visible = true;


	public abstract void dessineToi(GraphicsContext context);

	
	public abstract boolean contient(int a, int b);
}
