package com.parthdesai.naruto.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.parthdesai.naruto.util.Constants.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)