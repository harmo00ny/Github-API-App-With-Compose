package com.marysugar.github_api_app_with_compose.model.remote_data_source

import android.util.Log
import javax.inject.Inject

/**
 * [RemoteDataSource]の実装クラス
 */
class RemoteDataSourceImpl @Inject constructor(
    private val apiClient: ApiClient,
): RemoteDataSource {
    override suspend fun getGithubUser(userName: String): GithubUser {
        Log.d("ユーザー","データ")
        val response = apiClient.getGithubUser(userName = userName)
        Log.d("レスポンス","帰ってきた?")
        if (response.isSuccessful) {
            return requireNotNull(response.body())
        }
        throw HttpException()
    }
}

/**
 * Responseが失敗したとき
 */
class HttpException: Throwable()