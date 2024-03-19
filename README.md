<div align="left">

[![Visit Fastspring](./header.png)](https://fastspring.com&#x2F;)

# [Fastspring](https://fastspring.com&#x2F;)

The FastSpring API and its supported requests, data, endpoints, and rate limits.

The FastSpring API is a backend service you can use to communicate with your FastSpring Store programmatically. It requires basic understanding of HTTP communication methods. The primary API communication methods include:
- **GET** - request data from your store
- **POST** - send data to your store, such as creating a new product record
- **DELETE** - remove data from your store

The structure of the JSON data sent and received using the API is very similar to Webhooks. However, using the FastSpring API, you initiate all communication with your FastSpring Store.

If you prefer a client-side method of communicating with your FastSpring Store and generating dynamic webpage content, check out the [Store Builder Library](https://fastspring.com/docs/get-started-with-store-builder-library/).

## Access the API

#### API Credentials and Authentication

FastSpring API credentials consist of a single username and password for your entire Store. The username and password are used for [Basic Authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) when making requests to the API.

#### Obtain Your API Credentials

1. Log on to the FastSpring App and navigate to [Integrations](https://fastspring.com/docs/integrations) > **API Credentials**. Initially, the only option on this page is the **Create** command.

2. Click **Create** to generate your API **Username** and **Password**. The page automatically refreshes, and then your credentials are displayed.

3. Make a note of the credentials and store them securely.

The API credentials allow complete access and control over your FastSpring Store. You will not be able to view the password in the FastSpring App after this session. If you forget your API credentials, you can reset them, however any of your stored procedures that rely on API access must be updated immediately with the new credentials. Otherwise, the API requests will fail.

## API Requests

**Make all requests to https://api.fastspring.com**

When you make your requests, consider the following:
- Ensure that the HTTP methods for all calls use uppercase letters (“GET,” “POST,” “DELETE”) Lowercase letters may result in a 404 error response.
- FastSpring requires TLS 1.2 (or later) encryption for all calls to the FastSpring API. 
- The API requires a **User-Agent** header in all requests. If your request does not include it, you may receive an 401 error message when attempting to make API requests.
- The API uses basic authentication and does not support URL-encoded authentication. Use **Base64** to encode your username and password in the header.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=FastSpring&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>fast-spring-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:fast-spring-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/fast-spring-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.fastspring.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createNewAccount**](docs/AccountsApi.md#createNewAccount) | **POST** /accounts | Create an account
*AccountsApi* | [**getAccountById**](docs/AccountsApi.md#getAccountById) | **GET** /accounts/{account_id} | Get an account
*AccountsApi* | [**getAuthenticatedManagementUrl**](docs/AccountsApi.md#getAuthenticatedManagementUrl) | **GET** /accounts/{account_id}/authenticate | Get authenticated account management URL
*AccountsApi* | [**getByParameter**](docs/AccountsApi.md#getByParameter) | **GET** /accounts | Get all accounts or Search for accounts by parameter
*AccountsApi* | [**updateAccountById**](docs/AccountsApi.md#updateAccountById) | **POST** /accounts/{account_id} | Update account
*CouponsApi* | [**assignCodesToCoupon**](docs/CouponsApi.md#assignCodesToCoupon) | **POST** /coupons/{coupon_id} | Assign codes to a coupon
*CouponsApi* | [**createNewCoupon**](docs/CouponsApi.md#createNewCoupon) | **POST** /coupons | Create a coupon
*CouponsApi* | [**deleteAssociatedCodes**](docs/CouponsApi.md#deleteAssociatedCodes) | **DELETE** /coupons/{coupon_id}/codes | Delete all codes associated with a coupon
*CouponsApi* | [**getCodesAssignedToCoupon**](docs/CouponsApi.md#getCodesAssignedToCoupon) | **GET** /coupons/{coupon_id}/codes | Get coupon codes assigned to a coupon
*CouponsApi* | [**getDetails**](docs/CouponsApi.md#getDetails) | **GET** /coupons/{coupon_id} | Retrieve coupon details
*DataApi* | [**downloadReportById**](docs/DataApi.md#downloadReportById) | **GET** /data/v1/downloads/{id} | Download a report based on job ID.
*DataApi* | [**generateRevenueReport**](docs/DataApi.md#generateRevenueReport) | **POST** /data/v1/revenue | Generates a revenue report
*DataApi* | [**generateSubscriptionReport**](docs/DataApi.md#generateSubscriptionReport) | **POST** /data/v1/subscription | Generates a subscription report
*DataApi* | [**getJobInformation**](docs/DataApi.md#getJobInformation) | **GET** /data/v1/jobs/{id} | Get job information based on a job ID.
*DataApi* | [**getJobInformation_0**](docs/DataApi.md#getJobInformation_0) | **GET** /data/v1/jobs | Get information from a job listing.
*DataApi* | [**resetCacheForServiceEndPoints**](docs/DataApi.md#resetCacheForServiceEndPoints) | **GET** /data/v1/util/cache | Reset cache for data service end points.
*EventsApi* | [**getProcessedEvents**](docs/EventsApi.md#getProcessedEvents) | **GET** /events/processed | Get processed events
*EventsApi* | [**getUnprocessedEvents**](docs/EventsApi.md#getUnprocessedEvents) | **GET** /events/unprocessed | Get unprocessed events
*EventsApi* | [**updateEventById**](docs/EventsApi.md#updateEventById) | **POST** /events/{event_id} | Update an event
*OrdersApi* | [**getByDateRange**](docs/OrdersApi.md#getByDateRange) | **GET** /orders?begin&#x3D;{begin_date}&amp;end&#x3D;{end_date}&amp;limit&#x3D;{limit}&amp;page&#x3D;{page} | Get orders by date range
*OrdersApi* | [**getByEndDate**](docs/OrdersApi.md#getByEndDate) | **GET** /orders?end&#x3D;{end_date} | Get orders by end date
*OrdersApi* | [**getById**](docs/OrdersApi.md#getById) | **GET** /orders/{order_id} | Get orders by ID
*OrdersApi* | [**getByProductPath**](docs/OrdersApi.md#getByProductPath) | **GET** /orders?products&#x3D;{product_path}&amp;limit&#x3D;{limit}&amp;page&#x3D;{page} | Get orders by product path
*OrdersApi* | [**getByProductPathAndDateRange**](docs/OrdersApi.md#getByProductPathAndDateRange) | **GET** /orders?products&#x3D;{product_path}&amp;begin&#x3D;{begin_date}&amp;end&#x3D;{end_date} | Get orders by product path AND date range
*OrdersApi* | [**getOrdersWithReturns**](docs/OrdersApi.md#getOrdersWithReturns) | **GET** /orders?begin&#x3D;{begin_date}&amp;end&#x3D;{end_date}&amp;returns&#x3D;{return} | Get orders with returns only
*OrdersApi* | [**updateTagsAndAttributes**](docs/OrdersApi.md#updateTagsAndAttributes) | **POST** /orders | Update order tags and attributes
*ProductsApi* | [**createAndUpdate**](docs/ProductsApi.md#createAndUpdate) | **POST** /products | Create and update products
*ProductsApi* | [**createOrUpdateOffers**](docs/ProductsApi.md#createOrUpdateOffers) | **POST** /products/offers/{product_path} | Create or Update Product offers
*ProductsApi* | [**deleteProductById**](docs/ProductsApi.md#deleteProductById) | **DELETE** /products/{id} | Delete products
*ProductsApi* | [**getAllOffersByType**](docs/ProductsApi.md#getAllOffersByType) | **GET** /products/offers/{product_path} | Get all offers for a product by offer type
*ProductsApi* | [**getAllProductIds**](docs/ProductsApi.md#getAllProductIds) | **GET** /products | Get all product IDs
*ProductsApi* | [**getAllProductPrices**](docs/ProductsApi.md#getAllProductPrices) | **GET** /products/price | Get all product prices
*ProductsApi* | [**getAllProductPricesByCountry**](docs/ProductsApi.md#getAllProductPricesByCountry) | **GET** /products/price?country&#x3D;{country} | Get all product prices in specified country
*ProductsApi* | [**getAllProductPricesByCountryAndCurrency**](docs/ProductsApi.md#getAllProductPricesByCountryAndCurrency) | **GET** /products/price?country&#x3D;{country}&amp;currency&#x3D;{currency} | Get all product prices in specified country and currency
*ProductsApi* | [**getByProductPath**](docs/ProductsApi.md#getByProductPath) | **GET** /products/{product_path} | Get products by path
*ProductsApi* | [**getPriceById**](docs/ProductsApi.md#getPriceById) | **GET** /products/price/{id} | Get a product price
*ProductsApi* | [**getProductPriceByCountry**](docs/ProductsApi.md#getProductPriceByCountry) | **GET** /products/price/{id}?country&#x3D;{country} | Get a product price in a specified country
*ProductsApi* | [**getProductPriceByCountryAndCurrency**](docs/ProductsApi.md#getProductPriceByCountryAndCurrency) | **GET** /products/price/{id}?country&#x3D;{country}&amp;currency&#x3D;{currency} | Get a product price in a specified country and currency
*QuotesApi* | [**cancelQuoteById**](docs/QuotesApi.md#cancelQuoteById) | **POST** /quotes/{id}/cancel | Cancel a quote
*QuotesApi* | [**createNewQuote**](docs/QuotesApi.md#createNewQuote) | **POST** /quotes | Create a quote
*QuotesApi* | [**deleteQuoteById**](docs/QuotesApi.md#deleteQuoteById) | **DELETE** /quotes/{id} | Delete a quote
*QuotesApi* | [**getAllQuotes**](docs/QuotesApi.md#getAllQuotes) | **GET** /quotes | Get all quotes
*QuotesApi* | [**getById**](docs/QuotesApi.md#getById) | **GET** /quotes/{id} | Get a quote
*QuotesApi* | [**updateQuoteById**](docs/QuotesApi.md#updateQuoteById) | **PUT** /quotes/{id} | Update a quote
*ReturnsApi* | [**createNewReturn**](docs/ReturnsApi.md#createNewReturn) | **POST** /returns | Create returns
*ReturnsApi* | [**getById**](docs/ReturnsApi.md#getById) | **GET** /returns/{id} | Get returns
*SessionsApi* | [**createNewSession**](docs/SessionsApi.md#createNewSession) | **POST** /sessions | Create a session
*SubscriptionsApi* | [**cancelSubscriptionById**](docs/SubscriptionsApi.md#cancelSubscriptionById) | **DELETE** /subscriptions/{subscription_id} | Cancel a subscription
*SubscriptionsApi* | [**convertExpiredTrialWithoutPaymentMethod**](docs/SubscriptionsApi.md#convertExpiredTrialWithoutPaymentMethod) | **POST** /subscriptions/{subscription_id}/convert | Convert an Expired Trial Subscription without a Payment Method
*SubscriptionsApi* | [**getAllSubscriptions**](docs/SubscriptionsApi.md#getAllSubscriptions) | **GET** /subscriptions | Get all subscriptions
*SubscriptionsApi* | [**getById**](docs/SubscriptionsApi.md#getById) | **GET** /subscriptions/{subscription_id} | Get a subscription
*SubscriptionsApi* | [**getEntries**](docs/SubscriptionsApi.md#getEntries) | **GET** /subscriptions/{subscription_id}/entries | Get subscription entries
*SubscriptionsApi* | [**getPlanChangeHistory**](docs/SubscriptionsApi.md#getPlanChangeHistory) | **GET** /subscriptions/{subscription_id}/history | Get subscription plan change history
*SubscriptionsApi* | [**pauseSubscription**](docs/SubscriptionsApi.md#pauseSubscription) | **POST** /subscriptions/{subscription_id}/pause | Pause a subscription
*SubscriptionsApi* | [**previewPlanChange**](docs/SubscriptionsApi.md#previewPlanChange) | **POST** /subscriptions/estimate | Preview a proposed prorated plan change
*SubscriptionsApi* | [**rebillManagedSubscription**](docs/SubscriptionsApi.md#rebillManagedSubscription) | **POST** /subscriptions/charge | Rebill a managed subscription
*SubscriptionsApi* | [**removeScheduledPause**](docs/SubscriptionsApi.md#removeScheduledPause) | **POST** /subscriptions/{subscription_id}/resume | Remove a scheduled pause
*SubscriptionsApi* | [**resumeSubscription**](docs/SubscriptionsApi.md#resumeSubscription) | **POST** /subscriptions/{subscription_id} | Resume a canceled subscription
*SubscriptionsApi* | [**updateSubscription**](docs/SubscriptionsApi.md#updateSubscription) | **POST** /subscriptions | Update a subscription
*WebhooksApi* | [**updateWebhookKeySecret**](docs/WebhooksApi.md#updateWebhookKeySecret) | **POST** /webhooks/keys | Update a webhook key secret


## Documentation for Models

 - [Action](docs/Action.md)
 - [AddcouponcodestoacouponRequest](docs/AddcouponcodestoacouponRequest.md)
 - [AddingoreditingasubscriptionaddontoanactivesubscriptionRequest](docs/AddingoreditingasubscriptionaddontoanactivesubscriptionRequest.md)
 - [Addon](docs/Addon.md)
 - [Addon1](docs/Addon1.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [AddressResponse](docs/AddressResponse.md)
 - [Amount](docs/Amount.md)
 - [Amount2](docs/Amount2.md)
 - [Attributes](docs/Attributes.md)
 - [Attributes1](docs/Attributes1.md)
 - [Attributes2](docs/Attributes2.md)
 - [Available](docs/Available.md)
 - [ChangeasubscriptionfromautomaticrenewaltomanualRequest](docs/ChangeasubscriptionfromautomaticrenewaltomanualRequest.md)
 - [ChangethedateQuantityorcouponforanactivesubscriptionRequest](docs/ChangethedateQuantityorcouponforanactivesubscriptionRequest.md)
 - [ChangetheproductforanactivesubscriptionRequest](docs/ChangetheproductforanactivesubscriptionRequest.md)
 - [ChangingthepriceordiscountforanactivesubscriptionRequest](docs/ChangingthepriceordiscountforanactivesubscriptionRequest.md)
 - [CollectionModelQuoteResponse](docs/CollectionModelQuoteResponse.md)
 - [Contact](docs/Contact.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [CreateOneAccount](docs/CreateOneAccount.md)
 - [CreateQuoteRequest](docs/CreateQuoteRequest.md)
 - [CreateanaccountRequest](docs/CreateanaccountRequest.md)
 - [CreateasessionapplyingacoupontoanorderRequest](docs/CreateasessionapplyingacoupontoanorderRequest.md)
 - [CreateasessionoverridingaproductsdefaultpricingRequest](docs/CreateasessionoverridingaproductsdefaultpricingRequest.md)
 - [CreateasessionwithoutoverridinganydefaultvaluesRequest](docs/CreateasessionwithoutoverridinganydefaultvaluesRequest.md)
 - [CreateneworderandcompletethechargeRequest](docs/CreateneworderandcompletethechargeRequest.md)
 - [CreateoneormorenewproductsRequest](docs/CreateoneormorenewproductsRequest.md)
 - [Description](docs/Description.md)
 - [Discount](docs/Discount.md)
 - [Discount2](docs/Discount2.md)
 - [Discount3](docs/Discount3.md)
 - [DiscountReason](docs/DiscountReason.md)
 - [Display](docs/Display.md)
 - [Entitlement](docs/Entitlement.md)
 - [EstimateSubscriptionRequest](docs/EstimateSubscriptionRequest.md)
 - [FilterRevenueReportRequest](docs/FilterRevenueReportRequest.md)
 - [FilterSubscriptionReportRequest](docs/FilterSubscriptionReportRequest.md)
 - [Fulfillment](docs/Fulfillment.md)
 - [Full](docs/Full.md)
 - [GenerateRevenueReportRequest](docs/GenerateRevenueReportRequest.md)
 - [GenerateSubscriptionReportRequest](docs/GenerateSubscriptionReportRequest.md)
 - [Instructions](docs/Instructions.md)
 - [Item](docs/Item.md)
 - [Item1](docs/Item1.md)
 - [Item2](docs/Item2.md)
 - [Item3](docs/Item3.md)
 - [ItemRenewalResponse](docs/ItemRenewalResponse.md)
 - [ItemRequest](docs/ItemRequest.md)
 - [ItemResponse](docs/ItemResponse.md)
 - [ItemTaxResponse](docs/ItemTaxResponse.md)
 - [Link](docs/Link.md)
 - [Lookup](docs/Lookup.md)
 - [Order](docs/Order.md)
 - [Pageable](docs/Pageable.md)
 - [PauseSubscriptionRequest](docs/PauseSubscriptionRequest.md)
 - [Price](docs/Price.md)
 - [Price3](docs/Price3.md)
 - [Price4](docs/Price4.md)
 - [Pricing](docs/Pricing.md)
 - [Pricing1](docs/Pricing1.md)
 - [Pricing3](docs/Pricing3.md)
 - [Pricing4](docs/Pricing4.md)
 - [Pricing5](docs/Pricing5.md)
 - [Product](docs/Product.md)
 - [QuoteResponse](docs/QuoteResponse.md)
 - [QuotesUpdateQuoteByIdRequest](docs/QuotesUpdateQuoteByIdRequest.md)
 - [Reason](docs/Reason.md)
 - [RebillmanagedsubscriptioninstanceRequest](docs/RebillmanagedsubscriptioninstanceRequest.md)
 - [RemoveasubscriptionaddonfromanactivesubscriptionRequest](docs/RemoveasubscriptionaddonfromanactivesubscriptionRequest.md)
 - [Sort](docs/Sort.md)
 - [StatusHistoryResponse](docs/StatusHistoryResponse.md)
 - [StoreEntitlement](docs/StoreEntitlement.md)
 - [Subscription](docs/Subscription.md)
 - [Subscription1](docs/Subscription1.md)
 - [Subscription2](docs/Subscription2.md)
 - [Subscription3](docs/Subscription3.md)
 - [Subscription4](docs/Subscription4.md)
 - [Subscription5](docs/Subscription5.md)
 - [Subscription6](docs/Subscription6.md)
 - [Subscription7](docs/Subscription7.md)
 - [SubscriptionAddon](docs/SubscriptionAddon.md)
 - [SubscriptionPricing](docs/SubscriptionPricing.md)
 - [Summary](docs/Summary.md)
 - [TagRequest](docs/TagRequest.md)
 - [TagResponse](docs/TagResponse.md)
 - [Tags](docs/Tags.md)
 - [Tags1](docs/Tags1.md)
 - [UncancelasubscriptionpriortodeactivationRequest](docs/UncancelasubscriptionpriortodeactivationRequest.md)
 - [UpdateQuoteRequest](docs/UpdateQuoteRequest.md)
 - [UpdateasingleeventRequest](docs/UpdateasingleeventRequest.md)
 - [UpdateexistingaccountRequest](docs/UpdateexistingaccountRequest.md)
 - [UpdateoneormoreexistingproductsRequest](docs/UpdateoneormoreexistingproductsRequest.md)
 - [UpdateordertagsandattributesRequest](docs/UpdateordertagsandattributesRequest.md)
 - [UserPrincipal](docs/UserPrincipal.md)
 - [WebhooksUpdateWebhookKeySecretRequest](docs/WebhooksUpdateWebhookKeySecretRequest.md)
 - [WebhooksUpdateWebhookKeySecretResponse](docs/WebhooksUpdateWebhookKeySecretResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
