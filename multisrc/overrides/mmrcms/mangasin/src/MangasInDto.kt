package eu.kanade.tachiyomi.extension.es.mangasin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CDT(val ct: String, val s: String)

@Serializable
data class MIChapterDto(
    val slug: String,
    val name: String,
    val number: String,
    @SerialName("created_at") val createdAt: String,
)

@Serializable
data class MISearchResultDto(
    @SerialName("value") val name: String,
    @SerialName("data") val slug: String,
)

@Serializable
data class MILastedDto(
    val totalPages: Int,
    val data: List<MILastedDataDto>,
)

@Serializable
data class MILastedDataDto(
    @SerialName("manga_name") val title: String,
    @SerialName("manga_slug") val slug: String,
)
