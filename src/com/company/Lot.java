
package com.company;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lot {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("lignes")
    @Expose
    private List<Ligne> lignes = null;
    @SerializedName("prixTotalHT")
    @Expose
    private Double prixTotalHT;
    @SerializedName("prixTotalTTC")
    @Expose
    private Double prixTotalTTC;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

    public Double getPrixTotalHT() {
        return prixTotalHT;
    }

    public void setPrixTotalHT(Double prixTotalHT) {
        this.prixTotalHT = prixTotalHT;
    }

    public Double getPrixTotalTTC() {
        return prixTotalTTC;
    }

    public void setPrixTotalTTC(Double prixTotalTTC) {
        this.prixTotalTTC = prixTotalTTC;
    }

}
