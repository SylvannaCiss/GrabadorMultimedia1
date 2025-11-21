package com.example.grabadormultimedia1.data

import kotlinx.coroutines.flow.Flow

class MediaRepository(private val mediaDao: MediaDao) {

    fun getAllAudio(): Flow<List<MediaItem>> =
        mediaDao.getMediaByType(MediaType.AUDIO)

    fun getAllImages(): Flow<List<MediaItem>> =
        mediaDao.getMediaByType(MediaType.IMAGE)

    fun getAllVideos(): Flow<List<MediaItem>> =
        mediaDao.getMediaByType(MediaType.VIDEO)

    suspend fun insertMedia(item: MediaItem) {
        mediaDao.insertMedia(item)
    }
}

