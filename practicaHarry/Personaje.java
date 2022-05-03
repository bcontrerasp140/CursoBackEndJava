package practicaHarry;

import java.util.Arrays;

public class Personaje {
    private int id;
    private String nombre;
    private char genero;
    private String casa;
    private String sangre;
    private String especie;
    private String[] titulos;
    private String patronus;

    public Personaje() {
    }

    public Personaje(int id, String nombre, char genero, String casa, String sangre, String especie, String[] titulos, String patronus) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.sangre = sangre;
        this.especie = especie;
        this.titulos = titulos;
        this.patronus = patronus;
    }

    public int getId() {return id;}

    public String getNombre() {return nombre;}

    public char getGenero() {return genero;}

    public String getCasa() {return casa;}

    public String getSangre() {return sangre;}

    public String getEspecie() {return especie;}

    public String[] getTitulos() {return titulos;}

    public String getPatronus() {return patronus;}

    public boolean setId(int id) {
        if(id>0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty() && nombre.matches("[a-zA-Z ]+")){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(char genero) {
        if(genero=='M' || genero=='F'){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa) {
        if(!casa.isEmpty() && casa.matches("[a-zA-Z]+")){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setSangre(String sangre) {
        if(!sangre.isEmpty() && sangre.matches("[a-zA-Z]+")){
            this.sangre = sangre;
            return true;
        }else
            return false;
    }

    public boolean setEspecie(String especie) {
        if(!especie.isEmpty() && especie.matches("[a-zA-Z]+")){
            this.especie = especie;
            return true;
        }else
            return false;
    }

    public boolean setTitulos(String[] titulos) {
        if(titulos.length>0){
            this.titulos = titulos;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty() && patronus.matches("[a-zA-Z]+")){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "ID: "+id+"\n"
                +"NOMBRE: "+nombre+"\n"
                +"GENERO: "+genero+"\n"
                +"CASA: "+casa+"\n"
                +"SANGRE: "+sangre+"\n"
                +"ESPECIE: "+especie+"\n"
                +"TITULOS: "+Arrays.toString(titulos)+"\n"
                +"PATRONUS: "+patronus+"\n";
    }
}
