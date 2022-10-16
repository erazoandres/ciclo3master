package co.usa.ciclo3.ciclo3.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CABIN")
public class Cabaña implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String BRAND;
    private Integer ROOMS;
    private Integer CATEGORY_ID;
    private String NAME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public Integer getROOMS() {
        return ROOMS;
    }

    public void setROOMS(Integer ROOMS) {
        this.ROOMS = ROOMS;
    }

    public Integer getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public void setCATEGORY_ID(Integer CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
