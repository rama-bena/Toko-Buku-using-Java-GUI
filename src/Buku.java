
public class Buku implements Comparable<Buku>{
    //ATRIBUT
    private String judul;
    private String pengarang;
    private int stok;
    private double harga;
    private static double diskon = 0.0;

    //KONSTRUKTOR
    public Buku(String judul, String pengarang, int stok, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.stok = stok;
        this.harga = harga;
    }
    

    //SETTER
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public static void setDiskon(double diskon) {
        Buku.diskon = diskon;
    }
    
    //GETTER
    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public static double getDiskon() {
        return diskon;
    }
   
    
    //METHOD TAMBAHAN
    public void tambahStok(int nilai){
        stok += nilai;
    }
    public void kurangStok(int nilai){
        stok -= nilai;
    }
    public double hargaAkhir(){
        return (harga - (double)(harga*diskon /100.0));
    }

    public String[] toArray(){
        String [] ans = {judul, 
                        pengarang, 
                        Integer.toString(stok),
                        Double.toString(harga),
                        Double.toString(hargaAkhir())};
        return ans;
    }
   
    
    //Comparator
    @Override
    public int compareTo(Buku buku){
        return this.judul.compareTo(buku.getJudul());
    }

    
}
