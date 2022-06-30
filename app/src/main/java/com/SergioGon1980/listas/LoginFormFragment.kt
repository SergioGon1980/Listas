package com.SergioGon1980.listas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.jocnunez.listas.R

class LoginFormFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("debug", "OnCreate LoginFormFragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("debug", "OnCreateView LoginFormFragment: " + context.toString())
        val viewLogin = inflater.inflate(R.layout.fragment_login_form, container, false)
        val nextButton = viewLogin.findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            Log.d("debug", "Click on next button")
            //val intentLista = Intent(context, ListActivity::class.java).apply {
            //    Log.d("debug", "Intent Lista" + context.toString())
            //}
        }
        val intentLista = Intent(context, ListActivity::class.java).apply {
            Log.d("debug", "Intent Lista" + context.toString())
        }
        startActivity(intentLista)
        return view
    }
}