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
 * TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults {
  @SerializedName("email")
  private String email = null;

  @SerializedName("emailRaw")
  private String emailRaw = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameRaw")
  private String nameRaw = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("phoneNumberRaw")
  private String phoneNumberRaw = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("streetRaw")
  private String streetRaw = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("postalCodeRaw")
  private String postalCodeRaw = null;

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s email address.  For details, see &#x60;auth_ev_email&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return email
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s email address.  For details, see `auth_ev_email` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults emailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s email address.
   * @return emailRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s email address.")
  public String getEmailRaw() {
    return emailRaw;
  }

  public void setEmailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s name. 
   * @return name
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s name. 
   * @return nameRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s name. ")
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s phone number.  For details, see &#x60;auth_ev_phone_number&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s phone number.  For details, see `auth_ev_phone_number` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults phoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s phone number.
   * @return phoneNumberRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s phone number.")
  public String getPhoneNumberRaw() {
    return phoneNumberRaw;
  }

  public void setPhoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s street address.  For details, see &#x60;auth_ev_street&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return street
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s street address.  For details, see `auth_ev_street` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults streetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s street address.
   * @return streetRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s street address.")
  public String getStreetRaw() {
    return streetRaw;
  }

  public void setStreetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s postal code.  For details, see &#x60;auth_ev_postal_code&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s postal code.  For details, see `auth_ev_postal_code` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults postalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s postal code.
   * @return postalCodeRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s postal code.")
  public String getPostalCodeRaw() {
    return postalCodeRaw;
  }

  public void setPostalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults = (TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults) o;
    return Objects.equals(this.email, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.email) &&
        Objects.equals(this.emailRaw, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.emailRaw) &&
        Objects.equals(this.name, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.name) &&
        Objects.equals(this.nameRaw, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.nameRaw) &&
        Objects.equals(this.phoneNumber, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.phoneNumber) &&
        Objects.equals(this.phoneNumberRaw, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.phoneNumberRaw) &&
        Objects.equals(this.street, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.street) &&
        Objects.equals(this.streetRaw, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.streetRaw) &&
        Objects.equals(this.postalCode, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.postalCode) &&
        Objects.equals(this.postalCodeRaw, tssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults.postalCodeRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, emailRaw, name, nameRaw, phoneNumber, phoneNumberRaw, street, streetRaw, postalCode, postalCodeRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailRaw: ").append(toIndentedString(emailRaw)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberRaw: ").append(toIndentedString(phoneNumberRaw)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetRaw: ").append(toIndentedString(streetRaw)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postalCodeRaw: ").append(toIndentedString(postalCodeRaw)).append("\n");
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

