package com.marysugar.github_api_app_with_compose.model.remote_data_source

interface RemoteDataSource {
    /**
     * サーバーからのレスポンスを[GithubUser]として返す
     */
    suspend fun getGithubUser(userName: String): GithubUser
}