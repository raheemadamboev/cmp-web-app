package xyz.teamgravity.cmpwebapp

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlin.js.js

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        App(
            onCountChange = { count ->
                if (count == 10) {
                    alert()
                }
            }
        )
    }
}

private fun alert() {
    js(" { alert(\"Let's gooooo!\") }")
}