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
 * Ptsv2paymentsidreversalsOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class Ptsv2paymentsidreversalsOrderInformationAmountDetails {
  @SerializedName("serviceFeeAmount")
  private String serviceFeeAmount = null;

  public Ptsv2paymentsidreversalsOrderInformationAmountDetails serviceFeeAmount(String serviceFeeAmount) {
    this.serviceFeeAmount = serviceFeeAmount;
    return this;
  }

   /**
   * Service fee. Required for service fee transactions. 
   * @return serviceFeeAmount
  **/
  @ApiModelProperty(value = "Service fee. Required for service fee transactions. ")
  public String getServiceFeeAmount() {
    return serviceFeeAmount;
  }

  public void setServiceFeeAmount(String serviceFeeAmount) {
    this.serviceFeeAmount = serviceFeeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsOrderInformationAmountDetails ptsv2paymentsidreversalsOrderInformationAmountDetails = (Ptsv2paymentsidreversalsOrderInformationAmountDetails) o;
    return Objects.equals(this.serviceFeeAmount, ptsv2paymentsidreversalsOrderInformationAmountDetails.serviceFeeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsOrderInformationAmountDetails {\n");
    
    sb.append("    serviceFeeAmount: ").append(toIndentedString(serviceFeeAmount)).append("\n");
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

