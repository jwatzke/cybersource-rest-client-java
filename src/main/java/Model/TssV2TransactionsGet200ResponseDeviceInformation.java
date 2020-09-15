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
 * TssV2TransactionsGet200ResponseDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class TssV2TransactionsGet200ResponseDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("cookiesAccepted")
  private String cookiesAccepted = null;

  public TssV2TransactionsGet200ResponseDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public TssV2TransactionsGet200ResponseDeviceInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * DNS resolved hostname from &#x60;ipAddress&#x60;.
   * @return hostName
  **/
  @ApiModelProperty(value = "DNS resolved hostname from `ipAddress`.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public TssV2TransactionsGet200ResponseDeviceInformation cookiesAccepted(String cookiesAccepted) {
    this.cookiesAccepted = cookiesAccepted;
    return this;
  }

   /**
   * Whether the customer’s browser accepts cookies. This field can contain one of the following values: - &#x60;yes&#x60;: The customer’s browser accepts cookies. - &#x60;no&#x60;: The customer’s browser does not accept cookies. 
   * @return cookiesAccepted
  **/
  @ApiModelProperty(value = "Whether the customer’s browser accepts cookies. This field can contain one of the following values: - `yes`: The customer’s browser accepts cookies. - `no`: The customer’s browser does not accept cookies. ")
  public String getCookiesAccepted() {
    return cookiesAccepted;
  }

  public void setCookiesAccepted(String cookiesAccepted) {
    this.cookiesAccepted = cookiesAccepted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseDeviceInformation tssV2TransactionsGet200ResponseDeviceInformation = (TssV2TransactionsGet200ResponseDeviceInformation) o;
    return Objects.equals(this.ipAddress, tssV2TransactionsGet200ResponseDeviceInformation.ipAddress) &&
        Objects.equals(this.hostName, tssV2TransactionsGet200ResponseDeviceInformation.hostName) &&
        Objects.equals(this.cookiesAccepted, tssV2TransactionsGet200ResponseDeviceInformation.cookiesAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, hostName, cookiesAccepted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseDeviceInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    cookiesAccepted: ").append(toIndentedString(cookiesAccepted)).append("\n");
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

