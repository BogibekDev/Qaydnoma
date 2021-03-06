package dev.bogibek.eslatmalar.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.bogibek.eslatmalar.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object{
        val noteColors = listOf(Violet, RedOrange, RedPink, BabyBlue, LightGreen)
    }

}

class InvalidNodeException(message: String) : Exception(message)
