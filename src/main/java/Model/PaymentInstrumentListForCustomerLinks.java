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
import Model.PaymentInstrumentListForCustomerLinksFirst;
import Model.PaymentInstrumentListForCustomerLinksLast;
import Model.PaymentInstrumentListForCustomerLinksNext;
import Model.PaymentInstrumentListForCustomerLinksPrev;
import Model.PaymentInstrumentListForCustomerLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInstrumentListForCustomerLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class PaymentInstrumentListForCustomerLinks {
  @SerializedName("self")
  private PaymentInstrumentListForCustomerLinksSelf self = null;

  @SerializedName("first")
  private PaymentInstrumentListForCustomerLinksFirst first = null;

  @SerializedName("prev")
  private PaymentInstrumentListForCustomerLinksPrev prev = null;

  @SerializedName("next")
  private PaymentInstrumentListForCustomerLinksNext next = null;

  @SerializedName("last")
  private PaymentInstrumentListForCustomerLinksLast last = null;

  public PaymentInstrumentListForCustomerLinks self(PaymentInstrumentListForCustomerLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListForCustomerLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PaymentInstrumentListForCustomerLinksSelf self) {
    this.self = self;
  }

  public PaymentInstrumentListForCustomerLinks first(PaymentInstrumentListForCustomerLinksFirst first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListForCustomerLinksFirst getFirst() {
    return first;
  }

  public void setFirst(PaymentInstrumentListForCustomerLinksFirst first) {
    this.first = first;
  }

  public PaymentInstrumentListForCustomerLinks prev(PaymentInstrumentListForCustomerLinksPrev prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListForCustomerLinksPrev getPrev() {
    return prev;
  }

  public void setPrev(PaymentInstrumentListForCustomerLinksPrev prev) {
    this.prev = prev;
  }

  public PaymentInstrumentListForCustomerLinks next(PaymentInstrumentListForCustomerLinksNext next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListForCustomerLinksNext getNext() {
    return next;
  }

  public void setNext(PaymentInstrumentListForCustomerLinksNext next) {
    this.next = next;
  }

  public PaymentInstrumentListForCustomerLinks last(PaymentInstrumentListForCustomerLinksLast last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListForCustomerLinksLast getLast() {
    return last;
  }

  public void setLast(PaymentInstrumentListForCustomerLinksLast last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentListForCustomerLinks paymentInstrumentListForCustomerLinks = (PaymentInstrumentListForCustomerLinks) o;
    return Objects.equals(this.self, paymentInstrumentListForCustomerLinks.self) &&
        Objects.equals(this.first, paymentInstrumentListForCustomerLinks.first) &&
        Objects.equals(this.prev, paymentInstrumentListForCustomerLinks.prev) &&
        Objects.equals(this.next, paymentInstrumentListForCustomerLinks.next) &&
        Objects.equals(this.last, paymentInstrumentListForCustomerLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentListForCustomerLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

