
import java.util.ArrayList;


public class EGram {
    
//    private Buku daftarBuku[] = new Buku[100];
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
  
    //FITUR
    public void tambahBuku(Buku newBuku){
        int indeks = cariJudul(newBuku.getJudul());
        
        if(indeks != -1){ // jika bukunya sudah ada
            daftarBuku.get(indeks).tambahStok(newBuku.getStok());
        }
        else{ // jika tidak ada
            daftarBuku.add(newBuku);
        }
    }
    
    public void cariBuku(String judul){
        int indeks = cariJudul(judul);
        
        if(indeks != -1){ // jika ketemu
            System.out.println(daftarBuku.get(indeks));
        }else{
            System.out.println("Buku yang Anda cari tidak ditemukan");
        }
    }
    
    public void beliBuku(String judul){   
        int indeks = cariJudul(judul);
        
        if(indeks != -1){ // jika bukunya ada
            if(daftarBuku.get(indeks).getStok() != 0){ // stoknya ada
                daftarBuku.get(indeks).kurangStok(1);
                System.out.println("Pembelian buku berhasil");
            }
            else{ // jika stoknya tidak ada
                System.out.println("Buku yang dibeli stoknya habis");
            }
        }
        else{ //jika bukunya tidak ada
            System.out.println("Buku yang anda cari tidak ada");
        }
    }
    
    public void ubahDiskon(double nilaiDiskon){
        Buku.setDiskon(nilaiDiskon);
    }
    
    
    public int getJumlahBuku() {
        return daftarBuku.size();
    }
    
    public void tampilkanDaftarBuku(Double uang){
        daftarBuku.forEach((buku)->{
            if(buku.hargaAkhir() <= uang)
                System.out.println(buku);
        });
    }
    //END OF FITUR
    
    
    //METHOD BANTUAN
    private int cariJudul(String judul){
        for(int i=0; i<daftarBuku.size(); i++){
            if(daftarBuku.get(i).getJudul().equals(judul))
                return daftarBuku.indexOf(daftarBuku.get(i));
        }
        return -1;
    }
    
   
}
