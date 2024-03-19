# SubscriptionsApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSubscriptionById**](SubscriptionsApi.md#cancelSubscriptionById) | **DELETE** /subscriptions/{subscription_id} | Cancel a subscription |
| [**convertExpiredTrialWithoutPaymentMethod**](SubscriptionsApi.md#convertExpiredTrialWithoutPaymentMethod) | **POST** /subscriptions/{subscription_id}/convert | Convert an Expired Trial Subscription without a Payment Method |
| [**getAllSubscriptions**](SubscriptionsApi.md#getAllSubscriptions) | **GET** /subscriptions | Get all subscriptions |
| [**getById**](SubscriptionsApi.md#getById) | **GET** /subscriptions/{subscription_id} | Get a subscription |
| [**getEntries**](SubscriptionsApi.md#getEntries) | **GET** /subscriptions/{subscription_id}/entries | Get subscription entries |
| [**getPlanChangeHistory**](SubscriptionsApi.md#getPlanChangeHistory) | **GET** /subscriptions/{subscription_id}/history | Get subscription plan change history |
| [**pauseSubscription**](SubscriptionsApi.md#pauseSubscription) | **POST** /subscriptions/{subscription_id}/pause | Pause a subscription |
| [**previewPlanChange**](SubscriptionsApi.md#previewPlanChange) | **POST** /subscriptions/estimate | Preview a proposed prorated plan change |
| [**rebillManagedSubscription**](SubscriptionsApi.md#rebillManagedSubscription) | **POST** /subscriptions/charge | Rebill a managed subscription |
| [**removeScheduledPause**](SubscriptionsApi.md#removeScheduledPause) | **POST** /subscriptions/{subscription_id}/resume | Remove a scheduled pause |
| [**resumeSubscription**](SubscriptionsApi.md#resumeSubscription) | **POST** /subscriptions/{subscription_id} | Resume a canceled subscription |
| [**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **POST** /subscriptions | Update a subscription |


<a name="cancelSubscriptionById"></a>
# **cancelSubscriptionById**
> Object cancelSubscriptionById(subscriptionId).execute();

Cancel a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    try {
      Object result = client
              .subscriptions
              .cancelSubscriptionById(subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#cancelSubscriptionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .cancelSubscriptionById(subscriptionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#cancelSubscriptionById");
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
| **subscriptionId** | **String**| Subscription Id | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="convertExpiredTrialWithoutPaymentMethod"></a>
# **convertExpiredTrialWithoutPaymentMethod**
> Object convertExpiredTrialWithoutPaymentMethod(subscriptionId).execute();

Convert an Expired Trial Subscription without a Payment Method

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    try {
      Object result = client
              .subscriptions
              .convertExpiredTrialWithoutPaymentMethod(subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#convertExpiredTrialWithoutPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .convertExpiredTrialWithoutPaymentMethod(subscriptionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#convertExpiredTrialWithoutPaymentMethod");
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
| **subscriptionId** | **String**| Subscription Id | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAllSubscriptions"></a>
# **getAllSubscriptions**
> Object getAllSubscriptions().execute();

Get all subscriptions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    try {
      Object result = client
              .subscriptions
              .getAllSubscriptions()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getAllSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .getAllSubscriptions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getAllSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getById"></a>
# **getById**
> Object getById(subscriptionId).accountId(accountId).begin(begin).end(end).event(event).products(products).scope(scope).status(status).execute();

Get a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    String accountId = "accountId_example"; // specify a specific customer account whose subscriptions you want to retrieve
    String begin = "begin_example"; // specify the beginning of a date range in yyyy-mm-dd-format
    String end = "end_example"; // specify the end of a date range in yyyy-mm-dd format
    String event = "event_example"; // In each event, use begin and end to retrieve the corresponding subscriptions
    String products = "products_example"; // enter one or more product ids to filter the response to include only subscriptions for the specified products; use commas to separate multiple values
    String scope = "scope_example"; // 
    String status = "status_example"; // 
    try {
      Object result = client
              .subscriptions
              .getById(subscriptionId)
              .accountId(accountId)
              .begin(begin)
              .end(end)
              .event(event)
              .products(products)
              .scope(scope)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .getById(subscriptionId)
              .accountId(accountId)
              .begin(begin)
              .end(end)
              .event(event)
              .products(products)
              .scope(scope)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getById");
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
| **subscriptionId** | **String**| Subscription Id | |
| **accountId** | **String**| specify a specific customer account whose subscriptions you want to retrieve | [optional] |
| **begin** | **String**| specify the beginning of a date range in yyyy-mm-dd-format | [optional] |
| **end** | **String**| specify the end of a date range in yyyy-mm-dd format | [optional] |
| **event** | **String**| In each event, use begin and end to retrieve the corresponding subscriptions | [optional] |
| **products** | **String**| enter one or more product ids to filter the response to include only subscriptions for the specified products; use commas to separate multiple values | [optional] |
| **scope** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getEntries"></a>
# **getEntries**
> getEntries(subscriptionId).execute();

Get subscription entries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    try {
      client
              .subscriptions
              .getEntries(subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscriptions
              .getEntries(subscriptionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getEntries");
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
| **subscriptionId** | **String**| Subscription Id | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getPlanChangeHistory"></a>
# **getPlanChangeHistory**
> getPlanChangeHistory(subscriptionId).scope(scope).order(order).execute();

Get subscription plan change history

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    String scope = "base_plan"; // Type of items to return
    String order = "increasing"; // Sort Order for the results
    try {
      client
              .subscriptions
              .getPlanChangeHistory(subscriptionId)
              .scope(scope)
              .order(order)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getPlanChangeHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscriptions
              .getPlanChangeHistory(subscriptionId)
              .scope(scope)
              .order(order)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getPlanChangeHistory");
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
| **subscriptionId** | **String**| Subscription Id | |
| **scope** | **String**| Type of items to return | [optional] [enum: base_plan, add_on] |
| **order** | **String**| Sort Order for the results | [optional] [enum: increasing, decreasing] |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="pauseSubscription"></a>
# **pauseSubscription**
> Object pauseSubscription(subscriptionId, pauseSubscriptionRequest).execute();

Pause a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    Integer pausePeriodCount = 56;
    try {
      Object result = client
              .subscriptions
              .pauseSubscription(subscriptionId)
              .pausePeriodCount(pausePeriodCount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#pauseSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .pauseSubscription(subscriptionId)
              .pausePeriodCount(pausePeriodCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#pauseSubscription");
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
| **subscriptionId** | **String**| Subscription Id | |
| **pauseSubscriptionRequest** | [**PauseSubscriptionRequest**](PauseSubscriptionRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="previewPlanChange"></a>
# **previewPlanChange**
> Object previewPlanChange(estimateSubscriptionRequest).execute();

Preview a proposed prorated plan change

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscription = "subscription_example";
    String product = "product_example";
    Integer quantity = 56;
    Price pricing = new HashMap();
    List<SubscriptionAddon> addons = Arrays.asList();
    try {
      Object result = client
              .subscriptions
              .previewPlanChange(subscription)
              .product(product)
              .quantity(quantity)
              .pricing(pricing)
              .addons(addons)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#previewPlanChange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .previewPlanChange(subscription)
              .product(product)
              .quantity(quantity)
              .pricing(pricing)
              .addons(addons)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#previewPlanChange");
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
| **estimateSubscriptionRequest** | [**EstimateSubscriptionRequest**](EstimateSubscriptionRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="rebillManagedSubscription"></a>
# **rebillManagedSubscription**
> Object rebillManagedSubscription(body).execute();

Rebill a managed subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    try {
      Object result = client
              .subscriptions
              .rebillManagedSubscription()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#rebillManagedSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .rebillManagedSubscription()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#rebillManagedSubscription");
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
| **body** | **Object**|  | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeScheduledPause"></a>
# **removeScheduledPause**
> Object removeScheduledPause(subscriptionId).execute();

Remove a scheduled pause

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    try {
      Object result = client
              .subscriptions
              .removeScheduledPause(subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#removeScheduledPause");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .removeScheduledPause(subscriptionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#removeScheduledPause");
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
| **subscriptionId** | **String**| Subscription Id | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="resumeSubscription"></a>
# **resumeSubscription**
> resumeSubscription(subscriptionId, uncancelasubscriptionpriortodeactivationRequest).execute();

Resume a canceled subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    List<Subscription6> subscriptions = Arrays.asList();
    String subscriptionId = "subscriptionId_example"; // Subscription Id
    try {
      client
              .subscriptions
              .resumeSubscription(subscriptions, subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#resumeSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscriptions
              .resumeSubscription(subscriptions, subscriptionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#resumeSubscription");
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
| **subscriptionId** | **String**| Subscription Id | |
| **uncancelasubscriptionpriortodeactivationRequest** | [**UncancelasubscriptionpriortodeactivationRequest**](UncancelasubscriptionpriortodeactivationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> Object updateSubscription(changetheproductforanactivesubscriptionRequest).execute();

Update a subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionsApi;
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
    List<Subscription> subscriptions = Arrays.asList();
    try {
      Object result = client
              .subscriptions
              .updateSubscription(subscriptions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriptions
              .updateSubscription(subscriptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
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
| **changetheproductforanactivesubscriptionRequest** | [**ChangetheproductforanactivesubscriptionRequest**](ChangetheproductforanactivesubscriptionRequest.md)|  | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

