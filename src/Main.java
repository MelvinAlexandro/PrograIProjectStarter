import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        DynArray<Product> pda = new DynArray<>();
        FileIO pfio = new FileIO("products.csv");

        //* escribir archivo..
        pda.add(new Product("banana ,",3.25f));
        pda.add(new Product("banana,",3.25f));
        pda.add(new Product("banana,",3.25f));
        pda.add(new Product("banana,",3.25f));

        try {
            pfio.writeProducts(pda);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*/  //leer archivo

        try {
            pda = pfio.readProducts();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //*/

        for (int i = 0; i < pda.getSize(); i++) {
            System.out.println(pda.getItem(i));
        }


    }
}
