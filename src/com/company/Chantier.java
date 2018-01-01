
package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chantier {

    @SerializedName("isCustomerTravauxlib")
    @Expose
    private Boolean isCustomerTravauxlib;
    @SerializedName("typeContrat")
    @Expose
    private String typeContrat;
    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("customerEmail")
    @Expose
    private String customerEmail;
    @SerializedName("billingAddress")
    @Expose
    private String billingAddress;
    @SerializedName("billingPostalCode")
    @Expose
    private String billingPostalCode;
    @SerializedName("billingCity")
    @Expose
    private String billingCity;
    @SerializedName("sameBillingAndChantierAddress")
    @Expose
    private Boolean sameBillingAndChantierAddress;
    @SerializedName("chantierAddress")
    @Expose
    private String chantierAddress;
    @SerializedName("chantierPostalCode")
    @Expose
    private String chantierPostalCode;
    @SerializedName("chantierCity")
    @Expose
    private String chantierCity;

    public Boolean getIsCustomerTravauxlib() {
        return isCustomerTravauxlib;
    }

    public void setIsCustomerTravauxlib(Boolean isCustomerTravauxlib) {
        this.isCustomerTravauxlib = isCustomerTravauxlib;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public Boolean getSameBillingAndChantierAddress() {
        return sameBillingAndChantierAddress;
    }

    public void setSameBillingAndChantierAddress(Boolean sameBillingAndChantierAddress) {
        this.sameBillingAndChantierAddress = sameBillingAndChantierAddress;
    }

    public String getChantierAddress() {
        return chantierAddress;
    }

    public void setChantierAddress(String chantierAddress) {
        this.chantierAddress = chantierAddress;
    }

    public String getChantierPostalCode() {
        return chantierPostalCode;
    }

    public void setChantierPostalCode(String chantierPostalCode) {
        this.chantierPostalCode = chantierPostalCode;
    }

    public String getChantierCity() {
        return chantierCity;
    }

    public void setChantierCity(String chantierCity) {
        this.chantierCity = chantierCity;
    }

}
