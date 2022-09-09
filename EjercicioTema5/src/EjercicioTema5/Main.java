package EjercicioTema5;

public class Main {

    static CocheCRUD cocheCRUD  = new CocheCRUDImpl();


    public static void main(String[] args) {

        cocheCRUD.save();
            System.out.println("cocheCRUD.save");


        cocheCRUD.findAll();
            System.out.println("cocheCRUD.findAll");


        cocheCRUD.delete();
            System.out.println("cocheCRUD.delete");
    }
}
