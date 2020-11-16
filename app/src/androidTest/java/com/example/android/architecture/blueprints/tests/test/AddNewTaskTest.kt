package com.example.android.architecture.blueprints.tests.test

import androidx.test.core.app.ActivityScenario
import com.example.android.architecture.blueprints.tests.screen.TasksScreen
import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Test

class AddNewTaskTest : TestCase() {

    @Test
    fun addNewTaskTest() = run {
        step("Запустить приложение") {
            ActivityScenario.launch(TasksActivity::class.java)
        }

        step("Нет заметок по умолчанию") {
            TasksScreen {
                noTaskIcon {
                    isVisible()
                    isDisplayed()
                }
                noTasksText {
                    isVisible()
                    isDisplayed()
                }
            }
        }
    }

}