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
 * PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails {
  @SerializedName("voidAmount")
  private String voidAmount = null;

  @SerializedName("originalTransactionAmount")
  private String originalTransactionAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails voidAmount(String voidAmount) {
    this.voidAmount = voidAmount;
    return this;
  }

   /**
   * Total amount of the void.  #### PIN Debit Amount of the reversal.  Returned by PIN debit reversal. 
   * @return voidAmount
  **/
  @ApiModelProperty(value = "Total amount of the void.  #### PIN Debit Amount of the reversal.  Returned by PIN debit reversal. ")
  public String getVoidAmount() {
    return voidAmount;
  }

  public void setVoidAmount(String voidAmount) {
    this.voidAmount = voidAmount;
  }

  public PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails originalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
    return this;
  }

   /**
   * Amount of the original transaction.
   * @return originalTransactionAmount
  **/
  @ApiModelProperty(value = "Amount of the original transaction.")
  public String getOriginalTransactionAmount() {
    return originalTransactionAmount;
  }

  public void setOriginalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
  }

  public PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (&#x60;reversalInformation&#x60;) or a capture (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60;), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the &#x60;currency&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  #### Used by **Authorization** Required field.  **Authorization Reversal** For an authorization reversal (`reversalInformation`) or a capture (`processingOptions.capture` is set to `true`), you must use the same currency that you used in your payment authorization request.  #### PIN Debit Currency for the amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf). Returned by PIN debit purchase.  For PIN debit reversal requests, you must use the same currency that was used for the PIN debit purchase or PIN debit credit that you are reversing. For the possible values, see the [ISO Standard Currency Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/currencies.pdf).  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit.  #### DCC for First Data Your local currency. For details, see the `currency` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### Tax Calculation Required for international tax and value added tax only. Optional for U.S. and Canadian taxes. Your local currency. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails ptsV2PaymentsVoidsPost201ResponseVoidAmountDetails = (PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails) o;
    return Objects.equals(this.voidAmount, ptsV2PaymentsVoidsPost201ResponseVoidAmountDetails.voidAmount) &&
        Objects.equals(this.originalTransactionAmount, ptsV2PaymentsVoidsPost201ResponseVoidAmountDetails.originalTransactionAmount) &&
        Objects.equals(this.currency, ptsV2PaymentsVoidsPost201ResponseVoidAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voidAmount, originalTransactionAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails {\n");
    
    sb.append("    voidAmount: ").append(toIndentedString(voidAmount)).append("\n");
    sb.append("    originalTransactionAmount: ").append(toIndentedString(originalTransactionAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

