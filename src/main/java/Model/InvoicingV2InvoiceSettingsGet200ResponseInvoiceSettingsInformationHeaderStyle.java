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
 * InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle {
  @SerializedName("fontColor")
  private String fontColor = null;

  @SerializedName("backgroundColor")
  private String backgroundColor = null;

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * The invoice font color. The format is a valid hexadecimal code prefixed with &#x60;#&#x60;, such as &#x60;#000000&#x60; for black.
   * @return fontColor
  **/
  @ApiModelProperty(value = "The invoice font color. The format is a valid hexadecimal code prefixed with `#`, such as `#000000` for black.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * The invoice background color. The format is a valid hexadecimal code prefixed with &#x60;#&#x60;, such as &#x60;#ffffff&#x60; for white.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "The invoice background color. The format is a valid hexadecimal code prefixed with `#`, such as `#ffffff` for white.")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle = (InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle) o;
    return Objects.equals(this.fontColor, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle.fontColor) &&
        Objects.equals(this.backgroundColor, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontColor, backgroundColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle {\n");
    
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

