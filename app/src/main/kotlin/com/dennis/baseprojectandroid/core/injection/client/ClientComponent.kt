package com.dennis.baseprojectandroid.core.injection.client

import dagger.Subcomponent

@ClientScope
@Subcomponent(modules = [
    ClientModule::class
])
interface ClientComponent {

    //TODO the builder type should be ClientToken
    @Subcomponent.Builder
    interface Builder {

        fun build(): ClientComponent
    }
}