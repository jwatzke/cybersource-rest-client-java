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
 * TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting {
  @SerializedName("name")
  private String name = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("sequence")
  private String sequence = null;

  public TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Processor. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Processor. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;processorInformation.responseCategoryCode&#x60; field. String (3) 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `processorInformation.responseCategoryCode` field. String (3) ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Indicates the reason why a request succeeded or failed and possible action to take if a request fails.  For details, see the appendix of reason codes in the documentation for the relevant payment method. 
   * @return reasonCode
  **/
  @ApiModelProperty(value = "Indicates the reason why a request succeeded or failed and possible action to take if a request fails.  For details, see the appendix of reason codes in the documentation for the relevant payment method. ")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * The order in which the transaction was routed to the processor 
   * @return sequence
  **/
  @ApiModelProperty(value = "The order in which the transaction was routed to the processor ")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting tssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting = (TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting.name) &&
        Objects.equals(this.responseCode, tssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting.responseCode) &&
        Objects.equals(this.reasonCode, tssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting.reasonCode) &&
        Objects.equals(this.sequence, tssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, responseCode, reasonCode, sequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessorInformationMultiProcessorRouting {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

