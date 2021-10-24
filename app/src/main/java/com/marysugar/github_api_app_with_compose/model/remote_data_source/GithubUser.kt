package com.marysugar.github_api_app_with_compose.model.remote_data_source

import kotlinx.serialization.SerialName

data class GithubUser(
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("blog") val blog: String,
)
