package com.marely.surveydonkey.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.marely.surveydonkey.ui.fragment.*

class SurveyPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    // Cantidad de vistas en el ViewPager
    override fun getItemCount(): Int = 6

    // Cada posicion del ViewPager retorna un fragment distinto
    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> StartFragment()
            1 -> FirstQuestionFragment()
            2 -> SecondQuestionFragment()
            3 -> ThirdQuestionFragment()
            4 -> FourthQuestionFragment()
            5 -> EndFragment()
            else -> StartFragment()
        }
}