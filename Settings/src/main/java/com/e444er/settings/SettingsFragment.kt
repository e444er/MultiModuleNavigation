package com.e444er.settings

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController

class SettingsFragment : Fragment(R.layout.settings_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    val text = view.findViewById<TextView>(R.id.textView)

        text.setOnClickListener {
            val req = NavDeepLinkRequest.Builder
                .fromUri("android-app://androidx.navigation.app/favoriteFragment".toUri())
                .build()
            findNavController().navigate(req)
        }
    }

}