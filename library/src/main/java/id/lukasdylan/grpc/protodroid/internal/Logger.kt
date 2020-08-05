package id.lukasdylan.grpc.protodroid.internal

import timber.log.Timber

internal fun printLogRequest(lastState: DataState) {
    Timber.tag("GRPC")
        .d(". \n----- Service URL: -----\n${lastState.serviceUrl}\n----- Service Name: -----\n${lastState.serviceName}\n----- Request Body: -----\n${lastState.requestBody}")
}

internal fun printLogFullResponse(lastState: DataState) {
    Timber.tag("GRPC")
        .d(". \n----- Service URL: -----\n${lastState.serviceUrl}\n----- Service Name: -----\n${lastState.serviceName}\n----- Response Result: -----\n$lastState")
}
