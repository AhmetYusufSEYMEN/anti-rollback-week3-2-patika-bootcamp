package com.patika.week3appnavigation.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.R
import com.patika.week3appnavigation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            btnForgotPassword.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
                Log.e("Login1","lgn btn Çalştı")
            }

        }
    }


}