package com.wisnu.epoxyexample.data.github.db.model

data class ProfileVo(
    val id: String,
    val name: String,
    val avatarUrl: String,
    val location: String,
    val bio: String,
    val blog: String
)