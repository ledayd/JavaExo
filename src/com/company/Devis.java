
package com.company;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Devis {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("chantier")
    @Expose
    private Chantier chantier;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("introductionLetter")
    @Expose
    private String introductionLetter;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;
    @SerializedName("prixTotalHTAvantRemise")
    @Expose
    private Integer prixTotalHTAvantRemise;
    @SerializedName("hasRemise")
    @Expose
    private Boolean hasRemise;
    @SerializedName("pourcentageRemise")
    @Expose
    private Integer pourcentageRemise;
    @SerializedName("prixTotalHT")
    @Expose
    private Integer prixTotalHT;
    @SerializedName("prixTotalTTC")
    @Expose
    private Double prixTotalTTC;
    @SerializedName("montantsTVA")
    @Expose
    private List<MontantsTVA> montantsTVA = null;
    @SerializedName("attachments")
    @Expose
    private List<Object> attachments = null;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dateDebut")
    @Expose
    private String dateDebut;
    @SerializedName("dateFin")
    @Expose
    private String dateFin;
    @SerializedName("dureeValidite")
    @Expose
    private String dureeValidite;
    @SerializedName("modalitesPaiement")
    @Expose
    private List<ModalitesPaiement> modalitesPaiement = null;
    @SerializedName("signe")
    @Expose
    private Boolean signe;
    @SerializedName("isFinal")
    @Expose
    private Boolean isFinal;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Chantier getChantier() {
        return chantier;
    }

    public void setChantier(Chantier chantier) {
        this.chantier = chantier;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroductionLetter() {
        return introductionLetter;
    }

    public void setIntroductionLetter(String introductionLetter) {
        this.introductionLetter = introductionLetter;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Integer getPrixTotalHTAvantRemise() {
        return prixTotalHTAvantRemise;
    }

    public void setPrixTotalHTAvantRemise(Integer prixTotalHTAvantRemise) {
        this.prixTotalHTAvantRemise = prixTotalHTAvantRemise;
    }

    public Boolean getHasRemise() {
        return hasRemise;
    }

    public void setHasRemise(Boolean hasRemise) {
        this.hasRemise = hasRemise;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
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

    public List<MontantsTVA> getMontantsTVA() {
        return montantsTVA;
    }

    public void setMontantsTVA(List<MontantsTVA> montantsTVA) {
        this.montantsTVA = montantsTVA;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getDureeValidite() {
        return dureeValidite;
    }

    public void setDureeValidite(String dureeValidite) {
        this.dureeValidite = dureeValidite;
    }

    public List<ModalitesPaiement> getModalitesPaiement() {
        return modalitesPaiement;
    }

    public void setModalitesPaiement(List<ModalitesPaiement> modalitesPaiement) {
        this.modalitesPaiement = modalitesPaiement;
    }

    public Boolean getSigne() {
        return signe;
    }

    public void setSigne(Boolean signe) {
        this.signe = signe;
    }

    public Boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

}
