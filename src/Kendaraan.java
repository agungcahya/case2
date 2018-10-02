public class Kendaraan {
    String jenis;

    Kendaraan(String jenis){
        this.jenis = jenis;
    }

    public void cek(){
        switch (jenis){
            case "motor":
                System.out.println("- Area Parkir motor");
                System.out.println("- Area Parkir mobil");
                System.out.println("- Area Parkir bus");
                break;
            case "mobil":
                System.out.println("- Area Parkir mobil");
                System.out.println("- Area Parkir bus");
                break;
            case "bus":
                System.out.println("- Area Parkir bus");
                break;
            default:
                System.out.println("Input salah");
        }
    }
}
