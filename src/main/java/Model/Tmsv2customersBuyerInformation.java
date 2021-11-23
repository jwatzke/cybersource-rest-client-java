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
 * Tmsv2customersBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class Tmsv2customersBuyerInformation {
  @SerializedName("merchantCustomerID")
  private String merchantCustomerID = null;

  @SerializedName("email")
  private String email = null;

  public Tmsv2customersBuyerInformation merchantCustomerID(String merchantCustomerID) {
    this.merchantCustomerID = merchantCustomerID;
    return this;
  }

   /**
   * Your identifier for the customer. 
   * @return merchantCustomerID
  **/
  @ApiModelProperty(value = "Your identifier for the customer. ")
  public String getMerchantCustomerID() {
    return merchantCustomerID;
  }

  public void setMerchantCustomerID(String merchantCustomerID) {
    this.merchantCustomerID = merchantCustomerID;
  }

  public Tmsv2customersBuyerInformation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s primary email address, including the full domain name. 
   * @return email
  **/
  @ApiModelProperty(value = "Customer's primary email address, including the full domain name. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersBuyerInformation tmsv2customersBuyerInformation = (Tmsv2customersBuyerInformation) o;
    return Objects.equals(this.merchantCustomerID, tmsv2customersBuyerInformation.merchantCustomerID) &&
        Objects.equals(this.email, tmsv2customersBuyerInformation.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCustomerID, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersBuyerInformation {\n");
    
    sb.append("    merchantCustomerID: ").append(toIndentedString(merchantCustomerID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

