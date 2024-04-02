package com.kaur.manpreet

import androidx.lifecycle.ViewModel
import com.kaur.manpreet.Wellness

class WellnessViewModel : ViewModel() {
    val wellnessTips = listOf(
        Wellness(1, "Spend 15 minutes outdoors", "Take a walk outside or maybe even take a meeting while you're strolling through your neighborhood.", "drawable/outdoors.png"),
        // ... Add more tips here
    )
}
