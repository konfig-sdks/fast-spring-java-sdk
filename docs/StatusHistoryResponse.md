

# StatusHistoryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusUpdatedTo** | [**StatusUpdatedToEnum**](#StatusUpdatedToEnum) |  |  [optional] |
|**statusUpdatedByFullName** | **String** |  |  [optional] |
|**statusUpdatedByEmail** | **String** |  |  [optional] |
|**statusUpdatedOn** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusUpdatedToEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| CANCELED | &quot;CANCELED&quot; |
| AWAITING_PAYMENT | &quot;AWAITING_PAYMENT&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



