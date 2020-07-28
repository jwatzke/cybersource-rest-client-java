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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrument;
import Model.Tmsv2customersEmbeddedDefaultShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional resources for the Customer token. 
 */
@ApiModel(description = "Additional resources for the Customer token. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Tmsv2customersEmbedded {
  @SerializedName("defaultPaymentInstrument")
  private Tmsv2customersEmbeddedDefaultPaymentInstrument defaultPaymentInstrument = null;

  @SerializedName("defaultShippingAddress")
  private Tmsv2customersEmbeddedDefaultShippingAddress defaultShippingAddress = null;

  public Tmsv2customersEmbedded defaultPaymentInstrument(Tmsv2customersEmbeddedDefaultPaymentInstrument defaultPaymentInstrument) {
    this.defaultPaymentInstrument = defaultPaymentInstrument;
    return this;
  }

   /**
   * Get defaultPaymentInstrument
   * @return defaultPaymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrument getDefaultPaymentInstrument() {
    return defaultPaymentInstrument;
  }

  public void setDefaultPaymentInstrument(Tmsv2customersEmbeddedDefaultPaymentInstrument defaultPaymentInstrument) {
    this.defaultPaymentInstrument = defaultPaymentInstrument;
  }

  public Tmsv2customersEmbedded defaultShippingAddress(Tmsv2customersEmbeddedDefaultShippingAddress defaultShippingAddress) {
    this.defaultShippingAddress = defaultShippingAddress;
    return this;
  }

   /**
   * Get defaultShippingAddress
   * @return defaultShippingAddress
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddress getDefaultShippingAddress() {
    return defaultShippingAddress;
  }

  public void setDefaultShippingAddress(Tmsv2customersEmbeddedDefaultShippingAddress defaultShippingAddress) {
    this.defaultShippingAddress = defaultShippingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbedded tmsv2customersEmbedded = (Tmsv2customersEmbedded) o;
    return Objects.equals(this.defaultPaymentInstrument, tmsv2customersEmbedded.defaultPaymentInstrument) &&
        Objects.equals(this.defaultShippingAddress, tmsv2customersEmbedded.defaultShippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPaymentInstrument, defaultShippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbedded {\n");
    
    sb.append("    defaultPaymentInstrument: ").append(toIndentedString(defaultPaymentInstrument)).append("\n");
    sb.append("    defaultShippingAddress: ").append(toIndentedString(defaultShippingAddress)).append("\n");
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

