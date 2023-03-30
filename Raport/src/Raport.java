public class Raport {
    private String namaSiswa;
    private int mat;
    private int fis;
    private int kim;
    private int bio;
    private String lastUpdateBy;
    public Raport(String namaSiswa, int mat, int fis, int kim, int bio) {
        this.namaSiswa = namaSiswa;
        this.mat = mat;
        this.fis = fis;
        this.kim = kim;
        this.bio = bio;
        this.lastUpdateBy = "";
    }
    public String getNamaSiswa() {
        return namaSiswa;
    }
    public int getMat() {
        return mat;
    }
    public int getFis() {
        return fis;
    }
    public int getKim() {
        return kim;
    }
    public int getBio() {
        return bio;
    }
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }
    public void updateRaport(int mat, int fis, int kim, int bio, String updatedBy) {
        if (lastUpdateBy.isEmpty() || !lastUpdateBy.substring(0, 1).equalsIgnoreCase(updatedBy.substring(0, 1))) {
            this.mat = mat;
            this.fis = fis;
            this.kim = kim;
            this.bio = bio;
            this.lastUpdateBy = updatedBy;
            System.out.println("Raport berhasil diupdate oleh " + updatedBy);
        } else {
            System.out.println("Anda tidak bisa melakukan update pada raport ini");
        }
    }
}