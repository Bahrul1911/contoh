package com.spring.contoh.repo;

import com.spring.contoh.model.Kkbahrul;

import java.util.List;

public interface KkbahrulRepo {
    List<Kkbahrul> getall();

    void tambah(Kkbahrul a);

    void update(Kkbahrul a);
    //Return, nama operasi, parameter
    Kkbahrul get(String NIK);
    //Return (Nilai balik), operasi, tipedata alias

}
