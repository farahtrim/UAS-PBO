package last;
import first.ListHarga;
import second.AwalData;
import second.Data;

public class Main {
    public static void main(String [] args){
        ListHarga farah = new ListHarga();
        Data trim = new Data();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                       KOST MAMI ROHIMAH                         |");
        System.out.println("-------------------------------------------------------------------");
        farah.daftar();
        trim.harga();
        trim.data();
        trim.output();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                          TERIMAKASIH                            |");
        System.out.println("-------------------------------------------------------------------");
    }
}
