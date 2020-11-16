package com.example.android.architecture.blueprints.tests.screen

import com.agoda.kakao.image.KImageView
import com.agoda.kakao.text.KTextView
import  com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.tasks.TasksFragment
import com.kaspersky.kaspresso.screens.KScreen

object TasksScreen : KScreen<TasksScreen>() {

    override val layoutId: Int? = R.layout.tasks_frag

    override val viewClass: Class<*>? = TasksFragment::class.java

    val noTaskIcon = KImageView { withId(R.id.no_tasks_icon) }
    val noTasksText = KTextView { withId(R.id.no_tasks_text) }
}