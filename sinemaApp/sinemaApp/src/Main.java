//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KayitSistemi kayitSistemi = new KayitSistemi();

        // Müşteriler
        Musteri musteri1 = new Musteri(1, "Ahmet Yılmaz", "ahmet@gmail.com");
        Musteri musteri2 = new Musteri(2, "Ayşe Kaya", "ayse@gmail.com");

        // Filmler
        Film film1 = new Film("Inception", 148, "Bilim Kurgu");
        Film film2 = new Film("Titanic", 195, "Romantik");

        // Salonlar
        Salon salon1 = new Salon(1, "Salon A");
        Salon salon2 = new Salon(2, "Salon B");

        // Kayıt İşlemleri
        kayitSistemi.kayitOl(musteri1);
        kayitSistemi.kayitOl(musteri2);
        kayitSistemi.kayitOl(salon1);
        kayitSistemi.kayitOl(salon2);

        // Salonlara film ekleme
        salon1.filmEkle(film1);
        salon1.filmEkle(film2);

        // Salonlara müşteri ekleme
        salon1.musteriEkle(musteri1);
        salon1.musteriEkle(musteri2);

        // Bilgi Gösterimi
        System.out.println("\n=== Sistem Bilgileri ===");
        kayitSistemi.listele();

        System.out.println("\n=== Salon Detayları ===");
        salon1.bilgiGoster();
    }
}


