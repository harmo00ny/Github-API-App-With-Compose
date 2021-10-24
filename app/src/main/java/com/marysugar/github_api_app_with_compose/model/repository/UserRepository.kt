package com.marysugar.github_api_app_with_compose.model.repository

/**
 * [User]のRepository
 */
interface UserRepository {
    /**
     * [userName]に該当する[User]を返す
     */
    suspend fun getUser(userName: String): User
}