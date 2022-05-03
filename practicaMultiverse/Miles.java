package practicaMultiverse;

import classImosh.Colors;
import classImosh.Screen;

public class Miles extends Spiderman implements MilesActions{

    public Miles(){
        this.setId(2);
        this.setImagen("imagesMultiverse/miles.gif");
        this.setNombre("Miles Morales");
        this.setAlias("Spider-mam");
        this.setGenero('M');
        this.setEspecie("Humano");
        this.setUniverso("Tierra-TRN700");
        this.setOcupacion("Estudiante");
        System.out.println("Se ha creado un SpiderMan Variacion Miles");
    }
    /*public Miles(int id, String imagen, String nombre, String alias, char genero, String especie, String universo, String ocupacion) {
        super(id, imagen, nombre, alias, genero, especie, universo, ocupacion);
    }*/

    @Override
    public Screen curabilidad() {
        Screen s = new Screen("PODER MILES MORALES");
        s.out("****CURABILIDAD****\nMiles recupera el 100% de su salud\nATAQUE: +0pts\nDEFENSA: -50pts\nCURACION: +100pts\n", "Helvetica", 15, Colors.ReptileGreen);
        s.showImage("imagesMultiverse/miles0.jpg");
        s.setSize(350,485);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen venom_blast() {
        Screen s = new Screen("PODER MILES MORALES");
        s.out("****VEMOM BLAST****\nMiles lanza un golpe de energia\nATAQUE: +230pts\nDEFENSA: -10pts\nCURACION: -5pts\n", "Helvetica", 15, Colors.ReptileGreen);
        s.showImage("imagesMultiverse/miles1.jpg");
        s.setSize(350,485);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen hilos_energia() {
        Screen s = new Screen("PODER MILES MORALES");
        s.out("****HILOS DE ENERGIA****\nMiles inmoviliza a su enemigo\nATAQUE: +5pts\nDEFENSA: +110pts\nCURACION: +15pts\n", "Helvetica", 15, Colors.ReptileGreen);
        s.showImage("imagesMultiverse/miles2.jpg");
        s.setSize(350,485);
        s.setLocationRelativeTo(null);
        return s;
    }

    @Override
    public Screen invisibilidad() {
        Screen s = new Screen("PODER MILES MORALES");
        s.out("****INVISIBILIDAD****\nMiles puede pasar desapercibido\nATAQUE: +0pts\nDEFENSA: +80pts\nCURACION: +25pts\n", "Helvetica", 15, Colors.ReptileGreen);
        s.showImage("imagesMultiverse/miles3.jpg");
        s.setSize(350,485);
        s.setLocationRelativeTo(null);
        return s;
    }
}
