package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Second fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Second fragment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Second fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Second fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Second fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Second fragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Second fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Second fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Second fragment", "onDetach")
    }
}