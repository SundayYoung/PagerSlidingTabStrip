package com.felix.pagerslidingtabstrip

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = FragmentPagerAdapter(supportFragmentManager)

        fragmentAdapter.addFragment(BasicFragment() , "散标")
        fragmentAdapter.addFragment(BasicFragment() , "供应链")

        vVpTab.adapter = fragmentAdapter

        vTlTab.setViewPager(vVpTab)
    }
}
