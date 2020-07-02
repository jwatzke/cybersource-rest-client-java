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
 * The latest card details associated with the Network Token
 */
@ApiModel(description = "The latest card details associated with the Network Token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

   /**
   * The latest card suffix, automatically updated
   * @return suffix
  **/
  @ApiModelProperty(example = "1111", value = "The latest card suffix, automatically updated")
  public String getSuffix() {
    return suffix;
  }

   /**
   * The latest card expiration month, automatically updated
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "The latest card expiration month, automatically updated")
  public String getExpirationMonth() {
    return expirationMonth;
  }

   /**
   * The latest card expiration year, automatically updated
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2023", value = "The latest card expiration year, automatically updated")
  public String getExpirationYear() {
    return expirationYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard tmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard = (TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard) o;
    return Objects.equals(this.suffix, tmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard.suffix) &&
        Objects.equals(this.expirationMonth, tmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, expirationMonth, expirationYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200ResponseTokenizedCardCard {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
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

