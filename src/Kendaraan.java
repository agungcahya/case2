public class Kendaraan {
    String jenis;

    Kendaraan(String jenis){
        this.jenis = jenis;
    }

    public void cek(){
        switch (jenis){
            case "Motor":
                System.out.println("- Area Parkir motor");
                System.out.println("- Area Parkir mobil");
                System.out.println("- Area Parkir bus");
                break;
            case "Mobil":
                System.out.println("- Area Parkir mobil");
                System.out.println("- Area Parkir bus");
                break;
            case "Bus":
                System.out.println("- Area Parkir bus");
                break;
        }
    }
}
