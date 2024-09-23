package com.example.basicstate

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Portrait",
    group = "Orientation",
    device = "spec:parent=pixel_5,orientation=portrait",
    showBackground = true

)

annotation class PortraitPreview


@Preview(
    name = "Landscape",
    group = "Orientation",
    device = "spec:parent=pixel_5,orientation=landscape",
    showBackground = true
)

annotation class LandscapePreview
