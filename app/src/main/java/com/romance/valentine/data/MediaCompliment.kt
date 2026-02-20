package com.romance.valentine.data

sealed class MediaCompliment {
    abstract val compliment: String

    data class Photo(
        val imageResId: Int,
        override val compliment: String,
        val aspectRatio: Float = 9f / 16f
    ) : MediaCompliment()

    data class Video(
        val videoResId: Int,
        override val compliment: String
    ) : MediaCompliment()
}
