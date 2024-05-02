import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PegawaiTetap> listPTep = new ArrayList<>();
        listPTep.add(new PegawaiTetap("Risky","3515027112230004",9000000));
        listPTep.add(new PegawaiTetap("Pandu","3515021934030007",3400000));
        listPTep.add(new PegawaiTetap("Widianto","3515027231810004",5000000));
        
        System.out.println("\n|==============| Daftar Pegawai Tetap |==============|\n");
        for (int i = 0; i < listPTep.size(); i++) {
            PegawaiTetap pTep = listPTep.get(i);
            System.out.println("Nama\t\t: "+pTep.getNama());
            System.out.println("No. KTP\t\t: " + pTep.getNoKTP());
            System.out.println("Upah \t\t: " + pTep.getUpah());
            System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pTep.gaji());
            System.out.println("");
        }
        
        ArrayList<PegawaiHarian> listPHar = new ArrayList<>();
        
        listPHar.add(new PegawaiHarian("Queena","3515021606080001",50000,6));
        listPHar.add(new PegawaiHarian("Nadira","3515022606120008",80000,9));
        listPHar.add(new PegawaiHarian("Sam","3515021237670001",90000,11));
        
        System.out.println("\n|==============| Daftar Pegawai Harian |==============|\n");
        for (int i = 0; i < listPHar.size(); i++) {
            PegawaiHarian pHar = listPHar.get(i);
            System.out.println("Nama\t\t: "+pHar.getNama());
            System.out.println("No. KTP\t\t: " + pHar.getNoKTP());
            System.out.println("Upah Per Jam\t: Rp " + pHar.getUpahPerJam());
            System.out.println("Total Jam Kerja\t: " + pHar.getTotalJam());
            System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pHar.gaji());
            System.out.println("");
        }
         
        ArrayList<Sales> listSales = new ArrayList<>();
            
            listSales.add(new Sales("Charis","357512911040004",55,50000));
            listSales.add(new Sales("Dwi","3575120156830008",19,40000));
            listSales.add(new Sales("Yanto","3575124616790001",50,45000));
            
            System.out.println("\n|==================| Daftar Sales |==================|\n");
            for (int i = 0; i < listSales.size(); i++) {
                Sales pSal = listSales.get(i);
                System.out.println("Nama\t\t: "+pSal.getNama());
                System.out.println("No. KTP\t\t: " + pSal.getNoKTP());
                System.out.println("Total Penjualan\t: " + pSal.getPenjualan());
                System.out.println("Besaran Komisi\t: " + pSal.getKomisi());
                System.out.printf("%s%.0f\n","Pendapatan\t: Rp ",pSal.gaji());
                System.out.println("");
            }
            System.out.println("|=====================================================|\n");
    }
}