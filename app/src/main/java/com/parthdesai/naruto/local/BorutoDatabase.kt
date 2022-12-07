package com.parthdesai.naruto.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.parthdesai.naruto.domain.model.Hero
import com.parthdesai.naruto.domain.model.HeroRemoteKey
import com.parthdesai.naruto.local.dao.HeroDao
import com.parthdesai.naruto.local.dao.HeroRemoteKeyDao

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}