package com.example.tbc_course_28.domain

import com.example.tbc_course_28.R

data class MenuItem(
    val icon:Int,
    val name: String
){
    companion object{
        val itemInit = listOf(
            MenuItem(R.drawable.ic_dashboard,"Dashboard"),
            MenuItem(R.drawable.ic_inbox,"Inbox"),
            MenuItem(R.drawable.ic_notification,"Notifications"),
            MenuItem(R.drawable.ic_calendar,"Calendar"),
            MenuItem(R.drawable.ics_stonks,"Statistic"),
            MenuItem(R.drawable.ic_settings,"Settings"),

        )
    }
}

