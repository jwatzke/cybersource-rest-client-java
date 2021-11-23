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
import Model.Riskv1addressverificationsBuyerInformation;
import Model.Riskv1addressverificationsOrderInformation;
import Model.Riskv1liststypeentriesClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VerifyCustomerAddressRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class VerifyCustomerAddressRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private Riskv1addressverificationsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1addressverificationsBuyerInformation buyerInformation = null;

  public VerifyCustomerAddressRequest clientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1liststypeentriesClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public VerifyCustomerAddressRequest orderInformation(Riskv1addressverificationsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1addressverificationsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public VerifyCustomerAddressRequest buyerInformation(Riskv1addressverificationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1addressverificationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCustomerAddressRequest verifyCustomerAddressRequest = (VerifyCustomerAddressRequest) o;
    return Objects.equals(this.clientReferenceInformation, verifyCustomerAddressRequest.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, verifyCustomerAddressRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, verifyCustomerAddressRequest.buyerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, orderInformation, buyerInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCustomerAddressRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
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

