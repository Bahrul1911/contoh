package com.spring.contoh.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Kkbahrul {
    private String nik;
    private String nama;

    @Id
    @Column(name = "NIK")
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Basic
    @Column(name = "NAMA")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kkbahrul kkbahrul = (Kkbahrul) o;
        return Objects.equals(nik, kkbahrul.nik) &&
                Objects.equals(nama, kkbahrul.nama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nik, nama);
    }
}
