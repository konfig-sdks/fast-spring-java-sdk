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
 * ItemRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ItemRequest {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_UNIT_LIST_PRICE = "unitListPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_LIST_PRICE)
  private Double unitListPrice;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public ItemRequest() {
  }

  public ItemRequest product(String product) {
    
    
    if (product != null && product.length() < 0) {
      throw new IllegalArgumentException("Invalid value for product. Length must be greater than or equal to 0.");
    }
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    
    
    if (product != null && product.length() < 0) {
      throw new IllegalArgumentException("Invalid value for product. Length must be greater than or equal to 0.");
    }
    this.product = product;
  }


  public ItemRequest unitListPrice(Double unitListPrice) {
    if (unitListPrice != null && unitListPrice < 0) {
      throw new IllegalArgumentException("Invalid value for unitListPrice. Must be greater than or equal to 0.");
    }
    
    
    
    this.unitListPrice = unitListPrice;
    return this;
  }

  public ItemRequest unitListPrice(Integer unitListPrice) {
    if (unitListPrice != null && unitListPrice < 0) {
      throw new IllegalArgumentException("Invalid value for unitListPrice. Must be greater than or equal to 0.");
    }
    
    
    
    this.unitListPrice = unitListPrice.doubleValue();
    return this;
  }

   /**
   * Get unitListPrice
   * minimum: 0
   * @return unitListPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUnitListPrice() {
    return unitListPrice;
  }


  public void setUnitListPrice(Double unitListPrice) {
    if (unitListPrice != null && unitListPrice < 0) {
      throw new IllegalArgumentException("Invalid value for unitListPrice. Must be greater than or equal to 0.");
    }
    
    
    this.unitListPrice = unitListPrice;
  }


  public ItemRequest quantity(Integer quantity) {
    if (quantity != null && quantity < 1) {
      throw new IllegalArgumentException("Invalid value for quantity. Must be greater than or equal to 1.");
    }
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * minimum: 1
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    if (quantity != null && quantity < 1) {
      throw new IllegalArgumentException("Invalid value for quantity. Must be greater than or equal to 1.");
    }
    
    
    this.quantity = quantity;
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
   * @return the ItemRequest instance itself
   */
  public ItemRequest putAdditionalProperty(String key, Object value) {
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
    ItemRequest itemRequest = (ItemRequest) o;
    return Objects.equals(this.product, itemRequest.product) &&
        Objects.equals(this.unitListPrice, itemRequest.unitListPrice) &&
        Objects.equals(this.quantity, itemRequest.quantity)&&
        Objects.equals(this.additionalProperties, itemRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, unitListPrice, quantity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRequest {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    unitListPrice: ").append(toIndentedString(unitListPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("product");
    openapiFields.add("unitListPrice");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ItemRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemRequest is not found in the empty JSON string", ItemRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ItemRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemRequest>() {
           @Override
           public void write(JsonWriter out, ItemRequest value) throws IOException {
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
           public ItemRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ItemRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ItemRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemRequest
  * @throws IOException if the JSON string is invalid with respect to ItemRequest
  */
  public static ItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemRequest.class);
  }

 /**
  * Convert an instance of ItemRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

