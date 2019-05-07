package sample;


import javafx.scene.control.TextArea;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class hilo extends Thread {


    @Override
    public void run() {
        System.out.println("Inicio del hilo");
        for (int cont = 1; cont <= 60000; cont++) {
            Random random = new Random();
            IntStream intStream = random.ints(1,1,7);
            Iterator iterator = intStream.iterator();
            IntStream intStream2 = random.ints(1,1,7);
            Iterator iterator1 = intStream2.iterator();
            String n1 = iterator.next().toString();
            String n2 = iterator1.next().toString();
            dado1.setText(n1);
            dado2.setText(n2);
            int suma = Integer.parseInt(n1) + Integer.parseInt(n2);
            System.out.println(suma);
            valor3.setText(String.valueOf(suma));


            if (suma==7){
                Label label13 = new Label("Ya ganaste");
                grid.add(label13,1,4);

            }
        }
        }
    }
}
