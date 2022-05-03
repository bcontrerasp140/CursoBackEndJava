package practicaMona;

public class Nictocat extends Mona{
    private String ayudantes = "Duendes";

    public Nictocat() {
        this.setId(6);
        this.setNombre("Nictocat");
        this.setSkin(new String[]{"Gorro navideño", "Barba larga y blanca", "Abrigo polar rojo", "Pantalon polar rojo"});
        this.setFrase("Feliz Navidad");
        System.out.println("Se ha construido una Mona variacion Nictocat");
    }

    public String getAyudantes() {return ayudantes;}

    public boolean setAyudantes(String ayudantes) {
        if(ayudantes.isEmpty()){
            this.ayudantes = ayudantes;
            return true;
        }else
            return false;
    }

    public String show(){
        return super.showMessage();
    }

    public void especialidad(){
        System.out.println("Regalos para todo el mundo en 1 noche");
    }

}
