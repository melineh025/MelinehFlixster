package com.example.melinehflixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    // "poster_path" and "overview" are defined in Movies API website
    @SerializedName("poster_path")
    var bookImageUrl: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @JvmField
    @SerializedName("backdrop_path")
    var backdropUrl: String? = null

    @JvmField
    @SerializedName("release_date")
    val releaseDate: String? = null

    @JvmField
    @SerializedName("vote_average")
    val averageVote = 0.0

}