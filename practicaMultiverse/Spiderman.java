package practicaMultiverse;

import classImosh.Colors;
import classImosh.Screen;

public class Spiderman {
    private int id;
    private String imagen;
    private String nombre;
    private String alias;
    private char genero;
    private String especie;
    private String universo;
    private String ocupacion;

    public Spiderman(int id, String imagen, String nombre, String alias, char genero, String especie, String universo, String ocupacion) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.especie = especie;
        this.universo = universo;
        this.ocupacion = ocupacion;
    }

    public Spiderman() {

    }

    public int getId() {return id;}

    public String getImagen() {return imagen;}

    public String getNombre() {return nombre;}

    public String getAlias() {return alias;}

    public char getGenero() {return genero;}

    public String getEspecie() {return especie;}

    public String getUniverso() {return universo;}

    public String getOcupacion() {return ocupacion;}

    public void setId(int id) {
        this.id = id;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Screen showDescription(){
        Screen s = new Screen("VARIACION SPIDER-MAN");
        s.out(showMessage()+"\n", "Helvetica", 18, Colors.BLUE);
        s.showImage(imagen);
        s.setSize(500,600);
        s.setLocationRelativeTo(null);
        return s;
    }
    public String showMessage(){
        return "ID: "+id+"\n"
                +"NOMBRE: "+nombre+"\n"
                +"ALIAS: "+alias+"\n"
                +"GENERO: "+genero+"\n"
                +"ESPECIE: "+especie+"\n"
                +"UNIVERSO: "+universo+"\n"
                +"OCUPACION: "+ocupacion+"\n";
    }

}
