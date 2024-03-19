/*
 * FastSpring API
 * The FastSpring API and its supported requests, data, endpoints, and rate limits.  The FastSpring API is a backend service you can use to communicate with your FastSpring Store programmatically. It requires basic understanding of HTTP communication methods. The primary API communication methods include: - **GET** - request data from your store - **POST** - send data to your store, such as creating a new product record - **DELETE** - remove data from your store  The structure of the JSON data sent and received using the API is very similar to Webhooks. However, using the FastSpring API, you initiate all communication with your FastSpring Store.  If you prefer a client-side method of communicating with your FastSpring Store and generating dynamic webpage content, check out the [Store Builder Library](https://fastspring.com/docs/get-started-with-store-builder-library/).  ## Access the API  #### API Credentials and Authentication  FastSpring API credentials consist of a single username and password for your entire Store. The username and password are used for [Basic Authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) when making requests to the API.  #### Obtain Your API Credentials  1. Log on to the FastSpring App and navigate to [Integrations](https://fastspring.com/docs/integrations) > **API Credentials**. Initially, the only option on this page is the **Create** command.  2. Click **Create** to generate your API **Username** and **Password**. The page automatically refreshes, and then your credentials are displayed.  3. Make a note of the credentials and store them securely.  The API credentials allow complete access and control over your FastSpring Store. You will not be able to view the password in the FastSpring App after this session. If you forget your API credentials, you can reset them, however any of your stored procedures that rely on API access must be updated immediately with the new credentials. Otherwise, the API requests will fail.  ## API Requests  **Make all requests to https://api.fastspring.com**  When you make your requests, consider the following: - Ensure that the HTTP methods for all calls use uppercase letters (“GET,” “POST,” “DELETE”) Lowercase letters may result in a 404 error response. - FastSpring requires TLS 1.2 (or later) encryption for all calls to the FastSpring API.  - The API requires a **User-Agent** header in all requests. If your request does not include it, you may receive an 401 error message when attempting to make API requests. - The API uses basic authentication and does not support URL-encoded authentication. Use **Base64** to encode your username and password in the header. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Entitlement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UserPrincipal
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserPrincipal {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_SITE_IDS = "siteIds";
  @SerializedName(SERIALIZED_NAME_SITE_IDS)
  private List<String> siteIds = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_SITE_NAME = "siteName";
  @SerializedName(SERIALIZED_NAME_SITE_NAME)
  private String siteName;

  public static final String SERIALIZED_NAME_LOGIN_TOKEN = "loginToken";
  @SerializedName(SERIALIZED_NAME_LOGIN_TOKEN)
  private String loginToken;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public static final String SERIALIZED_NAME_API_ACCESS = "apiAccess";
  @SerializedName(SERIALIZED_NAME_API_ACCESS)
  private Boolean apiAccess;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ENTITLEMENTS = "entitlements";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENTS)
  private List<Entitlement> entitlements = null;

  public static final String SERIALIZED_NAME_CLIENT_CREDENTIALS = "clientCredentials";
  @SerializedName(SERIALIZED_NAME_CLIENT_CREDENTIALS)
  private Boolean clientCredentials;

  /**
   * Gets or Sets authProviderType
   */
  @JsonAdapter(AuthProviderTypeEnum.Adapter.class)
 public enum AuthProviderTypeEnum {
    COGNITO("COGNITO"),
    
    COMMERCE("COMMERCE"),
    
    SOCIAL_GOOGLE("SOCIAL_GOOGLE");

    private String value;

    AuthProviderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthProviderTypeEnum fromValue(String value) {
      for (AuthProviderTypeEnum b : AuthProviderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthProviderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthProviderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthProviderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthProviderTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_PROVIDER_TYPE = "authProviderType";
  @SerializedName(SERIALIZED_NAME_AUTH_PROVIDER_TYPE)
  private AuthProviderTypeEnum authProviderType;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRES = "tokenExpires";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRES)
  private Long tokenExpires;

  public UserPrincipal() {
  }

  public UserPrincipal email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public UserPrincipal siteId(String siteId) {
    
    
    
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    
    
    
    this.siteId = siteId;
  }


  public UserPrincipal siteIds(List<String> siteIds) {
    
    
    
    
    this.siteIds = siteIds;
    return this;
  }

  public UserPrincipal addSiteIdsItem(String siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

   /**
   * Get siteIds
   * @return siteIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSiteIds() {
    return siteIds;
  }


  public void setSiteIds(List<String> siteIds) {
    
    
    
    this.siteIds = siteIds;
  }


  public UserPrincipal firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public UserPrincipal lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public UserPrincipal companyName(String companyName) {
    
    
    
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    
    
    
    this.companyName = companyName;
  }


  public UserPrincipal siteName(String siteName) {
    
    
    
    
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSiteName() {
    return siteName;
  }


  public void setSiteName(String siteName) {
    
    
    
    this.siteName = siteName;
  }


  public UserPrincipal loginToken(String loginToken) {
    
    
    
    
    this.loginToken = loginToken;
    return this;
  }

   /**
   * Get loginToken
   * @return loginToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLoginToken() {
    return loginToken;
  }


  public void setLoginToken(String loginToken) {
    
    
    
    this.loginToken = loginToken;
  }


  public UserPrincipal roles(List<String> roles) {
    
    
    
    
    this.roles = roles;
    return this;
  }

  public UserPrincipal addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    
    
    
    this.roles = roles;
  }


  public UserPrincipal apiAccess(Boolean apiAccess) {
    
    
    
    
    this.apiAccess = apiAccess;
    return this;
  }

   /**
   * Get apiAccess
   * @return apiAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApiAccess() {
    return apiAccess;
  }


  public void setApiAccess(Boolean apiAccess) {
    
    
    
    this.apiAccess = apiAccess;
  }


  public UserPrincipal userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public UserPrincipal entitlements(List<Entitlement> entitlements) {
    
    
    
    
    this.entitlements = entitlements;
    return this;
  }

  public UserPrincipal addEntitlementsItem(Entitlement entitlementsItem) {
    if (this.entitlements == null) {
      this.entitlements = new ArrayList<>();
    }
    this.entitlements.add(entitlementsItem);
    return this;
  }

   /**
   * Get entitlements
   * @return entitlements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Entitlement> getEntitlements() {
    return entitlements;
  }


  public void setEntitlements(List<Entitlement> entitlements) {
    
    
    
    this.entitlements = entitlements;
  }


  public UserPrincipal clientCredentials(Boolean clientCredentials) {
    
    
    
    
    this.clientCredentials = clientCredentials;
    return this;
  }

   /**
   * Get clientCredentials
   * @return clientCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getClientCredentials() {
    return clientCredentials;
  }


  public void setClientCredentials(Boolean clientCredentials) {
    
    
    
    this.clientCredentials = clientCredentials;
  }


  public UserPrincipal authProviderType(AuthProviderTypeEnum authProviderType) {
    
    
    
    
    this.authProviderType = authProviderType;
    return this;
  }

   /**
   * Get authProviderType
   * @return authProviderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthProviderTypeEnum getAuthProviderType() {
    return authProviderType;
  }


  public void setAuthProviderType(AuthProviderTypeEnum authProviderType) {
    
    
    
    this.authProviderType = authProviderType;
  }


  public UserPrincipal accessToken(String accessToken) {
    
    
    
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    
    
    
    this.accessToken = accessToken;
  }


  public UserPrincipal tokenExpires(Long tokenExpires) {
    
    
    
    
    this.tokenExpires = tokenExpires;
    return this;
  }

   /**
   * Get tokenExpires
   * @return tokenExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTokenExpires() {
    return tokenExpires;
  }


  public void setTokenExpires(Long tokenExpires) {
    
    
    
    this.tokenExpires = tokenExpires;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UserPrincipal instance itself
   */
  public UserPrincipal putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPrincipal userPrincipal = (UserPrincipal) o;
    return Objects.equals(this.email, userPrincipal.email) &&
        Objects.equals(this.siteId, userPrincipal.siteId) &&
        Objects.equals(this.siteIds, userPrincipal.siteIds) &&
        Objects.equals(this.firstName, userPrincipal.firstName) &&
        Objects.equals(this.lastName, userPrincipal.lastName) &&
        Objects.equals(this.companyName, userPrincipal.companyName) &&
        Objects.equals(this.siteName, userPrincipal.siteName) &&
        Objects.equals(this.loginToken, userPrincipal.loginToken) &&
        Objects.equals(this.roles, userPrincipal.roles) &&
        Objects.equals(this.apiAccess, userPrincipal.apiAccess) &&
        Objects.equals(this.userId, userPrincipal.userId) &&
        Objects.equals(this.entitlements, userPrincipal.entitlements) &&
        Objects.equals(this.clientCredentials, userPrincipal.clientCredentials) &&
        Objects.equals(this.authProviderType, userPrincipal.authProviderType) &&
        Objects.equals(this.accessToken, userPrincipal.accessToken) &&
        Objects.equals(this.tokenExpires, userPrincipal.tokenExpires)&&
        Objects.equals(this.additionalProperties, userPrincipal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, siteId, siteIds, firstName, lastName, companyName, siteName, loginToken, roles, apiAccess, userId, entitlements, clientCredentials, authProviderType, accessToken, tokenExpires, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPrincipal {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    loginToken: ").append(toIndentedString(loginToken)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    apiAccess: ").append(toIndentedString(apiAccess)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    clientCredentials: ").append(toIndentedString(clientCredentials)).append("\n");
    sb.append("    authProviderType: ").append(toIndentedString(authProviderType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenExpires: ").append(toIndentedString(tokenExpires)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("email");
    openapiFields.add("siteId");
    openapiFields.add("siteIds");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("companyName");
    openapiFields.add("siteName");
    openapiFields.add("loginToken");
    openapiFields.add("roles");
    openapiFields.add("apiAccess");
    openapiFields.add("userId");
    openapiFields.add("entitlements");
    openapiFields.add("clientCredentials");
    openapiFields.add("authProviderType");
    openapiFields.add("accessToken");
    openapiFields.add("tokenExpires");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserPrincipal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserPrincipal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserPrincipal is not found in the empty JSON string", UserPrincipal.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("siteId") != null && !jsonObj.get("siteId").isJsonNull()) && !jsonObj.get("siteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("siteIds") != null && !jsonObj.get("siteIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteIds` to be an array in the JSON string but got `%s`", jsonObj.get("siteIds").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("siteName") != null && !jsonObj.get("siteName").isJsonNull()) && !jsonObj.get("siteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteName").toString()));
      }
      if ((jsonObj.get("loginToken") != null && !jsonObj.get("loginToken").isJsonNull()) && !jsonObj.get("loginToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginToken").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (jsonObj.get("entitlements") != null && !jsonObj.get("entitlements").isJsonNull()) {
        JsonArray jsonArrayentitlements = jsonObj.getAsJsonArray("entitlements");
        if (jsonArrayentitlements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entitlements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entitlements` to be an array in the JSON string but got `%s`", jsonObj.get("entitlements").toString()));
          }

          // validate the optional field `entitlements` (array)
          for (int i = 0; i < jsonArrayentitlements.size(); i++) {
            Entitlement.validateJsonObject(jsonArrayentitlements.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("authProviderType") != null && !jsonObj.get("authProviderType").isJsonNull()) && !jsonObj.get("authProviderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authProviderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authProviderType").toString()));
      }
      if ((jsonObj.get("accessToken") != null && !jsonObj.get("accessToken").isJsonNull()) && !jsonObj.get("accessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPrincipal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPrincipal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPrincipal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPrincipal.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPrincipal>() {
           @Override
           public void write(JsonWriter out, UserPrincipal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UserPrincipal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserPrincipal instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserPrincipal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserPrincipal
  * @throws IOException if the JSON string is invalid with respect to UserPrincipal
  */
  public static UserPrincipal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserPrincipal.class);
  }

 /**
  * Convert an instance of UserPrincipal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

