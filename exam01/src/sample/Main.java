package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {

            BorderPane ventana = new BorderPane();
            Button btnTirar = new Button("Tirar");

            //TODO: ¿Cómo se pone el tipo de evento
            btnTirar.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Boton presionado");
                    Thread hilo = new Thread();

                    hilo hiloInstancia = new hilo();

                    Button iniciar = new Button("iniciar");
                    iniciar.setPrefSize(50,10);
                    Button tirar = new Button("Tirar");
                    TextField dado1 = new TextField();
                    ventana.add(mostar,1,1);
                    TextField dado2 = new TextField();
                    ventana.add(mostar2,1,2);
                    TextField valor3 = new TextField();
                    ventana.add(mostar3,1,3);


                    hiloInstancia.start();

                }
            });

            ventana.setBottom(btnTirar);

            Scene scene = new Scene(ventana,400,400);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}
