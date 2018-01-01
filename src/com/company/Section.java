
package com.company;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Section {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("lots")
    @Expose
    private List<Lot> lots = null;
    @SerializedName("prixTotalHT")
    @Expose
    private Integer prixTotalHT;
    @SerializedName("prixTotalTTC")
    @Expose
    private Double prixTotalTTC;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lot> getLots() {
        return lots;
    }

    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }

    public Integer getPrixTotalHT() {
        return prixTotalHT;
    }

    public void setPrixTotalHT(Integer prixTotalHT) {
        this.prixTotalHT = prixTotalHT;
    }

    public Double getPrixTotalTTC() {
        return prixTotalTTC;
    }

    public void setPrixTotalTTC(Double prixTotalTTC) {
        this.prixTotalTTC = prixTotalTTC;
    }

}
