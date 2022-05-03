package practicaMona;

public class Catstello extends Mona{

    public Catstello() {
        this.setId(2);
        this.setNombre("Carstello");
        this.setSkin(new String[]{"Audifonos", "Lentes negros", "Playera con logo neon", "Jeans mezclilla"});
        this.setFrase("Al ritmo de la musica");
        System.out.println("Se ha construido una Mona variacion Castello");
    }


    public String show(){
        return super.showMessage();
    }

    public void especialidad(){
        System.out.println("Tocar en las mejores fiestas de Ibiza");
    }
}
