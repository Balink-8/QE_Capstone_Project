Feature: sebagai user saya berhasil melihat detail produk berdasarkan kategori

  @DetailProdukBerdasarkanKategori
  Scenario: sebagai user saya berhasil melihat detail produk berdasarkan kategori
    Given user click field email
    And user input valid email
    And user click field password
    And user input valid password
    And user click masuk button
    And user can login and go to home page
    And user click menu Shop
    And user click produk kategori pakaian
    And user click produk 1
    Then user see detail produk