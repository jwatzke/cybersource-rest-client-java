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
 * Riskv1exportcomplianceinquiriesExportComplianceInformationWeights
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class Riskv1exportcomplianceinquiriesExportComplianceInformationWeights {
  @SerializedName("address")
  private String address = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("name")
  private String name = null;

  public Riskv1exportcomplianceinquiriesExportComplianceInformationWeights address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Degree of correlation between a customer’s address and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The address must be identical to the entry in the DPL. - high: (default) The address cannot differ significantly from the entry in the DPL. - medium: The address can differ slightly more from the entry in the DPL. - low: The address can differ significantly from the entry in the DPL. 
   * @return address
  **/
  @ApiModelProperty(value = "Degree of correlation between a customer’s address and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The address must be identical to the entry in the DPL. - high: (default) The address cannot differ significantly from the entry in the DPL. - medium: The address can differ slightly more from the entry in the DPL. - low: The address can differ significantly from the entry in the DPL. ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Riskv1exportcomplianceinquiriesExportComplianceInformationWeights company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Degree of correlation between a company address and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The company name must be identical to the entry in the DPL. - high: (default) The company name cannot differ significantly from the entry in the DPL. - medium: The company name can differ slightly more from the entry in the DPL. - low: The company name can differ significantly from the entry in the DPL. 
   * @return company
  **/
  @ApiModelProperty(value = "Degree of correlation between a company address and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The company name must be identical to the entry in the DPL. - high: (default) The company name cannot differ significantly from the entry in the DPL. - medium: The company name can differ slightly more from the entry in the DPL. - low: The company name can differ significantly from the entry in the DPL. ")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Riskv1exportcomplianceinquiriesExportComplianceInformationWeights name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Degree of correlation between a customer’s name and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The name must be identical to the entry in the DPL. - high: (default) The name cannot differ significantly from the entry in the DPL. - medium: The name can differ slightly more from the entry in the DPL. - low: The name can differ significantly the entry in the DPL. 
   * @return name
  **/
  @ApiModelProperty(value = "Degree of correlation between a customer’s name and an entry in the DPL before a match occurs. This field can contain one of the following values: - exact: The name must be identical to the entry in the DPL. - high: (default) The name cannot differ significantly from the entry in the DPL. - medium: The name can differ slightly more from the entry in the DPL. - low: The name can differ significantly the entry in the DPL. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesExportComplianceInformationWeights riskv1exportcomplianceinquiriesExportComplianceInformationWeights = (Riskv1exportcomplianceinquiriesExportComplianceInformationWeights) o;
    return Objects.equals(this.address, riskv1exportcomplianceinquiriesExportComplianceInformationWeights.address) &&
        Objects.equals(this.company, riskv1exportcomplianceinquiriesExportComplianceInformationWeights.company) &&
        Objects.equals(this.name, riskv1exportcomplianceinquiriesExportComplianceInformationWeights.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, company, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesExportComplianceInformationWeights {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

