public class Main {
    public static void main(String[] args) {
        Raport raport = new Raport("Nawal", 90, 85, 80, 90);
        System.out.println("Nama Siswa: " + raport.getNamaSiswa());
        System.out.println("Nilai Matematika: " + raport.getMat());
        System.out.println("Nilai Fisika: " + raport.getFis());
        System.out.println("Nilai Kimia: " + raport.getKim());
        System.out.println("Nilai Biologi: " + raport.getBio());

        System.out.println();
        // Update nilai raport oleh guru
        System.out.println("Update pertama");
        raport.updateRaport(75, 80, 85, 90, "Ahmad");
        System.out.println("Diubah oleh: " + raport.getLastUpdateBy());

        System.out.println();
        System.out.println("Update kedua (Gagal)");
        // Update nilai raport oleh guru dengan huruf awal yang sama dengan guru sebelumnya
        raport.updateRaport(70, 75, 80, 85, "Andi");
        System.out.println("Diubah oleh: " + raport.getLastUpdateBy());

        System.out.println();
        System.out.println("Update ketiga (Berhasil)");
        // Update nilai raport oleh guru dengan huruf awal yang berbeda dengan guru sebelumnya
        raport.updateRaport(85, 90, 95, 100, "Bisma");
        System.out.println("Diubah oleh: " + raport.getLastUpdateBy());
    }
}