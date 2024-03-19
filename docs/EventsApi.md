# EventsApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcessedEvents**](EventsApi.md#getProcessedEvents) | **GET** /events/processed | Get processed events |
| [**getUnprocessedEvents**](EventsApi.md#getUnprocessedEvents) | **GET** /events/unprocessed | Get unprocessed events |
| [**updateEventById**](EventsApi.md#updateEventById) | **POST** /events/{event_id} | Update an event |


<a name="getProcessedEvents"></a>
# **getProcessedEvents**
> Object getProcessedEvents(days).execute();

Get processed events

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    Integer days = 56; // 
    try {
      Object result = client
              .events
              .getProcessedEvents(days)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getProcessedEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .events
              .getProcessedEvents(days)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getProcessedEvents");
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
| **days** | **Integer**|  | |

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

<a name="getUnprocessedEvents"></a>
# **getUnprocessedEvents**
> Object getUnprocessedEvents(begin).execute();

Get unprocessed events

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    Long begin = 56L; // 
    try {
      Object result = client
              .events
              .getUnprocessedEvents(begin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getUnprocessedEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .events
              .getUnprocessedEvents(begin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getUnprocessedEvents");
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
| **begin** | **Long**|  | |

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

<a name="updateEventById"></a>
# **updateEventById**
> updateEventById(eventId, updateasingleeventRequest).execute();

Update an event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
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
    Boolean processed = true;
    String eventId = "eventId_example"; // Event Id
    try {
      client
              .events
              .updateEventById(processed, eventId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#updateEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .events
              .updateEventById(processed, eventId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#updateEventById");
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
| **eventId** | **String**| Event Id | |
| **updateasingleeventRequest** | [**UpdateasingleeventRequest**](UpdateasingleeventRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

