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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AddressResponse;
import com.konfigthis.client.model.ContactResponse;
import com.konfigthis.client.model.ItemResponse;
import com.konfigthis.client.model.Link;
import com.konfigthis.client.model.StatusHistoryResponse;
import com.konfigthis.client.model.TagResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for QuoteResponse
 */
public class QuoteResponseTest {
    private final QuoteResponse model = new QuoteResponse();

    /**
     * Model tests for QuoteResponse
     */
    @Test
    public void testQuoteResponse() {
        // TODO: test QuoteResponse
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'buyerGenerated'
     */
    @Test
    public void buyerGeneratedTest() {
        // TODO: test buyerGenerated
    }

    /**
     * Test the property 'coupon'
     */
    @Test
    public void couponTest() {
        // TODO: test coupon
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'discount'
     */
    @Test
    public void discountTest() {
        // TODO: test discount
    }

    /**
     * Test the property 'discountDisplay'
     */
    @Test
    public void discountDisplayTest() {
        // TODO: test discountDisplay
    }

    /**
     * Test the property 'discountInPayoutCurrency'
     */
    @Test
    public void discountInPayoutCurrencyTest() {
        // TODO: test discountInPayoutCurrency
    }

    /**
     * Test the property 'discountInPayoutCurrencyDisplay'
     */
    @Test
    public void discountInPayoutCurrencyDisplayTest() {
        // TODO: test discountInPayoutCurrencyDisplay
    }

    /**
     * Test the property 'expires'
     */
    @Test
    public void expiresTest() {
        // TODO: test expires
    }

    /**
     * Test the property 'expirationDateDays'
     */
    @Test
    public void expirationDateDaysTest() {
        // TODO: test expirationDateDays
    }

    /**
     * Test the property 'fulfillmentTerm'
     */
    @Test
    public void fulfillmentTermTest() {
        // TODO: test fulfillmentTerm
    }

    /**
     * Test the property 'items'
     */
    @Test
    public void itemsTest() {
        // TODO: test items
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'notes'
     */
    @Test
    public void notesTest() {
        // TODO: test notes
    }

    /**
     * Test the property 'netTermsDays'
     */
    @Test
    public void netTermsDaysTest() {
        // TODO: test netTermsDays
    }

    /**
     * Test the property 'quoteUrl'
     */
    @Test
    public void quoteUrlTest() {
        // TODO: test quoteUrl
    }

    /**
     * Test the property 'recipient'
     */
    @Test
    public void recipientTest() {
        // TODO: test recipient
    }

    /**
     * Test the property 'recipientAddress'
     */
    @Test
    public void recipientAddressTest() {
        // TODO: test recipientAddress
    }

    /**
     * Test the property 'siteId'
     */
    @Test
    public void siteIdTest() {
        // TODO: test siteId
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'statusHistory'
     */
    @Test
    public void statusHistoryTest() {
        // TODO: test statusHistory
    }

    /**
     * Test the property 'subtotal'
     */
    @Test
    public void subtotalTest() {
        // TODO: test subtotal
    }

    /**
     * Test the property 'subtotalDisplay'
     */
    @Test
    public void subtotalDisplayTest() {
        // TODO: test subtotalDisplay
    }

    /**
     * Test the property 'subtotalInPayoutCurrency'
     */
    @Test
    public void subtotalInPayoutCurrencyTest() {
        // TODO: test subtotalInPayoutCurrency
    }

    /**
     * Test the property 'subtotalInPayoutCurrencyDisplay'
     */
    @Test
    public void subtotalInPayoutCurrencyDisplayTest() {
        // TODO: test subtotalInPayoutCurrencyDisplay
    }

    /**
     * Test the property 'tax'
     */
    @Test
    public void taxTest() {
        // TODO: test tax
    }

    /**
     * Test the property 'taxType'
     */
    @Test
    public void taxTypeTest() {
        // TODO: test taxType
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        // TODO: test total
    }

    /**
     * Test the property 'totalDisplay'
     */
    @Test
    public void totalDisplayTest() {
        // TODO: test totalDisplay
    }

    /**
     * Test the property 'totalInPayoutCurrency'
     */
    @Test
    public void totalInPayoutCurrencyTest() {
        // TODO: test totalInPayoutCurrency
    }

    /**
     * Test the property 'totalInPayoutCurrencyDisplay'
     */
    @Test
    public void totalInPayoutCurrencyDisplayTest() {
        // TODO: test totalInPayoutCurrencyDisplay
    }

    /**
     * Test the property 'updated'
     */
    @Test
    public void updatedTest() {
        // TODO: test updated
    }

    /**
     * Test the property 'taxId'
     */
    @Test
    public void taxIdTest() {
        // TODO: test taxId
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'sourceIP'
     */
    @Test
    public void sourceIPTest() {
        // TODO: test sourceIP
    }

    /**
     * Test the property 'isGrossTax'
     */
    @Test
    public void isGrossTaxTest() {
        // TODO: test isGrossTax
    }

    /**
     * Test the property 'invoiceId'
     */
    @Test
    public void invoiceIdTest() {
        // TODO: test invoiceId
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

}