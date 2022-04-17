package com.example.utsmobile.model

import androidx.annotation.DrawableRes
import java.io.Serializable

data class NBA (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val team: String,
    val score: String,
    val total: Int,
    val pos: String,
    val jersey: String,
    val height: String,
    val weight: String
    ) : Serializable