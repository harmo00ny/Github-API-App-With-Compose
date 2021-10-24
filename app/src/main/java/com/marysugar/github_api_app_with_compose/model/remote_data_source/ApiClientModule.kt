package com.marysugar.github_api_app_with_compose.model.remote_data_source

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import javax.inject.Singleton

/**
 * [ApiClient]のModule
 */
@Module
@InstallIn(SingletonComponent::class)
class ApiClientModule {

    /**
     * [ApiClient]のDIに用いられるインスタンスを生成して返す
     */
    @ExperimentalSerializationApi
    @Provides
    @Singleton
    fun provideApiClient(apiClientProvider: ApiClientProvider): ApiClient {
        return apiClientProvider.provide()
    }
}