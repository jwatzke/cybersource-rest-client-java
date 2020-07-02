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
import Model.TmsV1InstrumentIdentifiersPost200ResponseCard;
import Model.TmsV1InstrumentIdentifiersPost200ResponseIssuer;
import Model.TmsV1InstrumentIdentifiersPost200ResponseLinks;
import Model.TmsV1InstrumentIdentifiersPost200ResponseMetadata;
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation;
import Model.TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard;
import Model.Tmsv1instrumentidentifiersBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier {
  @SerializedName("_links")
  private TmsV1InstrumentIdentifiersPost200ResponseLinks links = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseCard card = null;

  @SerializedName("tokenizedCard")
  private TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard = null;

  @SerializedName("bankAccount")
  private Tmsv1instrumentidentifiersBankAccount bankAccount = null;

  @SerializedName("issuer")
  private TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer = null;

  @SerializedName("processingInformation")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation = null;

  @SerializedName("metadata")
  private TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier links(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
  }

   /**
   * &#39;Describes type of token.&#39;  Valid values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "'Describes type of token.'  Valid values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * &#39;Current state of the token.&#39;  Valid values: - ACTIVE - CLOSED 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "'Current state of the token.'  Valid values: - ACTIVE - CLOSED ")
  public String getState() {
    return state;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the existing instrument identifier to be linked to the newly created payment instrument.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456789", value = "The ID of the existing instrument identifier to be linked to the newly created payment instrument.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier card(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier tokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier bankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier issuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier processingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier metadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier) o;
    return Objects.equals(this.links, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.links) &&
        Objects.equals(this.object, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.object) &&
        Objects.equals(this.state, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.state) &&
        Objects.equals(this.id, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.id) &&
        Objects.equals(this.card, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.card) &&
        Objects.equals(this.tokenizedCard, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.tokenizedCard) &&
        Objects.equals(this.bankAccount, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.bankAccount) &&
        Objects.equals(this.issuer, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.issuer) &&
        Objects.equals(this.processingInformation, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.processingInformation) &&
        Objects.equals(this.metadata, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, state, id, card, tokenizedCard, bankAccount, issuer, processingInformation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedEmbeddedInstrumentIdentifier {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

