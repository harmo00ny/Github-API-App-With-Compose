package com.marysugar.github_api_app_with_compose.model.repository

import android.util.Log
import com.marysugar.github_api_app_with_compose.model.remote_data_source.GithubUser
import com.marysugar.github_api_app_with_compose.model.remote_data_source.RemoteDataSource
import timber.log.Timber
import javax.inject.Inject

/**
 * [UserRepository]の実装クラス
 */
class UserRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
): UserRepository {
    override suspend fun getUser(userName: String): User {
        Timber.d(userName)
        return remoteDataSource.getGithubUser(userName = userName).toUser()
    }
}

/**
 * [GithubUser]を[User]に変換する拡張関数
 */
private fun GithubUser.toUser(): User {
    return User(
        userId = UserId(value = id),
        name = name,
        avatarImage = NetworkImage(url = Url(value = avatarUrl)),
        blogUrl = Url(value = blog)
    )
}