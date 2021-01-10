package com.byfrunze.data

data class PhotoPage(
    val page: Int,
    val photos: PhotoDTO
)

data class PhotoDTO(
    val id: Int,
    val photographer: String,
    val photographer_url: String,
    val src: PhotoSrc
)

data class PhotoSrc(
    val original: String,
    val medium: String,
    val large: String,
    val small: String
)