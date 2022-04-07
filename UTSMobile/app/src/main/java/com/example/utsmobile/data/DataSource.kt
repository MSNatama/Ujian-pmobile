package com.example.utsmobile.data

import com.example.utsmobile.R
import com.example.utsmobile.model.Sport

object DataSource {

    val sports: List<Sport> = listOf(
        Sport(
            R.drawable.airsoft,
            "Airsoft",
            "Individual or Team"
        ),
        Sport(
            R.drawable.badminton,
            "Badminton",
            "1 or 2 per Team"
        ),
        Sport(
            R.drawable.basketball,
            "Basketball",
            "5 per Team"
        ),
        Sport(
            R.drawable.cycling,
            "Cycling",
            "Individual or Group"
        ),
        Sport(
            R.drawable.hiking,
            "Hiking",
            "Individual or Group"
        ),
        Sport(
            R.drawable.soccer,
            "Football",
            "11 per Team"
        ),
        Sport(
            R.drawable.swimming,
            "Swimming",
            "Individual or Team"
        ),
        Sport(
            R.drawable.tabletennis,
            "Table Tennis",
            "1 or 2 per Team"
        ),
        Sport(
            R.drawable.tennis,
            "Tennis",
            "1 or 2 per Team"
        ),
        Sport(
            R.drawable.voli,
            "Volleyball",
            "6 per Team"
        )
    )
}
