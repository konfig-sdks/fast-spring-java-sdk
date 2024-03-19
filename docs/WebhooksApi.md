# WebhooksApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateWebhookKeySecret**](WebhooksApi.md#updateWebhookKeySecret) | **POST** /webhooks/keys | Update a webhook key secret |


<a name="updateWebhookKeySecret"></a>
# **updateWebhookKeySecret**
> WebhooksUpdateWebhookKeySecretResponse updateWebhookKeySecret(webhooksUpdateWebhookKeySecretRequest).execute();

Update a webhook key secret

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    URI url = new URI(); // The URL associated with the webhook.
    String hmacSecret = "hmacSecret_example"; // The new HMAC Secret key.
    try {
      WebhooksUpdateWebhookKeySecretResponse result = client
              .webhooks
              .updateWebhookKeySecret(url, hmacSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getAction());
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhookKeySecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksUpdateWebhookKeySecretResponse> response = client
              .webhooks
              .updateWebhookKeySecret(url, hmacSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhookKeySecret");
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
| **webhooksUpdateWebhookKeySecretRequest** | [**WebhooksUpdateWebhookKeySecretRequest**](WebhooksUpdateWebhookKeySecretRequest.md)|  | |

### Return type

[**WebhooksUpdateWebhookKeySecretResponse**](WebhooksUpdateWebhookKeySecretResponse.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful key rotation |  -  |

