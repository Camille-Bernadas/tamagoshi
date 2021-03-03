package toto;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;

import dessin.Cercle;
import dessin.Rectangle;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;



/**
 * Définit un Canvas qui représente un visage.
 */
public class TotoPane extends BorderPane {
	
    GraphicsContext gc;
    private Canvas canvas;
    
	Point2D centre1;
	Cercle cercle1;
	Button bc1;
	Button bc2;
	Button bc3;
	Button br1;
	

	Point2D centre2;
	Cercle cercle2;
	
	Point2D centre3;
	Cercle cercle3;
	
	Rectangle rectangle;
	

	/**
	 * Appelle l'affichage de toutes les formes
	 */
	public void drawAll(){
		gc.clearRect(0.0, 0.0, 700.0, 700.0);
	
		cercle1.dessineToi(gc);
		cercle2.dessineToi(gc);
		cercle3.dessineToi(gc);
		rectangle.dessineToi(gc);
	}
	
	public void init() {
		centre1 = new Point2D(200,200);
		cercle1 = new Cercle(centre1,100);
		bc1 = new Button("cercle1");
		bc2 = new Button("cercle2");
		bc3 = new Button("cercle3");
		br1 = new Button("rectangle");
		centre2 = new Point2D(160,150);
		cercle2 = new Cercle(centre2,20);
		
		centre3 = new Point2D(240,150);
		cercle3 = new Cercle(centre3,20);
		
		rectangle = new Rectangle(150,220,100,40);
		
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
			
            @Override
            public void handle(MouseEvent t) {
            	
            	int x = (int) t.getSceneX();
            	int y = (int) t.getSceneY();
                
            	if(cercle3.contient(x, y)) {
                	cercle3.changeColor();
                }
                else if(cercle2.contient(x, y)){
                	cercle2.changeColor();
                }
                else if(rectangle.contient(x, y)) {
                	rectangle.changeColor();
                }
                else if(cercle1.contient(x, y)) {
                	cercle1.changeColor();
                }
                
            	
                drawAll();
            }
        });
		
		bc1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                cercle1.setVisibility(!cercle1.getVisibility());
                drawAll();
            }
        });
		
		bc2.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
            	cercle2.setVisibility(!cercle2.getVisibility());
                drawAll();
            }
        });
		
		bc3.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                cercle3.setVisibility(!cercle3.getVisibility());
                drawAll();
            }
        });
		
		br1.setOnAction(new EventHandler<ActionEvent>() {
			 
            @Override
            public void handle(ActionEvent event) {
                rectangle.setVisibility(!rectangle.getVisibility());
                drawAll();
            }
        });
		
		FlowPane buttons = new FlowPane();
		buttons.getChildren().add(bc1);
		buttons.getChildren().add(bc2);
		buttons.getChildren().add(bc3);
		buttons.getChildren().add(br1);
		
		setBottom(buttons);
		
		}

	/**
	 * Appelle le Constructeur par défaut d'un Canvas
	 * @param arg0
	 * @param arg1
	 */
	public TotoPane(double arg0, double arg1) {
		canvas = new Canvas(400,350);
		setCenter(canvas);
		gc = canvas.getGraphicsContext2D();
		init();
		drawAll();
	}
}
