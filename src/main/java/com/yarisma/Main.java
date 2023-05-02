package com.yarisma;

import com.yarisma.controller.KullaniciController;
import com.yarisma.controller.YarismaController;
import com.yarisma.controller.YarismaKatilimController;
import com.yarisma.entity.Kullanici;
import com.yarisma.entity.Yarisma;

import java.time.LocalDate;

public class Main {
    public static KullaniciController kullaniciController;
    public static YarismaController yarismaController;
    public static YarismaKatilimController yarismaKatilimController;

    public static void main(String[] args) {

        kullaniciController = new KullaniciController();
        yarismaController = new YarismaController();
        yarismaKatilimController = new YarismaKatilimController();

        // tüm metodlar aşağıda yer alıyor. önce verileriOluştur() çalıştırıp
        // sonra aşağıdaki diğer 3 metodu birlikte çalıştırabilirsiniz

    //     verileriOlustur();
        yarismaKatilimcilariniListele();
        kullanicininActigiYarismalariListele();
        katilimGosterilenYarismalariListele();


    }

    public static void verileriOlustur() {
        Kullanici kullanici1 = kullaniciController.kullaniciOlustur("sinem", "varol", "sin@gmail.com", "uskudar");
        Kullanici kullanici2 = kullaniciController.kullaniciOlustur("yasemin", "varol", "yas@gmail.com", "dublin");
        Kullanici kullanici3 = kullaniciController.kullaniciOlustur("batuhan", "karagoz", "batu@gmail.com", "g.o.p");
        Kullanici kullanici4 = kullaniciController.kullaniciOlustur("yagmur", "yüksel", "yy@gmail.com", "sancaktepe");
        Kullanici kullanici5 = kullaniciController.kullaniciOlustur("deniz", "ulusan", "du@gmail.com", "uskudar");
        Kullanici kullanici6 = kullaniciController.kullaniciOlustur("ozge", "ülkü", "ou@gmail.com", "kadıköy");
        Kullanici kullanici7 = kullaniciController.kullaniciOlustur("nihal", "ozgenç", "no@gmail.com", "kadıköy");
        Kullanici kullanici8 = kullaniciController.kullaniciOlustur("hakan", "daşdan", "hd@gmail.com", "kartal");
        Kullanici kullanici9 = kullaniciController.kullaniciOlustur("esra", "yılmaz", "ey@gmail.com", "beylikdüzü");
        Kullanici kullanici10 = kullaniciController.kullaniciOlustur("ahmet", "şentürk", "as@gmail.com", "besiktas");
        Kullanici kullanici11 = kullaniciController.kullaniciOlustur("veli", "şen", "vs@gmail.com", "mecidiyekoy");
        Kullanici kullanici12 = kullaniciController.kullaniciOlustur("canan", "öz", "co@gmail.com", "sisli");

        Yarisma yarisma1 = yarismaController.yarismaOlustur(kullanici1, LocalDate.of(2023, 9, 01), LocalDate.of(2023, 10, 01), "10k", 5);
        Yarisma yarisma2 = yarismaController.yarismaOlustur(kullanici2, LocalDate.of(2023, 11, 15), LocalDate.of(2023, 12, 15), "2k", 2);
        Yarisma yarisma3 = yarismaController.yarismaOlustur(kullanici3, LocalDate.of(2024, 01, 01), LocalDate.of(2024, 02, 01), "5k", 3);
        Yarisma yarisma4 = yarismaController.yarismaOlustur(kullanici1, LocalDate.of(2024, 01, 01), LocalDate.of(2024, 02, 01), "1k", 2);
        Yarisma yarisma5 = yarismaController.yarismaOlustur(kullanici1, LocalDate.of(2024, 01, 01), LocalDate.of(2024, 02, 01), "20k", 3);

        yarismaKatilimController.yarismaKatilimOlustur(yarisma1, kullanici3, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma1, kullanici4, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma1, kullanici5, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma2, kullanici3, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma2, kullanici5, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma3, kullanici3, LocalDate.of(2023, 05, 02));
        yarismaKatilimController.yarismaKatilimOlustur(yarisma3, kullanici4, LocalDate.of(2023, 05, 02));


    }

    public static void yarismaKatilimcilariniListele() {
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Birinci yarışma katılımcıları: ");
        yarismaKatilimController.yarismayaKatilanlariListele(1L);
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("İkinci yarışma katılımcıları: ");
        yarismaKatilimController.yarismayaKatilanlariListele(2L);
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Üçüncü yarışma katılımcıları: ");
        yarismaKatilimController.yarismayaKatilanlariListele(3L);
    }

    public static void kullanicininActigiYarismalariListele() {
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Birinci kullanıcının açtığı yarışmalar: ");
        yarismaController.kullanicininActigiYarismalariListele("sinem");
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("İkinci kullanıcının açtığı yarışmalar: ");
        yarismaController.kullanicininActigiYarismalariListele("yasemin");
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Üçüncü kullanıcının açtığı yarışmalar: ");
        yarismaController.kullanicininActigiYarismalariListele("batuhan");
    }


    public static void katilimGosterilenYarismalariListele() {
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Kullanıcı ID 3'ün katıldığı yarışmalar: ");
        kullaniciController.katilimGosterilenYarismalariListele(3L);
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Kullanıcı ID 4'ün katıldığı yarışmalar: ");
        kullaniciController.katilimGosterilenYarismalariListele(4L);
        System.out.println("\n - - - -- - - - - -- - - - -- ");
        System.out.println("Kullanıcı ID 5'in katıldığı yarışmalar: ");
        kullaniciController.katilimGosterilenYarismalariListele(5L);
    }
}