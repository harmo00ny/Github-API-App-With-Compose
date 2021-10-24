package com.marysugar.github_api_app_with_compose.model.repository

/**
 * ユーザーを表すクラス
 */
data class User(
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: Url,
)
