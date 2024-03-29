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
import com.konfigthis.client.model.AddressRequest;
import com.konfigthis.client.model.ContactRequest;
import com.konfigthis.client.model.ItemRequest;
import com.konfigthis.client.model.TagRequest;
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
 * CreateQuoteRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateQuoteRequest {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagRequest> tags = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private String coupon;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE_DAYS = "expirationDateDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE_DAYS)
  private Integer expirationDateDays;

  public static final String SERIALIZED_NAME_FULFILLMENT_TERM = "fulfillmentTerm";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_TERM)
  private String fulfillmentTerm;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ItemRequest> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_NET_TERMS_DAYS = "netTermsDays";
  @SerializedName(SERIALIZED_NAME_NET_TERMS_DAYS)
  private Integer netTermsDays;

  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private AddressRequest recipientAddress;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private ContactRequest recipient;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_I_P = "sourceIP";
  @SerializedName(SERIALIZED_NAME_SOURCE_I_P)
  private String sourceIP;

  public CreateQuoteRequest() {
  }

  public CreateQuoteRequest tags(List<TagRequest> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public CreateQuoteRequest addTagsItem(TagRequest tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TagRequest> getTags() {
    return tags;
  }


  public void setTags(List<TagRequest> tags) {
    
    
    
    this.tags = tags;
  }


  public CreateQuoteRequest coupon(String coupon) {
    
    
    if (coupon != null && coupon.length() < 0) {
      throw new IllegalArgumentException("Invalid value for coupon. Length must be greater than or equal to 0.");
    }
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TENOFF", value = "")

  public String getCoupon() {
    return coupon;
  }


  public void setCoupon(String coupon) {
    
    
    if (coupon != null && coupon.length() < 0) {
      throw new IllegalArgumentException("Invalid value for coupon. Length must be greater than or equal to 0.");
    }
    this.coupon = coupon;
  }


  public CreateQuoteRequest currency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    this.currency = currency;
  }


  public CreateQuoteRequest expirationDateDays(Integer expirationDateDays) {
    if (expirationDateDays != null && expirationDateDays < 1) {
      throw new IllegalArgumentException("Invalid value for expirationDateDays. Must be greater than or equal to 1.");
    }
    if (expirationDateDays != null && expirationDateDays > 90) {
      throw new IllegalArgumentException("Invalid value for expirationDateDays. Must be less than or equal to 90.");
    }
    
    
    this.expirationDateDays = expirationDateDays;
    return this;
  }

   /**
   * Get expirationDateDays
   * minimum: 1
   * maximum: 90
   * @return expirationDateDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getExpirationDateDays() {
    return expirationDateDays;
  }


  public void setExpirationDateDays(Integer expirationDateDays) {
    if (expirationDateDays != null && expirationDateDays < 1) {
      throw new IllegalArgumentException("Invalid value for expirationDateDays. Must be greater than or equal to 1.");
    }
    if (expirationDateDays != null && expirationDateDays > 90) {
      throw new IllegalArgumentException("Invalid value for expirationDateDays. Must be less than or equal to 90.");
    }
    
    this.expirationDateDays = expirationDateDays;
  }


  public CreateQuoteRequest fulfillmentTerm(String fulfillmentTerm) {
    
    
    
    
    this.fulfillmentTerm = fulfillmentTerm;
    return this;
  }

   /**
   * Get fulfillmentTerm
   * @return fulfillmentTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentTerm() {
    return fulfillmentTerm;
  }


  public void setFulfillmentTerm(String fulfillmentTerm) {
    
    
    
    this.fulfillmentTerm = fulfillmentTerm;
  }


  public CreateQuoteRequest items(List<ItemRequest> items) {
    
    
    
    
    this.items = items;
    return this;
  }

  public CreateQuoteRequest addItemsItem(ItemRequest itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ItemRequest> getItems() {
    return items;
  }


  public void setItems(List<ItemRequest> items) {
    
    
    
    this.items = items;
  }


  public CreateQuoteRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Quote for ABC Company", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateQuoteRequest notes(String notes) {
    
    
    if (notes != null && notes.length() < 0) {
      throw new IllegalArgumentException("Invalid value for notes. Length must be greater than or equal to 0.");
    }
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a Note", value = "")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    if (notes != null && notes.length() < 0) {
      throw new IllegalArgumentException("Invalid value for notes. Length must be greater than or equal to 0.");
    }
    this.notes = notes;
  }


  public CreateQuoteRequest netTermsDays(Integer netTermsDays) {
    
    
    
    
    this.netTermsDays = netTermsDays;
    return this;
  }

   /**
   * Get netTermsDays
   * @return netTermsDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNetTermsDays() {
    return netTermsDays;
  }


  public void setNetTermsDays(Integer netTermsDays) {
    
    
    
    this.netTermsDays = netTermsDays;
  }


  public CreateQuoteRequest recipientAddress(AddressRequest recipientAddress) {
    
    
    
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * Get recipientAddress
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressRequest getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(AddressRequest recipientAddress) {
    
    
    
    this.recipientAddress = recipientAddress;
  }


  public CreateQuoteRequest recipient(ContactRequest recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContactRequest getRecipient() {
    return recipient;
  }


  public void setRecipient(ContactRequest recipient) {
    
    
    
    this.recipient = recipient;
  }


  public CreateQuoteRequest taxId(String taxId) {
    
    
    if (taxId != null && taxId.length() < 0) {
      throw new IllegalArgumentException("Invalid value for taxId. Length must be greater than or equal to 0.");
    }
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BE09999999XX", value = "")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    
    
    if (taxId != null && taxId.length() < 0) {
      throw new IllegalArgumentException("Invalid value for taxId. Length must be greater than or equal to 0.");
    }
    this.taxId = taxId;
  }


  public CreateQuoteRequest source(String source) {
    
    
    if (source != null && source.length() < 0) {
      throw new IllegalArgumentException("Invalid value for source. Length must be greater than or equal to 0.");
    }
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MANAGER", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    if (source != null && source.length() < 0) {
      throw new IllegalArgumentException("Invalid value for source. Length must be greater than or equal to 0.");
    }
    this.source = source;
  }


  public CreateQuoteRequest sourceIP(String sourceIP) {
    
    
    if (sourceIP != null && sourceIP.length() < 0) {
      throw new IllegalArgumentException("Invalid value for sourceIP. Length must be greater than or equal to 0.");
    }
    
    this.sourceIP = sourceIP;
    return this;
  }

   /**
   * Get sourceIP
   * @return sourceIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "181.55.25.101", value = "")

  public String getSourceIP() {
    return sourceIP;
  }


  public void setSourceIP(String sourceIP) {
    
    
    if (sourceIP != null && sourceIP.length() < 0) {
      throw new IllegalArgumentException("Invalid value for sourceIP. Length must be greater than or equal to 0.");
    }
    this.sourceIP = sourceIP;
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
   * @return the CreateQuoteRequest instance itself
   */
  public CreateQuoteRequest putAdditionalProperty(String key, Object value) {
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
    CreateQuoteRequest createQuoteRequest = (CreateQuoteRequest) o;
    return Objects.equals(this.tags, createQuoteRequest.tags) &&
        Objects.equals(this.coupon, createQuoteRequest.coupon) &&
        Objects.equals(this.currency, createQuoteRequest.currency) &&
        Objects.equals(this.expirationDateDays, createQuoteRequest.expirationDateDays) &&
        Objects.equals(this.fulfillmentTerm, createQuoteRequest.fulfillmentTerm) &&
        Objects.equals(this.items, createQuoteRequest.items) &&
        Objects.equals(this.name, createQuoteRequest.name) &&
        Objects.equals(this.notes, createQuoteRequest.notes) &&
        Objects.equals(this.netTermsDays, createQuoteRequest.netTermsDays) &&
        Objects.equals(this.recipientAddress, createQuoteRequest.recipientAddress) &&
        Objects.equals(this.recipient, createQuoteRequest.recipient) &&
        Objects.equals(this.taxId, createQuoteRequest.taxId) &&
        Objects.equals(this.source, createQuoteRequest.source) &&
        Objects.equals(this.sourceIP, createQuoteRequest.sourceIP)&&
        Objects.equals(this.additionalProperties, createQuoteRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, coupon, currency, expirationDateDays, fulfillmentTerm, items, name, notes, netTermsDays, recipientAddress, recipient, taxId, source, sourceIP, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQuoteRequest {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    expirationDateDays: ").append(toIndentedString(expirationDateDays)).append("\n");
    sb.append("    fulfillmentTerm: ").append(toIndentedString(fulfillmentTerm)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    netTermsDays: ").append(toIndentedString(netTermsDays)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceIP: ").append(toIndentedString(sourceIP)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("coupon");
    openapiFields.add("currency");
    openapiFields.add("expirationDateDays");
    openapiFields.add("fulfillmentTerm");
    openapiFields.add("items");
    openapiFields.add("name");
    openapiFields.add("notes");
    openapiFields.add("netTermsDays");
    openapiFields.add("recipientAddress");
    openapiFields.add("recipient");
    openapiFields.add("taxId");
    openapiFields.add("source");
    openapiFields.add("sourceIP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recipientAddress");
    openapiRequiredFields.add("recipient");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateQuoteRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateQuoteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateQuoteRequest is not found in the empty JSON string", CreateQuoteRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateQuoteRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TagRequest.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("coupon") != null && !jsonObj.get("coupon").isJsonNull()) && !jsonObj.get("coupon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("fulfillmentTerm") != null && !jsonObj.get("fulfillmentTerm").isJsonNull()) && !jsonObj.get("fulfillmentTerm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentTerm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentTerm").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        ItemRequest.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      // validate the required field `recipientAddress`
      AddressRequest.validateJsonObject(jsonObj.getAsJsonObject("recipientAddress"));
      // validate the required field `recipient`
      ContactRequest.validateJsonObject(jsonObj.getAsJsonObject("recipient"));
      if ((jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonNull()) && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("sourceIP") != null && !jsonObj.get("sourceIP").isJsonNull()) && !jsonObj.get("sourceIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceIP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateQuoteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateQuoteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateQuoteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateQuoteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateQuoteRequest>() {
           @Override
           public void write(JsonWriter out, CreateQuoteRequest value) throws IOException {
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
           public CreateQuoteRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateQuoteRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateQuoteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateQuoteRequest
  * @throws IOException if the JSON string is invalid with respect to CreateQuoteRequest
  */
  public static CreateQuoteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateQuoteRequest.class);
  }

 /**
  * Convert an instance of CreateQuoteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

