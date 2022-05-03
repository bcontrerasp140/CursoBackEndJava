package practicaMona;

public class Doctocat extends Mona{

    public Doctocat() {
        this.setId(3);
        this.setNombre("Doctocat");
        this.setSkin(new String[]{"Lentes cromados", "Saco amarillo y camisa roja", "Traje laboratorio amarillo", "Pantalon vestir amarillo"});
        this.setFrase("Marty debes regresar en el tiempo");
        System.out.println("Se ha construido una Mona variacion Doctocat");
    }

    public void especialidad(){
        System.out.println("Construir una maquina del tiempo usando un Delorean");
    }


}
