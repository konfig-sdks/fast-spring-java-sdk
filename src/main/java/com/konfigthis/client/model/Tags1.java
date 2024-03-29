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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Tags1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Tags1 {
  public static final String SERIALIZED_NAME_TAG_KEY1 = "TagKey1";
  @SerializedName(SERIALIZED_NAME_TAG_KEY1)
  private String tagKey1;

  public static final String SERIALIZED_NAME_TAG_KEY2 = "TagKey2";
  @SerializedName(SERIALIZED_NAME_TAG_KEY2)
  private String tagKey2;

  public Tags1() {
  }

  public Tags1 tagKey1(String tagKey1) {
    
    
    
    
    this.tagKey1 = tagKey1;
    return this;
  }

   /**
   * Get tagKey1
   * @return tagKey1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TagValue1", required = true, value = "")

  public String getTagKey1() {
    return tagKey1;
  }


  public void setTagKey1(String tagKey1) {
    
    
    
    this.tagKey1 = tagKey1;
  }


  public Tags1 tagKey2(String tagKey2) {
    
    
    
    
    this.tagKey2 = tagKey2;
    return this;
  }

   /**
   * Get tagKey2
   * @return tagKey2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TagValue2", required = true, value = "")

  public String getTagKey2() {
    return tagKey2;
  }


  public void setTagKey2(String tagKey2) {
    
    
    
    this.tagKey2 = tagKey2;
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
   * @return the Tags1 instance itself
   */
  public Tags1 putAdditionalProperty(String key, Object value) {
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
    Tags1 tags1 = (Tags1) o;
    return Objects.equals(this.tagKey1, tags1.tagKey1) &&
        Objects.equals(this.tagKey2, tags1.tagKey2)&&
        Objects.equals(this.additionalProperties, tags1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKey1, tagKey2, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tags1 {\n");
    sb.append("    tagKey1: ").append(toIndentedString(tagKey1)).append("\n");
    sb.append("    tagKey2: ").append(toIndentedString(tagKey2)).append("\n");
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
    openapiFields.add("TagKey1");
    openapiFields.add("TagKey2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TagKey1");
    openapiRequiredFields.add("TagKey2");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Tags1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Tags1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tags1 is not found in the empty JSON string", Tags1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Tags1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("TagKey1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TagKey1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TagKey1").toString()));
      }
      if (!jsonObj.get("TagKey2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TagKey2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TagKey2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tags1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tags1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tags1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tags1.class));

       return (TypeAdapter<T>) new TypeAdapter<Tags1>() {
           @Override
           public void write(JsonWriter out, Tags1 value) throws IOException {
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
           public Tags1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Tags1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Tags1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tags1
  * @throws IOException if the JSON string is invalid with respect to Tags1
  */
  public static Tags1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tags1.class);
  }

 /**
  * Convert an instance of Tags1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

