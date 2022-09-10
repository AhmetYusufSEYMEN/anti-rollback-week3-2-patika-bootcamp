package com.patika.week3appnavigation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.databinding.FragmentSettingsBinding
import com.patika.week3appnavigation.model.UserInfo


class SettingsFragment : Fragment() {

    private lateinit var fragmentSettingsBinding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater)
        return fragmentSettingsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()

    }

    private fun initListeners() {

        fragmentSettingsBinding.apply {
            button4.setOnClickListener {
                val userInfo  = UserInfo(edtxEmail.text.toString(),edtxPassword.text.toString())
                val action = SettingsFragmentDirections.actionSettingsFragmentToProfileFragment(userInfo)
                findNavController().navigate(action)
            }
        }

    }

}