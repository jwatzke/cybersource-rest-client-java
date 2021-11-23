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
import Model.InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails;
import Model.Invoicingv2invoicesOrderInformationLineItems;
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
 * Contains all of the order-related fields for the invoice.
 */
@ApiModel(description = "Contains all of the order-related fields for the invoice.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class InvoicingV2InvoicesPost201ResponseOrderInformation {
  @SerializedName("amountDetails")
  private InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("lineItems")
  private List<Invoicingv2invoicesOrderInformationLineItems> lineItems = null;

  public InvoicingV2InvoicesPost201ResponseOrderInformation amountDetails(InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(InvoicingV2InvoicesPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformation lineItems(List<Invoicingv2invoicesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public InvoicingV2InvoicesPost201ResponseOrderInformation addLineItemsItem(Invoicingv2invoicesOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Invoicingv2invoicesOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Invoicingv2invoicesOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Invoicingv2invoicesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesPost201ResponseOrderInformation invoicingV2InvoicesPost201ResponseOrderInformation = (InvoicingV2InvoicesPost201ResponseOrderInformation) o;
    return Objects.equals(this.amountDetails, invoicingV2InvoicesPost201ResponseOrderInformation.amountDetails) &&
        Objects.equals(this.lineItems, invoicingV2InvoicesPost201ResponseOrderInformation.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesPost201ResponseOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

