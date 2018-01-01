
package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModalitesPaiement {

    @SerializedName("pourcentage")
    @Expose
    private Integer pourcentage;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("montant")
    @Expose
    private Double montant;

    public Integer getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Integer pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

}
