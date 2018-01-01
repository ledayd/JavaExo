
package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ligne {

    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("prixUnitaireHT")
    @Expose
    private Integer prixUnitaireHT;
    @SerializedName("quantite")
    @Expose
    private Integer quantite;
    @SerializedName("unite")
    @Expose
    private String unite;
    @SerializedName("prixHT")
    @Expose
    private Integer prixHT;
    @SerializedName("tauxTVA")
    @Expose
    private Integer tauxTVA;
    @SerializedName("montantTVA")
    @Expose
    private Double montantTVA;
    @SerializedName("prixTTC")
    @Expose
    private Double prixTTC;
    @SerializedName("prixPublicFournitureHT")
    @Expose
    private Integer prixPublicFournitureHT;
    @SerializedName("uniteLabel")
    @Expose
    private String uniteLabel;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    public void setPrixUnitaireHT(Integer prixUnitaireHT) {
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public Integer getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Integer prixHT) {
        this.prixHT = prixHT;
    }

    public Integer getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(Integer tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public Double getMontantTVA() {
        return montantTVA;
    }

    public void setMontantTVA(Double montantTVA) {
        this.montantTVA = montantTVA;
    }

    public Double getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(Double prixTTC) {
        this.prixTTC = prixTTC;
    }

    public Integer getPrixPublicFournitureHT() {
        return prixPublicFournitureHT;
    }

    public void setPrixPublicFournitureHT(Integer prixPublicFournitureHT) {
        this.prixPublicFournitureHT = prixPublicFournitureHT;
    }

    public String getUniteLabel() {
        return uniteLabel;
    }

    public void setUniteLabel(String uniteLabel) {
        this.uniteLabel = uniteLabel;
    }

}
