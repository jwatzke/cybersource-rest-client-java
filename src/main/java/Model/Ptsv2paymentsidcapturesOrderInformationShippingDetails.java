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
 * Ptsv2paymentsidcapturesOrderInformationShippingDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class Ptsv2paymentsidcapturesOrderInformationShippingDetails {
  @SerializedName("shipFromPostalCode")
  private String shipFromPostalCode = null;

  public Ptsv2paymentsidcapturesOrderInformationShippingDetails shipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
    return this;
  }

   /**
   * Postal code for the address from which the goods are shipped, which is used to establish nexus. The default is the postal code associated with your CyberSource account.  The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format:  &#x60;[5 digits][dash][4 digits]&#x60;  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format:  &#x60;[alpha][numeric][alpha][space] [numeric][alpha][numeric]&#x60;  Example A1B 2C3  This field is frequently used for Level II and Level III transactions. 
   * @return shipFromPostalCode
  **/
  @ApiModelProperty(value = "Postal code for the address from which the goods are shipped, which is used to establish nexus. The default is the postal code associated with your CyberSource account.  The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format:  `[5 digits][dash][4 digits]`  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format:  `[alpha][numeric][alpha][space] [numeric][alpha][numeric]`  Example A1B 2C3  This field is frequently used for Level II and Level III transactions. ")
  public String getShipFromPostalCode() {
    return shipFromPostalCode;
  }

  public void setShipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesOrderInformationShippingDetails ptsv2paymentsidcapturesOrderInformationShippingDetails = (Ptsv2paymentsidcapturesOrderInformationShippingDetails) o;
    return Objects.equals(this.shipFromPostalCode, ptsv2paymentsidcapturesOrderInformationShippingDetails.shipFromPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipFromPostalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesOrderInformationShippingDetails {\n");
    
    sb.append("    shipFromPostalCode: ").append(toIndentedString(shipFromPostalCode)).append("\n");
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

