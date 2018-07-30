package com.dennis.baseprojectandroid.core

import com.dennis.baseprojectandroid.core.injection.client.ClientComponent
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ClientManager @Inject constructor(private val clientComponentProvider: Provider<ClientComponent.Builder>) {

    //TODO the token type may not be string
    fun onClientAuthenticated(token: String) {
        clientComponentProvider.get()
            .build()
    }
}