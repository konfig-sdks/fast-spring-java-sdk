# QuotesApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelQuoteById**](QuotesApi.md#cancelQuoteById) | **POST** /quotes/{id}/cancel | Cancel a quote |
| [**createNewQuote**](QuotesApi.md#createNewQuote) | **POST** /quotes | Create a quote |
| [**deleteQuoteById**](QuotesApi.md#deleteQuoteById) | **DELETE** /quotes/{id} | Delete a quote |
| [**getAllQuotes**](QuotesApi.md#getAllQuotes) | **GET** /quotes | Get all quotes |
| [**getById**](QuotesApi.md#getById) | **GET** /quotes/{id} | Get a quote |
| [**updateQuoteById**](QuotesApi.md#updateQuoteById) | **PUT** /quotes/{id} | Update a quote |


<a name="cancelQuoteById"></a>
# **cancelQuoteById**
> QuoteResponse cancelQuoteById(id).execute();

Cancel a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    String id = "id_example"; // A unique identifier for the quote
    try {
      QuoteResponse result = client
              .quotes
              .cancelQuoteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getBuyerGenerated());
      System.out.println(result.getCoupon());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCurrency());
      System.out.println(result.getDiscount());
      System.out.println(result.getDiscountDisplay());
      System.out.println(result.getDiscountInPayoutCurrency());
      System.out.println(result.getDiscountInPayoutCurrencyDisplay());
      System.out.println(result.getExpires());
      System.out.println(result.getExpirationDateDays());
      System.out.println(result.getFulfillmentTerm());
      System.out.println(result.getItems());
      System.out.println(result.getName());
      System.out.println(result.getNotes());
      System.out.println(result.getNetTermsDays());
      System.out.println(result.getQuoteUrl());
      System.out.println(result.getRecipient());
      System.out.println(result.getRecipientAddress());
      System.out.println(result.getSiteId());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusHistory());
      System.out.println(result.getSubtotal());
      System.out.println(result.getSubtotalDisplay());
      System.out.println(result.getSubtotalInPayoutCurrency());
      System.out.println(result.getSubtotalInPayoutCurrencyDisplay());
      System.out.println(result.getTax());
      System.out.println(result.getTaxType());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDisplay());
      System.out.println(result.getTotalInPayoutCurrency());
      System.out.println(result.getTotalInPayoutCurrencyDisplay());
      System.out.println(result.getUpdated());
      System.out.println(result.getTaxId());
      System.out.println(result.getSource());
      System.out.println(result.getSourceIP());
      System.out.println(result.getIsGrossTax());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#cancelQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QuoteResponse> response = client
              .quotes
              .cancelQuoteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#cancelQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| A unique identifier for the quote | |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createNewQuote"></a>
# **createNewQuote**
> QuoteResponse createNewQuote(createQuoteRequest).execute();

Create a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    List<ItemRequest> items = Arrays.asList();
    String name = "name_example";
    AddressRequest recipientAddress = new AddressRequest();
    ContactRequest recipient = new ContactRequest();
    List<TagRequest> tags = Arrays.asList();
    String coupon = "coupon_example";
    String currency = "currency_example";
    Integer expirationDateDays = 56;
    String fulfillmentTerm = "fulfillmentTerm_example";
    String notes = "notes_example";
    Integer netTermsDays = 56;
    String taxId = "taxId_example";
    String source = "source_example";
    String sourceIP = "sourceIP_example";
    try {
      QuoteResponse result = client
              .quotes
              .createNewQuote(items, name, recipientAddress, recipient)
              .tags(tags)
              .coupon(coupon)
              .currency(currency)
              .expirationDateDays(expirationDateDays)
              .fulfillmentTerm(fulfillmentTerm)
              .notes(notes)
              .netTermsDays(netTermsDays)
              .taxId(taxId)
              .source(source)
              .sourceIP(sourceIP)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getBuyerGenerated());
      System.out.println(result.getCoupon());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCurrency());
      System.out.println(result.getDiscount());
      System.out.println(result.getDiscountDisplay());
      System.out.println(result.getDiscountInPayoutCurrency());
      System.out.println(result.getDiscountInPayoutCurrencyDisplay());
      System.out.println(result.getExpires());
      System.out.println(result.getExpirationDateDays());
      System.out.println(result.getFulfillmentTerm());
      System.out.println(result.getItems());
      System.out.println(result.getName());
      System.out.println(result.getNotes());
      System.out.println(result.getNetTermsDays());
      System.out.println(result.getQuoteUrl());
      System.out.println(result.getRecipient());
      System.out.println(result.getRecipientAddress());
      System.out.println(result.getSiteId());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusHistory());
      System.out.println(result.getSubtotal());
      System.out.println(result.getSubtotalDisplay());
      System.out.println(result.getSubtotalInPayoutCurrency());
      System.out.println(result.getSubtotalInPayoutCurrencyDisplay());
      System.out.println(result.getTax());
      System.out.println(result.getTaxType());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDisplay());
      System.out.println(result.getTotalInPayoutCurrency());
      System.out.println(result.getTotalInPayoutCurrencyDisplay());
      System.out.println(result.getUpdated());
      System.out.println(result.getTaxId());
      System.out.println(result.getSource());
      System.out.println(result.getSourceIP());
      System.out.println(result.getIsGrossTax());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#createNewQuote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QuoteResponse> response = client
              .quotes
              .createNewQuote(items, name, recipientAddress, recipient)
              .tags(tags)
              .coupon(coupon)
              .currency(currency)
              .expirationDateDays(expirationDateDays)
              .fulfillmentTerm(fulfillmentTerm)
              .notes(notes)
              .netTermsDays(netTermsDays)
              .taxId(taxId)
              .source(source)
              .sourceIP(sourceIP)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#createNewQuote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createQuoteRequest** | [**CreateQuoteRequest**](CreateQuoteRequest.md)|  | |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteQuoteById"></a>
