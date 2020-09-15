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
 * Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion {
  @SerializedName("indicator")
  private String indicator = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("id")
  private String id = null;

  public Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * Flag indicating that DCC Lookup has been performed before this transaction. Set this field to 1 when cardholders opts to use DCC on the transaction. 
   * @return indicator
  **/
  @ApiModelProperty(value = "Flag indicating that DCC Lookup has been performed before this transaction. Set this field to 1 when cardholders opts to use DCC on the transaction. ")
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Unique identifier generated by the DCC provider. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Unique identifier generated by the DCC provider. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Value of the Cybersource request ID returned in a DCC Lookup transaction. 
   * @return id
  **/
  @ApiModelProperty(value = "Value of the Cybersource request ID returned in a DCC Lookup transaction. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion = (Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion) o;
    return Objects.equals(this.indicator, ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion.indicator) &&
        Objects.equals(this.reconciliationId, ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion.reconciliationId) &&
        Objects.equals(this.id, ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, reconciliationId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

