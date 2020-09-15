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
 * This object contains recurring payment information.
 */
@ApiModel(description = "This object contains recurring payment information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class Ptsv2paymentsRecurringPaymentInformation {
  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("originalPurchaseDate")
  private String originalPurchaseDate = null;

  public Ptsv2paymentsRecurringPaymentInformation endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date after which no further recurring authorizations should be performed. Format: &#x60;YYYY-MM-DD&#x60; **Note** This field is required for recurring transactions. 
   * @return endDate
  **/
  @ApiModelProperty(value = "The date after which no further recurring authorizations should be performed. Format: `YYYY-MM-DD` **Note** This field is required for recurring transactions. ")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Ptsv2paymentsRecurringPaymentInformation frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Integer value indicating the minimum number of days between recurring authorizations. A frequency of monthly is indicated by the value 28. Multiple of 28 days will be used to indicate months.  Example: 6 months &#x3D; 168  Example values accepted (31 days): - 31 - 031 - 0031  **Note** This field is required for recurring transactions. 
   * @return frequency
  **/
  @ApiModelProperty(value = "Integer value indicating the minimum number of days between recurring authorizations. A frequency of monthly is indicated by the value 28. Multiple of 28 days will be used to indicate months.  Example: 6 months = 168  Example values accepted (31 days): - 31 - 031 - 0031  **Note** This field is required for recurring transactions. ")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public Ptsv2paymentsRecurringPaymentInformation originalPurchaseDate(String originalPurchaseDate) {
    this.originalPurchaseDate = originalPurchaseDate;
    return this;
  }

   /**
   * Date of original purchase. Required for recurring transactions. Format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60; **Note**: If this field is empty, the current date is used. 
   * @return originalPurchaseDate
  **/
  @ApiModelProperty(value = "Date of original purchase. Required for recurring transactions. Format: `YYYY-MM-DDTHH:MM:SSZ` **Note**: If this field is empty, the current date is used. ")
  public String getOriginalPurchaseDate() {
    return originalPurchaseDate;
  }

  public void setOriginalPurchaseDate(String originalPurchaseDate) {
    this.originalPurchaseDate = originalPurchaseDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsRecurringPaymentInformation ptsv2paymentsRecurringPaymentInformation = (Ptsv2paymentsRecurringPaymentInformation) o;
    return Objects.equals(this.endDate, ptsv2paymentsRecurringPaymentInformation.endDate) &&
        Objects.equals(this.frequency, ptsv2paymentsRecurringPaymentInformation.frequency) &&
        Objects.equals(this.originalPurchaseDate, ptsv2paymentsRecurringPaymentInformation.originalPurchaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, frequency, originalPurchaseDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsRecurringPaymentInformation {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    originalPurchaseDate: ").append(toIndentedString(originalPurchaseDate)).append("\n");
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

