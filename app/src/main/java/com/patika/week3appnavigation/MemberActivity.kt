package com.patika.week3appnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.patika.week3appnavigation.databinding.ActivityMemberBinding

class MemberActivity : AppCompatActivity() {

    private lateinit var activityMemberBinding: ActivityMemberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMemberBinding = DataBindingUtil.setContentView(this,R.layout.activity_member)

    }
}