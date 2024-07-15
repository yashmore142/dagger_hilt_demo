    package com.example.dagger_hilt_demo.api_call_setup.diapi

    import com.example.dagger_hilt_demo.api_call_setup.ApiClient
    import com.example.dagger_hilt_demo.api_call_setup.ApiInterface
    import com.example.dagger_hilt_demo.api_call_setup.AuthIntersepter
    import com.example.dagger_hilt_demo.api_call_setup.Repository
    import com.example.dagger_hilt_demo.api_call_setup.RepositoryImpl
    import dagger.Module
    import dagger.Provides
    import dagger.hilt.InstallIn
    import dagger.hilt.components.SingletonComponent
    import retrofit2.create
    import javax.inject.Singleton

    @Module
    @InstallIn(SingletonComponent::class)
    class ApplicationModel {

        @Provides
        @Singleton
        fun provideAPIInterface(authIntersepter: AuthIntersepter): ApiInterface {
            return ApiClient.getClient(authIntersepter)!!.create(ApiInterface::class.java)
        }

        @Provides
        @Singleton
        fun provideRepository(apiInterface: ApiInterface): Repository {
            return RepositoryImpl(apiInterface)
        }

        @Provides
        @Singleton
        fun provideAuthIntersepter(): AuthIntersepter {
            return AuthIntersepter()
        }
    }