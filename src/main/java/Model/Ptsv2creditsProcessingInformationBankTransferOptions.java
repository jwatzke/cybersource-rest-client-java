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
 * Ptsv2creditsProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class Ptsv2creditsProcessingInformationBankTransferOptions {
  @SerializedName("customerMemo")
  private String customerMemo = null;

  @SerializedName("secCode")
  private String secCode = null;

  @SerializedName("terminalCity")
  private String terminalCity = null;

  @SerializedName("terminalState")
  private String terminalState = null;

  @SerializedName("effectiveDate")
  private String effectiveDate = null;

  @SerializedName("partialPaymentId")
  private String partialPaymentId = null;

  @SerializedName("settlementMethod")
  private String settlementMethod = null;

  public Ptsv2creditsProcessingInformationBankTransferOptions customerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
    return this;
  }

   /**
   * Payment related information.  This information is included on the customer’s statement. 
   * @return customerMemo
  **/
  @ApiModelProperty(value = "Payment related information.  This information is included on the customer’s statement. ")
  public String getCustomerMemo() {
    return customerMemo;
  }

  public void setCustomerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Specifies the authorization method for the transaction.  #### TeleCheck Accepts only the following values: - &#x60;ARC&#x60;: account receivable conversion - &#x60;CCD&#x60;: corporate cash disbursement - &#x60;POP&#x60;: point of purchase conversion - &#x60;PPD&#x60;: prearranged payment and deposit entry - &#x60;TEL&#x60;: telephone-initiated entry - &#x60;WEB&#x60;: internet-initiated entry  For details, see &#x60;ecp_sec_code&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return secCode
  **/
  @ApiModelProperty(value = "Specifies the authorization method for the transaction.  #### TeleCheck Accepts only the following values: - `ARC`: account receivable conversion - `CCD`: corporate cash disbursement - `POP`: point of purchase conversion - `PPD`: prearranged payment and deposit entry - `TEL`: telephone-initiated entry - `WEB`: internet-initiated entry  For details, see `ecp_sec_code` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions terminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
    return this;
  }

   /**
   * City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalCity
  **/
  @ApiModelProperty(value = "City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalCity() {
    return terminalCity;
  }

  public void setTerminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions terminalState(String terminalState) {
    this.terminalState = terminalState;
    return this;
  }

   /**
   * State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalState
  **/
  @ApiModelProperty(value = "State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalState() {
    return terminalState;
  }

  public void setTerminalState(String terminalState) {
    this.terminalState = terminalState;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: &#x60;MMDDYYYY&#x60;  Supported only for the CyberSource ACH Service. 
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: `MMDDYYYY`  Supported only for the CyberSource ACH Service. ")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions partialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
    return this;
  }

   /**
   * Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. For details, see &#x60;partial_payment_id&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return partialPaymentId
  **/
  @ApiModelProperty(value = "Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. For details, see `partial_payment_id` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getPartialPaymentId() {
    return partialPaymentId;
  }

  public void setPartialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
  }

  public Ptsv2creditsProcessingInformationBankTransferOptions settlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
    return this;
  }

   /**
   * Method used for settlement.  Possible values: - &#x60;A&#x60;: Automated Clearing House (default for credits and for transactions using Canadian dollars) - &#x60;F&#x60;: Facsimile draft (U.S. dollars only) - &#x60;B&#x60;: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see &#x60;ecp_settlement_method&#x60; field description for credit cars and &#x60;ecp_debit_settlement_method&#x60; for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return settlementMethod
  **/
  @ApiModelProperty(value = "Method used for settlement.  Possible values: - `A`: Automated Clearing House (default for credits and for transactions using Canadian dollars) - `F`: Facsimile draft (U.S. dollars only) - `B`: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see `ecp_settlement_method` field description for credit cars and `ecp_debit_settlement_method` for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getSettlementMethod() {
    return settlementMethod;
  }

  public void setSettlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsProcessingInformationBankTransferOptions ptsv2creditsProcessingInformationBankTransferOptions = (Ptsv2creditsProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.customerMemo, ptsv2creditsProcessingInformationBankTransferOptions.customerMemo) &&
        Objects.equals(this.secCode, ptsv2creditsProcessingInformationBankTransferOptions.secCode) &&
        Objects.equals(this.terminalCity, ptsv2creditsProcessingInformationBankTransferOptions.terminalCity) &&
        Objects.equals(this.terminalState, ptsv2creditsProcessingInformationBankTransferOptions.terminalState) &&
        Objects.equals(this.effectiveDate, ptsv2creditsProcessingInformationBankTransferOptions.effectiveDate) &&
        Objects.equals(this.partialPaymentId, ptsv2creditsProcessingInformationBankTransferOptions.partialPaymentId) &&
        Objects.equals(this.settlementMethod, ptsv2creditsProcessingInformationBankTransferOptions.settlementMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerMemo, secCode, terminalCity, terminalState, effectiveDate, partialPaymentId, settlementMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsProcessingInformationBankTransferOptions {\n");
    
    sb.append("    customerMemo: ").append(toIndentedString(customerMemo)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    terminalCity: ").append(toIndentedString(terminalCity)).append("\n");
    sb.append("    terminalState: ").append(toIndentedString(terminalState)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    partialPaymentId: ").append(toIndentedString(partialPaymentId)).append("\n");
    sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
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

