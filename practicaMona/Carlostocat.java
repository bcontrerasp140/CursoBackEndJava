package practicaMona;

public class Carlostocat extends Mona{
    private String adicional="Cangurera";

    public Carlostocat() {
        this.setId(1);
        this.setNombre("Carlostocat");
        this.setSkin(new String[]{"Gorro blanco", "Lentes de sol ambar", "Playera azul", "Pañal"});
        this.setFrase("¿Que paso ayer?");
        System.out.println("Se ha construido una Mona variacion Carlostocat");
    }

    public String getAdicional() {
        return adicional;
    }

    public boolean setAdicional(String adicional) {
        if(adicional.isEmpty()){
            this.adicional = adicional;
            return true;
        }else
            return false;
    }

    public void especialidad(){
        System.out.println("Acompañar a Alan en su travesia en las Vegas");
    }

}
