public class Pelanggan implements iSuperMarket{
    public String nama;
    //public String noHp;
    public String Alamat;

    public Pelanggan (String nama, String noHp){
        this.nama = nama;
        //this.noHp = noHp;
        this.Alamat = Alamat;
    }

    @Override
    public void cetakFaktur() {
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }
}