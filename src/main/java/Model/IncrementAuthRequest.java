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
import Model.Ptsv2paymentsidClientReferenceInformation;
import Model.Ptsv2paymentsidMerchantInformation;
import Model.Ptsv2paymentsidOrderInformation;
import Model.Ptsv2paymentsidProcessingInformation;
import Model.Ptsv2paymentsidTravelInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IncrementAuthRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class IncrementAuthRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsidClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentsidProcessingInformation processingInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsidOrderInformation orderInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2paymentsidMerchantInformation merchantInformation = null;

  @SerializedName("travelInformation")
  private Ptsv2paymentsidTravelInformation travelInformation = null;

  public IncrementAuthRequest clientReferenceInformation(Ptsv2paymentsidClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2paymentsidClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public IncrementAuthRequest processingInformation(Ptsv2paymentsidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentsidProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public IncrementAuthRequest orderInformation(Ptsv2paymentsidOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsidOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public IncrementAuthRequest merchantInformation(Ptsv2paymentsidMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2paymentsidMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public IncrementAuthRequest travelInformation(Ptsv2paymentsidTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Ptsv2paymentsidTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncrementAuthRequest incrementAuthRequest = (IncrementAuthRequest) o;
    return Objects.equals(this.clientReferenceInformation, incrementAuthRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, incrementAuthRequest.processingInformation) &&
        Objects.equals(this.orderInformation, incrementAuthRequest.orderInformation) &&
        Objects.equals(this.merchantInformation, incrementAuthRequest.merchantInformation) &&
        Objects.equals(this.travelInformation, incrementAuthRequest.travelInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, orderInformation, merchantInformation, travelInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncrementAuthRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
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

