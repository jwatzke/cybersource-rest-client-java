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
 * Ptsv2paymentsidMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class Ptsv2paymentsidMerchantInformation {
  @SerializedName("transactionLocalDateTime")
  private String transactionLocalDateTime = null;

  public Ptsv2paymentsidMerchantInformation transactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
    return this;
  }

   /**
   * Date and time at your physical location.  Format: &#x60;YYYYMMDDhhmmss&#x60;, where:  - &#x60;YYYY&#x60; &#x3D; year  - &#x60;MM&#x60; &#x3D; month  - &#x60;DD&#x60; &#x3D; day  - &#x60;hh&#x60; &#x3D; hour  - &#x60;mm&#x60; &#x3D; minutes  - &#x60;ss&#x60; &#x3D; seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. 
   * @return transactionLocalDateTime
  **/
  @ApiModelProperty(value = "Date and time at your physical location.  Format: `YYYYMMDDhhmmss`, where:  - `YYYY` = year  - `MM` = month  - `DD` = day  - `hh` = hour  - `mm` = minutes  - `ss` = seconds  #### Used by **Authorization** Required for these processors: - American Express Direct                                                                                                                                                                                                                                                                                                                         - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - SIX  Optional for all other processors. ")
  public String getTransactionLocalDateTime() {
    return transactionLocalDateTime;
  }

  public void setTransactionLocalDateTime(String transactionLocalDateTime) {
    this.transactionLocalDateTime = transactionLocalDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidMerchantInformation ptsv2paymentsidMerchantInformation = (Ptsv2paymentsidMerchantInformation) o;
    return Objects.equals(this.transactionLocalDateTime, ptsv2paymentsidMerchantInformation.transactionLocalDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionLocalDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidMerchantInformation {\n");
    
    sb.append("    transactionLocalDateTime: ").append(toIndentedString(transactionLocalDateTime)).append("\n");
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

