package practicaMultiverse;

import classImosh.Colors;
import classImosh.Screen;

public class Porker extends Spiderman implements PorkerActions{

    public Porker(){
        this.setId(1);
        this.setImagen("imagesMultiverse/porker.gif");
        this.setNombre("Peter Porker");
        this.setAlias("Spider-Ham");
        this.setGenero('M');
        this.setEspecie("Porcino");
        this.setUniverso("Tierra-TRN705");
        this.setOcupacion("Reportero");
        System.out.println("Se ha creado un SpiderMan Variacion Porker");
    }
    /*public Porker(int id, String imagen, String nombre, String alias, char genero, String especie, String universo, String ocupacion) {
        super(id, imagen, nombre, alias, genero, especie, universo, ocupacion);
    }*/

    @Override
    public Screen marranazo() {
        Screen s = new Screen("PODER PETER PORKER");
        s.out("****MARRANAZO****\nPorker realiza una ataque de embestida\nATAQUE: +200pts\nDEFENSA: +10pts\nCURACION: -15pts\n", "Helvetica", 15, Colors.RED);
        s.showImage("imagesMultiverse/porker0.jpg");
        s.setSize(275,350);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen manitas_de_cerdo() {
        Screen s = new Screen("PODER PETER PORKER");
        s.out("****MANITAS DE CERDO****\nPorker destruye las defensas del enemigo\nATAQUE: +150pts\nDEFENSA:+20pts\nCURACION: -5pts\n", "Helvetica", 15, Colors.RED);
        s.showImage("imagesMultiverse/porker1.jpg");
        s.setSize(275,350);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen de_eso_nada() {
        Screen s = new Screen("PODER PETER PORKER");
        s.out("****MANITAS DE CERDO****\nPorker manda a la lona al enemigo\nATAQUE: +500pts\nDEFENSA: -10pts\nCURACION: -50pts\n", "Helvetica", 15, Colors.RED);
        s.showImage("imagesMultiverse/porker2.jpg");
        s.setSize(255,325);
        s.setLocationRelativeTo(null);
        return s;
    }
}
