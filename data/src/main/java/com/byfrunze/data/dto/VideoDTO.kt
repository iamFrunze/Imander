package com.byfrunze.data.dto

data class VideoPage(
    val page: Int,
    val videos: VideoDTO
)

data class VideoDTO(
    val id: Int,
    val user: VideoUser,
    val video_files: VideoFiles
)

data class VideoUser(
    val name: String,
    val url: String,
    val duration: Int
)

data class VideoFiles(
    val quality: String,
    val link: String
)