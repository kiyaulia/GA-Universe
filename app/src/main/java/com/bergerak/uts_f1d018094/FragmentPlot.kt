package com.bergerak.uts_f1d018094

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentPlot : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plot, container, false)


    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val fragmentSyn = FragmentSynopsis()
//        val btnToSynopsis: Button = view.findViewById(R.id.btn_to_synopsis)
//        btnToSynopsis.setOnClickListener{
//            fragmentManager?.beginTransaction()?.apply {
//                replace(R.id.container, fragmentSyn, FragmentSynopsis::class.java.simpleName)
//                    .addToBackStack(null)
//                    .commit()
//            }
//        }
//    }

}