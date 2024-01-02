package second;

public class MetodePembayaran {
   public enum JenisMetodePembayaran{
       Tunai,
       Transfer,
       dana,
   }

   private String nama;
   private JenisMetodePembayaran jenis;
    public MetodePembayaran(String nama,JenisMetodePembayaran jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public JenisMetodePembayaran getJenis() {
        return jenis;
    }
    public void setJenis(JenisMetodePembayaran jenis) {
        this.jenis = jenis;
    }
}