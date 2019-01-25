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
import io.swagger.client.model.Data;
import io.swagger.client.model.DocumentModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DataIocInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-23T16:57:59.678+08:00")
public class DataIocInner {
  @SerializedName("publicationDate")
  private String publicationDate = null;

  @SerializedName("data")
  private Data data = null;

  @SerializedName("documents")
  private List<DocumentModel> documents = null;

  public DataIocInner publicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * 
   * @return publicationDate
  **/
  @ApiModelProperty(example = "2018-03-28", value = "")
  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public DataIocInner data(Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public DataIocInner documents(List<DocumentModel> documents) {
    this.documents = documents;
    return this;
  }

  public DataIocInner addDocumentsItem(DocumentModel documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentModel>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * 
   * @return documents
  **/
  @ApiModelProperty(example = "[{\"documentType\":\"Proof of regulation\",\"fileName\":\"GLOBDESTXXX_POR_English.pdf\",\"language\":\"English\",\"url\":\"/documents/SWAAABU99027\",\"expiryDate\":\"2020-01-01T00:00:00.000Z\",\"description\":\"Proof Of Regulation\"}]", value = "")
  public List<DocumentModel> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocumentModel> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataIocInner dataIocInner = (DataIocInner) o;
    return Objects.equals(this.publicationDate, dataIocInner.publicationDate) &&
        Objects.equals(this.data, dataIocInner.data) &&
        Objects.equals(this.documents, dataIocInner.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationDate, data, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataIocInner {\n");
    
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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
