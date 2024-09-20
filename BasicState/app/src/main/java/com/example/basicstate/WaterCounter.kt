import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatefulCounter(modifier: Modifier) {

    var count by rememberSaveable { mutableIntStateOf(0) }
// -----------

    StatelessCounter(
        modifier = modifier,
        count = count,
        onIncrement = {
            count++
        },
        onClear = {
            count = 0
        }
    )
}

@Composable
private fun StatelessCounter(
    modifier: Modifier,
    count: Int,
    onIncrement: () -> Unit,
    onClear: () -> Unit) {
    var count1 = count
    Column(modifier = modifier.padding(16.dp)) {
        if (count1 > 0) {
            Text(text = "You've had $count1 glasses.")
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = onIncrement,
                enabled = count1 < 10,
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Add One")
            }
            Button(
                onClick = onClear,
                enabled = count1 > 0,
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Clear Water Count")
            }
        }
    }
}