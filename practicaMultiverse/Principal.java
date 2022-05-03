package practicaMultiverse;

import classImosh.Dialog;
import classImosh.Screen;

public class Principal {
    public static void main(String[] args) {
        if(porker()){
            if(miles()){
                peni();
            }
        }
    }

    public static boolean porker(){
        Dialog dialog = new Dialog();
        Screen poder;

        Porker porker = new Porker();

        Screen personaje=porker.showDescription();
        personaje.setVisible(true);

        esperar();
        if(dialog.confirm("¿Quieres ver sus poderes?", "")==0){
            poder = porker.marranazo();
            poder.setVisible(true);
            esperar();
            if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                poder.setVisible(false);
                poder = porker.manitas_de_cerdo();
                poder.setVisible(true);
                esperar();
                if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                    poder.setVisible(false);
                    poder = porker.de_eso_nada();
                    poder.setVisible(true);
                    esperar();
                }
            }
        }
        return siguiente(personaje);
    }

    public static boolean miles(){
        Dialog dialog = new Dialog();
        Screen poder;

        Miles miles = new Miles();

        Screen personaje=miles.showDescription();
        personaje.setVisible(true);

        esperar();
        if(dialog.confirm("¿Quieres ver sus poderes?", "")==0){
            poder = miles.curabilidad();
            poder.setVisible(true);
            esperar();
            if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                poder.setVisible(false);
                poder = miles.venom_blast();
                poder.setVisible(true);
                esperar();
                if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                    poder.setVisible(false);
                    poder = miles.hilos_energia();
                    poder.setVisible(true);
                    esperar();
                    if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                        poder.setVisible(false);
                        poder = miles.invisibilidad();
                        poder.setVisible(true);
                        esperar();
                    }
                }
            }
        }
        return siguiente(personaje);
    }

    public static boolean peni(){
        Dialog dialog = new Dialog();
        Screen poder;

        Peni peni = new Peni();

        Screen personaje=peni.showDescription();
        personaje.setVisible(true);

        esperar();
        if(dialog.confirm("¿Quieres ver sus poderes?", "")==0){
            poder = peni.spdr();
            poder.setVisible(true);
            esperar();
            if(dialog.confirm("¿Quieres ver su siguiente poder?", "")==0){
                poder.setVisible(false);
                poder = peni.arco();
                poder.setVisible(true);
                esperar();
                new Dialog().display("Hasta la proxima");
            }
        }
        return true;
    }

    public static boolean siguiente(Screen s){
        if ((new Dialog().readString("¿Quieres ver al siguiente personaje? S/N:")).charAt(0) == 'S') {
            s.setVisible(false);
            return true;
        }else
            s.setVisible(false);
            new Dialog().display("Hasta la proxima");
            return false;
    }
    public static void esperar(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
