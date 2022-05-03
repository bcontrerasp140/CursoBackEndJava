package practicaLineUp;

import classImosh.Screen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concierto implements ConciertoActions{
    List<Escenario> escenarios = new ArrayList<Escenario>();

    public void iniciarConcierto(){
        cargarEscenarios();
        for(int i=0;i<escenarios.size();i++){
            escenarios.get(i).start();
        }
    }

    public void cargarEscenarios(){
        int i=-1;
        try {
            InputStream archivo = new FileInputStream("imagesLineUp/lineUpDia1.txt");
            Scanner txt = new Scanner(archivo);
            mostrarHorario(txt.nextLine());
            while (txt.hasNextLine()){
                String h = txt.nextLine();
                if(h.contains("++")){
                    i++;
                    escenarios.add(new Escenario(h.substring(2)));
                }else{
                    escenarios.get(i).setArtista(h.split(":"));
                }
            }
            archivo.close();
            txt.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public void mostrarHorario(String h){
        Screen s = new Screen();
        s.setSize(550,600);
        s.out("Hola headliner, gracias por asistir aun nuevo dia de nuestra edicion Mexico 2022\n A continuacion estan los horarios para ver a tus Djs favoritos\n");
        s.showImage(h,490,290);
        s.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showMessage(){
        for (int i=0;i< escenarios.size();i++){
            System.out.println(escenarios.get(i).getNombre());
            for (int j=0; j< escenarios.get(i).getArtistas().size();j++){
                System.out.println(escenarios.get(i).getArtistas().get(j).getNombre());
                for (int k=0;k<escenarios.get(i).getArtistas().get(j).getCanciones().size();k++){
                    System.out.println(escenarios.get(i).getArtistas().get(j).getCanciones().get(k).getNombre());
                }
            }
        }
    }
}
