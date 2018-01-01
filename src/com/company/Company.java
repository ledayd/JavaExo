
package com.company;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("logoUrl")
    @Expose
    private String logoUrl;
    @SerializedName("siret")
    @Expose
    private String siret;
    @SerializedName("formattedSiret")
    @Expose
    private String formattedSiret;
    @SerializedName("siren")
    @Expose
    private String siren;
    @SerializedName("numeroTVA")
    @Expose
    private String numeroTVA;
    @SerializedName("statutEntreprise")
    @Expose
    private String statutEntreprise;
    @SerializedName("RCS")
    @Expose
    private String rCS;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("capital")
    @Expose
    private Integer capital;
    @SerializedName("insurances")
    @Expose
    private List<Insurance> insurances = null;
    @SerializedName("corpsEtat")
    @Expose
    private List<Object> corpsEtat = null;
    @SerializedName("isRGE")
    @Expose
    private Boolean isRGE;
    @SerializedName("isQualibat")
    @Expose
    private Boolean isQualibat;
    @SerializedName("isEcoArtisan")
    @Expose
    private Boolean isEcoArtisan;
    @SerializedName("isKycCompliant")
    @Expose
    private Boolean isKycCompliant;
    @SerializedName("lemonWayWalletId")
    @Expose
    private Integer lemonWayWalletId;
    @SerializedName("firstNameRepresentantLegal")
    @Expose
    private String firstNameRepresentantLegal;
    @SerializedName("lastNameRepresentantLegal")
    @Expose
    private String lastNameRepresentantLegal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getFormattedSiret() {
        return formattedSiret;
    }

    public void setFormattedSiret(String formattedSiret) {
        this.formattedSiret = formattedSiret;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getNumeroTVA() {
        return numeroTVA;
    }

    public void setNumeroTVA(String numeroTVA) {
        this.numeroTVA = numeroTVA;
    }

    public String getStatutEntreprise() {
        return statutEntreprise;
    }

    public void setStatutEntreprise(String statutEntreprise) {
        this.statutEntreprise = statutEntreprise;
    }

    public String getRCS() {
        return rCS;
    }

    public void setRCS(String rCS) {
        this.rCS = rCS;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public List<Object> getCorpsEtat() {
        return corpsEtat;
    }

    public void setCorpsEtat(List<Object> corpsEtat) {
        this.corpsEtat = corpsEtat;
    }

    public Boolean getIsRGE() {
        return isRGE;
    }

    public void setIsRGE(Boolean isRGE) {
        this.isRGE = isRGE;
    }

    public Boolean getIsQualibat() {
        return isQualibat;
    }

    public void setIsQualibat(Boolean isQualibat) {
        this.isQualibat = isQualibat;
    }

    public Boolean getIsEcoArtisan() {
        return isEcoArtisan;
    }

    public void setIsEcoArtisan(Boolean isEcoArtisan) {
        this.isEcoArtisan = isEcoArtisan;
    }

    public Boolean getIsKycCompliant() {
        return isKycCompliant;
    }

    public void setIsKycCompliant(Boolean isKycCompliant) {
        this.isKycCompliant = isKycCompliant;
    }

    public Integer getLemonWayWalletId() {
        return lemonWayWalletId;
    }

    public void setLemonWayWalletId(Integer lemonWayWalletId) {
        this.lemonWayWalletId = lemonWayWalletId;
    }

    public String getFirstNameRepresentantLegal() {
        return firstNameRepresentantLegal;
    }

    public void setFirstNameRepresentantLegal(String firstNameRepresentantLegal) {
        this.firstNameRepresentantLegal = firstNameRepresentantLegal;
    }

    public String getLastNameRepresentantLegal() {
        return lastNameRepresentantLegal;
    }

    public void setLastNameRepresentantLegal(String lastNameRepresentantLegal) {
        this.lastNameRepresentantLegal = lastNameRepresentantLegal;
    }

}
