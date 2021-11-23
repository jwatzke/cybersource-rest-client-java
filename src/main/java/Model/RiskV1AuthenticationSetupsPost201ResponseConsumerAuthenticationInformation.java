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
 * RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation {
  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("referenceId")
  private String referenceId = null;

  @SerializedName("deviceDataCollectionUrl")
  private String deviceDataCollectionUrl = null;

  public RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * JSON Web Token (JWT) used to authenticate the consumer with the authentication provider, such as, CardinalCommerce or Rupay. Note - Max Length of this field is 2048 characters. 
   * @return accessToken
  **/
  @ApiModelProperty(value = "JSON Web Token (JWT) used to authenticate the consumer with the authentication provider, such as, CardinalCommerce or Rupay. Note - Max Length of this field is 2048 characters. ")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * This identifier represents cardinal has started device data collection session and this must be passed in Authentication JWT to Cardinal when invoking the deviceDataCollectionUrl. 
   * @return referenceId
  **/
  @ApiModelProperty(value = "This identifier represents cardinal has started device data collection session and this must be passed in Authentication JWT to Cardinal when invoking the deviceDataCollectionUrl. ")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation deviceDataCollectionUrl(String deviceDataCollectionUrl) {
    this.deviceDataCollectionUrl = deviceDataCollectionUrl;
    return this;
  }

   /**
   * The deviceDataCollectionUrl is the location to send the Authentication JWT when invoking the Device Data collection process. 
   * @return deviceDataCollectionUrl
  **/
  @ApiModelProperty(value = "The deviceDataCollectionUrl is the location to send the Authentication JWT when invoking the Device Data collection process. ")
  public String getDeviceDataCollectionUrl() {
    return deviceDataCollectionUrl;
  }

  public void setDeviceDataCollectionUrl(String deviceDataCollectionUrl) {
    this.deviceDataCollectionUrl = deviceDataCollectionUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation riskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation = (RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation) o;
    return Objects.equals(this.accessToken, riskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation.accessToken) &&
        Objects.equals(this.referenceId, riskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation.referenceId) &&
        Objects.equals(this.deviceDataCollectionUrl, riskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation.deviceDataCollectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, referenceId, deviceDataCollectionUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AuthenticationSetupsPost201ResponseConsumerAuthenticationInformation {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    deviceDataCollectionUrl: ").append(toIndentedString(deviceDataCollectionUrl)).append("\n");
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

