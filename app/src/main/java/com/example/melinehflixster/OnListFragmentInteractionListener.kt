package com.example.melinehflixster



/**
 * This interface is used by the [MoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [MoviesPlayingFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: MoviesPlaying)
}