# **deleteQuoteById**
> QuoteResponse deleteQuoteById(id).execute();

Delete a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    String id = "id_example"; // A unique identifier for the quote
    try {
      QuoteResponse result = client
              .quotes
              .deleteQuoteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getBuyerGenerated());
      System.out.println(result.getCoupon());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCurrency());
      System.out.println(result.getDiscount());
      System.out.println(result.getDiscountDisplay());
      System.out.println(result.getDiscountInPayoutCurrency());
      System.out.println(result.getDiscountInPayoutCurrencyDisplay());
      System.out.println(result.getExpires());
      System.out.println(result.getExpirationDateDays());
      System.out.println(result.getFulfillmentTerm());
      System.out.println(result.getItems());
      System.out.println(result.getName());
      System.out.println(result.getNotes());
      System.out.println(result.getNetTermsDays());
      System.out.println(result.getQuoteUrl());
      System.out.println(result.getRecipient());
      System.out.println(result.getRecipientAddress());
      System.out.println(result.getSiteId());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusHistory());
      System.out.println(result.getSubtotal());
      System.out.println(result.getSubtotalDisplay());
      System.out.println(result.getSubtotalInPayoutCurrency());
      System.out.println(result.getSubtotalInPayoutCurrencyDisplay());
      System.out.println(result.getTax());
      System.out.println(result.getTaxType());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDisplay());
      System.out.println(result.getTotalInPayoutCurrency());
      System.out.println(result.getTotalInPayoutCurrencyDisplay());
      System.out.println(result.getUpdated());
      System.out.println(result.getTaxId());
      System.out.println(result.getSource());
      System.out.println(result.getSourceIP());
      System.out.println(result.getIsGrossTax());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QuoteResponse> response = client
              .quotes
              .deleteQuoteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| A unique identifier for the quote | |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAllQuotes"></a>
# **getAllQuotes**
> CollectionModelQuoteResponse getAllQuotes().createdBegin(createdBegin).createdEnd(createdEnd).createdEmail(createdEmail).expiresBegin(expiresBegin).expiresEnd(expiresEnd).searchParam(searchParam).expiredBefore(expiredBefore).onlyQuoteId(onlyQuoteId).statuses(statuses).execute();

