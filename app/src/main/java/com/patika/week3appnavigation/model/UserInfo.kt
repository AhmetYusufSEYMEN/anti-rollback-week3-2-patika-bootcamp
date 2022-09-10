package com.patika.week3appnavigation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserInfo(val name : String, val email : String) : Parcelable
