package ca.kanoa.session.models

/**
 * @param length how long each iteration of this routine should take in days
 */
class Routine (
    val name: String,
    val length: Int,
    val description: String,
    val diffculty: RoutineDiffculty,
    val days: List<ExerciseSequence>
)