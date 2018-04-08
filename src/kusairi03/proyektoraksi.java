package kusairi03;
public class proyektoraksi {
    public static void main(String[] args) {
        proyektor s = new proyektor();
        s.setJenis("acer");
        s.setMerk("Merah");
        s.setHarga(100000);
        
        s.cetakInfo();
        System.out.print("Jenisnya \t: ");
        System.out.println(s.getJenis());
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        proyektorapple sm = new proyektorapple();
        sm.setJenis("Karet");
        sm.setMerk("Hitam");
        sm.setHarga(10000);
        sm.setproyektorapple("koko");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getproyektorapple());
        sm.throttle();
        
    }
}
