package com.marysugar.github_api_app_with_compose.model.remote_data_source

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("users/{username}")
    suspend fun getGithubUser(@Path("username") userName: String): Response<GithubUser>
}