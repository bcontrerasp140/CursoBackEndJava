package practicaComic;

import classImosh.Dialog;

public class Principal {
    public static void main(String[] args) {
        int tiempo=obtenerTiempo();
        Grafico hiloGraficos = new Grafico(tiempo);
        hiloGraficos.start();

        Thread hiloDialogos = new Thread(new Dialogo(tiempo));
        hiloDialogos.start();
    }

    public static int obtenerTiempo(){
        return Integer.parseInt(((String) new Dialog().
                readObject("Selecciona los segundos que durara cada pagina",
                        "Tiempo", new Object[] { "05 segundos",
                                "10 segundos",
                                "15 segundos" },1)).substring(0,2))*1000;
    }
}
