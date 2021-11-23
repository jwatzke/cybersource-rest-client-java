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
import java.util.ArrayList;
import java.util.List;

/**
 * PtsV2PaymentsPost201ResponseRiskInformationInfoCodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationInfoCodes {
  @SerializedName("velocity")
  private List<String> velocity = null;

  @SerializedName("address")
  private List<String> address = null;

  @SerializedName("customerList")
  private List<String> customerList = null;

  @SerializedName("deviceBehavior")
  private List<String> deviceBehavior = null;

  @SerializedName("identityChange")
  private List<String> identityChange = null;

  @SerializedName("internet")
  private List<String> internet = null;

  @SerializedName("phone")
  private List<String> phone = null;

  @SerializedName("suspicious")
  private List<String> suspicious = null;

  @SerializedName("globalVelocity")
  private List<String> globalVelocity = null;

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes velocity(List<String> velocity) {
    this.velocity = velocity;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addVelocityItem(String velocityItem) {
    if (this.velocity == null) {
      this.velocity = new ArrayList<String>();
    }
    this.velocity.add(velocityItem);
    return this;
  }

   /**
   * List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules. 
   * @return velocity
  **/
  @ApiModelProperty(value = "List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules. ")
  public List<String> getVelocity() {
    return velocity;
  }

  public void setVelocity(List<String> velocity) {
    this.velocity = velocity;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes address(List<String> address) {
    this.address = address;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Indicates a mismatch between the customer’s billing and shipping addresses. 
   * @return address
  **/
  @ApiModelProperty(value = "Indicates a mismatch between the customer’s billing and shipping addresses. ")
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes customerList(List<String> customerList) {
    this.customerList = customerList;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addCustomerListItem(String customerListItem) {
    if (this.customerList == null) {
      this.customerList = new ArrayList<String>();
    }
    this.customerList.add(customerListItem);
    return this;
  }

   /**
   * Indicates that customer information is associated with transactions that are either on the negative or the positive list. 
   * @return customerList
  **/
  @ApiModelProperty(value = "Indicates that customer information is associated with transactions that are either on the negative or the positive list. ")
  public List<String> getCustomerList() {
    return customerList;
  }

  public void setCustomerList(List<String> customerList) {
    this.customerList = customerList;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes deviceBehavior(List<String> deviceBehavior) {
    this.deviceBehavior = deviceBehavior;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addDeviceBehaviorItem(String deviceBehaviorItem) {
    if (this.deviceBehavior == null) {
      this.deviceBehavior = new ArrayList<String>();
    }
    this.deviceBehavior.add(deviceBehaviorItem);
    return this;
  }

   /**
   * Indicates the device behavior information code(s) returned from device fingerprinting. 
   * @return deviceBehavior
  **/
  @ApiModelProperty(value = "Indicates the device behavior information code(s) returned from device fingerprinting. ")
  public List<String> getDeviceBehavior() {
    return deviceBehavior;
  }

  public void setDeviceBehavior(List<String> deviceBehavior) {
    this.deviceBehavior = deviceBehavior;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes identityChange(List<String> identityChange) {
    this.identityChange = identityChange;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addIdentityChangeItem(String identityChangeItem) {
    if (this.identityChange == null) {
      this.identityChange = new ArrayList<String>();
    }
    this.identityChange.add(identityChangeItem);
    return this;
  }

   /**
   * Indicates excessive identity changes. The threshold is variable depending on the identity elements being compared. 
   * @return identityChange
  **/
  @ApiModelProperty(value = "Indicates excessive identity changes. The threshold is variable depending on the identity elements being compared. ")
  public List<String> getIdentityChange() {
    return identityChange;
  }

  public void setIdentityChange(List<String> identityChange) {
    this.identityChange = identityChange;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes internet(List<String> internet) {
    this.internet = internet;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addInternetItem(String internetItem) {
    if (this.internet == null) {
      this.internet = new ArrayList<String>();
    }
    this.internet.add(internetItem);
    return this;
  }

   /**
   * Indicates a problem with the customer’s email address, IP address, or billing address. 
   * @return internet
  **/
  @ApiModelProperty(value = "Indicates a problem with the customer’s email address, IP address, or billing address. ")
  public List<String> getInternet() {
    return internet;
  }

  public void setInternet(List<String> internet) {
    this.internet = internet;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes phone(List<String> phone) {
    this.phone = phone;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addPhoneItem(String phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<String>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * Indicates a problem with the customer’s phone number. 
   * @return phone
  **/
  @ApiModelProperty(value = "Indicates a problem with the customer’s phone number. ")
  public List<String> getPhone() {
    return phone;
  }

  public void setPhone(List<String> phone) {
    this.phone = phone;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes suspicious(List<String> suspicious) {
    this.suspicious = suspicious;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addSuspiciousItem(String suspiciousItem) {
    if (this.suspicious == null) {
      this.suspicious = new ArrayList<String>();
    }
    this.suspicious.add(suspiciousItem);
    return this;
  }

   /**
   * Indicates that the customer provided potentially suspicious information. 
   * @return suspicious
  **/
  @ApiModelProperty(value = "Indicates that the customer provided potentially suspicious information. ")
  public List<String> getSuspicious() {
    return suspicious;
  }

  public void setSuspicious(List<String> suspicious) {
    this.suspicious = suspicious;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes globalVelocity(List<String> globalVelocity) {
    this.globalVelocity = globalVelocity;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes addGlobalVelocityItem(String globalVelocityItem) {
    if (this.globalVelocity == null) {
      this.globalVelocity = new ArrayList<String>();
    }
    this.globalVelocity.add(globalVelocityItem);
    return this;
  }

   /**
   * Indicates that the customer has a high purchase frequency. 
   * @return globalVelocity
  **/
  @ApiModelProperty(value = "Indicates that the customer has a high purchase frequency. ")
  public List<String> getGlobalVelocity() {
    return globalVelocity;
  }

  public void setGlobalVelocity(List<String> globalVelocity) {
    this.globalVelocity = globalVelocity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationInfoCodes ptsV2PaymentsPost201ResponseRiskInformationInfoCodes = (PtsV2PaymentsPost201ResponseRiskInformationInfoCodes) o;
    return Objects.equals(this.velocity, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.velocity) &&
        Objects.equals(this.address, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.address) &&
        Objects.equals(this.customerList, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.customerList) &&
        Objects.equals(this.deviceBehavior, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.deviceBehavior) &&
        Objects.equals(this.identityChange, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.identityChange) &&
        Objects.equals(this.internet, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.internet) &&
        Objects.equals(this.phone, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.phone) &&
        Objects.equals(this.suspicious, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.suspicious) &&
        Objects.equals(this.globalVelocity, ptsV2PaymentsPost201ResponseRiskInformationInfoCodes.globalVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(velocity, address, customerList, deviceBehavior, identityChange, internet, phone, suspicious, globalVelocity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationInfoCodes {\n");
    
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customerList: ").append(toIndentedString(customerList)).append("\n");
    sb.append("    deviceBehavior: ").append(toIndentedString(deviceBehavior)).append("\n");
    sb.append("    identityChange: ").append(toIndentedString(identityChange)).append("\n");
    sb.append("    internet: ").append(toIndentedString(internet)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    suspicious: ").append(toIndentedString(suspicious)).append("\n");
    sb.append("    globalVelocity: ").append(toIndentedString(globalVelocity)).append("\n");
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

