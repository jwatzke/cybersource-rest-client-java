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
 * InlineResponse400Details
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class InlineResponse400Details {
  @SerializedName("name")
  private String name = null;

  @SerializedName("location")
  private String location = null;

   /**
   * The name of the field that caused the error.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the field that caused the error.")
  public String getName() {
    return name;
  }

   /**
   * The location of the field that caused the error.
   * @return location
  **/
  @ApiModelProperty(value = "The location of the field that caused the error.")
  public String getLocation() {
    return location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400Details inlineResponse400Details = (InlineResponse400Details) o;
    return Objects.equals(this.name, inlineResponse400Details.name) &&
        Objects.equals(this.location, inlineResponse400Details.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400Details {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

