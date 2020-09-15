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
import Model.Ptsv2paymentsidOrderInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class Ptsv2paymentsidOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv2paymentsidOrderInformationAmountDetails amountDetails = null;

  public Ptsv2paymentsidOrderInformation amountDetails(Ptsv2paymentsidOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidOrderInformation ptsv2paymentsidOrderInformation = (Ptsv2paymentsidOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv2paymentsidOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

