package com.example.pharmaecomapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Brands(
    val id: Int? = null,
    val name: String? = null,
    val imageUrl: String? = null
) : Parcelable