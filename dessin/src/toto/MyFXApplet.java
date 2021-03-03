package toto;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyFXApplet extends FXApplet {
    // protected fields scene & root are available

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void initApplet() {
        // this method is called once applet has been loaded & JavaFX has been set-up

        Label label = new Label("Hello World!");
        root.getChildren().add(label);

        Rectangle r = new Rectangle(25,25,250,250);
        r.setFill(Color.BLUE);
        root.getChildren().add(r);
    }
}
