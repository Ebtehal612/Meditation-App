package com.example.meditation

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs

fun Path.standerdQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(from.x, from.y, abs(from.x + to.x) / 2f, abs(from.y + to.y) / 2f)
}