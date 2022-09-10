package com.patika.week3appnavigation.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.patika.week3appnavigation.R
import com.patika.week3appnavigation.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var fragmentProfileBinding: FragmentProfileBinding
    private val args : ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentProfileBinding = FragmentProfileBinding.inflate(inflater)
        return fragmentProfileBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            if (args.userInfoSafeArgs?.name != null){

                fragmentProfileBinding.apply {
                    txvName.text = args.userInfoSafeArgs?.name.toString()
                    txvEmail.text = args.userInfoSafeArgs?.email.toString()

                }
            }

        initListeners()

    }

    private fun initListeners() {

        fragmentProfileBinding.apply {
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_settingsFragment)
            }
        }

    }

}