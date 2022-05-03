package practicaMona;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\tVERSION #1");
        version1();
        System.out.println("\n\tVERSION #2");
        version2();
        System.out.println("\n\tVERSION #3");
        version3();
        System.out.println("\n\tVERSION #4");
        version4();
        System.out.println("\n\tVERSION #5");
        version5();
        System.out.println("\n\tVERSION #6");
        version6();
    }

    public static void version1(){
        Carlostocat carlostocat = new Carlostocat();
        System.out.println(carlostocat.showMessage()+"ADICIONAL: "+carlostocat.getAdicional());
        System.out.println("ACTIVIDAD");
        carlostocat.especialidad();
    }

    public static void version2(){
        Catstello catstello = new Catstello();
        System.out.println(catstello.show());
        System.out.println("ACTIVIDAD");
        catstello.especialidad();
    }

    public static void version3(){
        Mona doctocat = new Doctocat();
        System.out.println(doctocat.showMessage());
        System.out.println("ACTIVIDAD");
        doctocat.especialidad();
    }

    public static void version4(){
        Mona heisencat = new Heisencat();
        System.out.println(heisencat.showMessage());
        System.out.println("ACTIVIDAD");
        heisencat.especialidad();
    }

    public static void version5(){
        Investocat investocat = new Investocat();
        System.out.println(investocat.show());
        System.out.println("ACTIVIDAD");
        investocat.especialidad();
    }

    public static void version6(){
        Nictocat nictocat = new Nictocat();
        System.out.println(nictocat.show()+"AYUDANTES: "+nictocat.getAyudantes());
        System.out.println("ACTIVIDAD");
        nictocat.especialidad();
    }
}
