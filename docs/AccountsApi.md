# AccountsApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAccount**](AccountsApi.md#createNewAccount) | **POST** /accounts | Create an account |
| [**getAccountById**](AccountsApi.md#getAccountById) | **GET** /accounts/{account_id} | Get an account |
| [**getAuthenticatedManagementUrl**](AccountsApi.md#getAuthenticatedManagementUrl) | **GET** /accounts/{account_id}/authenticate | Get authenticated account management URL |
| [**getByParameter**](AccountsApi.md#getByParameter) | **GET** /accounts | Get all accounts or Search for accounts by parameter |
| [**updateAccountById**](AccountsApi.md#updateAccountById) | **POST** /accounts/{account_id} | Update account |


<a name="createNewAccount"></a>
# **createNewAccount**
> Object createNewAccount(createOneAccount).execute();

Create an account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    ContactRequest contact = new HashMap();
    try {
      Object result = client
              .accounts
              .createNewAccount()
              .contact(contact)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .createNewAccount()
              .contact(contact)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
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
| **createOneAccount** | [**CreateOneAccount**](CreateOneAccount.md)|  | |

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

<a name="getAccountById"></a>
# **getAccountById**
> Object getAccountById(accountId).execute();

Get an account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "accountId_example"; // Account Id
    try {
      Object result = client
              .accounts
              .getAccountById(accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .getAccountById(accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccountById");
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
| **accountId** | **String**| Account Id | |

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

<a name="getAuthenticatedManagementUrl"></a>
# **getAuthenticatedManagementUrl**
> Object getAuthenticatedManagementUrl(accountId).execute();

Get authenticated account management URL

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "accountId_example"; // Account Id
    try {
      Object result = client
              .accounts
              .getAuthenticatedManagementUrl(accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAuthenticatedManagementUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .getAuthenticatedManagementUrl(accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAuthenticatedManagementUrl");
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
| **accountId** | **String**| Account Id | |

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

<a name="getByParameter"></a>
# **getByParameter**
> Object getByParameter().email(email).custom(custom).global(global).orderID(orderID).orderReference(orderReference).subscriptionId(subscriptionId).products(products).subscriptions(subscriptions).refunds(refunds).limit(limit).page(page).execute();

Get all accounts or Search for accounts by parameter

If no parameters are sent, the operation will return a list of accountIDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String email = "email_example"; // Account email
    String custom = "custom_example"; // Account custom key
    String global = "global_example"; // Account global key
    String orderID = "orderID_example"; // Order id
    String orderReference = "orderReference_example"; // Order Reference
    String subscriptionId = "subscriptionId_example"; // Subscription ID
    String products = "products_example"; // Product ID
    String subscriptions = "subscriptions_example"; // \"active\", \"ended\", \"canceled\", \"started\" will return accounts with subscriptions in the corresponding state
    String refunds = "refunds_example"; // true
    Double limit = 3.4D; // integer value indicating the maximum number of records to be returned Or, when used together with page, the maximum number of records to be returned per page
    Double page = 3.4D; // Integer value that must be used in conjunction with limit to specify which page of results should be returned
    try {
      Object result = client
              .accounts
              .getByParameter()
              .email(email)
              .custom(custom)
              .global(global)
              .orderID(orderID)
              .orderReference(orderReference)
              .subscriptionId(subscriptionId)
              .products(products)
              .subscriptions(subscriptions)
              .refunds(refunds)
              .limit(limit)
              .page(page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getByParameter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .getByParameter()
              .email(email)
              .custom(custom)
              .global(global)
              .orderID(orderID)
              .orderReference(orderReference)
              .subscriptionId(subscriptionId)
              .products(products)
              .subscriptions(subscriptions)
              .refunds(refunds)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getByParameter");
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
| **email** | **String**| Account email | [optional] |
| **custom** | **String**| Account custom key | [optional] |
| **global** | **String**| Account global key | [optional] |
| **orderID** | **String**| Order id | [optional] |
| **orderReference** | **String**| Order Reference | [optional] |
| **subscriptionId** | **String**| Subscription ID | [optional] |
| **products** | **String**| Product ID | [optional] |
| **subscriptions** | **String**| \&quot;active\&quot;, \&quot;ended\&quot;, \&quot;canceled\&quot;, \&quot;started\&quot; will return accounts with subscriptions in the corresponding state | [optional] |
| **refunds** | **String**| true | [optional] |
| **limit** | **Double**| integer value indicating the maximum number of records to be returned Or, when used together with page, the maximum number of records to be returned per page | [optional] |
| **page** | **Double**| Integer value that must be used in conjunction with limit to specify which page of results should be returned | [optional] |

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

<a name="updateAccountById"></a>
# **updateAccountById**
> Object updateAccountById(accountId, createOneAccount).execute();

Update account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String accountId = "accountId_example"; // Account Id
    ContactRequest contact = new HashMap();
    try {
      Object result = client
              .accounts
              .updateAccountById(accountId)
              .contact(contact)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .accounts
              .updateAccountById(accountId)
              .contact(contact)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccountById");
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
| **accountId** | **String**| Account Id | |
| **createOneAccount** | [**CreateOneAccount**](CreateOneAccount.md)|  | |

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

