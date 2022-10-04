package com.example.tbc_course_28.domain

import com.example.tbc_course_28.R
import com.example.tbc_course_28.common.Constants

data class MenuItem(
    val icon:Int,
    val name: String
){
    companion object{
        val itemInit = listOf(
            MenuItem(R.drawable.ic_dashboard,Constants.DASHBOARD),
            MenuItem(R.drawable.ic_inbox,Constants.INBOX),
            MenuItem(R.drawable.ic_notification,Constants.NOTIFICATION),
            MenuItem(R.drawable.ic_calendar,Constants.CALENDAR),
            MenuItem(R.drawable.ics_stonks,Constants.STATISTIC),
            MenuItem(R.drawable.ic_settings,Constants.SETTINGS),

        )
    }
}

