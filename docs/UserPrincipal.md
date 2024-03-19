

# UserPrincipal


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  [optional] |
|**siteId** | **String** |  |  [optional] |
|**siteIds** | **List&lt;String&gt;** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**companyName** | **String** |  |  [optional] |
|**siteName** | **String** |  |  [optional] |
|**loginToken** | **String** |  |  [optional] |
|**roles** | **List&lt;String&gt;** |  |  [optional] |
|**apiAccess** | **Boolean** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**entitlements** | [**List&lt;Entitlement&gt;**](Entitlement.md) |  |  [optional] |
|**clientCredentials** | **Boolean** |  |  [optional] |
|**authProviderType** | [**AuthProviderTypeEnum**](#AuthProviderTypeEnum) |  |  [optional] |
|**accessToken** | **String** |  |  [optional] |
|**tokenExpires** | **Long** |  |  [optional] |



## Enum: AuthProviderTypeEnum

| Name | Value |
|---- | -----|
| COGNITO | &quot;COGNITO&quot; |
| COMMERCE | &quot;COMMERCE&quot; |
| SOCIAL_GOOGLE | &quot;SOCIAL_GOOGLE&quot; |



