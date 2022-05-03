package practicaMultiverse;

import classImosh.Colors;
import classImosh.Screen;

public class Peni extends Spiderman implements PeniActions{

    public Peni(){
        this.setId(1);
        this.setImagen("imagesMultiverse/peni.gif");
        this.setNombre("Peni Parker");
        this.setAlias("SP dr");
        this.setGenero('F');
        this.setEspecie("Humana");
        this.setUniverso("Tierra-TRN704");
        this.setOcupacion("Ingeniera");
        System.out.println("Se ha creado un SpiderMan Variacion Peni");
    }

    @Override
    public Screen arco() {
        Screen s = new Screen("PODER PENI PARKER");
        s.out("****ARCO****\nPeni se logra defender mientra su robot esta incapacitado\nATAQUE: +20pts\nDEFENSA: +110pts\nCURACION: -35pts\n", "Helvetica", 15, Colors.ORANGE);
        s.showImage("imagesMultiverse/peni0.jpg");
        s.setSize(350,350);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen spdr() {
        Screen s = new Screen("PODER PENI PARKER");
        s.out("****SP DR****\nPeni despliega su robot SP-DR\nATAQUE: +250pts\nDEFENSA: +90pts\nCURACION: +65pts\n", "Helvetica", 15, Colors.ORANGE);
        s.showImage("imagesMultiverse/peni1.jpg");
        s.setSize(350,350);
        s.setLocationRelativeTo(null);
        return s;
    }
}
