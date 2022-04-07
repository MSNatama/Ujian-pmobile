package com.example.utsmobile.model

import androidx.annotation.DrawableRes

data class Sport (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val desc: String
    )