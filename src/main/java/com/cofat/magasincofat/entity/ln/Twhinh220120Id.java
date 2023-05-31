package com.cofat.magasincofat.entity.ln;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Objects;

@Data
@EqualsAndHashCode
public class Twhinh220120Id implements Serializable {

    private String tOrno;
    private Integer tPono;


    public Twhinh220120Id(String tOrno, Integer tPono) {
        this.tOrno = tOrno;
        this.tPono = tPono;
    }

    public String gettOrno() {
        return tOrno;
    }

    public void settOrno(String tOrno) {
        this.tOrno = tOrno;
    }

    public Integer gettPono() {
        return tPono;
    }

    public void settPono(Integer tPono) {
        this.tPono = tPono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Twhinh220120Id)) return false;
        Twhinh220120Id that = (Twhinh220120Id) o;
        return gettOrno().equals(that.gettOrno()) && gettPono().equals(that.gettPono());
    }

    @Override
    public int hashCode() {
        return Objects.hash(gettOrno(), gettPono());
    }

    public Twhinh220120Id(String tOrno) {
        this.tOrno = tOrno;
    }

    public Twhinh220120Id(Integer tPono) {
        this.tPono = tPono;
    }

    public Twhinh220120Id() {
    }
}
