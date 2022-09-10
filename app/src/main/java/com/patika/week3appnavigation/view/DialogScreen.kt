package com.patika.week3appnavigation.view

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.R

class DialogScreen: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Do you want to go Profile Fragment? ")
                .setPositiveButton("Yes") { _, _ ->
                    findNavController().navigate(R.id.action_dialogScreen_to_main_graph)
                    // popUpTo set-> "login_graph" and popUpToInclusive set-> "true" action in login_graph for never come back
                }
                .setNegativeButton("No") { _, _ ->
                    findNavController().navigateUp()
                }
            builder.create()
        }?: throw IllegalStateException("activity can not null")

    }

}