package practicaComic;

import classImosh.Colors;
import classImosh.Screen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Dialogo implements Runnable{
    int tiempo=5000;
    Screen s = new Screen("Dialogos");

    public Dialogo(int tiempo){
        this.tiempo=tiempo;
        s.setLocation(475,0);
        s.setSize(490,710);
    }
    @Override
    public void run() {
        String[] dialogos;
        s.setVisible(true);
        try {
            InputStream archivo = new FileInputStream("imagesComic/dialogos.txt");
            Scanner txt = new Scanner(archivo);
            while (txt.hasNextLine()){
                String d = txt.nextLine();
                if(!d.contains("++")){
                    dialogos = d.split(":");
                }else
                    dialogos=new String[]{};
                mostrarDialogos(dialogos);
            }
            txt.close();
            archivo.close();
        } catch (InterruptedException | IOException ex) {
            ex.printStackTrace();
        }
    }

    public void mostrarDialogos(String[] dialogos) throws InterruptedException {
        Thread.sleep(300);
        if(dialogos.length>0){
            for (int i=0;i<dialogos.length;i++){
                s.out(dialogos[i]+"\n","Helvetica", 15, Colors.RED);
                Thread.sleep(Math.round(tiempo/dialogos.length));
            }
        }else
            Thread.sleep(tiempo);
        s.cls();
    }
}
