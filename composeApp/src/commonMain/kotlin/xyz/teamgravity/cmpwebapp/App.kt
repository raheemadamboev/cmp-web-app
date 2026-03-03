package xyz.teamgravity.cmpwebapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun App(
    onCountChange: (count: Int) -> Unit = {}
) {
    MaterialTheme {
        var count by remember { mutableIntStateOf(0) }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                space = 16.dp,
                alignment = Alignment.CenterVertically
            ),
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = count.toString(),
                fontSize = 40.sp
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(
                    space = 16.dp,
                    alignment = Alignment.CenterHorizontally
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        count--
                        onCountChange(count)
                    }
                ) {
                    Text(
                        text = "-"
                    )
                }
                Button(
                    onClick = {
                        count++
                        onCountChange(count)
                    }
                ) {
                    Text(
                        text = "+"
                    )
                }
            }
        }
    }
}