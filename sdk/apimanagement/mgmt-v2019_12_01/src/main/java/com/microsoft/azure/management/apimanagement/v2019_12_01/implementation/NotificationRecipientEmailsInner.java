/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ErrorResponseException;
import com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationName;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NotificationRecipientEmails.
 */
public class NotificationRecipientEmailsInner {
    /** The Retrofit service to perform REST calls. */
    private NotificationRecipientEmailsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of NotificationRecipientEmailsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NotificationRecipientEmailsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(NotificationRecipientEmailsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NotificationRecipientEmails to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NotificationRecipientEmailsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationRecipientEmails listByNotification" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/notifications/{notificationName}/recipientEmails")
        Observable<Response<ResponseBody>> listByNotification(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("notificationName") NotificationName notificationName1, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationRecipientEmails checkEntityExists" })
        @HEAD("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/notifications/{notificationName}/recipientEmails/{email}")
        Observable<Response<Void>> checkEntityExists(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("notificationName") NotificationName notificationName1, @Path("email") String email, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationRecipientEmails createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/notifications/{notificationName}/recipientEmails/{email}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("notificationName") NotificationName notificationName1, @Path("email") String email, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.NotificationRecipientEmails delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/notifications/{notificationName}/recipientEmails/{email}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("notificationName") NotificationName notificationName1, @Path("email") String email, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecipientEmailCollectionInner object if successful.
     */
    public RecipientEmailCollectionInner listByNotification(String resourceGroupName, String serviceName, NotificationName notificationName) {
        return listByNotificationWithServiceResponseAsync(resourceGroupName, serviceName, notificationName).toBlocking().single().body();
    }

    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecipientEmailCollectionInner> listByNotificationAsync(String resourceGroupName, String serviceName, NotificationName notificationName, final ServiceCallback<RecipientEmailCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByNotificationWithServiceResponseAsync(resourceGroupName, serviceName, notificationName), serviceCallback);
    }

    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecipientEmailCollectionInner object
     */
    public Observable<RecipientEmailCollectionInner> listByNotificationAsync(String resourceGroupName, String serviceName, NotificationName notificationName) {
        return listByNotificationWithServiceResponseAsync(resourceGroupName, serviceName, notificationName).map(new Func1<ServiceResponse<RecipientEmailCollectionInner>, RecipientEmailCollectionInner>() {
            @Override
            public RecipientEmailCollectionInner call(ServiceResponse<RecipientEmailCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecipientEmailCollectionInner object
     */
    public Observable<ServiceResponse<RecipientEmailCollectionInner>> listByNotificationWithServiceResponseAsync(String resourceGroupName, String serviceName, NotificationName notificationName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (notificationName == null) {
            throw new IllegalArgumentException("Parameter notificationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByNotification(resourceGroupName, serviceName, notificationName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecipientEmailCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<RecipientEmailCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecipientEmailCollectionInner> clientResponse = listByNotificationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecipientEmailCollectionInner> listByNotificationDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecipientEmailCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecipientEmailCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean checkEntityExists(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        return checkEntityExistsWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).toBlocking().single().body();
    }

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> checkEntityExistsAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email, final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromResponse(checkEntityExistsWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email), serviceCallback);
    }

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<Boolean> checkEntityExistsAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        return checkEntityExistsWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).map(new Func1<ServiceResponse<Boolean>, Boolean>() {
            @Override
            public Boolean call(ServiceResponse<Boolean> response) {
                return response.body();
            }
        });
    }

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Observable<ServiceResponse<Boolean>> checkEntityExistsWithServiceResponseAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (notificationName == null) {
            throw new IllegalArgumentException("Parameter notificationName is required and cannot be null.");
        }
        if (email == null) {
            throw new IllegalArgumentException("Parameter email is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.checkEntityExists(resourceGroupName, serviceName, notificationName, email, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = checkEntityExistsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> checkEntityExistsDelegate(Response<Void> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Boolean, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildEmpty(response);
    }

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecipientEmailContractInner object if successful.
     */
    public RecipientEmailContractInner createOrUpdate(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).toBlocking().single().body();
    }

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecipientEmailContractInner> createOrUpdateAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email, final ServiceCallback<RecipientEmailContractInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email), serviceCallback);
    }

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecipientEmailContractInner object
     */
    public Observable<RecipientEmailContractInner> createOrUpdateAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).map(new Func1<ServiceResponse<RecipientEmailContractInner>, RecipientEmailContractInner>() {
            @Override
            public RecipientEmailContractInner call(ServiceResponse<RecipientEmailContractInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecipientEmailContractInner object
     */
    public Observable<ServiceResponse<RecipientEmailContractInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (notificationName == null) {
            throw new IllegalArgumentException("Parameter notificationName is required and cannot be null.");
        }
        if (email == null) {
            throw new IllegalArgumentException("Parameter email is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdate(resourceGroupName, serviceName, notificationName, email, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecipientEmailContractInner>>>() {
                @Override
                public Observable<ServiceResponse<RecipientEmailContractInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecipientEmailContractInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecipientEmailContractInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecipientEmailContractInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecipientEmailContractInner>() { }.getType())
                .register(201, new TypeToken<RecipientEmailContractInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        deleteWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).toBlocking().single().body();
    }

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email), serviceCallback);
    }

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        return deleteWithServiceResponseAsync(resourceGroupName, serviceName, notificationName, email).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier. Possible values include: 'RequestPublisherNotificationMessage', 'PurchasePublisherNotificationMessage', 'NewApplicationNotificationMessage', 'BCC', 'NewIssuePublisherNotificationMessage', 'AccountClosedPublisher', 'QuotaLimitApproachingPublisherNotificationMessage'
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (notificationName == null) {
            throw new IllegalArgumentException("Parameter notificationName is required and cannot be null.");
        }
        if (email == null) {
            throw new IllegalArgumentException("Parameter email is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, serviceName, notificationName, email, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
