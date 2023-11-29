@bdshop
Feature: Alisveris_yapma
  Scenario: Bdshop'tan alisveris yapma
    Given kullanici "anaSayfa" sayfasina properties ile gider
    When kullanici Consumer Electronics'i secer
    Then kullanici DSLR Camera secer
    And kullanici 2 saniye bekler
    Then kullanici DSLR Camera kategorisinde oldugunu dogrular
    And acilan kategoriden bir urune tikla
    And urunun bilgilerinin gorunurlugunu dogrula
    And kullanici 2 saniye bekler
    Then urunu satin almak icin Add To Cart butonuna tikla
    And acilan sayfada View Cart butonuna tikla sepete git
    And sepete gittigini dogrula
    And kullanici 2 saniye bekler
    Then Continue Shopping butonuna tikla
    And alisverise devam ettigini dogrula
    And kullanici 2 saniye bekler
    And kullanici Consumer Electronics'den Digital Cameras'i secer
    Then kullanici Digital Cameras kategorisinde oldugunu dogrular
    And acilan kategoriden sekizinci urune tiklar
    And urunun bilgilerinin gorunurlugunu dogrula
    Then urunu satin almak icin Add To Cart butonuna tiklar
    And acilan sayfada View Cart butonuna tikla sepete git
    And ikinci urunun sepette oldugunu dogrula
    And kullanici 2 saniye bekler
    Then sepetteki urunlerden birinin adetini arttir
    And Update Cart butonuna tikla sepeti guncelle
    And kullanici 2 saniye bekler
    Then toplam fiyatin gorunurlugunu dogrula
    When Clear Shopping Cart butonuna tikla
    Then cikan uyariyi onayla
    And sepetin bos oldugunu dogrula
    And anasayfaya don
    And kullanici 2 saniye bekler
    And sayfayi kapat
