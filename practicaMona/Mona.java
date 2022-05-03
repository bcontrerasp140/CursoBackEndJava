package practicaMona;

import java.util.Arrays;

public class Mona {
    private int id=0;
    private String nombre="MonaCat";
    private String[] skin=new String[]{"Nada en cabeza", "Nada en cara", "Nada en torso" , "Nada en piernas"};
    private String frase="Hola soy la mascota de GitHub";

    public int getId() {return id;}

    public String getNombre() {return nombre;}

    public String[] getSkin() {return skin;}

    public String getFrase() {return frase;}

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

    public boolean setSkin(String[] skin) {
        if(skin.length>0){
            this.skin = skin;
            return true;
        }else
            return false;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void especialidad(){
        System.out.println("Mas poder que Barbie");
    }

    public String showMessage(){
        return "ID: "+id+"\n"
                +"NOMBRE: "+nombre+"\n"
                +"SKIN: "+ Arrays.toString(skin)+"\n"
                +"FRASE: "+frase;
    }
}
