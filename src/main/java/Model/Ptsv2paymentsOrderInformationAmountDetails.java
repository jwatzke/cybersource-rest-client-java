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
import Model.Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts;
import Model.Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion;
import Model.Ptsv2paymentsOrderInformationAmountDetailsSurcharge;
import Model.Ptsv2paymentsOrderInformationAmountDetailsTaxDetails;
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
 * Ptsv2paymentsOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("dutyAmount")
  private String dutyAmount = null;

  @SerializedName("gratuityAmount")
  private String gratuityAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("nationalTaxIncluded")
  private String nationalTaxIncluded = null;

  @SerializedName("taxAppliedAfterDiscount")
  private String taxAppliedAfterDiscount = null;

  @SerializedName("taxAppliedLevel")
  private String taxAppliedLevel = null;

  @SerializedName("taxTypeCode")
  private String taxTypeCode = null;

  @SerializedName("freightAmount")
  private String freightAmount = null;

  @SerializedName("foreignAmount")
  private String foreignAmount = null;

  @SerializedName("foreignCurrency")
  private String foreignCurrency = null;

  @SerializedName("exchangeRate")
  private String exchangeRate = null;

  @SerializedName("exchangeRateTimeStamp")
  private String exchangeRateTimeStamp = null;

  @SerializedName("surcharge")
  private Ptsv2paymentsOrderInformationAmountDetailsSurcharge surcharge = null;

  @SerializedName("settlementAmount")
  private String settlementAmount = null;

  @SerializedName("settlementCurrency")
  private String settlementCurrency = null;

  @SerializedName("amexAdditionalAmounts")
  private List<Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts = null;

  @SerializedName("taxDetails")
  private List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails = null;

  @SerializedName("serviceFeeAmount")
  private String serviceFeeAmount = null;

  @SerializedName("originalAmount")
  private String originalAmount = null;

  @SerializedName("originalCurrency")
  private String originalCurrency = null;

  @SerializedName("cashbackAmount")
  private String cashbackAmount = null;

  @SerializedName("currencyConversion")
  private Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion currencyConversion = null;

  public Ptsv2paymentsOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \&quot;Authorization Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Capture Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \&quot;Credit Information for Specific Processors\&quot; in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \&quot;Zero Amount Authorizations,\&quot; \&quot;Credit Information for Specific Processors\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Card Present Required to include either this field or &#x60;orderInformation.lineItems[].unitPrice&#x60; for the order.  #### Invoicing Required for creating a new invoice.  #### PIN Debit Amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount.  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit; however, for all other processors, these fields are required.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see &#x60;grand_total_amount&#x60; field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \&quot;Authorization Information for Specific Processors\&quot; of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used. 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. This value cannot be negative. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  **Note** For CTV, FDCCompass, Paymentech processors, the maximum length for this field is 12.  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. For details, see: - \"Authorization Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Capture Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/). - \"Credit Information for Specific Processors\" in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. For details, see \"Zero Amount Authorizations,\" \"Credit Information for Specific Processors\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Card Present Required to include either this field or `orderInformation.lineItems[].unitPrice` for the order.  #### Invoicing Required for creating a new invoice.  #### PIN Debit Amount you requested for the PIN debit purchase. This value is returned for partial authorizations. The issuing bank can approve a partial amount if the balance on the debit card is less than the requested transaction amount.  Required field for PIN Debit purchase and PIN Debit credit requests. Optional field for PIN Debit reversal requests.  #### GPX This field is optional for reversing an authorization or credit; however, for all other processors, these fields are required.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either this field or the 1st line item in the order and the specific line-order amount in your request. For details, see `grand_total_amount` field description in [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf).  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in \"Authorization Information for Specific Processors\" of the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### DCC for First Data Not used. ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails currency(String currency) {
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

  public Ptsv2paymentsOrderInformationAmountDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Total discount amount applied to the order. 
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Total discount amount applied to the order. ")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails dutyAmount(String dutyAmount) {
    this.dutyAmount = dutyAmount;
    return this;
  }

   /**
   * Total charges for any import or export duties included in the order. 
   * @return dutyAmount
  **/
  @ApiModelProperty(value = "Total charges for any import or export duties included in the order. ")
  public String getDutyAmount() {
    return dutyAmount;
  }

  public void setDutyAmount(String dutyAmount) {
    this.dutyAmount = dutyAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails gratuityAmount(String gratuityAmount) {
    this.gratuityAmount = gratuityAmount;
    return this;
  }

   /**
   * Gratuity or tip amount for restaurants when the card is present. Allowed only when &#x60;industryDatatype&#x3D;restaurant&#x60;. When your customer uses a debit card or prepaid card, and you receive a partial authorization, the payment networks recommend that you do not submit a capture amount that is higher than the authorized amount. When the capture amount exceeds the partial amount that was approved, the issuer has chargeback rights for the excess amount.  #### Used by **Capture** Optional field.  #### CyberSource through VisaNet Restaurant data is supported only on CyberSource through VisaNet. 
   * @return gratuityAmount
  **/
  @ApiModelProperty(value = "Gratuity or tip amount for restaurants when the card is present. Allowed only when `industryDatatype=restaurant`. When your customer uses a debit card or prepaid card, and you receive a partial authorization, the payment networks recommend that you do not submit a capture amount that is higher than the authorized amount. When the capture amount exceeds the partial amount that was approved, the issuer has chargeback rights for the excess amount.  #### Used by **Capture** Optional field.  #### CyberSource through VisaNet Restaurant data is supported only on CyberSource through VisaNet. ")
  public String getGratuityAmount() {
    return gratuityAmount;
  }

  public void setGratuityAmount(String gratuityAmount) {
    this.gratuityAmount = gratuityAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount for all the items in the order. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax amount for all the items in the order. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails nationalTaxIncluded(String nationalTaxIncluded) {
    this.nationalTaxIncluded = nationalTaxIncluded;
    return this;
  }

   /**
   * Flag that indicates whether a national tax is included in the order total.  Possible values:   - **0**: national tax not included  - **1**: national tax included 
   * @return nationalTaxIncluded
  **/
  @ApiModelProperty(value = "Flag that indicates whether a national tax is included in the order total.  Possible values:   - **0**: national tax not included  - **1**: national tax included ")
  public String getNationalTaxIncluded() {
    return nationalTaxIncluded;
  }

  public void setNationalTaxIncluded(String nationalTaxIncluded) {
    this.nationalTaxIncluded = nationalTaxIncluded;
  }

  public Ptsv2paymentsOrderInformationAmountDetails taxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
    return this;
  }

   /**
   * Flag that indicates how the merchant manages discounts.  Possible values:   - **0**: no invoice level discount included  - **1**: tax calculated on the postdiscount invoice total  - **2**: tax calculated on the prediscount invoice total 
   * @return taxAppliedAfterDiscount
  **/
  @ApiModelProperty(value = "Flag that indicates how the merchant manages discounts.  Possible values:   - **0**: no invoice level discount included  - **1**: tax calculated on the postdiscount invoice total  - **2**: tax calculated on the prediscount invoice total ")
  public String getTaxAppliedAfterDiscount() {
    return taxAppliedAfterDiscount;
  }

  public void setTaxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails taxAppliedLevel(String taxAppliedLevel) {
    this.taxAppliedLevel = taxAppliedLevel;
    return this;
  }

   /**
   * Flag that indicates how you calculate tax.  Possible values:   - **0**: net prices with tax calculated at line item level  - **1**: net prices with tax calculated at invoice level  - **2**: gross prices with tax provided at line item level  - **3**: gross prices with tax provided at invoice level  - **4**: no tax applies on the invoice for the transaction 
   * @return taxAppliedLevel
  **/
  @ApiModelProperty(value = "Flag that indicates how you calculate tax.  Possible values:   - **0**: net prices with tax calculated at line item level  - **1**: net prices with tax calculated at invoice level  - **2**: gross prices with tax provided at line item level  - **3**: gross prices with tax provided at invoice level  - **4**: no tax applies on the invoice for the transaction ")
  public String getTaxAppliedLevel() {
    return taxAppliedLevel;
  }

  public void setTaxAppliedLevel(String taxAppliedLevel) {
    this.taxAppliedLevel = taxAppliedLevel;
  }

  public Ptsv2paymentsOrderInformationAmountDetails taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

   /**
   * For tax amounts that can be categorized as one tax type.  This field contains the tax type code that corresponds to the entry in the _lineItems.taxAmount_ field.  Possible values:   - **056**: sales tax (U.S only)  - **TX~**: all taxes (Canada only)   Note ~ &#x3D; space. 
   * @return taxTypeCode
  **/
  @ApiModelProperty(value = "For tax amounts that can be categorized as one tax type.  This field contains the tax type code that corresponds to the entry in the _lineItems.taxAmount_ field.  Possible values:   - **056**: sales tax (U.S only)  - **TX~**: all taxes (Canada only)   Note ~ = space. ")
  public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }

  public Ptsv2paymentsOrderInformationAmountDetails freightAmount(String freightAmount) {
    this.freightAmount = freightAmount;
    return this;
  }

   /**
   * Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field.  For processor-specific information, see the freight_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return freightAmount
  **/
  @ApiModelProperty(value = "Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field.  For processor-specific information, see the freight_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(String freightAmount) {
    this.freightAmount = freightAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails foreignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
    return this;
  }

   /**
   * Set this field to the converted amount that was returned by the DCC provider. For processor-specific information, see the &#x60;foreign_amount&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return foreignAmount
  **/
  @ApiModelProperty(value = "Set this field to the converted amount that was returned by the DCC provider. For processor-specific information, see the `foreign_amount` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getForeignAmount() {
    return foreignAmount;
  }

  public void setForeignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails foreignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * Set this field to the converted amount that was returned by the DCC provider. 
   * @return foreignCurrency
  **/
  @ApiModelProperty(value = "Set this field to the converted amount that was returned by the DCC provider. ")
  public String getForeignCurrency() {
    return foreignCurrency;
  }

  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }

  public Ptsv2paymentsOrderInformationAmountDetails exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Exchange rate returned by the DCC service. Includes a decimal point and a maximum of 4 decimal places.  For details, see &#x60;exchange_rate&#x60; request-level field description in the [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf) 
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "Exchange rate returned by the DCC service. Includes a decimal point and a maximum of 4 decimal places.  For details, see `exchange_rate` request-level field description in the [Dynamic Currency Conversion For First Data Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/DCC_FirstData_SCMP/DCC_FirstData_SCMP_API.pdf) ")
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public Ptsv2paymentsOrderInformationAmountDetails exchangeRateTimeStamp(String exchangeRateTimeStamp) {
    this.exchangeRateTimeStamp = exchangeRateTimeStamp;
    return this;
  }

   /**
   * Time stamp for the exchange rate. This value is returned by the DCC service.  Format: &#x60;YYYYMMDD~HH:MM&#x60;  where ~ denotes a space. 
   * @return exchangeRateTimeStamp
  **/
  @ApiModelProperty(value = "Time stamp for the exchange rate. This value is returned by the DCC service.  Format: `YYYYMMDD~HH:MM`  where ~ denotes a space. ")
  public String getExchangeRateTimeStamp() {
    return exchangeRateTimeStamp;
  }

  public void setExchangeRateTimeStamp(String exchangeRateTimeStamp) {
    this.exchangeRateTimeStamp = exchangeRateTimeStamp;
  }

  public Ptsv2paymentsOrderInformationAmountDetails surcharge(Ptsv2paymentsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationAmountDetailsSurcharge getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Ptsv2paymentsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
  }

  public Ptsv2paymentsOrderInformationAmountDetails settlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder’s account. 
   * @return settlementAmount
  **/
  @ApiModelProperty(value = "This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholder’s account. ")
  public String getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder&#39;s account. 
   * @return settlementCurrency
  **/
  @ApiModelProperty(value = "This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder's account. ")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public Ptsv2paymentsOrderInformationAmountDetails amexAdditionalAmounts(List<Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts) {
    this.amexAdditionalAmounts = amexAdditionalAmounts;
    return this;
  }

  public Ptsv2paymentsOrderInformationAmountDetails addAmexAdditionalAmountsItem(Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts amexAdditionalAmountsItem) {
    if (this.amexAdditionalAmounts == null) {
      this.amexAdditionalAmounts = new ArrayList<Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts>();
    }
    this.amexAdditionalAmounts.add(amexAdditionalAmountsItem);
    return this;
  }

   /**
   * Get amexAdditionalAmounts
   * @return amexAdditionalAmounts
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> getAmexAdditionalAmounts() {
    return amexAdditionalAmounts;
  }

  public void setAmexAdditionalAmounts(List<Ptsv2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts) {
    this.amexAdditionalAmounts = amexAdditionalAmounts;
  }

  public Ptsv2paymentsOrderInformationAmountDetails taxDetails(List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public Ptsv2paymentsOrderInformationAmountDetails addTaxDetailsItem(Ptsv2paymentsOrderInformationAmountDetailsTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<Ptsv2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public Ptsv2paymentsOrderInformationAmountDetails serviceFeeAmount(String serviceFeeAmount) {
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

  public Ptsv2paymentsOrderInformationAmountDetails originalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Amount in your original local pricing currency.  This value cannot be negative. You can include a decimal point (.) in this field to denote the currency exponent, but you cannot include any other special characters.  If needed, CyberSource truncates the amount to the correct number of decimal places. 
   * @return originalAmount
  **/
  @ApiModelProperty(value = "Amount in your original local pricing currency.  This value cannot be negative. You can include a decimal point (.) in this field to denote the currency exponent, but you cannot include any other special characters.  If needed, CyberSource truncates the amount to the correct number of decimal places. ")
  public String getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails originalCurrency(String originalCurrency) {
    this.originalCurrency = originalCurrency;
    return this;
  }

   /**
   * Your local pricing currency code.  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) 
   * @return originalCurrency
  **/
  @ApiModelProperty(value = "Your local pricing currency code.  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) ")
  public String getOriginalCurrency() {
    return originalCurrency;
  }

  public void setOriginalCurrency(String originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public Ptsv2paymentsOrderInformationAmountDetails cashbackAmount(String cashbackAmount) {
    this.cashbackAmount = cashbackAmount;
    return this;
  }

   /**
   * Cashback amount in the acquirer’s currency. If a cashback amount is included in the request, it must be included in the &#x60;orderInformation.amountDetails.totalAmount&#x60; value.  This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization** Optional. **Authorization Reversal** Optional.  #### PIN debit Required field for PIN debit purchase, PIN debit credit or PIN debit reversal. 
   * @return cashbackAmount
  **/
  @ApiModelProperty(value = "Cashback amount in the acquirer’s currency. If a cashback amount is included in the request, it must be included in the `orderInformation.amountDetails.totalAmount` value.  This field is supported only on CyberSource through VisaNet.  #### Used by **Authorization** Optional. **Authorization Reversal** Optional.  #### PIN debit Required field for PIN debit purchase, PIN debit credit or PIN debit reversal. ")
  public String getCashbackAmount() {
    return cashbackAmount;
  }

  public void setCashbackAmount(String cashbackAmount) {
    this.cashbackAmount = cashbackAmount;
  }

  public Ptsv2paymentsOrderInformationAmountDetails currencyConversion(Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(Ptsv2paymentsOrderInformationAmountDetailsCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetails ptsv2paymentsOrderInformationAmountDetails = (Ptsv2paymentsOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, ptsv2paymentsOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, ptsv2paymentsOrderInformationAmountDetails.currency) &&
        Objects.equals(this.discountAmount, ptsv2paymentsOrderInformationAmountDetails.discountAmount) &&
        Objects.equals(this.dutyAmount, ptsv2paymentsOrderInformationAmountDetails.dutyAmount) &&
        Objects.equals(this.gratuityAmount, ptsv2paymentsOrderInformationAmountDetails.gratuityAmount) &&
        Objects.equals(this.taxAmount, ptsv2paymentsOrderInformationAmountDetails.taxAmount) &&
        Objects.equals(this.nationalTaxIncluded, ptsv2paymentsOrderInformationAmountDetails.nationalTaxIncluded) &&
        Objects.equals(this.taxAppliedAfterDiscount, ptsv2paymentsOrderInformationAmountDetails.taxAppliedAfterDiscount) &&
        Objects.equals(this.taxAppliedLevel, ptsv2paymentsOrderInformationAmountDetails.taxAppliedLevel) &&
        Objects.equals(this.taxTypeCode, ptsv2paymentsOrderInformationAmountDetails.taxTypeCode) &&
        Objects.equals(this.freightAmount, ptsv2paymentsOrderInformationAmountDetails.freightAmount) &&
        Objects.equals(this.foreignAmount, ptsv2paymentsOrderInformationAmountDetails.foreignAmount) &&
        Objects.equals(this.foreignCurrency, ptsv2paymentsOrderInformationAmountDetails.foreignCurrency) &&
        Objects.equals(this.exchangeRate, ptsv2paymentsOrderInformationAmountDetails.exchangeRate) &&
        Objects.equals(this.exchangeRateTimeStamp, ptsv2paymentsOrderInformationAmountDetails.exchangeRateTimeStamp) &&
        Objects.equals(this.surcharge, ptsv2paymentsOrderInformationAmountDetails.surcharge) &&
        Objects.equals(this.settlementAmount, ptsv2paymentsOrderInformationAmountDetails.settlementAmount) &&
        Objects.equals(this.settlementCurrency, ptsv2paymentsOrderInformationAmountDetails.settlementCurrency) &&
        Objects.equals(this.amexAdditionalAmounts, ptsv2paymentsOrderInformationAmountDetails.amexAdditionalAmounts) &&
        Objects.equals(this.taxDetails, ptsv2paymentsOrderInformationAmountDetails.taxDetails) &&
        Objects.equals(this.serviceFeeAmount, ptsv2paymentsOrderInformationAmountDetails.serviceFeeAmount) &&
        Objects.equals(this.originalAmount, ptsv2paymentsOrderInformationAmountDetails.originalAmount) &&
        Objects.equals(this.originalCurrency, ptsv2paymentsOrderInformationAmountDetails.originalCurrency) &&
        Objects.equals(this.cashbackAmount, ptsv2paymentsOrderInformationAmountDetails.cashbackAmount) &&
        Objects.equals(this.currencyConversion, ptsv2paymentsOrderInformationAmountDetails.currencyConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, discountAmount, dutyAmount, gratuityAmount, taxAmount, nationalTaxIncluded, taxAppliedAfterDiscount, taxAppliedLevel, taxTypeCode, freightAmount, foreignAmount, foreignCurrency, exchangeRate, exchangeRateTimeStamp, surcharge, settlementAmount, settlementCurrency, amexAdditionalAmounts, taxDetails, serviceFeeAmount, originalAmount, originalCurrency, cashbackAmount, currencyConversion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    dutyAmount: ").append(toIndentedString(dutyAmount)).append("\n");
    sb.append("    gratuityAmount: ").append(toIndentedString(gratuityAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    nationalTaxIncluded: ").append(toIndentedString(nationalTaxIncluded)).append("\n");
    sb.append("    taxAppliedAfterDiscount: ").append(toIndentedString(taxAppliedAfterDiscount)).append("\n");
    sb.append("    taxAppliedLevel: ").append(toIndentedString(taxAppliedLevel)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    freightAmount: ").append(toIndentedString(freightAmount)).append("\n");
    sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    exchangeRateTimeStamp: ").append(toIndentedString(exchangeRateTimeStamp)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    amexAdditionalAmounts: ").append(toIndentedString(amexAdditionalAmounts)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    serviceFeeAmount: ").append(toIndentedString(serviceFeeAmount)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    cashbackAmount: ").append(toIndentedString(cashbackAmount)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
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

