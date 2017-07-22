package ca.kanoa.session.models

data class ExerciseSequence(
    val name: String,
    val description: String,
    val exercises: List<ExerciseLike>
)