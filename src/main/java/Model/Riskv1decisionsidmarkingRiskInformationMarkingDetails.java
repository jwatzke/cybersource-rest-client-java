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
import java.util.ArrayList;
import java.util.List;

/**
 * Details for marking the transaction.
 */
@ApiModel(description = "Details for marking the transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class Riskv1decisionsidmarkingRiskInformationMarkingDetails {
  @SerializedName("notes")
  private String notes = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("fieldsIncluded")
  private List<String> fieldsIncluded = null;

  @SerializedName("action")
  private String action = null;

  public Riskv1decisionsidmarkingRiskInformationMarkingDetails notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes or details that explain the reasons for marking the transaction as suspect or otherwise.
   * @return notes
  **/
  @ApiModelProperty(value = "Notes or details that explain the reasons for marking the transaction as suspect or otherwise.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Riskv1decisionsidmarkingRiskInformationMarkingDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for marking the transaction as suspect or otherwise. This field can contain one of the following values: - &#x60;fraud_chargeback:&#x60; You have received a fraud-related chargeback for the transaction. - &#x60;non_fraud_chargeback:&#x60; You have received a non-fraudulent chargeback for the transaction. - &#x60;suspected:&#x60; You believe that you will probably receive a chargeback for the transaction. - &#x60;creditback:&#x60; You issued a refund to the customer to avoid a chargeback for the transaction. 
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for marking the transaction as suspect or otherwise. This field can contain one of the following values: - `fraud_chargeback:` You have received a fraud-related chargeback for the transaction. - `non_fraud_chargeback:` You have received a non-fraudulent chargeback for the transaction. - `suspected:` You believe that you will probably receive a chargeback for the transaction. - `creditback:` You issued a refund to the customer to avoid a chargeback for the transaction. ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Riskv1decisionsidmarkingRiskInformationMarkingDetails fieldsIncluded(List<String> fieldsIncluded) {
    this.fieldsIncluded = fieldsIncluded;
    return this;
  }

  public Riskv1decisionsidmarkingRiskInformationMarkingDetails addFieldsIncludedItem(String fieldsIncludedItem) {
    if (this.fieldsIncluded == null) {
      this.fieldsIncluded = new ArrayList<String>();
    }
    this.fieldsIncluded.add(fieldsIncludedItem);
    return this;
  }

   /**
   * This field can contain one or more of the following values. When you specify more than one value, separate them with commas (,). - &#x60;account_key_hash&#x60; - &#x60;customer_account_id&#x60; - &#x60;customer_email&#x60; - &#x60;customer_ipaddress&#x60; - &#x60;customer_phone&#x60; - &#x60;device_fingerprint&#x60; - &#x60;ship_address&#x60; If no value is specified, &#x60;account_key_hash&#x60;, &#x60;customer_email&#x60;, and &#x60;ship_address&#x60; are used by default. Note &#x60;account_key_hash&#x60; adds the field that contains the card number (&#x60;customer_cc_number&#x60;). 
   * @return fieldsIncluded
  **/
  @ApiModelProperty(value = "This field can contain one or more of the following values. When you specify more than one value, separate them with commas (,). - `account_key_hash` - `customer_account_id` - `customer_email` - `customer_ipaddress` - `customer_phone` - `device_fingerprint` - `ship_address` If no value is specified, `account_key_hash`, `customer_email`, and `ship_address` are used by default. Note `account_key_hash` adds the field that contains the card number (`customer_cc_number`). ")
  public List<String> getFieldsIncluded() {
    return fieldsIncluded;
  }

  public void setFieldsIncluded(List<String> fieldsIncluded) {
    this.fieldsIncluded = fieldsIncluded;
  }

  public Riskv1decisionsidmarkingRiskInformationMarkingDetails action(String action) {
    this.action = action;
    return this;
  }

   /**
   * This field can contain one of the following values: - add: Mark as Suspect. - clear: Clear Mark as Suspect. - hide: Remove from history. 
   * @return action
  **/
  @ApiModelProperty(value = "This field can contain one of the following values: - add: Mark as Suspect. - clear: Clear Mark as Suspect. - hide: Remove from history. ")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsidmarkingRiskInformationMarkingDetails riskv1decisionsidmarkingRiskInformationMarkingDetails = (Riskv1decisionsidmarkingRiskInformationMarkingDetails) o;
    return Objects.equals(this.notes, riskv1decisionsidmarkingRiskInformationMarkingDetails.notes) &&
        Objects.equals(this.reason, riskv1decisionsidmarkingRiskInformationMarkingDetails.reason) &&
        Objects.equals(this.fieldsIncluded, riskv1decisionsidmarkingRiskInformationMarkingDetails.fieldsIncluded) &&
        Objects.equals(this.action, riskv1decisionsidmarkingRiskInformationMarkingDetails.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, reason, fieldsIncluded, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsidmarkingRiskInformationMarkingDetails {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fieldsIncluded: ").append(toIndentedString(fieldsIncluded)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

