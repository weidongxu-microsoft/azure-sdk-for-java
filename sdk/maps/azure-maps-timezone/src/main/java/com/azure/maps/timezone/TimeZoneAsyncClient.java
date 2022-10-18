// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.maps.timezone.implementation.TimezonesImpl;
import com.azure.maps.timezone.implementation.helper.Utility;
import com.azure.maps.timezone.implementation.models.ErrorResponseException;
import com.azure.maps.timezone.models.IanaId;
import com.azure.maps.timezone.models.TimeZoneCoordinateOptions;
import com.azure.maps.timezone.models.TimeZoneIdOptions;
import com.azure.maps.timezone.implementation.models.JsonFormat;
import com.azure.maps.timezone.models.TimeZoneIanaVersionResult;
import com.azure.maps.timezone.models.TimeZoneResult;
import com.azure.maps.timezone.models.TimeZoneWindows;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous TimeZoneClient type. 
* Creating an async client using a {@link com.azure.core.credential.AzureKeyCredential}:
* <!-- src_embed com.azure.maps.timezone.async.builder.key.instantiation -->
* <pre>
* &#47;&#47; Authenticates using subscription key
* AzureKeyCredential keyCredential = new AzureKeyCredential&#40;System.getenv&#40;&quot;SUBSCRIPTION_KEY&quot;&#41;&#41;;
*
* &#47;&#47; Creates a client
* TimeZoneAsyncClient asyncClient = new TimeZoneClientBuilder&#40;&#41;
*     .credential&#40;keyCredential&#41;
*     .timezoneClientId&#40;System.getenv&#40;&quot;MAPS_CLIENT_ID&quot;&#41;&#41;
*     .buildAsyncClient&#40;&#41;;
*
* </pre>
* <!-- end com.azure.maps.timezone.async.builder.key.instantiation -->
*/
@ServiceClient(builder = TimeZoneClientBuilder.class, isAsync = true)
public final class TimeZoneAsyncClient {
    private final TimezonesImpl serviceClient;

