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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateoneormorenewproductsRequest;
import com.konfigthis.client.model.Product;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductsApi
 */
@Disabled
public class ProductsApiTest {

    private static ProductsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProductsApi(apiClient);
    }

    /**
     * Create and update products
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAndUpdateTest() throws ApiException {
        List<Product> products = null;
        Object response = api.createAndUpdate(products)
                .execute();
        // TODO: test validations
    }

    /**
     * Create or Update Product offers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrUpdateOffersTest() throws ApiException {
        String productPath = null;
        Object response = api.createOrUpdateOffers(productPath)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete products
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductByIdTest() throws ApiException {
        String id = null;
        Object response = api.deleteProductById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all offers for a product by offer type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllOffersByTypeTest() throws ApiException {
        String productPath = null;
        String type = null;
        Object response = api.getAllOffersByType(productPath)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all product IDs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProductIdsTest() throws ApiException {
        Object response = api.getAllProductIds()
                .execute();
        // TODO: test validations
    }

    /**
     * Get all product prices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProductPricesTest() throws ApiException {
        Object response = api.getAllProductPrices()
                .execute();
        // TODO: test validations
    }

    /**
     * Get all product prices in specified country
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProductPricesByCountryTest() throws ApiException {
        String country = null;
        Object response = api.getAllProductPricesByCountry(country)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all product prices in specified country and currency
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProductPricesByCountryAndCurrencyTest() throws ApiException {
        String country = null;
        String currency = null;
        Object response = api.getAllProductPricesByCountryAndCurrency(country, currency)
                .execute();
        // TODO: test validations
    }

    /**
     * Get products by path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByProductPathTest() throws ApiException {
        String productPath = null;
        Object response = api.getByProductPath(productPath)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a product price
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPriceByIdTest() throws ApiException {
        String id = null;
        Object response = api.getPriceById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a product price in a specified country
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductPriceByCountryTest() throws ApiException {
        String id = null;
        String country = null;
        Object response = api.getProductPriceByCountry(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a product price in a specified country and currency
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductPriceByCountryAndCurrencyTest() throws ApiException {
        String id = null;
        String country = null;
        String currency = null;
        Object response = api.getProductPriceByCountryAndCurrency(id, country, currency)
                .execute();
        // TODO: test validations
    }

}