/*
 * KYC API
 * KYC Registry API
 *
 * OpenAPI spec version: 1.0.0-public
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IndustryClassifications;
import io.swagger.client.model.LicencesInfo;
import io.swagger.client.model.SICCodes;
import java.io.IOException;

/**
 * Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-23T16:57:59.678+08:00")
public class Data {
  @SerializedName("LegalFormLocal")
  private String legalFormLocal = null;

  @SerializedName("LegalFormAnglicised")
  private String legalFormAnglicised = null;

  @SerializedName("LegalNameLocal")
  private String legalNameLocal = null;

  @SerializedName("LegalNamePrevious")
  private String legalNamePrevious = null;

  @SerializedName("TradingNameLocal")
  private String tradingNameLocal = null;

  @SerializedName("IndustryClassifications")
  private IndustryClassifications industryClassifications = null;

  @SerializedName("SICCodes")
  private SICCodes siCCodes = null;

  @SerializedName("EmployeesNumber")
  private String employeesNumber = null;

  @SerializedName("RegistrationNumber")
  private String registrationNumber = null;

  @SerializedName("RegistrationAuthorityCountry")
  private String registrationAuthorityCountry = null;

  @SerializedName("RegistrationAuthority")
  private String registrationAuthority = null;

  @SerializedName("RegistrationAuthorityWebsite")
  private String registrationAuthorityWebsite = null;

  @SerializedName("IncorporationDate")
  private String incorporationDate = null;

  @SerializedName("Website")
  private String website = null;

  @SerializedName("RegulatoryStatus")
  private String regulatoryStatus = null;

  @SerializedName("ShellBank")
  private String shellBank = null;

  @SerializedName("RegulatorCountryPrimary")
  private String regulatorCountryPrimary = null;

  @SerializedName("RegulatorNamePrimary")
  private String regulatorNamePrimary = null;

  @SerializedName("RegulatorWebsitePrimary")
  private String regulatorWebsitePrimary = null;

  @SerializedName("PassportedLicence")
  private String passportedLicence = null;

  @SerializedName("LicencesInfo")
  private LicencesInfo licencesInfo = null;

  public Data legalFormLocal(String legalFormLocal) {
    this.legalFormLocal = legalFormLocal;
    return this;
  }

   /**
   * 
   * @return legalFormLocal
  **/
  @ApiModelProperty(example = "Joint stock company", value = "")
  public String getLegalFormLocal() {
    return legalFormLocal;
  }

  public void setLegalFormLocal(String legalFormLocal) {
    this.legalFormLocal = legalFormLocal;
  }

  public Data legalFormAnglicised(String legalFormAnglicised) {
    this.legalFormAnglicised = legalFormAnglicised;
    return this;
  }

   /**
   * 
   * @return legalFormAnglicised
  **/
  @ApiModelProperty(example = "Joint stock company", value = "")
  public String getLegalFormAnglicised() {
    return legalFormAnglicised;
  }

  public void setLegalFormAnglicised(String legalFormAnglicised) {
    this.legalFormAnglicised = legalFormAnglicised;
  }

  public Data legalNameLocal(String legalNameLocal) {
    this.legalNameLocal = legalNameLocal;
    return this;
  }

   /**
   * 
   * @return legalNameLocal
  **/
  @ApiModelProperty(example = "GLOBAL BANK", value = "")
  public String getLegalNameLocal() {
    return legalNameLocal;
  }

  public void setLegalNameLocal(String legalNameLocal) {
    this.legalNameLocal = legalNameLocal;
  }

  public Data legalNamePrevious(String legalNamePrevious) {
    this.legalNamePrevious = legalNamePrevious;
    return this;
  }

   /**
   * 
   * @return legalNamePrevious
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getLegalNamePrevious() {
    return legalNamePrevious;
  }

  public void setLegalNamePrevious(String legalNamePrevious) {
    this.legalNamePrevious = legalNamePrevious;
  }

  public Data tradingNameLocal(String tradingNameLocal) {
    this.tradingNameLocal = tradingNameLocal;
    return this;
  }

   /**
   * 
   * @return tradingNameLocal
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getTradingNameLocal() {
    return tradingNameLocal;
  }

  public void setTradingNameLocal(String tradingNameLocal) {
    this.tradingNameLocal = tradingNameLocal;
  }

  public Data industryClassifications(IndustryClassifications industryClassifications) {
    this.industryClassifications = industryClassifications;
    return this;
  }

   /**
   * Get industryClassifications
   * @return industryClassifications
  **/
  @ApiModelProperty(value = "")
  public IndustryClassifications getIndustryClassifications() {
    return industryClassifications;
  }

  public void setIndustryClassifications(IndustryClassifications industryClassifications) {
    this.industryClassifications = industryClassifications;
  }

  public Data siCCodes(SICCodes siCCodes) {
    this.siCCodes = siCCodes;
    return this;
  }

   /**
   * Get siCCodes
   * @return siCCodes
  **/
  @ApiModelProperty(value = "")
  public SICCodes getSiCCodes() {
    return siCCodes;
  }

  public void setSiCCodes(SICCodes siCCodes) {
    this.siCCodes = siCCodes;
  }

  public Data employeesNumber(String employeesNumber) {
    this.employeesNumber = employeesNumber;
    return this;
  }

   /**
   * 
   * @return employeesNumber
  **/
  @ApiModelProperty(example = "1-50", value = "")
  public String getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(String employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

  public Data registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * 
   * @return registrationNumber
  **/
  @ApiModelProperty(example = "111-222-3333", value = "")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public Data registrationAuthorityCountry(String registrationAuthorityCountry) {
    this.registrationAuthorityCountry = registrationAuthorityCountry;
    return this;
  }

   /**
   * 
   * @return registrationAuthorityCountry
  **/
  @ApiModelProperty(example = "Germany", value = "")
  public String getRegistrationAuthorityCountry() {
    return registrationAuthorityCountry;
  }

  public void setRegistrationAuthorityCountry(String registrationAuthorityCountry) {
    this.registrationAuthorityCountry = registrationAuthorityCountry;
  }

  public Data registrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
    return this;
  }

   /**
   * 
   * @return registrationAuthority
  **/
  @ApiModelProperty(example = "Unternehmens-register - Company Register", value = "")
  public String getRegistrationAuthority() {
    return registrationAuthority;
  }

  public void setRegistrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
  }

  public Data registrationAuthorityWebsite(String registrationAuthorityWebsite) {
    this.registrationAuthorityWebsite = registrationAuthorityWebsite;
    return this;
  }

   /**
   * 
   * @return registrationAuthorityWebsite
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getRegistrationAuthorityWebsite() {
    return registrationAuthorityWebsite;
  }

  public void setRegistrationAuthorityWebsite(String registrationAuthorityWebsite) {
    this.registrationAuthorityWebsite = registrationAuthorityWebsite;
  }

  public Data incorporationDate(String incorporationDate) {
    this.incorporationDate = incorporationDate;
    return this;
  }

   /**
   * 
   * @return incorporationDate
  **/
  @ApiModelProperty(example = "1/1/2002 12:00:00 AM", value = "")
  public String getIncorporationDate() {
    return incorporationDate;
  }

  public void setIncorporationDate(String incorporationDate) {
    this.incorporationDate = incorporationDate;
  }

  public Data website(String website) {
    this.website = website;
    return this;
  }

   /**
   * 
   * @return website
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Data regulatoryStatus(String regulatoryStatus) {
    this.regulatoryStatus = regulatoryStatus;
    return this;
  }

   /**
   * 
   * @return regulatoryStatus
  **/
  @ApiModelProperty(example = "Fully Regulated", value = "")
  public String getRegulatoryStatus() {
    return regulatoryStatus;
  }

  public void setRegulatoryStatus(String regulatoryStatus) {
    this.regulatoryStatus = regulatoryStatus;
  }

  public Data shellBank(String shellBank) {
    this.shellBank = shellBank;
    return this;
  }

   /**
   * 
   * @return shellBank
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getShellBank() {
    return shellBank;
  }

  public void setShellBank(String shellBank) {
    this.shellBank = shellBank;
  }

  public Data regulatorCountryPrimary(String regulatorCountryPrimary) {
    this.regulatorCountryPrimary = regulatorCountryPrimary;
    return this;
  }

   /**
   * 
   * @return regulatorCountryPrimary
  **/
  @ApiModelProperty(example = "Germany", value = "")
  public String getRegulatorCountryPrimary() {
    return regulatorCountryPrimary;
  }

  public void setRegulatorCountryPrimary(String regulatorCountryPrimary) {
    this.regulatorCountryPrimary = regulatorCountryPrimary;
  }

  public Data regulatorNamePrimary(String regulatorNamePrimary) {
    this.regulatorNamePrimary = regulatorNamePrimary;
    return this;
  }

   /**
   * 
   * @return regulatorNamePrimary
  **/
  @ApiModelProperty(example = "Bundesanstalt fÃ¼r Finanzdienstleistungsaufsicht - Federal Financial Supervisory Authority", value = "")
  public String getRegulatorNamePrimary() {
    return regulatorNamePrimary;
  }

  public void setRegulatorNamePrimary(String regulatorNamePrimary) {
    this.regulatorNamePrimary = regulatorNamePrimary;
  }

  public Data regulatorWebsitePrimary(String regulatorWebsitePrimary) {
    this.regulatorWebsitePrimary = regulatorWebsitePrimary;
    return this;
  }

   /**
   * 
   * @return regulatorWebsitePrimary
  **/
  @ApiModelProperty(example = "Not applicable", value = "")
  public String getRegulatorWebsitePrimary() {
    return regulatorWebsitePrimary;
  }

  public void setRegulatorWebsitePrimary(String regulatorWebsitePrimary) {
    this.regulatorWebsitePrimary = regulatorWebsitePrimary;
  }

  public Data passportedLicence(String passportedLicence) {
    this.passportedLicence = passportedLicence;
    return this;
  }

   /**
   * 
   * @return passportedLicence
  **/
  @ApiModelProperty(example = "No", value = "")
  public String getPassportedLicence() {
    return passportedLicence;
  }

  public void setPassportedLicence(String passportedLicence) {
    this.passportedLicence = passportedLicence;
  }

  public Data licencesInfo(LicencesInfo licencesInfo) {
    this.licencesInfo = licencesInfo;
    return this;
  }

   /**
   * Get licencesInfo
   * @return licencesInfo
  **/
  @ApiModelProperty(value = "")
  public LicencesInfo getLicencesInfo() {
    return licencesInfo;
  }

  public void setLicencesInfo(LicencesInfo licencesInfo) {
    this.licencesInfo = licencesInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.legalFormLocal, data.legalFormLocal) &&
        Objects.equals(this.legalFormAnglicised, data.legalFormAnglicised) &&
        Objects.equals(this.legalNameLocal, data.legalNameLocal) &&
        Objects.equals(this.legalNamePrevious, data.legalNamePrevious) &&
        Objects.equals(this.tradingNameLocal, data.tradingNameLocal) &&
        Objects.equals(this.industryClassifications, data.industryClassifications) &&
        Objects.equals(this.siCCodes, data.siCCodes) &&
        Objects.equals(this.employeesNumber, data.employeesNumber) &&
        Objects.equals(this.registrationNumber, data.registrationNumber) &&
        Objects.equals(this.registrationAuthorityCountry, data.registrationAuthorityCountry) &&
        Objects.equals(this.registrationAuthority, data.registrationAuthority) &&
        Objects.equals(this.registrationAuthorityWebsite, data.registrationAuthorityWebsite) &&
        Objects.equals(this.incorporationDate, data.incorporationDate) &&
        Objects.equals(this.website, data.website) &&
        Objects.equals(this.regulatoryStatus, data.regulatoryStatus) &&
        Objects.equals(this.shellBank, data.shellBank) &&
        Objects.equals(this.regulatorCountryPrimary, data.regulatorCountryPrimary) &&
        Objects.equals(this.regulatorNamePrimary, data.regulatorNamePrimary) &&
        Objects.equals(this.regulatorWebsitePrimary, data.regulatorWebsitePrimary) &&
        Objects.equals(this.passportedLicence, data.passportedLicence) &&
        Objects.equals(this.licencesInfo, data.licencesInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalFormLocal, legalFormAnglicised, legalNameLocal, legalNamePrevious, tradingNameLocal, industryClassifications, siCCodes, employeesNumber, registrationNumber, registrationAuthorityCountry, registrationAuthority, registrationAuthorityWebsite, incorporationDate, website, regulatoryStatus, shellBank, regulatorCountryPrimary, regulatorNamePrimary, regulatorWebsitePrimary, passportedLicence, licencesInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    legalFormLocal: ").append(toIndentedString(legalFormLocal)).append("\n");
    sb.append("    legalFormAnglicised: ").append(toIndentedString(legalFormAnglicised)).append("\n");
    sb.append("    legalNameLocal: ").append(toIndentedString(legalNameLocal)).append("\n");
    sb.append("    legalNamePrevious: ").append(toIndentedString(legalNamePrevious)).append("\n");
    sb.append("    tradingNameLocal: ").append(toIndentedString(tradingNameLocal)).append("\n");
    sb.append("    industryClassifications: ").append(toIndentedString(industryClassifications)).append("\n");
    sb.append("    siCCodes: ").append(toIndentedString(siCCodes)).append("\n");
    sb.append("    employeesNumber: ").append(toIndentedString(employeesNumber)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registrationAuthorityCountry: ").append(toIndentedString(registrationAuthorityCountry)).append("\n");
    sb.append("    registrationAuthority: ").append(toIndentedString(registrationAuthority)).append("\n");
    sb.append("    registrationAuthorityWebsite: ").append(toIndentedString(registrationAuthorityWebsite)).append("\n");
    sb.append("    incorporationDate: ").append(toIndentedString(incorporationDate)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    regulatoryStatus: ").append(toIndentedString(regulatoryStatus)).append("\n");
    sb.append("    shellBank: ").append(toIndentedString(shellBank)).append("\n");
    sb.append("    regulatorCountryPrimary: ").append(toIndentedString(regulatorCountryPrimary)).append("\n");
    sb.append("    regulatorNamePrimary: ").append(toIndentedString(regulatorNamePrimary)).append("\n");
    sb.append("    regulatorWebsitePrimary: ").append(toIndentedString(regulatorWebsitePrimary)).append("\n");
    sb.append("    passportedLicence: ").append(toIndentedString(passportedLicence)).append("\n");
    sb.append("    licencesInfo: ").append(toIndentedString(licencesInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

