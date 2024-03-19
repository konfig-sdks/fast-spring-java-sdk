

# UpdateQuoteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;TagRequest&gt;**](TagRequest.md) |  |  [optional] |
|**coupon** | **String** |  |  [optional] |
|**currency** | **String** |  |  |
|**expirationDateDays** | **Integer** |  |  |
|**fulfillmentTerm** | **String** |  |  |
|**items** | [**List&lt;ItemRequest&gt;**](ItemRequest.md) |  |  |
|**name** | **String** |  |  |
|**notes** | **String** |  |  [optional] |
|**netTermsDays** | **Integer** |  |  [optional] |
|**recipientAddress** | [**AddressRequest**](AddressRequest.md) |  |  |
|**recipient** | [**ContactRequest**](ContactRequest.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**taxId** | **String** |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**sourceIP** | **String** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| CANCELED | &quot;CANCELED&quot; |
| AWAITING_PAYMENT | &quot;AWAITING_PAYMENT&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



