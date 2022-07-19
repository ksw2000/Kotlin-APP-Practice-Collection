package com.example.fragmentpractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("First fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e("First fragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("First fragment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("First fragment", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.e("First fragment", "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.e("First fragment", "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.e("First fragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("First fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("First fragment", "onDestroy")
    }

    override fun onDetach(){
        super.onDetach()
        Log.e("First fragment", "onDetach")
    }
}