import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String jenis;
        Scanner s = new Scanner(System.in);
        System.out.print("Jenis Kendaraan: ");
        jenis = s.next();
        Kendaraan k = new Kendaraan(jenis);
        k.cek();
    }
}
