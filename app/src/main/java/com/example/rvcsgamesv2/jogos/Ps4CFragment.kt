package com.example.rvcsgamesv2.jogos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rvcsgamesv2.R
import com.example.rvcsgamesv2.databinding.ActivityMainBinding

class Ps4CFragment : Fragment() {

    lateinit var binding: ActivityMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_ps4_c, container, false)
    }
}