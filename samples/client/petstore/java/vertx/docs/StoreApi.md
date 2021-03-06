# StoreApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{order_id} | Delete purchase order by ID
[**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status
[**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{order_id} | Find purchase order by ID
[**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet




<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete purchase order by ID

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;



StoreApi apiInstance = new StoreApi();

String orderId = Arrays.asList("orderId_example"); // String | ID of the order that needs to be deleted

try {
    apiInstance.deleteOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**String**](.md)| ID of the order that needs to be deleted |


### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a name="getInventory"></a>
# **getInventory**
> Map&lt;String, Integer&gt; getInventory()

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;



StoreApi apiInstance = new StoreApi();

try {
    Map<String, Integer> result = apiInstance.getInventory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getInventory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId)

Find purchase order by ID

For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;



StoreApi apiInstance = new StoreApi();

Integer orderId = Arrays.asList(56); // Integer | ID of pet that needs to be fetched

try {
    Order result = apiInstance.getOrderById(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**Integer**](.md)| ID of pet that needs to be fetched |


### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json


<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(order)

Place an order for a pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoreApi;



StoreApi apiInstance = new StoreApi();

Order order = ; // Order | order placed for purchasing the pet

try {
    Order result = apiInstance.placeOrder(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](.md)| order placed for purchasing the pet |


### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json



