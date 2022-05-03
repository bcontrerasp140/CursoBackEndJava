package practicaMona;

public class Investocat extends Mona{

    public Investocat() {
        this.setId(5);
        this.setNombre("Investocat");
        this.setSkin(new String[]{"Sombrero PorkPie", "Lentes negros", "Gabardina larga", "Pantalon vestir negro"});
        this.setFrase("Descubrir la verdad");
        System.out.println("Se ha construido una Mona variacion Investocat");
    }

    public String show(){
        return super.showMessage();
    }

    public void especialidad(){
        System.out.println("Resolver casos clasificados como Top Secret");
    }

}
