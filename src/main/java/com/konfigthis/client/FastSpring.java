package com.konfigthis.client;

import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.CouponsApi;
import com.konfigthis.client.api.DataApi;
import com.konfigthis.client.api.EventsApi;
import com.konfigthis.client.api.OrdersApi;
import com.konfigthis.client.api.ProductsApi;
import com.konfigthis.client.api.QuotesApi;
import com.konfigthis.client.api.ReturnsApi;
import com.konfigthis.client.api.SessionsApi;
import com.konfigthis.client.api.SubscriptionsApi;
import com.konfigthis.client.api.WebhooksApi;

public class FastSpring {
    private ApiClient apiClient;
    public final AccountsApi accounts;
    public final CouponsApi coupons;
    public final DataApi data;
    public final EventsApi events;
    public final OrdersApi orders;
    public final ProductsApi products;
    public final QuotesApi quotes;
    public final ReturnsApi returns;
    public final SessionsApi sessions;
    public final SubscriptionsApi subscriptions;
    public final WebhooksApi webhooks;

    public FastSpring() {
        this(null);
    }

    public FastSpring(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounts = new AccountsApi(this.apiClient);
        this.coupons = new CouponsApi(this.apiClient);
        this.data = new DataApi(this.apiClient);
        this.events = new EventsApi(this.apiClient);
        this.orders = new OrdersApi(this.apiClient);
        this.products = new ProductsApi(this.apiClient);
        this.quotes = new QuotesApi(this.apiClient);
        this.returns = new ReturnsApi(this.apiClient);
        this.sessions = new SessionsApi(this.apiClient);
        this.subscriptions = new SubscriptionsApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
