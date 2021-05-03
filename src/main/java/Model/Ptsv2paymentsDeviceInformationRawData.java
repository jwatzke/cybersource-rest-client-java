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
 * Ptsv2paymentsDeviceInformationRawData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class Ptsv2paymentsDeviceInformationRawData {
  @SerializedName("data")
  private String data = null;

  @SerializedName("provider")
  private String provider = null;

  public Ptsv2paymentsDeviceInformationRawData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Field that contains the device fingerprint data from the specified provider. The value should be Base64 encoded. 
   * @return data
  **/
  @ApiModelProperty(value = "Field that contains the device fingerprint data from the specified provider. The value should be Base64 encoded. ")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Ptsv2paymentsDeviceInformationRawData provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Possible values: - cardinal - inauth - threatmetrix 
   * @return provider
  **/
  @ApiModelProperty(value = "Possible values: - cardinal - inauth - threatmetrix ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsDeviceInformationRawData ptsv2paymentsDeviceInformationRawData = (Ptsv2paymentsDeviceInformationRawData) o;
    return Objects.equals(this.data, ptsv2paymentsDeviceInformationRawData.data) &&
        Objects.equals(this.provider, ptsv2paymentsDeviceInformationRawData.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, provider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsDeviceInformationRawData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

