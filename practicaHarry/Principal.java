package practicaHarry;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        personaje1();
        personaje2();
        personaje3();
        personaje4();
        personaje5();
    }

    public static void personaje1(){
        Personaje hermione = new Personaje(0, "Hermione Granger", 'F', "Gryffindor", "Muggle", "Humano", new String[]{"Prefecta", "Madame", "Ministra de Magia"}, "Nutria");
        System.out.println("PRIMER PERSONAJE\n"+hermione.showMessage());
    }

    public static void personaje2(){
        Personaje matias = new Personaje(1, "Matias Gryffindor", 'M', "Slytherin", "Pura", "Humano", new String[]{"Prefecto", "Profesor", "Director", "jefe de magos"}, "San Bernardo");
        System.out.println("SEGUNDO PERSONAJE\n"+matias.showMessage());
    }

    public static void personaje3(){
        Personaje draco = new Personaje(2, "Draco Malfoy", 'M', "Slytherin", "Pura", "Humano", new String[]{"Prefecto", "Buscador", "Mortifago"}, "Ciervo");
        System.out.println("TERCER PERSONAJE\n"+draco.showMessage());
    }

    public static void personaje4(){
        Personaje newton = new Personaje();
        newton.setId(3);
        newton.setNombre("Newton Scamander");
        newton.setGenero('M');
        newton.setCasa("Hufflepuff");
        newton.setSangre("Mestiza");
        newton.setEspecie("Humana");
        newton.setTitulos(new String[]{"Orden de merlin", "Segunda clase"});
        newton.setPatronus("Puercoespin");
        System.out.println("CUARTO PERSONAJE\n"+newton.showMessage());
    }

    public static void personaje5(){
        Personaje harry = new Personaje();
        harry.setId(4);
        harry.setNombre("Harry Potter");
        harry.setCasa("Gryffindor");
        harry.setGenero('M');
        harry.setSangre("Mestiza");
        harry.setEspecie("Humana");
        harry.setTitulos(new String[]{"Capitan", "Buscador", "Auror", "Maestro de la muerte", "Campeon"});
        harry.setPatronus("Ciervo");
        System.out.println("QUINTO PERSONAJE\n"+
                "ID: "+harry.getId()+"\n"
                +"NOMBRE: "+harry.getNombre()+"\n"
                +"GENERO: "+harry.getGenero()+"\n"
                +"CASA: "+harry.getCasa()+"\n"
                +"SANGRE: "+harry.getSangre()+"\n"
                +"ESPECIE: "+harry.getEspecie()+"\n"
                +"TITULOS: "+Arrays.toString(harry.getTitulos())+"\n"
                +"PATRONUS: "+harry.getPatronus()+"\n");
    }
}
