package com.cofat.magasincofat.entity.ln;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Objects;

       import lombok.Data;
        import lombok.EqualsAndHashCode;

        import java.io.Serializable;
        import java.util.Objects;

@Data
@EqualsAndHashCode
public class Twhinh200120Id implements Serializable {

    private String tOrno;
    private Integer tOset;


    public Twhinh200120Id(String tOrno, Integer tOset) {
        this.tOrno = tOrno;
        this.tOset = tOset;
    }

    public String gettOrno() {
        return tOrno;
    }

    public void settOrno(String tOrno) {
        this.tOrno = tOrno;
    }

    public Integer gettOset() {
        return tOset;
    }

    public void settOset(Integer tOset) {
        this.tOset = tOset;
    }


    public Twhinh200120Id(String tOrno) {
        this.tOrno = tOrno;
    }

    public Twhinh200120Id(Integer tOset) {
        this.tOset = tOset;
    }

    public Twhinh200120Id() {
    }
}
