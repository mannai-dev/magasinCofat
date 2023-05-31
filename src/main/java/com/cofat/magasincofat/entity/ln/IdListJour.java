package com.cofat.magasincofat.entity.ln;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@Table(name ="IdListJour")
public class IdListJour implements Serializable {

    @Id
    @Column(name = "code", nullable = true)
    private Integer movementId ;

    public IdListJour() {
    }

    public IdListJour(Integer movementId) {
        this.movementId = movementId;
    }

    public Integer getMovementId() {
        return movementId;
    }

    public void setMovementId(Integer movementId) {
        this.movementId = movementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdListJour)) return false;
        IdListJour that = (IdListJour) o;
        return Objects.equals(getMovementId(), that.getMovementId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovementId());
    }
}
