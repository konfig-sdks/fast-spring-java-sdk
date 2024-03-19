

# QuoteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;TagResponse&gt;**](TagResponse.md) |  |  [optional] |
|**id** | **String** | The quote id |  [optional] |
|**buyerGenerated** | **Boolean** |  |  [optional] |
|**coupon** | **String** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**ContactResponse**](ContactResponse.md) |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**discount** | **Double** |  |  [optional] |
|**discountDisplay** | **String** |  |  [optional] |
|**discountInPayoutCurrency** | **Double** |  |  [optional] |
|**discountInPayoutCurrencyDisplay** | **String** |  |  [optional] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**expirationDateDays** | **Integer** |  |  [optional] |
|**fulfillmentTerm** | [**FulfillmentTermEnum**](#FulfillmentTermEnum) |  |  [optional] |
|**items** | [**List&lt;ItemResponse&gt;**](ItemResponse.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**netTermsDays** | **Integer** |  |  [optional] |
|**quoteUrl** | **String** |  |  [optional] |
|**recipient** | [**ContactResponse**](ContactResponse.md) |  |  [optional] |
|**recipientAddress** | [**AddressResponse**](AddressResponse.md) |  |  [optional] |
|**siteId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statusHistory** | [**Set&lt;StatusHistoryResponse&gt;**](StatusHistoryResponse.md) |  |  [optional] |
|**subtotal** | **Double** |  |  [optional] |
|**subtotalDisplay** | **String** |  |  [optional] |
|**subtotalInPayoutCurrency** | **Double** |  |  [optional] |
|**subtotalInPayoutCurrencyDisplay** | **String** |  |  [optional] |
|**tax** | **Double** |  |  [optional] |
|**taxType** | **String** |  |  [optional] |
|**total** | **Double** |  |  [optional] |
|**totalDisplay** | **String** |  |  [optional] |
|**totalInPayoutCurrency** | **Double** |  |  [optional] |
|**totalInPayoutCurrencyDisplay** | **String** |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**taxId** | **String** |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**sourceIP** | **String** |  |  [optional] |
|**isGrossTax** | **Boolean** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: FulfillmentTermEnum

| Name | Value |
|---- | -----|
| PAYMENT | &quot;ON_PAYMENT&quot; |
| QUOTE_ACCEPTANCE | &quot;ON_QUOTE_ACCEPTANCE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| CANCELED | &quot;CANCELED&quot; |
| AWAITING_PAYMENT | &quot;AWAITING_PAYMENT&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



