package com.marysugar.github_api_app_with_compose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.marysugar.github_api_app_with_compose.model.repository.User

@Composable
fun UserDetailView(user: User) {
    Column {
        Text(
            text = user.userId.value.toString()
        )
        Text(
            text = user.name
        )
        Text(
            text = user.avatarImage.url.value
        )
        Text(
            text = user.blogUrl.value
        )
    }
}