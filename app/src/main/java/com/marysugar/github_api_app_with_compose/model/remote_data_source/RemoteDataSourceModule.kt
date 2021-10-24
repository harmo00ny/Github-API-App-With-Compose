package com.marysugar.github_api_app_with_compose.model.remote_data_source

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class RemoteDataSourceModule {
    /**
     * [RemoteDataSource]のDIに用いられるインスタンスを生成
     */
    @Provides
    fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource {
        return remoteDataSourceImpl
    }
}