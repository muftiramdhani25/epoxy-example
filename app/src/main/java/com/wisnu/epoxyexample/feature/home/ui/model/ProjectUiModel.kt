package com.wisnu.epoxyexample.feature.home.ui.model

data class ProjectUiModel(
    val id: String,
    val name: String,
    val description: String,
    val language: String,
    val stars: Int,
    val issues: Int
)