package practicaMona;

public class Heisencat extends Mona{

    public Heisencat() {
        this.setId(4);
        this.setNombre("Heisencat");
        this.setSkin(new String[]{"Mascarilla gas", "Lentes cuadrados", "Traje laboratorio amarillo", "Nada en piernas"});
        this.setFrase("Di mi nombre");
        System.out.println("Se ha construido una Mona variacion Heisencat");
    }

    public void especialidad(){
        System.out.println("Obtener el mayor grado de pureza de su producto");
    }

}
