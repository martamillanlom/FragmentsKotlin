package com.example.fragmentskotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

class FormFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View= inflater.inflate(R.layout.fragment_form, container, false);

        Log.i("testDAM", "hola");

        return view;
    }
}