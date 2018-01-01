
package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MontantsTVA {

    @SerializedName("taux")
    @Expose
    private Integer taux;
    @SerializedName("montant")
    @Expose
    private Double montant;

    public Integer getTaux() {
        return taux;
    }

    public void setTaux(Integer taux) {
        this.taux = taux;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

}