    /**
     * Initializes an instance of TimeZoneClient client.
     *
     * @param serviceClient the service client implementation.
     */
    TimeZoneAsyncClient(TimezonesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * __Time Zone by Id__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_id -->
     * <pre>
     * TimeZoneIdOptions options2 = new TimeZoneIdOptions&#40;&quot;Asia&#47;Bahrain&quot;&#41;.setOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneById&#40;options2&#41;;
     * </pre>
     * <!-- end om.azure.maps.timezone.async.get_timezone_by_id -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param options contains parameters for get timezone by id 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimeZoneResult> getTimezoneById(TimeZoneIdOptions options) {
        Mono<Response<TimeZoneResult>> result = this.getTimezoneByIdWithResponse(options);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Time Zone by Id__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_id -->
     * <pre>
     * TimeZoneIdOptions options2 = new TimeZoneIdOptions&#40;&quot;Asia&#47;Bahrain&quot;&#41;.setOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneById&#40;options2&#41;;
     * </pre>
     * <!-- end om.azure.maps.timezone.async.get_timezone_by_id -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param options contains parameters for get timezone by id 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimeZoneResult>> getTimezoneByIdWithResponse(TimeZoneIdOptions options) {
        return this.getTimezoneByIdWithResponse(options, null);
    }

    /**
     * __Time Zone by Id__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_id -->
     * <pre>
     * TimeZoneIdOptions options2 = new TimeZoneIdOptions&#40;&quot;Asia&#47;Bahrain&quot;&#41;.setOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneById&#40;options2&#41;;
     * </pre>
     * <!-- end om.azure.maps.timezone.async.get_timezone_by_id -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param options contains parameters for get timezone by id 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    Mono<Response<TimeZoneResult>> getTimezoneByIdWithResponse(TimeZoneIdOptions options, Context context) {
        return this.serviceClient.getTimezoneByIDWithResponseAsync(
            JsonFormat.JSON,
            options.getTimezoneId(),
            options.getLanguage(),
            options.getOptions(),
            options.getTimestamp(),
            options.getDaylightSavingsTime(),
            options.getDaylightSavingsTimeLastingYears(), 
            context).onErrorMap(throwable -> {
                if (!(throwable instanceof ErrorResponseException)) {
                    return throwable;
                }
                ErrorResponseException exception = (ErrorResponseException) throwable;
                return new HttpResponseException(exception.getMessage(), exception.getResponse());
            });
    }

    /**
     * __Time Zone by Coordinates__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     * <pre>
     * GeoPosition c2 = new GeoPosition&#40;-122, 47.0&#41;;
     * TimeZoneCoordinateOptions op2 = new TimeZoneCoordinateOptions&#40;c2&#41;.setTimezoneOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneByCoordinates&#40;op2&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param options options contains parameters for get timezone by coordinates
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimeZoneResult> getTimezoneByCoordinates(TimeZoneCoordinateOptions options) {
        Mono<Response<TimeZoneResult>> result = this.getTimezoneByCoordinatesWithResponse(options);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Time Zone by Coordinates__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     * <pre>
     * GeoPosition c2 = new GeoPosition&#40;-122, 47.0&#41;;
     * TimeZoneCoordinateOptions op2 = new TimeZoneCoordinateOptions&#40;c2&#41;.setTimezoneOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneByCoordinates&#40;op2&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param options options contains parameters for get timezone by coordinates
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimeZoneResult>> getTimezoneByCoordinatesWithResponse(TimeZoneCoordinateOptions options) {
        return this.getTimezoneByCoordinatesWithResponse(options, null);
    }

    /**
     * __Time Zone by Coordinates__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     * <pre>
     * GeoPosition c2 = new GeoPosition&#40;-122, 47.0&#41;;
     * TimeZoneCoordinateOptions op2 = new TimeZoneCoordinateOptions&#40;c2&#41;.setTimezoneOptions&#40;TimeZoneOptions.ALL&#41;;
     * asyncClient.getTimezoneByCoordinates&#40;op2&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_by_coordinates -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param options options contains parameters for get timezone by coordinates
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    Mono<Response<TimeZoneResult>> getTimezoneByCoordinatesWithResponse(TimeZoneCoordinateOptions options, Context context) {
        return this.serviceClient.getTimezoneByCoordinatesWithResponseAsync(
            JsonFormat.JSON,
            Utility.toCoordinateList(options.getPosition()),
            options.getLanguage(),
            options.getTimezoneOptions(),
            options.getTimestamp(),
            options.getDaylightSavingsTime(),
            options.getDaylightSavingsTimeLastingYears(), 
            context).onErrorMap(throwable -> {
                if (!(throwable instanceof ErrorResponseException)) {
                    return throwable;
                }
                ErrorResponseException exception = (ErrorResponseException) throwable;
                return new HttpResponseException(exception.getMessage(), exception.getResponse());
            });
    }

    /**
     * __Windows Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_windows -->
     * <pre>
     * asyncClient.getWindowsTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_windows -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     * 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<TimeZoneWindows>> getWindowsTimezoneIds() {
        Mono<Response<List<TimeZoneWindows>>> result = this.getWindowsTimezoneIdsWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Windows Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_windows -->
     * <pre>
     * asyncClient.getWindowsTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_windows -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<TimeZoneWindows>>> getWindowsTimezoneIdsWithResponse() {
        return this.getWindowsTimezoneIdsWithResponse(null);
    }

    /**
     * __Windows Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_windows -->
     * <pre>
     * asyncClient.getWindowsTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_windows -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    Mono<Response<List<TimeZoneWindows>>> getWindowsTimezoneIdsWithResponse(Context context) {
        return this.serviceClient.getWindowsTimezoneIdsWithResponseAsync(JsonFormat.JSON, context).onErrorMap(throwable -> {
            if (!(throwable instanceof ErrorResponseException)) {
                return throwable;
            }
            ErrorResponseException exception = (ErrorResponseException) throwable;
            return new HttpResponseException(exception.getMessage(), exception.getResponse());
        });
    }

    /**
     * __IANA Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_iana -->
     * <pre>
     * asyncClient.getIanaTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<IanaId>> getIanaTimezoneIds() {
        Mono<Response<List<IanaId>>> result = this.getIanaTimezoneIdsWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __IANA Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_iana -->
     * <pre>
     * asyncClient.getIanaTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> getIanaTimezoneIdsWithResponse() {
        return this.getIanaTimezoneIdsWithResponse(null);
    }

    /**
     * __IANA Time Zones__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_enum_iana -->
     * <pre>
     * asyncClient.getIanaTimezoneIds&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_enum_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    Mono<Response<List<IanaId>>> getIanaTimezoneIdsWithResponse(Context context) {
        return this.serviceClient.getIanaTimezoneIdsWithResponseAsync(JsonFormat.JSON, context).onErrorMap(throwable -> {
            if (!(throwable instanceof ErrorResponseException)) {
                return throwable;
            }
            ErrorResponseException exception = (ErrorResponseException) throwable;
            return new HttpResponseException(exception.getMessage(), exception.getResponse());
        });
    }

    /**
     * __Time Zone IANA Version__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_iana_version -->
     * <pre>
     * asyncClient.getIanaVersion&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_iana_version -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimeZoneIanaVersionResult> getIanaVersion() {
        Mono<Response<TimeZoneIanaVersionResult>> result = this.getIanaVersionWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Time Zone IANA Version__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_iana_version -->
     * <pre>
     * asyncClient.getIanaVersion&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_iana_version -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimeZoneIanaVersionResult>> getIanaVersionWithResponse() {
        return this.getIanaVersionWithResponse(null);
    }

    /**
     * __Time Zone IANA Version__
     * <!-- src_embed com.azure.maps.timezone.async.get_timezone_iana_version -->
     * <pre>
     * asyncClient.getIanaVersion&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.get_timezone_iana_version -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    Mono<Response<TimeZoneIanaVersionResult>> getIanaVersionWithResponse(Context context) {
        return this.serviceClient.getIanaVersionWithResponseAsync(JsonFormat.JSON, context).onErrorMap(throwable -> {
            if (!(throwable instanceof ErrorResponseException)) {
                return throwable;
            }
            ErrorResponseException exception = (ErrorResponseException) throwable;
            return new HttpResponseException(exception.getMessage(), exception.getResponse());
        });
    }

    /**
     * __Windows to IANA Time Zone__
     * <!-- src_embed com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     * <pre>
     * asyncClient.convertWindowsTimezoneToIana&#40;&quot;pacific standard time&quot;, null&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<IanaId>> convertWindowsTimezoneToIana(String windowsTimezoneId, String windowsTerritoryCode) {
        Mono<Response<List<IanaId>>> result = this.convertWindowsTimezoneToIanaWithResponse(windowsTimezoneId, windowsTerritoryCode);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Windows to IANA Time Zone__
     * <!-- src_embed com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     * <pre>
     * asyncClient.convertWindowsTimezoneToIana&#40;&quot;pacific standard time&quot;, null&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> convertWindowsTimezoneToIanaWithResponse(String windowsTimezoneId, String windowsTerritoryCode) {
        return this.convertWindowsTimezoneToIanaWithResponse(windowsTimezoneId, windowsTerritoryCode, null);
    }

    /**
     * __Windows to IANA Time Zone__
     * <!-- src_embed com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     * <pre>
     * asyncClient.convertWindowsTimezoneToIana&#40;&quot;pacific standard time&quot;, null&#41;;
     * </pre>
     * <!-- end com.azure.maps.timezone.async.convert_windows_timezone_to_iana -->
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param context The context to associate with this operation.
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    Mono<Response<List<IanaId>>> convertWindowsTimezoneToIanaWithResponse(String windowsTimezoneId, String windowsTerritoryCode, Context context) {
        return this.serviceClient.convertWindowsTimezoneToIanaWithResponseAsync(
            JsonFormat.JSON, windowsTimezoneId, windowsTerritoryCode, context).onErrorMap(throwable -> {
                if (!(throwable instanceof ErrorResponseException)) {
                    return throwable;
                }
                ErrorResponseException exception = (ErrorResponseException) throwable;
                return new HttpResponseException(exception.getMessage(), exception.getResponse());
            });
    }
}