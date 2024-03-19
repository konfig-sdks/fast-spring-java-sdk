# CouponsApi

All URIs are relative to *https://api.fastspring.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignCodesToCoupon**](CouponsApi.md#assignCodesToCoupon) | **POST** /coupons/{coupon_id} | Assign codes to a coupon |
| [**createNewCoupon**](CouponsApi.md#createNewCoupon) | **POST** /coupons | Create a coupon |
| [**deleteAssociatedCodes**](CouponsApi.md#deleteAssociatedCodes) | **DELETE** /coupons/{coupon_id}/codes | Delete all codes associated with a coupon |
| [**getCodesAssignedToCoupon**](CouponsApi.md#getCodesAssignedToCoupon) | **GET** /coupons/{coupon_id}/codes | Get coupon codes assigned to a coupon |
| [**getDetails**](CouponsApi.md#getDetails) | **GET** /coupons/{coupon_id} | Retrieve coupon details |


<a name="assignCodesToCoupon"></a>
# **assignCodesToCoupon**
> assignCodesToCoupon(couponId, addcouponcodestoacouponRequest).execute();

Assign codes to a coupon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CouponsApi;
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
    List<String> codes = Arrays.asList();
    String couponId = "couponId_example"; // Coupon Id
    try {
      client
              .coupons
              .assignCodesToCoupon(codes, couponId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#assignCodesToCoupon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .coupons
              .assignCodesToCoupon(codes, couponId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#assignCodesToCoupon");
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
| **couponId** | **String**| Coupon Id | |
| **addcouponcodestoacouponRequest** | [**AddcouponcodestoacouponRequest**](AddcouponcodestoacouponRequest.md)|  | |

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

<a name="createNewCoupon"></a>
# **createNewCoupon**
> createNewCoupon(body).execute();

Create a coupon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CouponsApi;
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
      client
              .coupons
              .createNewCoupon()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#createNewCoupon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .coupons
              .createNewCoupon()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#createNewCoupon");
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

<a name="deleteAssociatedCodes"></a>
# **deleteAssociatedCodes**
> deleteAssociatedCodes(couponId).execute();

Delete all codes associated with a coupon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CouponsApi;
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
    String couponId = "couponId_example"; // Coupon Id
    try {
      client
              .coupons
              .deleteAssociatedCodes(couponId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#deleteAssociatedCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .coupons
              .deleteAssociatedCodes(couponId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#deleteAssociatedCodes");
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
| **couponId** | **String**| Coupon Id | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getCodesAssignedToCoupon"></a>
# **getCodesAssignedToCoupon**
> Object getCodesAssignedToCoupon(couponId).body(body).execute();

Get coupon codes assigned to a coupon

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CouponsApi;
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
    String couponId = "couponId_example"; // Coupon Id
    try {
      Object result = client
              .coupons
              .getCodesAssignedToCoupon(couponId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#getCodesAssignedToCoupon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .coupons
              .getCodesAssignedToCoupon(couponId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#getCodesAssignedToCoupon");
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
| **couponId** | **String**| Coupon Id | |
| **body** | **Object**|  | [optional] |

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

<a name="getDetails"></a>
# **getDetails**
> Object getDetails(couponId).execute();

Retrieve coupon details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FastSpring;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CouponsApi;
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
    String couponId = "couponId_example"; // Coupon Id
    try {
      Object result = client
              .coupons
              .getDetails(couponId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .coupons
              .getDetails(couponId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponsApi#getDetails");
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
| **couponId** | **String**| Coupon Id | |

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

