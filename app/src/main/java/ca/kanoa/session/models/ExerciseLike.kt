package ca.kanoa.session.models

sealed class ExerciseLike

data class SetRepExercise(
    val sets: Int,
    val reps: Int,
    val exerciseId: String
) : ExerciseLike()