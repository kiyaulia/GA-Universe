package com.bergerak.uts_f1d018094

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class ExplainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)



        setUpTabs()

//        val btnPlot = findViewById<Button>(R.id.btn_to_plot)
//        btnPlot.setOnClickListener(this)

//        val fragmentPlot = FragmentPlot()
//        val fragment = supportFragmentManager.findFragmentByTag(FragmentPlot::class.java.simpleName)
////        val fragment : Fragment? = supportFragmentManager.findFragmentByTag(FragmentPlot::class.java.simpleName)
//
//        if (fragment !is FragmentPlot){
//            supportFragmentManager.beginTransaction()
//                    .add(R.id.container, fragmentPlot, FragmentPlot::class.java.simpleName)
//                    .commit()
//        }
    }

    private fun setUpTabs() {
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabs = findViewById<TabLayout>(R.id.tabs)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentExplain(), "Explain")
        adapter.addFragment(FragmentPlot(), "Plot")
        adapter.addFragment(FragmentSynopsis(), "Synopsis")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        //tabs.getTabAt(0)!!



    }

//    override fun onClick(v: View?) {
//        when(v?.id){
//            R.id.btn_to_plot -> run {
//                //deklarasi intent
////                val intent_btn1 = Intent(this@MainActivity, ExplainActivity::class.java)
////                startActivity(intent_btn1)
//
//                val fragmentPlot = FragmentPlot()
//                val fragment = supportFragmentManager.findFragmentByTag(FragmentPlot::class.java.simpleName)
//        //        val fragment : Fragment? = supportFragmentManager.findFragmentByTag(FragmentPlot::class.java.simpleName)
//
//                if (fragment !is FragmentPlot){
//                    supportFragmentManager.beginTransaction()
//                            .add(R.id.container, fragmentPlot, FragmentPlot::class.java.simpleName)
//                            .commit()
//                }
//            }
//
//        }
//    }
}