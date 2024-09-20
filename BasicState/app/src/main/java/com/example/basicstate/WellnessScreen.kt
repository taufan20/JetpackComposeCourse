import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.basicstate.WellnessTasksList
import com.example.basicstate.data.WellnessTask
import com.example.basicstate.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(modifier: Modifier = Modifier,
                   wellnessViewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StatefulCounter(modifier)

        WellnessTasksList(list = wellnessViewModel.tasks,
            onCloseTask = {task -> wellnessViewModel.remove(task)})
    }
}
