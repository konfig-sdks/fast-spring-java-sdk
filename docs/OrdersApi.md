# OrdersApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByDateRange**](OrdersApi.md#getByDateRange) | **GET** /orders?begin&#x3D;{begin_date}&amp;end&#x3D;{end_date}&amp;limit&#x3D;{limit}&amp;page&#x3D;{page} | Get orders by date range |
| [**getByEndDate**](OrdersApi.md#getByEndDate) | **GET** /orders?end&#x3D;{end_date} | Get orders by end date |
| [**getById**](OrdersApi.md#getById) | **GET** /orders/{order_id} | Get orders by ID |
| [**getByProductPath**](OrdersApi.md#getByProductPath) | **GET** /orders?products&#x3D;{product_path}&amp;limit&#x3D;{limit}&amp;page&#x3D;{page} | Get orders by product path |
| [**getByProductPathAndDateRange**](OrdersApi.md#getByProductPathAndDateRange) | **GET** /orders?products&#x3D;{product_path}&amp;begin&#x3D;{begin_date}&amp;end&#x3D;{end_date} | Get orders by product path AND date range |
| [**getOrdersWithReturns**](OrdersApi.md#getOrdersWithReturns) | **GET** /orders?begin&#x3D;{begin_date}&amp;end&#x3D;{end_date}&amp;returns&#x3D;{return} | Get orders with returns only |
| [**updateTagsAndAttributes**](OrdersApi.md#updateTagsAndAttributes) | **POST** /orders | Update order tags and attributes |


<a name="getByDateRange"></a>
# **getByDateRange**
> Object getByDateRange(beginDate, endDate, limit, page).execute();

Get orders by date range

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String beginDate = "beginDate_example"; // filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be MM/DD/YY
    String endDate = "endDate_example"; // filters results to include transactions before the specified end date, the format must be MM/DD/YY
    Double limit = 3.4D; // integer limits the number of order records returned per page (default is 50 records)
    Double page = 3.4D; // specifies page number of results to be returned; used together with limit to control pagination
    try {
      Object result = client
              .orders
              .getByDateRange(beginDate, endDate, limit, page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getByDateRange(beginDate, endDate, limit, page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByDateRange");
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
| **beginDate** | **String**| filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be MM/DD/YY | |
| **endDate** | **String**| filters results to include transactions before the specified end date, the format must be MM/DD/YY | |
| **limit** | **Double**| integer limits the number of order records returned per page (default is 50 records) | |
| **page** | **Double**| specifies page number of results to be returned; used together with limit to control pagination | |

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

<a name="getByEndDate"></a>
# **getByEndDate**
> Object getByEndDate(endDate).execute();

Get orders by end date

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String endDate = "endDate_example"; // filters results to include transactions before the specified end date, the format must be MM/DD/YY
    try {
      Object result = client
              .orders
              .getByEndDate(endDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByEndDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getByEndDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByEndDate");
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
| **endDate** | **String**| filters results to include transactions before the specified end date, the format must be MM/DD/YY | |

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
> Object getById(orderId).execute();

Get orders by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String orderId = "orderId_example"; // Order Id
    try {
      Object result = client
              .orders
              .getById(orderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getById(orderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getById");
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
| **orderId** | **String**| Order Id | |

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

<a name="getByProductPath"></a>
# **getByProductPath**
> Object getByProductPath(productPath, limit, page).execute();

Get orders by product path

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String productPath = "productPath_example"; // Product path
    Double limit = 3.4D; // integer limits the number of order records returned per page (default is 50 records)
    Double page = 3.4D; // specifies page number of results to be returned; used together with limit to control pagination
    try {
      Object result = client
              .orders
              .getByProductPath(productPath, limit, page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByProductPath");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getByProductPath(productPath, limit, page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByProductPath");
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
| **productPath** | **String**| Product path | |
| **limit** | **Double**| integer limits the number of order records returned per page (default is 50 records) | |
| **page** | **Double**| specifies page number of results to be returned; used together with limit to control pagination | |

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

<a name="getByProductPathAndDateRange"></a>
# **getByProductPathAndDateRange**
> Object getByProductPathAndDateRange(productPath, beginDate, endDate).limit(limit).page(page).execute();

Get orders by product path AND date range

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String productPath = "productPath_example"; // Product path
    String beginDate = "beginDate_example"; // filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be yyyy-mm-dd
    String endDate = "endDate_example"; // filters results to include transactions before the specified end date, the format must be yyyy-mm-dd
    Double limit = 3.4D; // integer limits the number of order records returned per page (default is 50 records)
    Double page = 3.4D; // specifies page number of results to be returned; used together with limit to control pagination
    try {
      Object result = client
              .orders
              .getByProductPathAndDateRange(productPath, beginDate, endDate)
              .limit(limit)
              .page(page)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByProductPathAndDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getByProductPathAndDateRange(productPath, beginDate, endDate)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getByProductPathAndDateRange");
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
| **productPath** | **String**| Product path | |
| **beginDate** | **String**| filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be yyyy-mm-dd | |
| **endDate** | **String**| filters results to include transactions before the specified end date, the format must be yyyy-mm-dd | |
| **limit** | **Double**| integer limits the number of order records returned per page (default is 50 records) | [optional] |
| **page** | **Double**| specifies page number of results to be returned; used together with limit to control pagination | [optional] |

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

<a name="getOrdersWithReturns"></a>
# **getOrdersWithReturns**
> Object getOrdersWithReturns(beginDate, endDate, _return).execute();

Get orders with returns only

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String beginDate = "beginDate_example"; // filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be MM/DD/YY
    String endDate = "endDate_example"; // filters results to include transactions before the specified end date, the format must be MM/DD/YY
    Boolean _return = true; // 
    try {
      Object result = client
              .orders
              .getOrdersWithReturns(beginDate, endDate, _return)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrdersWithReturns");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .getOrdersWithReturns(beginDate, endDate, _return)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrdersWithReturns");
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
| **beginDate** | **String**| filters results to include transactions after the specified begin date (must be at least one day before the specified end date), the format must be MM/DD/YY | |
| **endDate** | **String**| filters results to include transactions before the specified end date, the format must be MM/DD/YY | |
| **_return** | **Boolean**|  | |

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

<a name="updateTagsAndAttributes"></a>
# **updateTagsAndAttributes**
> Object updateTagsAndAttributes(body).execute();

Update order tags and attributes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
              .orders
              .updateTagsAndAttributes()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateTagsAndAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .orders
              .updateTagsAndAttributes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateTagsAndAttributes");
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