Get all quotes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    OffsetDateTime createdBegin = OffsetDateTime.now(); // The format must be YYYY-MM-DD
    OffsetDateTime createdEnd = OffsetDateTime.now(); // The format must be YYYY-MM-DD
    String createdEmail = "createdEmail_example";
    OffsetDateTime expiresBegin = OffsetDateTime.now(); // The format must be YYYY-MM-DD
    OffsetDateTime expiresEnd = OffsetDateTime.now(); // The format must be YYYY-MM-DD
    String searchParam = "searchParam_example";
    OffsetDateTime expiredBefore = OffsetDateTime.now(); // The format must be YYYY-MM-DD
    Boolean onlyQuoteId = true;
    List<String> statuses = Arrays.asList();
    try {
      CollectionModelQuoteResponse result = client
              .quotes
              .getAllQuotes()
              .createdBegin(createdBegin)
              .createdEnd(createdEnd)
              .createdEmail(createdEmail)
              .expiresBegin(expiresBegin)
              .expiresEnd(expiresEnd)
              .searchParam(searchParam)
              .expiredBefore(expiredBefore)
              .onlyQuoteId(onlyQuoteId)
              .statuses(statuses)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getContent());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getAllQuotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionModelQuoteResponse> response = client
              .quotes
              .getAllQuotes()
              .createdBegin(createdBegin)
              .createdEnd(createdEnd)
              .createdEmail(createdEmail)
              .expiresBegin(expiresBegin)
              .expiresEnd(expiresEnd)
              .searchParam(searchParam)
              .expiredBefore(expiredBefore)
              .onlyQuoteId(onlyQuoteId)
              .statuses(statuses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getAllQuotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createdBegin** | **OffsetDateTime**| The format must be YYYY-MM-DD | [optional] |
| **createdEnd** | **OffsetDateTime**| The format must be YYYY-MM-DD | [optional] |
| **createdEmail** | **String**|  | [optional] |
| **expiresBegin** | **OffsetDateTime**| The format must be YYYY-MM-DD | [optional] |
| **expiresEnd** | **OffsetDateTime**| The format must be YYYY-MM-DD | [optional] |
| **searchParam** | **String**|  | [optional] |
| **expiredBefore** | **OffsetDateTime**| The format must be YYYY-MM-DD | [optional] |
| **onlyQuoteId** | **Boolean**|  | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**CollectionModelQuoteResponse**](CollectionModelQuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> QuoteResponse getById(id).execute();

Get a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    String id = "id_example";
    try {
      QuoteResponse result = client
              .quotes
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getBuyerGenerated());
      System.out.println(result.getCoupon());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCurrency());
      System.out.println(result.getDiscount());
      System.out.println(result.getDiscountDisplay());
      System.out.println(result.getDiscountInPayoutCurrency());
      System.out.println(result.getDiscountInPayoutCurrencyDisplay());
      System.out.println(result.getExpires());
      System.out.println(result.getExpirationDateDays());
      System.out.println(result.getFulfillmentTerm());
      System.out.println(result.getItems());
      System.out.println(result.getName());
      System.out.println(result.getNotes());
      System.out.println(result.getNetTermsDays());
      System.out.println(result.getQuoteUrl());
      System.out.println(result.getRecipient());
      System.out.println(result.getRecipientAddress());
      System.out.println(result.getSiteId());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusHistory());
      System.out.println(result.getSubtotal());
      System.out.println(result.getSubtotalDisplay());
      System.out.println(result.getSubtotalInPayoutCurrency());
      System.out.println(result.getSubtotalInPayoutCurrencyDisplay());
      System.out.println(result.getTax());
      System.out.println(result.getTaxType());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDisplay());
      System.out.println(result.getTotalInPayoutCurrency());
      System.out.println(result.getTotalInPayoutCurrencyDisplay());
      System.out.println(result.getUpdated());
      System.out.println(result.getTaxId());
      System.out.println(result.getSource());
      System.out.println(result.getSourceIP());
      System.out.println(result.getIsGrossTax());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QuoteResponse> response = client
              .quotes
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateQuoteById"></a>
# **updateQuoteById**
> QuoteResponse updateQuoteById(id, quotesUpdateQuoteByIdRequest).execute();

Update a quote

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QuotesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.fastspring.com";
    
    // Configure HTTP basic authorization: auth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    FastSpring client = new FastSpring(configuration);
    String id = "id_example"; // A unique identifier for the quote
    UpdateQuoteRequest updateQuoteRequest = new UpdateQuoteRequest();
    try {
      QuoteResponse result = client
              .quotes
              .updateQuoteById(id)
              .updateQuoteRequest(updateQuoteRequest)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getBuyerGenerated());
      System.out.println(result.getCoupon());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCurrency());
      System.out.println(result.getDiscount());
      System.out.println(result.getDiscountDisplay());
      System.out.println(result.getDiscountInPayoutCurrency());
      System.out.println(result.getDiscountInPayoutCurrencyDisplay());
      System.out.println(result.getExpires());
      System.out.println(result.getExpirationDateDays());
      System.out.println(result.getFulfillmentTerm());
      System.out.println(result.getItems());
      System.out.println(result.getName());
      System.out.println(result.getNotes());
      System.out.println(result.getNetTermsDays());
      System.out.println(result.getQuoteUrl());
      System.out.println(result.getRecipient());
      System.out.println(result.getRecipientAddress());
      System.out.println(result.getSiteId());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusHistory());
      System.out.println(result.getSubtotal());
      System.out.println(result.getSubtotalDisplay());
      System.out.println(result.getSubtotalInPayoutCurrency());
      System.out.println(result.getSubtotalInPayoutCurrencyDisplay());
      System.out.println(result.getTax());
      System.out.println(result.getTaxType());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDisplay());
      System.out.println(result.getTotalInPayoutCurrency());
      System.out.println(result.getTotalInPayoutCurrencyDisplay());
      System.out.println(result.getUpdated());
      System.out.println(result.getTaxId());
      System.out.println(result.getSource());
      System.out.println(result.getSourceIP());
      System.out.println(result.getIsGrossTax());
      System.out.println(result.getInvoiceId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#updateQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QuoteResponse> response = client
              .quotes
              .updateQuoteById(id)
              .updateQuoteRequest(updateQuoteRequest)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#updateQuoteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| A unique identifier for the quote | |
| **quotesUpdateQuoteByIdRequest** | [**QuotesUpdateQuoteByIdRequest**](QuotesUpdateQuoteByIdRequest.md)|  | |

### Return type

[**QuoteResponse**](QuoteResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

