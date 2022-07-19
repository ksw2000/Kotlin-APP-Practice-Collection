package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Third fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Third fragment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Third fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Third fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Third fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Third fragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Third fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Third fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Third fragment", "onDetach")
    }
}