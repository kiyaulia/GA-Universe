package com.bergerak.uts_f1d018094

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GreysAnatomy (
    val photo: Int,
    val name: String,
    val desc: String
        ): Parcelable