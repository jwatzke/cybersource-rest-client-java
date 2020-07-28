/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsAcquirerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsAcquirerInformation {
  @SerializedName("acquirerBin")
  private String acquirerBin = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  public Ptsv2paymentsAcquirerInformation acquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
    return this;
  }

   /**
   * Acquirer bank ID number that  corresponds to a certificate that Cybersource already has.This ID has this format. 4XXXXX for Visa and 5XXXXX for Mastercard. 
   * @return acquirerBin
  **/
  @ApiModelProperty(value = "Acquirer bank ID number that  corresponds to a certificate that Cybersource already has.This ID has this format. 4XXXXX for Visa and 5XXXXX for Mastercard. ")
  public String getAcquirerBin() {
    return acquirerBin;
  }

  public void setAcquirerBin(String acquirerBin) {
    this.acquirerBin = acquirerBin;
  }

  public Ptsv2paymentsAcquirerInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Issuers need to be aware of the Acquirer&#39;s Country Code when the Acquirer country differs from the Merchant country and the Acquirer is in the EEA (European Economic Area). 
   * @return country
  **/
  @ApiModelProperty(value = "Issuers need to be aware of the Acquirer's Country Code when the Acquirer country differs from the Merchant country and the Acquirer is in the EEA (European Economic Area). ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsAcquirerInformation password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Registered password for the Visa directory server. 
   * @return password
  **/
  @ApiModelProperty(value = "Registered password for the Visa directory server. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Ptsv2paymentsAcquirerInformation merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Username for the visa directory server that is created when your acquirer sets up your account. This ID might be the same as your merchant ID. the username can be 15 or 23 characters. 
   * @return merchantId
  **/
  @ApiModelProperty(value = "Username for the visa directory server that is created when your acquirer sets up your account. This ID might be the same as your merchant ID. the username can be 15 or 23 characters. ")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsAcquirerInformation ptsv2paymentsAcquirerInformation = (Ptsv2paymentsAcquirerInformation) o;
    return Objects.equals(this.acquirerBin, ptsv2paymentsAcquirerInformation.acquirerBin) &&
        Objects.equals(this.country, ptsv2paymentsAcquirerInformation.country) &&
        Objects.equals(this.password, ptsv2paymentsAcquirerInformation.password) &&
        Objects.equals(this.merchantId, ptsv2paymentsAcquirerInformation.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerBin, country, password, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsAcquirerInformation {\n");
    
    sb.append("    acquirerBin: ").append(toIndentedString(acquirerBin)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

